public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        System.out.println(terminal.getMoney());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                terminal.withdrawMoney("Oleg", 15000);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                terminal.withdrawMoney("Marina", 19999999);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                terminal.withdrawMoney("Alex", 5000);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                terminal.withdrawMoney("Danil", 2384900);
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread4.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                terminal.withdrawMoney("Max", 9329);
            }
        });
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        System.out.println(terminal.getMoney());
    }
}
