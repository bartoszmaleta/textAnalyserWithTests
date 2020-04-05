import com.company.FileContent;
import com.company.StatisticalAnalysis;
import com.company.WordIterator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticalAnalysisTest {
    private FileContent fileContent = new FileContent("resources/test1.txt");
    private WordIterator wordIterator;

    @Test
    public void testDictionarySize() {
        wordIterator = new WordIterator(fileContent);
        StatisticalAnalysis statisticalAnalysis = new StatisticalAnalysis();





    }
}