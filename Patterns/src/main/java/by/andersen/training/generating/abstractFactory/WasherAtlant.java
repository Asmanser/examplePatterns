package by.andersen.training.generating.abstractFactory;

import java.util.Date;

public class WasherAtlant implements Washer {

    @Override
    public void time() {
        System.out.println("The time washer: " + new Date());
    }
}
