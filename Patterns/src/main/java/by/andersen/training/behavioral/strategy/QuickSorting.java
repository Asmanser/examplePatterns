package by.andersen.training.behavioral.strategy;

public class QuickSorting implements Sorting {

    private int[] array;

    @Override
    public void sort(int[] array) {
        this.array = array;
        sort(0,array.length - 1);
    }

   private void sort(int start, int end) {
        if (start >= end)
            return;
        int current = (start + end) / 2;
        int  i = start;
        int j = end;
        while(i < j) {
            while(i < current && array[current] >= array[i])
                i++;
            while(j > current && array[current] <= array[j])
                j--;
            if(i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if(i == current) {
                    current = j;
                } else {
                    if(j == current) {
                        current = i;
                    }
                }
            }
        }
        sort(start, current);
        sort(current + 1, end);
    }


}
