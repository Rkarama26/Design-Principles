package creational.abstract_factory.product;

public interface CheckBox {

    boolean isCheckBox();

    void size(int rows, int cols);

    enum type {WIN, MAC}

}
