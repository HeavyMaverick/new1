public class Loop {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        int count = 100;
        while (i < 100){
            i++;
            b += i;
        }
        System.out.println((float)b/100);
    }
}
