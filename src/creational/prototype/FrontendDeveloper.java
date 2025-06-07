package creational.prototype;

public class FrontendDeveloper extends EmployeePrototype{


    public FrontendDeveloper(String name, String department, Address address) {
        super(name, department, address);
    }

    @Override
    public void showEmployee() {
        System.out.println("Frontend Developer: "+ name + ", Department: " + department+ ", Address: "+ address.city);
    }
}
