public class Ej027_MultiplicaTresNumeros {

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

    public static int multiply(int[] args) {
        return (args[0] * args[1] * args[2]);
    }

    public static void main(String[] args) {
        int result;
        int[] int_args;

        if (args.length != 3)
        {
            print_err();
            return ;
        }
        if (!isNumeric(args[0]) || !isNumeric(args[1]) || !isNumeric(args[2]))
        {
            print_err();
            return ;
        }
        int_args = parse_args_to_int(args);
        result = multiply(int_args);
        System.out.printf("El resultado es: %d\n", result);
    }
}
