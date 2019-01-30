package by.andersen.training.structural.adapter;

public class Xml {

    private String xml;

    public Xml(String xml) {
        this.xml = xml;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    @Override
    public String toString() {
        return "Xml{" +
                "xml='" + xml + '\'' +
                '}';
    }
}
