package NumberConverterClasses;

public class Driver {
    public static void main(String[] args) {
        WordifiedNumberImpl test = new WordifiedNumberImpl();
        System.out.println(test.toWords(1));
        System.out.println(test.toWords(21));
        System.out.println(test.toWords(105));
        System.out.println(test.toWords(1005));
        System.out.println(test.toWords(110105));
        System.out.println(test.toWords(1000099));
        System.out.println(test.toWords(1000100));
        System.out.println(test.toWords(56945781));
    }
}
