import java.util.Scanner;

public class Ej023_ContarLetrasNombre {
    public static String requestWord(String message, Scanner sc) {
        String word;

        System.out.print(message + ": ");
        word = sc.nextLine();
        return (word);
    }

    public static String clean_name(String name) {
        StringBuilder mySB;
        char each;

        mySB = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            each = name.charAt(i);
            if ((each >= 65 && each <= 90) || (each >= 97 && each <= 122))
                mySB.append(each);
        }
        return (mySB.toString());
    }

    public static int count_letters(String name) {
        int count;

        count = 0;
        for (int i = 0; i < name.length(); i++)
            count++;
        return (count);
    }

    public static void main(String[] args) {
        Scanner mySc;
        String input;
        String cleaned_name;
        int len;

        mySc = new Scanner(System.in);
        input = requestWord("Introduce tu nombre", mySc);
        cleaned_name = clean_name(input);
        len = count_letters(cleaned_name);
        System.out.printf("La longitud de %s es: %d", cleaned_name, len);
        mySc.close();
    }
}
