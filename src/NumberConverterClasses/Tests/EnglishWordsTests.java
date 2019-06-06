package NumberConverterClasses.Tests;
import NumberConverterClasses.EnglishWords;
import org.junit.Assert;
import org.junit.Test;

public class EnglishWordsTests {

    EnglishWords words = new EnglishWords();
    @Test
    public void returnWordsUnit() {

        String returnedWord = words.returnword("oneToNineteen", "9", 8);
        Assert.assertEquals("nine hundred and ", returnedWord);
    }

    @Test
    public void returnWordsTens() {

        String returnedWord = words.returnword("tens", "7", 7);
        Assert.assertEquals("seventy ", returnedWord);
    }

    @Test
    public void testCheckLastThreeDigitsForAnd(){
        String returnedWord = words.checkLastThreeDigitsForAnd(100);
        Assert.assertEquals("", returnedWord);
    }

    @Test
    public void testCheckLastThreeDigitsForAndV2(){
        String returnedWord = words.checkLastThreeDigitsForAnd(99);
        Assert.assertEquals("and ", returnedWord);
    }
}
