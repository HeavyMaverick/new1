public class Terminal {
    private int money;
    private final Object object = new Object();

    public Terminal() {
        money = (int) (Math.random() * 100000);
    }

    public int getMoney() {
        return money;
    }

    public void withdrawMoney(String name, int amount) {
        //synchronized (object){ //this) {
            System.out.println(name + " подошел к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (money > 0 && (money - amount) >= 0) {
                money = money - amount;
                System.out.println(name + " вывел " + amount + "\nОставшаяся сумма в банкомате " + money);
            }
            if (money <= 0 || (money - amount) < 0) {
                System.out.println("В банкомате недостаточно денег для " + name);
           // }
        }
    }
}
