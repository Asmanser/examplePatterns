package by.andersen.training.behavioral.comands;

public class DeleteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Delete");
    }
}
