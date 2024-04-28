package figures;

public class Triangle extends Figure {
    private double c;

    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getArea() {
        double p2 = (getA() + getB() + c) / 2;
        return Math.sqrt(p2 * (p2 - getA()) * (p2 - getB()) * (p2 - c));
    }
}
