package figures;

public abstract class Figure {
    private double a;
    private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getArea();

    public final double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public final double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
