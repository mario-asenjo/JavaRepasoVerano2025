import java.util.Scanner;

public class Ej013_EsPrimo {

    public static int requestNumber(Scanner sc) {
        int res;

        System.out.print("Introduce un numero: ");
        res = sc.nextInt();
        return (res);
    }

    public static boolean isPrime(int nbr) {
        int div_count;
        int i;

        div_count = 2;
        i = 2;
        while (i < nbr && div_count < 3)
        {
            if (nbr % i == 0)
                div_count++;
            i++;
        }
        return (div_count == 2);
    }

    public static void printIsPrime(int nbr) {
        if (isPrime(nbr))
            System.out.println("Primo.");
        else
            System.out.println("No primo.");
    }

    public static void main(String[] args) {
        Scanner mySc;
        int nbr;

        mySc = new Scanner(System.in);
        nbr = requestNumber(mySc);
        printIsPrime(nbr);
        mySc.close();
    }
}
