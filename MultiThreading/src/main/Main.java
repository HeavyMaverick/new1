package main;

public class Main {
    static boolean isFive;
    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (true){
                        if (i == 5){
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception ignored){}
            }
        });
        timer.start();
        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!isFive){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception ignored){}
            }
        });
        timer2.start();
    }
}