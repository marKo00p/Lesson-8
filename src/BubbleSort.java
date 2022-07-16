import java.util.Arrays;
public class BubbleSort implements Sort{

    /* method perform the bubble sort
     variable i is for outer loop
     variable j is for inner loop
     variable temp is for swap
     variable flag mark if the elements have been rearranged
     */
        @Override
        public void sort(int[] array){
            int[] bubbleSortArray = new int[array.length];
            for(int i = 0; i < array.length - 1; i++) {
                boolean flag = false;
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {  //comparing two elements and the greater number goes to the max index
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        flag = true;
                    }
                }
                if(!flag){
                    break;
                }
            }
            System.out.println("Sorted by Bubble Sort: " + Arrays.toString(array));
        }
}
