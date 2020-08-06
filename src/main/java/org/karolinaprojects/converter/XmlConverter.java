package org.karolinaprojects.converter;

import java.util.ArrayList;
import java.util.List;

public class XmlConverter implements Converter {

    // TODO: research w necie parsowac text do xml

    @Override
    public List<String> parseText(List<String> text) {
        List<String> xml = new ArrayList<>();
        xml.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xml.add("<text>");
        text.forEach(line ->{
            xml.add("<line>" + line + "</line>");
        });
        xml.add("</text>");

        return xml;
    }
}
