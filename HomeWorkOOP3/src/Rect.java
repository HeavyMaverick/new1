public class Rect {
    double width;
    double lenght;

    void setSizes(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    double getPerimeter() {
        return (width + lenght) * 2;
    }

    double getArea() {
        return width * lenght;
    }
}
