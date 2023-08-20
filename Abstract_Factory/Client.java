package Abstract_Factory;

public class Client{
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.salary());
        System.out.println(e1.name());

        System.out.println("--------------");
        
        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(e2.salary());
        System.out.println(e2.name());
    }
}