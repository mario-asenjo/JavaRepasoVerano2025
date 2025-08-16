
import java.util.Scanner;

public class Ej002_ClasificaEdad {

    public static int entradaDatos() {
        Scanner sc;
        int     edad;
        
        sc = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        edad = sc.nextInt();
        sc.close();
        return (edad);
    }

    public static String clasificarEdad(int edad) {
        String  result;

        if (edad < 18)
            result = "Menor de edad.";
        else if (edad < 65)
            result = "Adulto.";
        else
            result = "Mayor de 65 años.";
        return (result);
    }

    public static void imprimirResultado(String resultado)
    {
        System.out.printf("Segun tu edad, eres: %s\n", resultado);
    }

    public static void main(String[] args) {
        int     edad;
        String  resultado;

        edad = entradaDatos();
        resultado = clasificarEdad(edad);
        imprimirResultado(resultado);
    }
}
