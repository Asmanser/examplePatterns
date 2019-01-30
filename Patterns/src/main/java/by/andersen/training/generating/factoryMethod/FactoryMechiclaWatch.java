package by.andersen.training.generating.factoryMethod;

public class FactoryMechiclaWatch implements FactoryWatch {

    @Override
    public Watch createWatch() {
        return new MechicalWatch();
    }
}
