package by.andersen.training.generating.abstractFactory;

import java.util.Random;

public class FridgeAtlant implements Fridge {

    @Override
    public void countProduct() {
        System.out.println(new Random().nextInt() % 100);
    }
}
