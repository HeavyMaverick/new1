package figures;

public class Rect extends Figure {

    public Rect(double size) {
        super(size, size);
    }

    public Rect(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }
}
