package creational.factory_method;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "TEXT : {}";
    }
}
