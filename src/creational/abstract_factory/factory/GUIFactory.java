package creational.abstract_factory.factory;

import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.CheckBox;

public interface GUIFactory {

    Button createButton();


    CheckBox createCheckBox();

}
