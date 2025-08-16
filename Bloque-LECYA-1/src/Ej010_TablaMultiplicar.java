import java.util.Scanner;

public class Ej010_TablaMultiplicar {

    public static int requestNumber(Scanner sc) {
        System.out.print("Introduce un numero: ");
        return (sc.nextInt());
    }

    public static void printTable(int nbr) {
        for (int i = 1; i < 11; i++)
            System.out.printf("%d x %d = %d\n", nbr, i, nbr * i);
    }

    public static void main(String[] args) {
        Scanner mySc;
        int nbr;

        mySc = new Scanner(System.in);
        nbr = requestNumber(mySc);
        printTable(nbr);
        mySc.close();
    }
}
