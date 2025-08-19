import java.util.Scanner;

public class Ej015_ImparesEntreDos {

    public static int requestNumber(String message, Scanner sc) {
        int res;

        System.out.print(message + ": ");
        res = sc.nextInt();
        return (res);
    }

    public static void printOdds(int start, int end) {
        System.out.printf("Los impares entre %d y %d --> ", start, end);
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0)
                System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        Scanner mySc;
        int start;
        int end;

        mySc = new Scanner(System.in);
        start = requestNumber("Introduce el primer numero", mySc);
        end = requestNumber("Introduce el ultimo numero", mySc);
        printOdds(start, end);
        mySc.close();
    }
}
