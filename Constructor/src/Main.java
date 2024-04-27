public class Main {
    public static void main(String[] args) {
        Monstr monstr = new Monstr(5);
        System.out.println(monstr.legs + " " + monstr.eyes);
        Monstr monstr1 = new Monstr(2, 10,15 );
        monstr1.voice();
        monstr1.voice(3, "Growl");
        monstr1.voice(5);

    }
}
