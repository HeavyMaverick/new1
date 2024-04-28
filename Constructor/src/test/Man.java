package test;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + " " + age);
    }

    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть больше нуля");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
