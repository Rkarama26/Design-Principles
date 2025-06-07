package creational.prototype;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Delhi");

        //Original obj
        FrontendDeveloper dev1 = new FrontendDeveloper("Rohit", "FRONTEND", address);
        BackendDeveloper dev2 = new BackendDeveloper("swaleha", "BACKEND", address);


        //Cloned obj

//        Shallow copy creates a new object, but it only copies references fpr any object fields instead
//         of duplicating.
        FrontendDeveloper clonedDev1 = (FrontendDeveloper) dev1.clone();


        BackendDeveloper clonedDev2 = (BackendDeveloper) dev2.clone();
//      Shallow copy - changing address in clonedDev1 will also change in original object
        //clonedDev1.address.city = "Banglore";


        // Deep copy
        clonedDev2.address.city = "Mumbai";


        dev1.showEmployee();
        clonedDev1.showEmployee();

        dev2.showEmployee();
        clonedDev2.showEmployee();
    }
}
