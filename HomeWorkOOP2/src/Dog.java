public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        String s = "";
        for (int i = 1; i < speed + 1; i++) {
            s += "Run";
            if (i != speed) {
                s += ", ";
            }
        }
        System.out.println(s);
    }

    String getInfo() {
        return name + " " + breed + " " + speed;
    }
}
