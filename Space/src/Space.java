import java.lang.runtime.SwitchBootstraps;
import java.util.SortedMap;

public class Space {
    public static void main(String[] args){
        int numberOfMonth = 5;
        switch (numberOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Месяц не существует");
        }
        String first = "Hello";
        String second = "Hello";
        if (first.equals(second)){
            System.out.println("1");
        }
    }
}
