import java.util.Scanner;

public class Ej011_SumaHastaCero {

    public static int requestNumber(Scanner sc) {
        int res;

        System.out.print("Introduce un numero a sumar: ");
        res = sc.nextInt();
        return (res);
    }

    public static int acumularHasta0(Scanner sc) {
        int input;
        int result;

        input = 0;
        result = 0;
        do {
            result += input;
            input = requestNumber(sc);
        } while (input != 0);
        return (result);
    }

    public static void main(String[] args) {
        Scanner mySc;
        int result;

        mySc = new Scanner(System.in);
        result = acumularHasta0(mySc);
        System.out.printf("El valor acumulado es: %d", result);
        mySc.close();
    }
}
