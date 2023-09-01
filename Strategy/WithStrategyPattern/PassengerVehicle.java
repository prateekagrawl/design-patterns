package Strategy.WithStrategyPattern;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDriveStrategy()); //calls parent class driveStartegyObj
    }
    
}
