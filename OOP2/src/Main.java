public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        box1.lenght = 5;
        box1.height = 5;
        box1.width = 5;
        box2.height = 10;
        box2.lenght = 10;
        box2.width = 10;
        double volume = box1.volume();
        double volume2 = box2.volume();
        System.out.println(volume);
        System.out.println(volume2);
    }
}