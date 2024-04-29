package test;

public class Empty {
    public Empty(){
        this.width = 1;
        this.length = 1;
    }
    public Empty(double size){
        this.width = size;
        this.length = size;
    }
    private double width;
    private double length;
    @Override
    public String toString() {
        return "Длина " + length + " Ширина " + width;
    }
}
