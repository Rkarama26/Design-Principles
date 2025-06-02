package Factory_Method;

public class JsonMessage extends Message{

    @Override
    public String getContent() {
        return "{\"JSON]\" : []}";
    }
}
