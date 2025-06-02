package simple_factory;

public class Sedan extends Car{


    public int sedanModel;

    public String sedanType;


    public int getSedanModel() {
        return sedanModel;
    }

    public void setSedanModel(int sedanModel) {
        this.sedanModel = sedanModel;
    }

    public String getSedanType() {
        return sedanType;
    }

    public void setSedanType(String sedanType) {
        this.sedanType = sedanType;
    }
}
