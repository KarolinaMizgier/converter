package org.karolinaprojects.converter;

import java.util.ArrayList;
import java.util.List;

public class CsvConverter implements Converter {

    @Override
    public List<String> parseText(List<String> text) {

        List<String> parsedText = new ArrayList<>();
        //element z listy text wrzucac do parsedText w petli
        text.stream().forEach(line ->{
            parsedText.add(line.replace(" ", ","));
        });

        return parsedText;
    }
}