package Factory;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting web dev salary");
        return 40000;
    }
    
}
