import java.util.*;

public class Ej022_PalindromoFrase {
    public static String requestWord(String message, Scanner sc) {
        String word;

        System.out.print(message + ": ");
        word = sc.nextLine();
        return (word);
    }

    public static String clean(String phrase) {
        StringBuilder mySB;
        Map<Character, Character> accent_raw;
        ArrayList<Character> punctuation;

        mySB = new StringBuilder();
        accent_raw = new HashMap<>(Map.of('á','a','é','e', 'í','i', 'ó','o', 'ú','u'));
        punctuation = new ArrayList<Character>(List.of('.', ';', ','));
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ' && !punctuation.contains(phrase.charAt(i)))
                mySB.append(phrase.charAt(i));
        }
        for (int i = 0; i < mySB.length(); i++) {
            if (accent_raw.containsKey(mySB.charAt(i)))
                mySB.setCharAt(i, accent_raw.get(mySB.charAt(i)));
        }
        return (mySB.toString());
    }

    public static boolean isPalindrome(String word) {
        for (int i = word.length(); i > 0; i--) {
            if (word.charAt(word.length() - i) != word.charAt(i - 1))
                return (false);
        }
        return (true);
    }

    public static void printIsPalindromePhrase(String phrase) {
        String cleaned;

        cleaned = clean(phrase);
        if (isPalindrome(cleaned))
            System.out.println("Es palindromo! :)");
        else
            System.out.println("No es palindromo. :(");
    }

    public static void main(String[] args) {
        Scanner mySc;
        String phrase;

        mySc = new Scanner(System.in);
        phrase = requestWord("Introduce una frase", mySc);
        printIsPalindromePhrase(phrase);
        mySc.close();
    }
}
