package creational.abstract_factory.factory;

import creational.abstract_factory.MacButton;
import creational.abstract_factory.MacCheckBox;
import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.CheckBox;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
