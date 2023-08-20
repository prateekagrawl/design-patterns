package Abstract_Factory;

public class AndroidDevFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
    
}
