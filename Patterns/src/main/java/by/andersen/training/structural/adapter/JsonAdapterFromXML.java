package by.andersen.training.structural.adapter;

public class JsonAdapterFromXML extends Xml implements Print {

    public JsonAdapterFromXML(String xml) {
        super(xml);
    }

    @Override
    public void printJson(Json json) {
        setXml(json.getJson());
        System.out.println(super.toString());
    }
}
