package main;

import boxes.Box;
import boxes.BoxWeight;
import cats.Cat;
import cats.Lion;
import figures.Rect;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();

//        Box box = new Box(3, 5, 7);
//        BoxWeight boxWeight = new BoxWeight(1, 4, 6, 15);
//        box.showInfo();
//        System.out.println("----------");
//        boxWeight.showInfo();

        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(10);
        System.out.println(rect.getArea());
        System.out.println(triangle.getArea());

    }
}
