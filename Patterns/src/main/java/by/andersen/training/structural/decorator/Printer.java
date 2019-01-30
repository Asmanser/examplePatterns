package by.andersen.training.structural.decorator;

public class Printer implements Print {

    private String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
