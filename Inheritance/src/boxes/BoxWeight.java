package boxes;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        super();
        weight = 1;
    }

    public BoxWeight(double height, double length, double width, double weight) {
        super(height, length, width);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }
}
