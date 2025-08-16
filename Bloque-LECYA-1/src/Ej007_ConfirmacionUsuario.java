import java.util.Scanner;

public class Ej007_ConfirmacionUsuario {
    public static void promptMessage() {
        System.out.print("¿Deseas Continuar? ('S' o 'N'): ");
    }

    public static String requestChar(Scanner sc) {
        return (sc.nextLine());
    }

    public static boolean checkConfirmation(Scanner sc) {
        String a;

        promptMessage();
        a = requestChar(sc);
        return (!a.equalsIgnoreCase("s") && !a.equalsIgnoreCase("n"));
    }

    public static void main(String[] args) {
        Scanner mySc;
        boolean running;

        mySc = new Scanner(System.in);
        do {
            running = checkConfirmation(mySc);
        } while (running);
        mySc.close();
    }
}
