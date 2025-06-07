package creational.factory_method;

public class JsonMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
