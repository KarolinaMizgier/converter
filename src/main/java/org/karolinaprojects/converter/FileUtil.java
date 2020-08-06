package org.karolinaprojects.converter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class FileUtil {

    public static void write(List<String> text, String path){
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

    public static List<String> readLine(String path){
        return read(path);
    }
    public static String readText(String path){
        List<String> list = read(path);
        StringBuilder builder = new StringBuilder();
        list.forEach(line->{
            builder.append(line);
        });
        return builder.toString();
    }

    private static List<String> read(String path) {

        List<String> textList = new ArrayList<>();
        try {
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


