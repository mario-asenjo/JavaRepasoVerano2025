import java.util.Scanner;

public class Ej20_SumaDigitos {

    public static int requestNumber(String message, Scanner sc) {
        int res;

        System.out.print(message + ": ");
        res = sc.nextInt();
        return (res);
    }

    public static void sumDigits(int nbr) {
        int res;
        int sum;

        sum = 0;
        nbr *= 10;
        while ((nbr /= 10) > 0)
            sum += nbr % 10;
        System.out.printf("El numero es: %d\n", sum);
    }
    public static void main(String[] args) {
        Scanner mySc;
        int nbr;

        mySc = new Scanner(System.in);
        nbr = requestNumber("Introduce un numero", mySc);
        sumDigits(nbr);
    }
}
