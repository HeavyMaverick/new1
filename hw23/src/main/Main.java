package main;

import interfaces.Drivable;
import workers.Chef;
import workers.Coder;
import workers.Driver;
import workers.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        Chef chef = new Chef("Chef");
        Coder coder = new Coder("Coder");
        Driver driver = new Driver("Driver");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(chef);
        workers.add(driver);
        workers.add(coder);
        for (Worker worker : workers) {
            worker.voice();
        }
        for (Worker worker : workers) {
            worker.work();
        }
//        ArrayList<Drivable> drivers = new ArrayList<>();
//        drivers.add(driver);
//        drivers.add(driver2);
//        drivers.add(driver3);
//        for (Drivable i : drivers) {
//            i.driveVehicle();
//        }
    }
}
