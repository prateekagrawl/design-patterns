package Strategy.WithStrategyPattern;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    Vehicle(DriveStrategy obj){
        this.driveStrategyObj = obj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
    
}
