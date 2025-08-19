import java.util.Scanner;

public class Ej014_MultiplosDeNumero {

    public static int requestNumber(Scanner sc) {
        int res;

        System.out.print("Introduce un numero: ");
        res = sc.nextInt();
        return (res);
    }

    public static void getResult(int nbr) {
        System.out.printf("Multiplos del 1 al 100 de: %d --> ", nbr);
        for (int i = 1; i <= 100; i++) {
            if (nbr % i == 0)
                System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        int nbr;
        Scanner mySc;

        mySc = new Scanner(System.in);
        nbr = requestNumber(mySc);
        getResult(nbr);
        mySc.close();
    }
}
