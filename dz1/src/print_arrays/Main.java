package print_arrays;

public class Main {

    static int[] array = new int[]{1,2,3,4};
    static String[] arrayString = new String[]{"red","white","blue"};

    public static void main(String[] args) {

        print_arrays.PrintArray[] printArrays = new print_arrays.PrintArray[]{
                new print_arrays.PrettyPrintArray(),
                new print_arrays.SimplePrintArray(),
        };

        for (int i = 0; i < printArrays.length; i++) {
            printArrays[i].print(array);
            System.out.println();
        }

        SimplePrintArray simplePrintArray = new SimplePrintArray();
        PrettyPrintArray prettyPrintArray = new PrettyPrintArray();
        printArrays(prettyPrintArray, arrayString);

    }

    public static void printArrays(PrintArray printArray, String[] array){
        printArray.print(array);
    }

    public static void printArrays(print_arrays.SimplePrintArray printArray, String[] array){
        printArray.print(array);
    }

    public static void printArrays(print_arrays.PrettyPrintArray printArray, String[] array){
        printArray.print(array);
    }

}