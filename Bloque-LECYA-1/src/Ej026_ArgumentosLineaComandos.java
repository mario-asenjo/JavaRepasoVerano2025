public class Ej026_ArgumentosLineaComandos {
    public static void main(String[] args) {
        if (args.length < 1)
            System.err.println("Dame al menos un argumento!!");
        for (String x : args)
            System.out.println(x);
    }
}
