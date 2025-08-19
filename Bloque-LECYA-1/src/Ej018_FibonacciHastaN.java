import java.util.Scanner;

public class Ej018_FibonacciHastaN {
    public static int requestNumber(String message, Scanner sc) {
        int res;

        System.out.print(message + ": ");
        res = sc.nextInt();
        return (res);
    }

    public static int fib(int n) {
        if (n == 0) {
            return (0);
        }
        if (n == 1) {
            return (1);
        }
        return (fib(n-1)+fib(n-2));
    }

    public static void printFibN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", fib(i));
        }
    }
    public static void main(String[] args) {
        Scanner mySc;
        int n;

        mySc = new Scanner(System.in);
        n = requestNumber("Introduce un termino", mySc);
        printFibN(n);
        mySc.close();
    }
}
