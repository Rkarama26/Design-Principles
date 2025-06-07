package creational.factory_method;

public class Main {

    public static void main(String[] args) {

        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());

    }

    public static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
