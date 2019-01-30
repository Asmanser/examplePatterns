package by.andersen.training.structural.adapter;

public class Printer implements Print {

    @Override
    public void printJson(Json json) {
        System.out.println(json);
    }
}
