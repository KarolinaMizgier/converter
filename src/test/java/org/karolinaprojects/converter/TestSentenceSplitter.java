package org.karolinaprojects.converter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestSentenceSplitter {
    @Test
    public void testSentenceSplitter(){
        String text = "Ms. and Mr. Smith met Dr. Jekyll outside. What he  shouted was shocking: Hey! Next sentence.";
        List<String> expected = new ArrayList<>();
        expected.add("Ms. and Mr. Smith met Dr. Jekyll outside. ");
        expected.add("What he  shouted was shocking: Hey! ");
        expected.add("Next sentence.");
        List<String> splitted = SentenceSplitter.split(text);

        assertEquals(splitted, expected);
    }
}
