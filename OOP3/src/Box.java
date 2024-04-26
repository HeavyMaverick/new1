public class Box {
    double width;
    double height;
    double lenght;

    void setDimens(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    double volume() {
        return width * height * lenght;
    }
}
