import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        for (int i = 0; i<100; i++){
            cars.add(new Car("Brand" + i, i));
        }
        for(Car car : cars){
            System.out.println(car);
        }
    }
}
