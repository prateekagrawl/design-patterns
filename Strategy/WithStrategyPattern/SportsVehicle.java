package Strategy.WithStrategyPattern;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
