package com.company.secondSolutionWithTests;

import com.company.FileContent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticalAnalysisTest {
    @Test
    public void testRatio() {

        com.company.FileContent file = new FileContent("resources/test1.txt");

        StatisticalAnalysis words = new StatisticalAnalysis(file.wordIterator());

        String stringA = "a";
        String stringB = "aaaabqwe";
        assertEquals(1, words.countOf("a"));
    }
}