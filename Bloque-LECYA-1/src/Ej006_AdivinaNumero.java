import java.util.Random;
import java.util.Scanner;

public class Ej006_AdivinaNumero {
    public static int initRand(int bound) {
        Random rnd;
        rnd = new Random();
        return (rnd.nextInt(100));
    }

    public static int requestOption(Scanner sc) {
        System.out.print("Introduce un numero: ");
        return (sc.nextInt());
    }

    public static boolean guessNbr(Scanner sc, int nbr) {
        int guess;

        guess = requestOption(sc);
        if (guess == nbr) {
            System.out.printf("Correcto!! Tu num -> %d El mio -> %d\n", guess, nbr);
            return (false);
        }
        if (guess < nbr)
            System.out.println("Mayor.");
        else
            System.out.println("Menor.");
        return (true);
    }

    public static void main(String[] args) {
        Scanner mySc;
        int nbr;
        boolean running;

        mySc = new Scanner(System.in);
        nbr = initRand(100);
        running = true;
        while (running)
            running = guessNbr(mySc, nbr);
        mySc.close();
    }
}
