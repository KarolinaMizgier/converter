package org.karolinaprojects.converter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileUtilNotStatic read = new FileUtilNotStatic();


        List<String> splitted = SentenceSplitter.split(read.readText("Tekst"));
        // System.out.println(read);
        Converter converter = new XmlConverter();
        List<String> convertedText = converter.parseText(splitted);
        convertedText.stream().forEach(line -> {
            System.out.println(line);
        });

    }
}
