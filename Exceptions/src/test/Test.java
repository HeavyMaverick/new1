package test;

public class Test {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] += i;
        }
        for (int i :numbers){
            System.out.println(i);
        }
        try {
            System.out.println(numbers[12]);
        } catch (Exception e){
            assert System.out != null;
            System.out.println("Ошибка");
        } finally {
            assert System.out != null;
            System.out.println("Мы в блоке finally");
        }
    }
}
