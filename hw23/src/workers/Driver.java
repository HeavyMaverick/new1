package workers;

import interfaces.Drivable;

public class Driver extends Worker implements Drivable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driveVehicle() {
        System.out.println("Водитель поехал");
    }

    @Override
    public void work() {
        driveVehicle();
    }
}
