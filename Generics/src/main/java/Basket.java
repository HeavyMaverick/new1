import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit>{
    private List<T> fruits;
    public Basket(){
        fruits = new ArrayList<>();
    }
    public float getWeight(){
        float w = 0;
        for (T fruit : fruits){
            w += fruit.getWeight();
        }
        return w;
    }
    public void add(T fruit){
        fruits.add(fruit);
    }
    public int compare(Basket<?> basket){
        return Float.compare(getWeight(), basket.getWeight());
    }
    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dst){
        dst.fruits.addAll(src.fruits);
        src.fruits.clear();
    }
}
