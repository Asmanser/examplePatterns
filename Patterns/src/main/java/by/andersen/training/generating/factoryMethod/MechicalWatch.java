package by.andersen.training.generating.factoryMethod;

import java.util.Date;

public class MechicalWatch implements Watch {
    @Override
    public void time() {
        System.out.println("Mechical watch: " + new Date());
    }
}
