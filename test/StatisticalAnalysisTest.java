import com.company.FileContent;
import com.company.secondSolutionWithTests.StatisticalAnalysis;
import com.company.WordIterator;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class StatisticalAnalysisTest {
    private FileContent fileContent = new FileContent("resources/test1.txt");
    private WordIterator wordIterator;
    private Iterator<String> stringIterator;

//    @Test
//    public void testDictionarySize() {
//
//        FileContent file = new FileContent("resources/test1.txt");
//
//        StatisticalAnalysis words = new StatisticalAnalysis(file.wordIterator());
//
//        assertEquals(268, words.dictionarySize());
//
//    }



}