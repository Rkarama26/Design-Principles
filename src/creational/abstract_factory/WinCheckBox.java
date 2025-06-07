package creational.abstract_factory;

import creational.abstract_factory.product.CheckBox;

public class WinCheckBox implements CheckBox {

    @Override
    public boolean isCheckBox() {
        return true;
    }

    @Override
    public void size(int rows, int cols) {
        System.out.println("CheckBox contains "+ rows + " rows " + cols + " cols ");
    }

    public String name(){
        return "Win_CheckBox";
    }
}
