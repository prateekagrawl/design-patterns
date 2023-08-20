package Abstract_Factory;

public class WebDevFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee() {
        return new WebDev();
    }
    
}
