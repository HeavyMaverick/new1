public class Math {
    public static void main(String[] args) {
        int seconds = 270001235;
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int secs = ((seconds % 86400) % 3600) % 60;
        System.out.println("Дней = " + days);
        System.out.println("Часов = " + hours);
        System.out.println("Минут = " + minutes);
        System.out.println("Секунд = " + secs);


    }
}
