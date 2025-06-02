package Factory_Method;

public class JsonMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
