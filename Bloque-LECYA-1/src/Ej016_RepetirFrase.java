import java.util.Scanner;

public class Ej016_RepetirFrase {

    public static String requestPhrase(Scanner sc) {
        String phrase;

        System.out.print("Introduce una frase: ");
        phrase = sc.nextLine();
        return (phrase);
    }

    public static int requestN(Scanner sc) {
        int res;

        System.out.print("Introduce un numero: ");
        res = sc.nextInt();
        return (res);
    }

    public static void repeatNTimes(String phrase, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(phrase);
        }
    }

    public static void main(String[] args) {
        Scanner mySc;
        String phrase;
        int n;

        mySc = new Scanner(System.in);
        phrase = requestPhrase(mySc);
        n = requestN(mySc);
        repeatNTimes(phrase, n);
        mySc.close();
    }
}
