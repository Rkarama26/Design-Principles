package creational.abstract_factory.factory;

import creational.abstract_factory.WinButton;
import creational.abstract_factory.WinCheckBox;
import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.CheckBox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
