package NumberConverterClasses;
import java.util.HashMap;

public class EnglishWords {
    HashMap<String, String> oneToNineteen = new HashMap<>();
    HashMap<String, String> tens = new HashMap<>();
    private final String thousands = "thousand ";
    private final String millions = "million ";
    private final String hundreds = "hundred ";
    private final String and = "and ";

    public EnglishWords() {
        //Store the variables for oneToNineteen in HashMap
        oneToNineteen.put("0", "");
        oneToNineteen.put("1", "one ");
        oneToNineteen.put("2", "two ");
        oneToNineteen.put("3", "three ");
        oneToNineteen.put("4", "four ");
        oneToNineteen.put("5", "five ");
        oneToNineteen.put("6", "six ");
        oneToNineteen.put("7", "seven ");
        oneToNineteen.put("8", "eight ");
        oneToNineteen.put("9", "nine ");
        oneToNineteen.put("10", "ten ");
        oneToNineteen.put("11", "eleven ");
        oneToNineteen.put("12", "twelve ");
        oneToNineteen.put("13", "thirteen ");
        oneToNineteen.put("14", "fourteen ");
        oneToNineteen.put("15", "fifteen ");
        oneToNineteen.put("16", "sixteen ");
        oneToNineteen.put("17", "seventeen ");
        oneToNineteen.put("18", "eighteen ");
        oneToNineteen.put("19", "nineteen ");

        //store the variables for tens in HashMap
        tens.put("0", "");
        tens.put("1", "ten ");
        tens.put("2", "twenty ");
        tens.put("3", "thirty ");
        tens.put("4", "forty ");
        tens.put("5", "fifty ");
        tens.put("6", "sixty ");
        tens.put("7", "seventy ");
        tens.put("8", "eighty ");
        tens.put("9", "ninety ");
    }

    //this method reads in a number and return the number it is mapped to in either the oneToNineteen or tens Hashmap.
    //it then adds the value of the number i.e hundreds, thousands, millions based on the position of the number.
    public String returnword(String value, String number, int position) {
        String word = "";

        if (value.equals("oneToNineteen")) {
           word = oneToNineteen.get(number);
        } else if (value.equals("tens")) {
            word = tens.get(number);
        }

        if(position == 6 ){
            word += millions;
        }

        if(position == 3 && !number.equals("0") ||( position == 4 && number.equals("10"))){
            word+= thousands;
        }

        if((position == 2 && !number.equals("0")) || (position == 5 && !number.equals("0")) || (position == 8 && !number.equals("0"))){
            word += hundreds;
            if(position == 5 || position == 8){
                word += and;
            }
        }
            return word;
    }

    //this methods checks the last three digits of a number to decide if the word "and" should  be put before the last three digits
    public String checkLastThreeDigitsForAnd(int number){
        String word = "";
        if(number % 10 != 0){
            word = and;
        }
        return word;
    }
}