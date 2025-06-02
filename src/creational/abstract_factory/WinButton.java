package creational.abstract_factory;

import creational.abstract_factory.product.Button;

public class WinFactory implements Button {
    @Override
    public void paint() {
        System.out.println("Button of blue color");
    }

    @Override
    public void size() {
        System.out.println("Button size 2*3 ");
    }
}
