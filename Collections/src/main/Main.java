package main;

public class Main {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        String name = s.substring(4, 8);
        int age = Integer.parseInt(s.substring(14, 16));
        String heightString = s.substring(32, 37);
        double height = Double.parseDouble(s.substring(32,37));
        String position = s.substring(54, 65);
        Man man = new Man(name, position, age, height);
        man.getInfo();
    }
}
