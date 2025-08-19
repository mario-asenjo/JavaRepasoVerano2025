import java.util.Scanner;

public class Ej019_InvertirPalabra {
    public static String requestWord(String message, Scanner sc) {
        String word;

        System.out.print(message + ": ");
        word = sc.nextLine();
        return (word);
    }

    public static void printStringReverse(String word) {
        System.out.print("String inversa: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner mySc;
        String word;

        mySc = new Scanner(System.in);
        word = requestWord("Introduce una palabra", mySc);
        printStringReverse(word);
        mySc.close();
    }
}
