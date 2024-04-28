package boxes;

public class Box {
    private double height;
    private double length;
    private double width;

    public Box() {
        height = 1;
        length = 1;
        width = 1;
    }

    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Box(double size) {
        height = size;
        length = size;
        width = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void showInfo() {
        System.out.println("Высота: " + height + "\nДлина: " + length + "\nШирина: " + width);
    }
}
