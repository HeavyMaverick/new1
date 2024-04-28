package main;

public class Man {
    private String name;
    private String position;
    private int age;
    private double height;

    public Man(String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void getInfo() {
        System.out.println("Имя: " + name + "\nДолжность: " + position + "\nВозраст: " + age + "\nРост: " + height);
    }
}
