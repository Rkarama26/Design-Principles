package creational.abstract_factory;

import creational.abstract_factory.product.Button;

public class WinButton implements Button {

    public String name() {
        return "Win_Button";
    }

    @Override
    public void paint(String colorCode, boolean filled) {

        System.out.println("Button of Color: " + colorCode + "filled: " + filled);

    }

    @Override
    public void size(int h, int w) {
        System.out.println("Button of size: " + h + " and " + w);

    }
}
