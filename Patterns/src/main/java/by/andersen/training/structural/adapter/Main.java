package by.andersen.training.structural.adapter;

/***
 * Позволяет объектам с несовместимыми интерфейсами работать вместе
 * +++
 * Отделяет и скрывает от клиента подробности преобразования различных интерфейсов.
 * +++
 * ---
 * Усложняет код программы из-за введения дополнительных классов.
 * ---
 */

public class Main {

    public static void main(String[] args) {
        Print print = new JsonAdapterFromXML("Xml");
        print.printJson(new Json("json"));
    }

}
