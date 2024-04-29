public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public void otchet(int months) {
                System.out.println("Отчет за " + months + " месяцев");
            }
        }, 15);
        Worker worker = new Worker();
        director.force(worker, 3);
    }
}
