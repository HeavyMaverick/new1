public class Main {
    public static void main(String[] args) {
        Dog sobaka = new Dog();
        sobaka.speed = 10;
        sobaka.name = "Goofy";
        sobaka.breed = "Labrador";
        sobaka.run();
        System.out.println(sobaka.getInfo());
    }
}