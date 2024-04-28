package test;

public class Monstr {
    int eyes;
    int legs;
    int hands;

    public Monstr() {
        eyes = 2;
        legs = 2;
        hands = 2;
    }

    public Monstr(int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.legs = 2;
    }

    public Monstr(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = 2;
    }

    public Monstr(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    void voice() {
        System.out.println("Grrrraaaaarhgh");
    }

    void voice(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Grrrraaaaarhgh");
        }
    }

    void voice(int count, String phrase) {
        for (int i = 0; i < count; i++) {
            System.out.println(phrase);
        }

    }
}
