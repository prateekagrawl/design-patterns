package Factory;

/*
 * Factory DP is used when there is a superclass(Employee in our case) and multiple subclasses(WebDeveloper
 * and AndroidDeveloper) and we want to get an object based on the input and requirement(at run time)
 */

public class Developer {
    public static void main(String[] args) {
        
        //* Factory method to call employee
        Employee emp1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(emp1.salary());

        Employee emp2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(emp2.salary());
    }    
}
