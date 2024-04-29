import test.Empty;

public class Main {
    public static void main(String[] args) {
        int random = 0;
        int i = 9;
        while (i > random){
            random = (int) (Math.random() * 100 + 1);
        }
        String result = String.format("Ваше число: %s Попробуйте еще раз.", random);
        System.out.println(result);
    }
}
