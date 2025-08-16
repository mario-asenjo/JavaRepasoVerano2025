public class Ej001_ImprimeDatosPersonales {
    
    public static void imprimirDatos() {
        String  nombreCompleto;
        String  ciclo;
        byte    edad;

        nombreCompleto = "Mario";
        ciclo = "DAM";
        edad = 22;
        System.out.printf("%s, %d y %s", nombreCompleto, edad, ciclo);
    }

    public static void main(String[] args) {
        imprimirDatos();
    }
}