package by.andersen.training.behavioral.strategy;

import java.util.Arrays;

public class Array {

    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void sort(Sorting sorting) {
        sorting.sort(array);
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
