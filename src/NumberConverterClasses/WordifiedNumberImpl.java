package NumberConverterClasses;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordifiedNumberImpl implements WordifiedNumber {

    //this method reads in the number converts it to a string before converting it to a list to allow for individual number to be worked with.
    //it then reverses the list of numbers to allow for the numbers to be worked through starting with the lowest value and working up through them. i.e. units, tens, hundreds, thousands
    @Override
    public String toWords(int number) {
        String numberAsString = Integer.toString(number);
        List<String> nums = Arrays.asList(numberAsString.split(""));
        Collections.reverse(nums);
        return getNumberAsWord(nums);
    }

    //this method reads in a list and then iterates through the list passing the values to the  map number to word method
    private static String getNumberAsWord(List<String> numbers) {


        //the below code gets the last three digits of the number to allow it to be passed into the CheckLastThreeDigitsForAnd method in the EnglishWords Class
        int lastThreeDigits = 100;
        StringBuilder lastThreeDigitsAsString = new StringBuilder();
        if(numbers.size() > 2 ){
            for(int i = 2; i >= 0; i--){
                lastThreeDigitsAsString.append(numbers.get(i));
            }
            lastThreeDigits = Integer.parseInt(lastThreeDigitsAsString.toString());
        }

        //use a string builder to build the number in the english language
        StringBuilder numberConvertedtoWord = new StringBuilder();
        //iterate through the number and pass the number to the mapNumberToWord Method
            for (int position = numbers.size() -1; position >= 0 ; position--) {
                //this if statement checks the value and position of a number for example if the number 1 appears in a certain position
                //the next number is needed as well to create the english word: for example take the number 1019 the number one for the number 1 nad 9 are needed to create the word nineteen.
                //the if statement checks the positions where this can occur and then creates a number using two numbers in the list where it has happened.
                // it then iterates to ensure the next number is skipped past.
                if ((position == 1 || position == 4 || position == 7) && numbers.get(position).equals("1")) {
                    String newNumber = numbers.get(position) + numbers.get(position - 1);
                    numberConvertedtoWord.append(mapNumbertoWord(newNumber, position, lastThreeDigits));
                    position--;
                } else {
                    numberConvertedtoWord.append(mapNumbertoWord(numbers.get(position), position, lastThreeDigits));
                }
            }

            //check the word "and" is not at the end of the string
            if(numberConvertedtoWord.substring(numberConvertedtoWord.length() - 4).equals("and ")){
                    numberConvertedtoWord = new StringBuilder(numberConvertedtoWord.substring(0, numberConvertedtoWord.length() - 4));
            }

        return numberConvertedtoWord.toString().trim();
    }

    //this method passes the number, value and positionOfNumber of a number into the returnMethod of the english Words class and then returns the value.
    //based on the positon of the number the value varies between oneToNineTeen and tens. if the positionOfNumber is equal to 1 the checkLastThreedigits method is called as well to see if the word "and" is required before the last three digits
    private static String mapNumbertoWord(String number, int positionOfNumber, int lastThreeDigits) {

        String word = "";
        EnglishWords engWords = new EnglishWords();

        if(positionOfNumber == 0 || positionOfNumber == 2 || positionOfNumber == 3 || positionOfNumber == 5 || positionOfNumber == 6 || positionOfNumber == 8 ) {
            word = engWords.returnword("oneToNineteen", number, positionOfNumber);

        }else{

            if(positionOfNumber == 1) {
                word += engWords.checkLastThreeDigitsForAnd(lastThreeDigits);
            }

            if(number.length() == 2){
                word += engWords.returnword("oneToNineteen", number, positionOfNumber);
            }else{
                word += engWords.returnword("tens", number, positionOfNumber);
            }
        }
        return word;
    }
}
