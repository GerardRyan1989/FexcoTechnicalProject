package NumberConverterClasses;

import java.util.HashMap;

public class EnglishWords {
    HashMap<String, String> oneToNineteen = new HashMap<>();
    HashMap<String, String> tens = new HashMap<>();


    public final String thousands = "Thousand";
    public final String million = "Million";

    public EnglishWords() {
        //Store the variables for oneToNineteen in HashMap
        oneToNineteen.put("0", "");
        oneToNineteen.put("1", "One ");
        oneToNineteen.put("2", "Two ");
        oneToNineteen.put("3", "Three ");
        oneToNineteen.put("4", "Four ");
        oneToNineteen.put("5", "Five ");
        oneToNineteen.put("6", "Six ");
        oneToNineteen.put("7", "Seven ");
        oneToNineteen.put("8", "Eight ");
        oneToNineteen.put("9", "Nine ");
        oneToNineteen.put("10", "Ten ");
        oneToNineteen.put("11", "Eleven ");
        oneToNineteen.put("12", "Twelve ");
        oneToNineteen.put("13", "Thirteen ");
        oneToNineteen.put("14", "Fourteen ");
        oneToNineteen.put("15", "Fifteen ");
        oneToNineteen.put("16", "Sixteen ");
        oneToNineteen.put("17", "Seventeen ");
        oneToNineteen.put("18", "Eighteen ");
        oneToNineteen.put("19", "Nineteen ");

        //store the variables for tens in HashMap
        tens.put("0", "");
        tens.put("1", "Ten ");
        tens.put("2", "Twenty ");
        tens.put("3", "Thirty ");
        tens.put("4", "Forty ");
        tens.put("5", "Fifty ");
        tens.put("6", "Sixty ");
        tens.put("7", "Seventy ");
        tens.put("8", "Eighty ");
        tens.put("9", "Ninety ");
    }


    public String returnword(String value, String number) {
        String word = "";
        if (value.equals("oneToNineteen")) {
           word = oneToNineteen.get(number);
        } else if (value.equals("tens")) {
            word = tens.get(number);
        }
            return word;
    }
}