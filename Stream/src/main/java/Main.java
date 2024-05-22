import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Director director = new Director();
//        String result = director.force((int n) -> {
//           for (int i =0; i< n; i++){
//               System.out.println("1111");
//           }
//            return "Sss";
//        }, 5);
//        System.out.println("Result");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, i -> i % 2 == 0);
        for (int i: filtered){
            System.out.println(i);
        }
    }
    private static List<Integer> filter(List<Integer> list ,Predicate predicate){
        List<Integer> result = new ArrayList<>();
        for (int i:list){
            if (predicate.test(i)){
                result.add(i);
            }
        }
        return result;
    }
}
