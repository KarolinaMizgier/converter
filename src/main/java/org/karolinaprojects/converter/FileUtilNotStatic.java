package org.karolinaprojects.converter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class FileUtilNotStatic {

    public void write(List<String> text, String path){
        FileWriter writer = null;
        File f = new File(path);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            text.stream().forEach(line ->{
                try {
                    bw.append(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            bw.close();

        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }

    public List<String> readLine(String name){
        return read(name);
    }
    public String readText(String name){
        List<String> list = read(name);
        StringBuilder builder = new StringBuilder();
        list.forEach(line->{
            builder.append(line);
        });
        return builder.toString();
    }

    private List<String> read(String name) {

        List<String> textList = new ArrayList<>();
        try {
            String path = this.getClass().getClassLoader().getResource(name).getPath();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                textList.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return textList;
    }

}


