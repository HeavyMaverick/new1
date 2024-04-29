public class Worker implements Counter{

    @Override
    public void otchet(int months) {
        System.out.println("Отчет за " + months + " месяцев");
    }
}
