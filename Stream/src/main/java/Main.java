import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((int) (Math.random() * 100 + 101));
        }
        List<String> list = numbers.stream()
                .filter(integer -> integer % 5 == 0 && integer % 2 == 0)
                .map(Math::sqrt)
                .map(d -> "Корень: " + d)
                .toList();
        for (String s : list){
            System.out.println(s);
        }
//        List<String> list = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(integer -> "Number: " + integer)
//                .filter(s -> s.endsWith("0"))
//                .map(s -> s + "!")
//                .collect(Collectors.toList());

//        for(String s : list){
//            System.out.println(s);
//        }
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
