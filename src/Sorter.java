
/*
  class Sorter is delegating sort method
 */

public class Sorter implements Sort{

    private final Sort sort;

    public Sorter(Sort sort){
        this.sort = sort;
    }
    @Override
    public void sort(int[] array){
        sort.sort(array);
    }

    }


