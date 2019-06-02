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

        int  lastThreeDigits = 100;
        StringBuilder lastThreeDigitsAsString  = new StringBuilder();

        if(numbers.size() > 2 ){
            for(int i = 2; i >= 0; i--){
                lastThreeDigitsAsString.append(numbers.get(i));
            }

            lastThreeDigits = Integer.parseInt(lastThreeDigitsAsString.toString());
        }

        StringBuilder numberConvertedtoWord = new StringBuilder();
            for (int position = numbers.size() -1; position >= 0 ; position--) {
                if ((position == 1 || position == 4 || position == 7) && numbers.get(position).equals("1")) {
                    String newNumber = numbers.get(position) + numbers.get(position - 1);
                    numberConvertedtoWord.append(mapNumbertoWord(newNumber, position, lastThreeDigits));
                    position--;
                } else {
                    numberConvertedtoWord.append(mapNumbertoWord(numbers.get(position), position, lastThreeDigits));
                }
            }

            if(numberConvertedtoWord.substring(numberConvertedtoWord.length() - 4).equals("and ")){
                    numberConvertedtoWord = new StringBuilder(numberConvertedtoWord.substring(0, numberConvertedtoWord.length() - 4));
            }

        return numberConvertedtoWord.toString();
    }

    private static String mapNumbertoWord(String number, int position, int lastThreeDigits) {
        String word = "";
        EnglishWords engWords = new EnglishWords();

        switch (position) {
            case 0:
                word = engWords.returnword("oneToNineteen", number, position);
                break;
            case 1:
                word += engWords.checkLastThreeDigitsForAnd(lastThreeDigits);
                if(number.length() == 2){
                    word += engWords.returnword("oneToNineteen", number, position);
                }else{
                    word += engWords.returnword("tens", number, position);
                }
                break;
            case 2:
                word = engWords.returnword("oneToNineteen", number, position);
                break;
            case 3:
                word = engWords.returnword("oneToNineteen", number, position);
                break;
            case 4:
                if(number.length() == 2){
                    word = engWords.returnword("oneToNineteen", number, position);
                }else{
                    word = engWords.returnword("tens", number, position);
                }
                break;
            case 5:
                word = engWords.returnword("oneToNineteen", number, position);
                break;
            case 6:
                word = engWords.returnword("oneToNineteen", number, position);
                break;
            case 7:
                if(number.length() == 2){
                    word = engWords.returnword("oneToNineteen", number, position);
                }else{
                    word = engWords.returnword("tens", number, position);
                }
                break;
            case 8:
                word = engWords.returnword("oneToNineteen", number, position);
                break;
            default:
                break;
        }
        return word;
    }
}
