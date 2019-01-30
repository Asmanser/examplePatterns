package by.andersen.training.generating.factoryMethod;

import java.util.Date;

public class DigitalWatch implements Watch {

    @Override
    public void time() {
        System.out.println("Digital watch: " + new Date());
    }
}
