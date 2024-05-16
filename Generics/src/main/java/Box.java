import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Box<T extends Number> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Box(T... array) {
        this.array = array;
    }

    public double avg(){
        double result = 0;
        for (T e : array){
            result += ((Number) e).doubleValue();
        }
        return result / array.length;
    }

    public int compare(Box<? extends Number> another){
        if (avg() > another.avg()){
            return 1;
        } else if (avg() == another.avg()){
            return 0;
        } else {
            return -1;
        }
    }
    public void method(List<? extends Number> numbers){

    }
    public static <U> U getFirstElement(List<U> list){
        return list.getFirst();
    }
    public static <U> void transfer(List<? extends U> src, List<? super U> dst){
        dst.addAll(src);
        src.clear();
    }
}