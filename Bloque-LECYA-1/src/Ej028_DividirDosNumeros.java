public class Ej028_DividirDosNumeros {
    public static void print_err() {
        System.err.println("Tienes que introducir 3 numeros como argumentos\nOBLIGATORIAMENTE.");
    }

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57)
                return (false);
        }
        return (true);
    }

    public static int ascii_to_integer(String str) {
        int res;

        res = 0;
        for (int i = 0; i < str.length(); i++) {
            res = (res * 10) + (str.charAt(i) - 48);
        }
        return (res);
    }

    public static int[] parse_args_to_int(String[] args) {
        int[] arr;

        arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = ascii_to_integer(args[i]);
        }
        return (arr);
    }

    public static int divide(int[] nbrs) {
        if (nbrs[1] == 0)
            throw new ArithmeticException("No se puede dividir entre 0!");
        return (nbrs[0] / nbrs[1]);
    }

    public static void main(String[] args) {
        int result;
        int[] nbrs;

        if (args.length != 2) {
            print_err();
            return ;
        }
        if (!isNumeric(args[0]) || !isNumeric(args[1])) {
            print_err();
            return ;
        }
        nbrs = parse_args_to_int(args);
        try {
            result = divide(nbrs);
            System.out.printf("El resultado es: %d", result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
