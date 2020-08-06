package org.karolinaprojects.converter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestXmlConverter {
    Converter converter = new XmlConverter();

    @Test
    public void testParseTest(){
        List<String> pattern = new ArrayList<>();
        pattern.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        pattern.add("<text>");
        pattern.add("<line>Hello</line>");
        pattern.add("</text>");

        List<String> input = new ArrayList<>();
        input.add("Hello");
        List<String> converted;
        converted = converter.parseText(input);

        assertEquals(converted,pattern);
    }
}
