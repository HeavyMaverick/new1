public class HomeWork {
    public static void main(String[] args) {
        int time = 22;
        boolean night = time >= 23 || time <= 5;
        boolean isGoodWeather = true;
        if (night) {
            System.out.println("Спать");
        }
        if (!night && isGoodWeather){
            System.out.println("Гулять");
        }
        if (!night && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
