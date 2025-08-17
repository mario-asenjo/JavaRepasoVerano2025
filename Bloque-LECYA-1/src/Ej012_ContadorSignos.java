import java.util.Scanner;

public class Ej012_ContadorSignos {

    public static int requestNumber(Scanner sc) {
        int res;

        System.out.print("Introduce un numero: ");
        res = sc.nextInt();
        return (res);
    }

    public static int[] calculateSigns() {
        int input;
        Scanner mySc;
        int[] p_n;

        p_n = new int[2];
        mySc = new Scanner(System.in);
        while ((input = requestNumber(mySc)) != 0) {
            if (input < 0)
                p_n[1]++;
            else
                p_n[0]++;
        }
        return (p_n);
    }

    public static void main(String[] args) {
        int[] positives_negatives;

        positives_negatives = calculateSigns();
        System.out.printf("Positivos: %d\nNegativos: %d\n", positives_negatives[0], positives_negatives[1]);
    }
}
