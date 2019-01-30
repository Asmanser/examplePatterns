package by.andersen.training.structural.decorator;

public class EncodePrintDecorator extends PrintDecorator {

    public EncodePrintDecorator(Print print) {
        super(print);
    }

    @Override
    public void printMessage() {
        StringBuffer stringBuffer = new StringBuffer(super.getMessage());
        for(int i = 0; i < stringBuffer.length(); i++) {
            stringBuffer.replace(i,i + 1,Character.toString((char)(stringBuffer.charAt(i) + 1)));
        }
        setMessage(stringBuffer.toString());
        super.printMessage();
    }
}
