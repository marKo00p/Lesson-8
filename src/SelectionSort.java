import java.util.Arrays;
public class SelectionSort implements Sort{
    /* method perform selection sort
    variable i is for outer loop
    variable j is for inner loop
    variable temp is for swap
     */
    @Override
    public void sort(int[] array){
        int[] selectionSortArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int min = i; // suggesting that the element with index 0 is minimal
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){  //comparing two elements and smaller goes to min index
                    int temp = array[j];
                    array[j] = array[min];
                    array[min] = temp;
                }
            }
        }
        System.out.println("Sorted by Selection Sort: " + Arrays.toString(array));
    }

}
