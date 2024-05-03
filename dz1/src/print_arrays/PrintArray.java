package print_arrays;

public abstract class PrintArray {

    public void print(int[] array){
        for (int i: array) {
            printElement(i);
        }
    }

    public void print(String[] array){
        for (String i: array) {
            printElement(i);
        }
    }

    protected abstract void printElement(int elem);

    protected abstract void printElement(String elem);
}


class PrettyPrintArray extends PrintArray{

    @Override
    protected void printElement(int elem) {
        System.out.print("[" + elem + "]" + " ");
    }

    @Override
    protected void printElement(String elem) {
        System.out.print("[" + elem + "]" + " ");
    }
}

class SimplePrintArray extends PrintArray {

    @Override
    protected void printElement(int elem) {
        System.out.print(elem + " ");
    }

    @Override
    protected void printElement(String elem) {
        System.out.print(elem + " ");
    }
}