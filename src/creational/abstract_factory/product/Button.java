package creational.abstract_factory.product;


public interface Button {

    void paint(String colorCode, boolean filled);

    void size(int h, int w);

    enum type {WIN, MAC}


}
