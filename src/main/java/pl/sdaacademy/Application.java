package pl.sdaacademy;

public class Application {
    public static void main(String[] args) {

        String input = "dksfgh4738b43b5mbh43mnbmn436bjb56n";
        int i = new NumberAdder(input).addNumbers(input);
        System.out.println(i);
    }
}
