import java.util.ArrayList;
import java.util.Scanner;

public class Ej017_MayorNumero {

    public static int requestNumber(String message, Scanner sc) {
        int res;

        System.out.print(message + ": ");
        res = sc.nextInt();
        return (res);
    }

    public static void findGreatest(Scanner sc) {
        int nbr;
        int greatest;

        greatest = 0;
        System.out.println("Introduce numeros hasta -1:");
        while ((nbr = requestNumber("N", sc)) != -1) {
            if (nbr > greatest)
                greatest = nbr;
        }
        System.out.printf("El mayor numero introducido es: %d\n", greatest);
    }

    public static void main(String[] args) {
        Scanner mySc;

        mySc = new Scanner(System.in);
        findGreatest(mySc);
        mySc.close();
    }
}
