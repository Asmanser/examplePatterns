package by.andersen.training.structural.decorator;

public abstract class PrintDecorator implements Print{

    private Print print;

    public PrintDecorator(Print print) {
        this.print = print;
    }

    @Override
    public void printMessage() {
        print.printMessage();
    }

    @Override
    public void setMessage(String message) {
        print.setMessage(message);
    }

    @Override
    public String getMessage() {
        return print.getMessage();
    }
}
