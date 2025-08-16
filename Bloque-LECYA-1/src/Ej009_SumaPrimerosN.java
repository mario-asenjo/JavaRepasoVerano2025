import java.util.Scanner;

public class Ej009_SumaPrimerosN {

    public static int requestN(Scanner sc) {
        System.out.print("Introduce un numero: ");
        return (sc.nextInt());
    }

    public static int sum_N_naturalNumbers(int n) {
        int res;
        int i;

        res = 0;
        i = 0;
        while (++i <= n)
            res+=i;
        return (res);
    }

    public static void main(String[] args) {
        Scanner mySc;
        int n;
        int result;

        mySc = new Scanner(System.in);
        n = requestN(mySc);
        result = sum_N_naturalNumbers(n);
        System.out.printf("La suma de los primeros %d numeros es: %d", n, result);
    }
}
