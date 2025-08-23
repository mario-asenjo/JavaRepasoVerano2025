import java.util.Scanner;

public class Ej029_PrimerUltimaLetra {

    public static String requestPhrase(String message, Scanner sc) {
        String phrase;

        System.out.print(message + ": ");
        phrase = sc.nextLine();
        return (phrase);
    }

    public static void printFirstLast(String str) {
        System.out.printf("%c-%c",str.charAt(0), str.charAt(str.length()-1));
    }

    public static void main(String[] args) {
        Scanner mySc;
        String phrase;

        mySc = new Scanner(System.in);
        phrase = requestPhrase("Introduce una frase", mySc);
        printFirstLast(phrase);
    }
}
