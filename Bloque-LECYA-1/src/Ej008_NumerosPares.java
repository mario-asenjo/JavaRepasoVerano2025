public class Ej008_NumerosPares {

    public static boolean checkEven(int nbr) {
        return (nbr % 2 == 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (checkEven(i))
                System.out.printf("%d ", i);
        }

    }
}
