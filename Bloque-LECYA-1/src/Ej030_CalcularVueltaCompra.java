import java.util.*;

public class Ej030_CalcularVueltaCompra {

    public static int requestNumber(String str, Scanner sc) {
        System.out.print(str + ": ");
        return ((int)(sc.nextDouble() * 100));
    }

    public static Map<Integer, Integer> descomposicion_diferencia(int price, int given) {
        int difference;
        int ammount;
        int[] correspondencias;
        Map<Integer, Integer> res;

        difference = given - price;
        res = new LinkedHashMap<Integer, Integer>();
        correspondencias = new int[]{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < correspondencias.length; i++) {
            ammount = difference / correspondencias[i];
            if (ammount > 0) {
                res.put(correspondencias[i], ammount);
                difference %= correspondencias[i];
            }
        }
        return (res);
    }

    public static void print_change_in_euros(Map<Integer,Integer> map) {
        if (map.isEmpty()) {
            System.out.println("No ha nada que devolver!!");
            return ;
        }
        for (Map.Entry<Integer,Integer> x : map.entrySet()) {
            if (x.getKey() >= 500)
                System.out.printf("%d billete(s) de %d €\n", x.getValue(), (x.getKey() / 100));
            else if (x.getKey() >= 100 && x.getKey() < 500)
                System.out.printf("%d moneda(s) de %d €.\n", x.getValue(), (x.getKey() / 100));
            else
                System.out.printf("%d moneda(s) de %d centimos.\n", x.getValue(), x.getKey());
        }
    }

    public static void main(String[] args) {
        Scanner mySc;
        int price;
        int given;
        Map<Integer, Integer> result;

        mySc = new Scanner(System.in);
        price = requestNumber("Introduce el precio del articulo", mySc);
        given = requestNumber("Introduce la cantidad pagada", mySc);
        result = descomposicion_diferencia(price, given);
        print_change_in_euros(result);
        mySc.close();
    }
}
