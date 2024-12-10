package Abstract_Factory;

/*
 * Abstract DP adds another layer of abstraction. Called factory of factories.
 * EmployeeFactory class doesn't know itself which object is going to be called unlike the case of Factory DP where it knew.
 */

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