package by.andersen.training.generating.factoryMethod;

public class FactoryDigitalWatch implements FactoryWatch {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
