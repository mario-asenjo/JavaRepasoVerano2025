import java.time.LocalDateTime;
import java.util.Scanner;

public class Ej003_MenuOperaciones {

    public static void printMenu() {
        System.out.printf("1. Saludar\n2. Mostrar fecha actual\n3. Salir\n");
    }

    public static short request(Scanner sc) {
        short option;
        System.out.print("Introduce una opcion: ");
        option = sc.nextShort();
        return (option);
    }

    public static void greet()
    {
        System.out.println("Hola!! Como me gusta Java joder.... sudo Java.... ;)");
    }

    public static void showDate() {
        LocalDateTime myLDT;

        myLDT = LocalDateTime.now();
        System.out.printf("Fecha: %s", myLDT.toString());
    }

    public static void exitMessage() {
        System.out.println("Saliendo del programa... Hasta pronto!");
    }

    public static boolean requestOption(Scanner sc) {
        short option;

        printMenu();
        option = request(sc);
        switch (option) {
            case 1:
                greet();
                break;
            case 2:
                showDate();
                break;
            case 3:
                exitMessage();
                return (false);
            default:
                System.out.println("Error: Opcion solo entre 1 y 3...");
        }
        return (true);
    }

    public static void main(String[] args) {
        boolean running;
        Scanner myScanner;

        myScanner = new Scanner(System.in);
        running = true;
        while (running)
            running = requestOption(myScanner);
        myScanner.close();
    }
}
