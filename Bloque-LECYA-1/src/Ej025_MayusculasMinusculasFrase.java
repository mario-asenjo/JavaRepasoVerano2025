import java.util.Scanner;

public class Ej025_MayusculasMinusculasFrase {

    public static String requestPhrase(String message, Scanner sc) {
        String phrase;

        System.out.print(message + ": ");
        phrase = sc.nextLine();
        return (phrase);
    }

    public static String toUpper(String str) {
        StringBuilder mySB;

        mySB = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 97 && str.charAt(i) <= 122))
                mySB.append((char)(str.charAt(i) - 32));
            else
                mySB.append(str.charAt(i));
        }
        return (mySB.toString());
    }

    public static String toLower(String str) {
        StringBuilder mySB;

        mySB = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90))
                mySB.append((char)(str.charAt(i) + 32));
            else
                mySB.append(str.charAt(i));
        }
        return (mySB.toString());
    }

    public static void main(String[] args) {
        Scanner mySc;
        String phrase;

        mySc = new Scanner(System.in);
        phrase = requestPhrase("Introduce una frase", mySc);
        System.out.println(toUpper(phrase));
        System.out.println(toLower(phrase));
    }
}
