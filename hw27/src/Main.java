public class Main {
    static boolean isEquals = false;
    static int number = 0;
    // постоянно загадывает и постоянно пытается угадать
    public static void main(String[] args) {
        //int random = (int) (Math.random()*1000000 + 1);
        //System.out.println(random);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isEquals) {
                    try {
                        number = (int) (Math.random() * 100000 + 1);
                        System.out.println(number + "ПОТОК 1");
                        Thread.sleep(1000);
                    } catch (Exception ignored) {
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!isEquals) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception ignored) {
                }
            }
        });
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (!isEquals){
//                    int n1 = (int) (Math.random()*1000000 + 1);
//                    if (n1 = random){
//                        isEquals = true;
//                        System.out.println(n1);
//                    }
//                }
//            }
//        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isEquals) {
                    try {
                        int n = (int) (Math.random() * 100000 + 1);
                        System.out.println(n + "ПОТОК 2");
                        Thread.sleep(1000);
                        if (n == number) {
                            isEquals = true;
                            System.out.println(number);
                        }
                    } catch (Exception ignored) {
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
