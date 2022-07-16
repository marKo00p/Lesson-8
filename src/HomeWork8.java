
public class HomeWork8 {
    private static final int[] UNSORTED_ARRAY = {34,1,9,0,21,3};

    public static void main(String[] args) {

        Sorter array1 = new Sorter(new BubbleSort());
        Sorter array2 = new Sorter(new SelectionSort());

        array1.sort(UNSORTED_ARRAY);
        array2.sort(UNSORTED_ARRAY);

    }
}
