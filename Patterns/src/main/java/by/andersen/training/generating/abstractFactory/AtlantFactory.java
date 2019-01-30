package by.andersen.training.generating.abstractFactory;

public class AtlantFactory implements AbstractFactory {

    @Override
    public Fridge createFridge() {
        return new FridgeAtlant();
    }

    @Override
    public Washer createWasher() {
        return new WasherAtlant();
    }
}
