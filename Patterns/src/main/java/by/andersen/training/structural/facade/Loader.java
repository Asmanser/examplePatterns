package by.andersen.training.structural.facade;

import by.andersen.training.MyClassLoader;

public class Loader {

    private MyClassLoader myClassLoader;
    private String name;

    public Loader(String path,String name) {
        this.name = name;
        this.myClassLoader = new MyClassLoader(path);
    }

    public Class<?> load() throws ClassNotFoundException {
        myClassLoader.cashLoad(name);
        return myClassLoader.loadClass(name);
    }

}
