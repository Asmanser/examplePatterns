package by.andersen.training.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Shop extends Observable {

    List<Book> books = new ArrayList<>();

    public void addNewBook(Book book) {
        books.add(book);
        setChanged();
        notifyObservers(book);
    }

}
