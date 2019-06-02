package NumberConverterClasses;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordifiedNumberImpl implements WordifiedNumber {

    @Override
    public String toWords(int number) {
        String numberAsString = Integer.toString(number);
        List<String> nums = Arrays.asList(numberAsString.split(""));
        Collections.reverse(nums);
        return getNumberAsWord(nums);
    }

    private static String getNumberAsWord(List<String> numbers) {

        StringBuilder numberConvertedtoWord = new StringBuilder();
            for (int position = numbers.size() -1; position >= 0 ; position--)
                if ((position == 1 || position == 4 || position == 7) && numbers.get(position).equals("1")) {
                    String newNumber = numbers.get(position) + numbers.get(position - 1);
                    numberConvertedtoWord.append(mapNumbertoWord(newNumber, position, newNumber.length()));
                    position--;
                } else {
                        numberConvertedtoWord.append(mapNumbertoWord(numbers.get(position), position, numbers.get(position).length()));
                }
        return numberConvertedtoWord.toString();
    }

    private static String mapNumbertoWord(String number, int position, int numberLength) {
        String word = "";
        EnglishWords engWords = new EnglishWords();

        switch (position) {
            case 0:
                word = engWords.returnword("oneToNineteen", number);
                break;
            case 1:
                if(number.length() == 2){
                    word = engWords.returnword("oneToNineteen", number);
                }else{
                    word = engWords.returnword("tens", number);
                }
                //maybe ten to nine teen
                break;
            case 2:
                    //oneToNineteen
                     word = engWords.returnword("oneToNineteen", number);
                break;
            case 3:
                    word = engWords.returnword("oneToNineteen", number);
                break;
            case 4:
                if(number.length() == 2){
                    word = engWords.returnword("oneToNineteen", number);
                }else{
                    word = engWords.returnword("tens", number);
                }
                break;
            case 5:
                //oneToNineteen
                word = engWords.returnword("oneToNineteen", number);
                break;
            case 6:
                    word = engWords.returnword("oneToNineteen", number);
                break;
            case 7:
                if(number.length() == 2){
                    word = engWords.returnword("oneToNineteen", number);
                }else{
                    word = engWords.returnword("tens", number);
                }
                break;
            case 8:
                word = engWords.returnword("oneToNineteen", number);
                break;
            default:
                break;
        }
        return word;
    }
}
