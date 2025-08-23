import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Ej024_ContarLetrasFrase {
    public static String requestPhrase(String message, Scanner sc) {
        String phrase;

        System.out.print(message + ": ");
        phrase = sc.nextLine();
        return (phrase);
    }

    public static String clean_phrase(String name) {
        StringBuilder mySB;
        char each;

        mySB = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            each = name.charAt(i);
            if ((each >= 65 && each <= 90) || (each >= 97 && each <= 122))
                mySB.append(each);
        }
        return (mySB.toString().toLowerCase());
    }

    public static Map<Character, Integer> getCharFrecuencies(String phrase) {
        String cleaned;
        Map<Character, Integer> frecuencies;

        cleaned = clean_phrase(phrase);
        frecuencies = new HashMap<Character, Integer>();
        for (int i = 0; i < cleaned.length(); i++) {
            if (!frecuencies.containsKey(cleaned.charAt(i)))
                frecuencies.put(cleaned.charAt(i), 1);
            else
                frecuencies.put(cleaned.charAt(i), frecuencies.get(cleaned.charAt(i)) + 1);
        }
        return (frecuencies);
    }

    public static void printFrecuencies(Map <Character, Integer> frecuencies) {
        System.out.println("Frecuencias de la palabra introducida:");
        for (Map.Entry<Character, Integer> x : frecuencies.entrySet()) {
            System.out.printf("%c: %d\n", x.getKey(), x.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner mySc;
        String phrase;
        Map<Character, Integer> frecuencies;

        mySc = new Scanner(System.in);
        phrase = requestPhrase("Introduce una frase", mySc);
        frecuencies = getCharFrecuencies(phrase);
        printFrecuencies(frecuencies);
        mySc.close();
    }
}
