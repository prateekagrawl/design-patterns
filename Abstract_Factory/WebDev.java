package Abstract_Factory;

public class WebDev implements Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I am web developer");
        return "web developer";
    }
    
}
