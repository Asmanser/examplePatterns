package by.andersen.training.generating.singleton;

public class Director {

    private static Director director = null;

    private Director(){}

    public synchronized static Director getInstance() {
        if (director == null) {
            director = new Director();
        }
        return director;
    }

    public void print(String s) {
        System.out.println(s);
    }

}
