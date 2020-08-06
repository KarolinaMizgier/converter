package org.karolinaprojects.converter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestCsvConverter {

    Converter converter = new CsvConverter();

    @Test
    public void testParseText(){
    List<String> text = new ArrayList<>();
    text.add("abc def ghi");
    List<String> converted = new ArrayList<>();
    List<String> pattern = new ArrayList<>();
    pattern.add("abc,def,ghi");

    converted = converter.parseText(text);

    assertEquals(converted,pattern);

}


}
