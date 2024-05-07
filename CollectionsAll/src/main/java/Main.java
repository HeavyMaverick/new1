import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CarCollection list = new CarArrayList();
        for (int i = 0; i < 100; i++){
            list.add(new Car("Brand" + i, i));
        }
        for (Car car : list){
            System.out.println(car.getBrand() + " " + car.getNumber());
        }
    }
}
