package by.andersen.training.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Listener implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The shop has new book: " + arg);
    }
}
