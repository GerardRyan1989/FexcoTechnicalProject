package NumberConverterClasses.Tests;
import static org.junit.Assert.assertEquals;
import NumberConverterClasses.WordifiedNumber;
import NumberConverterClasses.WordifiedNumberImpl;
import org.junit.Test;

public class WordifiedNumberImplTests {


    @Test
    public void testToWordsMethod(){
        WordifiedNumber wordifiedNumber = new WordifiedNumberImpl();
        assertEquals("nine hundred and ninety nine",wordifiedNumber.toWords(999));
    }
}
