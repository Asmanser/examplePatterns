package by.andersen.training.structural.facade;

/***
 * Предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.
 * +++
 * Изолирует клиентов от компонентов сложной подсистемы.
 * +++
 * ---
 * Фасад рискует стать божественным объектом, привязанным ко всем классам программы.
 * ---
 */

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Loader loader = new Loader("D:\\WORK\\Andersen\\exampleMyClassLoader\\MyClass.class","by.andersen.training.MyClass");
        Class<?> aClass = loader.load();
        Object o = aClass.newInstance();
    }

}
