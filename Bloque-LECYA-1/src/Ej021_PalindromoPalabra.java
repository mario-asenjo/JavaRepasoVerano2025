import java.util.Scanner;

public class Ej021_PalindromoPalabra {

    public static String requestWord(String message, Scanner sc) {
        String word;

        System.out.print(message + ": ");
        word = sc.nextLine();
        return (word);
    }

    public static boolean isPalindrome(String word) {
        boolean flag;

        flag = false;
        for (int i = word.length(); i > 0; i--) {
            if (word.charAt(word.length() - i) == word.charAt(i - 1))
                flag = true;
            else
                flag = false;
        }
        return (flag);
    }

    public static void printIsPalindrome(String word) {
        if (isPalindrome(word))
            System.out.println("Es palindromo! :)");
        else
            System.out.println("No es palindromo. :(");
    }

    public static void main(String[] args) {
        Scanner mySc;
        String word;

        mySc = new Scanner(System.in);
        word = requestWord("Introduce una palabra", mySc);
        printIsPalindrome(word);
        mySc.close();
    }
}
