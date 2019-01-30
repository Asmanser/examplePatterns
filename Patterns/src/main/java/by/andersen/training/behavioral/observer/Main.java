package by.andersen.training.behavioral.observer;

/***
 * Позволяет одному объекту получать уведомления об изменении другого объекта
 *
 * +++
 * Издатели не зависят от конкретных классов подписчиков и наоборот.
 * Вы можете подписывать и отписывать получателей на лету.
 * Реализует принцип открытости/закрытости.
 * +++
 * ---
 * Подписчики оповещаются в случайном порядке.
 * ---
 */

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Listener listener = new Listener();
        shop.addObserver(listener);
        Book book1 = new Book("Герберт Шилдт","Java 8. Полное руководство 9-е издание");
        shop.addNewBook(book1);
    }

}
