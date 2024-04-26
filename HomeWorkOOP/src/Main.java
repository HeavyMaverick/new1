public class Main {
    public static void main(String[] args) {
        Human Mike = new Human();
        Human Austin = new Human();
        Human Josh = new Human();
        Mike.age = 35;
        Mike.name = "Mike";
        Mike.weight = 65;
        Austin.age = 20;
        Austin.name = "Austin";
        Austin.weight = 70;
        Josh.weight = 105;
        Josh.name = "Josh";
        Josh.age = 51;
        double summary = (double) (Josh.age + Austin.age + Mike.age) / 3;
        System.out.println(summary);

    }
}