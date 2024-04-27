public class Box {
    double width;
    double height;
    double lenght;

    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public Box(double size) {
        width = size;
        height = size;
        lenght = size;
    }
    Box(){
        width = 0;
        height = 0;
        lenght = 0;
    }

    double volume() {
        return width * height * lenght;
    }
    void showVolume(){
        System.out.println(volume());
    }
}
