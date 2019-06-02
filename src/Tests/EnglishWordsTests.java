package Tests;
import NumberConverterClasses.EnglishWords;
import org.junit.Assert;
import org.junit.Test;

public class EnglishWordsTests {

    @Test
    public void returnWordsUnit() {
        EnglishWords words = new EnglishWords();
        String returnedWord = words.returnword("oneToNineteen", "9", 8);
        Assert.assertEquals("nine hundred and ",returnedWord);
    }

    @Test
    public void returnWordsTens() {
        EnglishWords words = new EnglishWords();
        String returnedWord = words.returnword("tens", "7", 7);
        Assert.assertEquals("seventy ", returnedWord);
    }
}
