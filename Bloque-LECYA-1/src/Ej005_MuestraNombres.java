public class Ej005_MuestraNombres {

    public static String[] initArray(int size) {
        int      i;
        String[] arr = new String[size];

        i = -1;
        while (++i < size)
            arr[i] = "InitializacionPorDefecto";
        return (arr);
    }

    public static void printArray(String[] arr, int size) {
        int i;

        i = 0;
        for(String x : arr)
            System.out.printf("S%d: %s\n", i++, x);
    }

    public static void main(String[] args) {
        int size;
        String[] arr;

        size = 4;
        arr = initArray(size);
        printArray(arr, size);
    }
}
