import java.util.Arrays;

public class CarArrayList implements CarList{

    private Car[] array = new Car[10];
    private int size = 0;
    @Override
    public Car get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void add(Car car) {
        if (size >= array.length){
            array = Arrays.copyOf(array, array.length*2);
        }
        array[size] = car;
        size++;
//        if (size >= array.length){
//            Car[] newArray = new Car[array.length*2];
//            for (int i = 0; i < array.length; i++){
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }

    }

    @Override
    public boolean remove(Car car) {
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }
    private void checkIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
