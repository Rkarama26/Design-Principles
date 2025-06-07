package structural.adapter;

public class Main {


    public static void main(String[] args) {

        // Class Adapter Pattern
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        BussinessCardDesigner designer = new BussinessCardDesigner();
        populateEmployeeData(adapter);
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("*****************************************");

        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);

    }

    public static void populateEmployeeData(Employee employee) {

        employee.setFullName("Rohit");
        employee.setJobTitle("Developer");
        employee.setOfficeLocation("Los Angles");
    }

}
