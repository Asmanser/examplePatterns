package by.andersen.training.behavioral.strategy;

public class BubleSorting implements Sorting {

    private void toSwap(int first, int second,int[] array){ //метод меняет местами пару чисел массива
        int dummy = array[first];      //во временную переменную помещаем первый элемент
        array[first] = array[second];       //на место первого ставим второй элемент
        array[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
    }

    @Override
    public void sort(int[] array) {
        for (int out = array.length - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(array[in] > array[in + 1])               //Если порядок элементов нарушен
                    toSwap(in, in + 1,array);             //вызвать метод, меняющий местами
            }
        }
    }
}
