public class Var {
    public static void main(String[] args){
        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);

        int a = 15;
        byte b = (byte)a;
        System.out.println(b);
    }
}
