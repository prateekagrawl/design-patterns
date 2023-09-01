package Strategy.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle obj = new SportsVehicle(); // creates DriveStrategy obj indirectly of SpecialCategory and 
                                            //internally calls drive() of it
        obj.drive();

        Vehicle obj1 = new PassengerVehicle(); // creates DriveStrategy obj indirectly of NormalCategory and 
                                            //internally calls drive() of it
        obj1.drive();
    }
}
