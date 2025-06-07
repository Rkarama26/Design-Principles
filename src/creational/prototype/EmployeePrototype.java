package creational.prototype;


//Prototype Class
public abstract class EmployeePrototype implements Cloneable{

    protected String name;
    protected String department;
    protected Address address;

    public EmployeePrototype(String name , String department, Address address){
        this.name = name;
        this.department = department;
        this.address = address;
    }

    public EmployeePrototype clone() throws CloneNotSupportedException {

        return (EmployeePrototype) super.clone(); // shallow copy by default
    }

    public abstract void showEmployee();
}
