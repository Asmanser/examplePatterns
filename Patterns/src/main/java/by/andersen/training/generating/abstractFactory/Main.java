package by.andersen.training.generating.abstractFactory;

/***
 * Позволяет создавать семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов.
 * +++
 * Гарантирует сочетаемость создаваемых продуктов.
 * Избавляет клиентский код от привязки к конкретным классам продуктов.
 * Выделяет код производства продуктов в одно место, упрощая поддержку кода.
 * Упрощает добавление новых продуктов в программу.
 * Реализует принцип открытости/закрытости.
 * +++
 * ---
 * Усложняет код программы из-за введения множества дополнительных классов.
 * Требует наличия всех типов продуктов в каждой вариации.
 * ---
 */

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AtlantFactory();
        Washer washer = abstractFactory.createWasher();
        Fridge fridge = abstractFactory.createFridge();
        washer.time();
        fridge.countProduct();
    }

}
