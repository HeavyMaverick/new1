package main;

public class Bird extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит");
    }
}
