package Factory_Method;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "TEXT : {}";
    }
}
