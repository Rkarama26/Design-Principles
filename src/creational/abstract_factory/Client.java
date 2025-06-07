package creational.abstract_factory;

import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.WinFactory;
import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.CheckBox;

public class Client {

    private GUIFactory factory;

    public Client(GUIFactory factory){
        this.factory = factory;
    }

    public Button createUI(){
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        return button;

    }

    public static void main(String[] args) {

        Client UI = new Client(new WinFactory());
        Button button = UI.createUI();
        button.size(5, 5);
        button.paint("#4556 ", true);
    }
}
