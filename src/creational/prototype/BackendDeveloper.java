package prototype;

public class BackendDeveloper extends EmployeePrototype {


    public BackendDeveloper(String name, String department, Address address) {
        super(name, department, address);
    }

    @Override
    public void showEmployee() {
        System.out.println("Backend Developer: " + name + " Department: " + department + ", Address: " + address.city);
    }

    public BackendDeveloper clone() throws CloneNotSupportedException {
        BackendDeveloper cloned = (BackendDeveloper) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }


}
