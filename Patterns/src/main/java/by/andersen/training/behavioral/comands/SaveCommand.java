package by.andersen.training.behavioral.comands;

public class SaveCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Save");
    }
}
