public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int square = test.getSquare(80);
        System.out.println(square);

        Box box = new Box();
        box.setDimens(15, 15,15);
        System.out.println(box.volume());
    }
}