import java.util.Map;
import java.util.concurrent.*;

public class Main {
    private static final Map<Integer, Long> map = new ConcurrentHashMap<>();
    private static int index = 0;
    private static final Object obj = new Object();

    public static void main(String[] args) {
        CountDownLatch countDownLatch1 = new CountDownLatch(10);
        CountDownLatch countDownLatch2 = new CountDownLatch(10);
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            final int NUM = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long before = System.currentTimeMillis();
                    long millis = (long) (Math.random() * 5000 + 1000);
                    Thread.currentThread().setName("Car-" + NUM);
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " готовится к гонке");
                    countDownLatch1.countDown();
                    try {
                        countDownLatch1.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name + " поехала по первой трассе");
                    try {
                        semaphore.acquire();
                        System.out.println(name + " заехала в туннель 1");
                        Thread.sleep(millis);
                        System.out.println(name + " выехала из туннеля 1");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        semaphore.release();
                    }
                    System.out.println(name + " поехала по второй трассе");
                    try {
                        semaphore.acquire();
                        System.out.println(name + " заехала в туннель 2");
                        Thread.sleep(millis);
                        System.out.println(name + "выехала из туннеля 2");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name + " прихала на финиш");
                    synchronized (obj) {
                        if (index == -1) {
                            index = NUM;
                        }
                    }
                    long after = System.currentTimeMillis();
                    map.put(NUM, after - before);
                }
            }).start();
            try {
                countDownLatch2.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
            System.out.println("Победитель " + index + " Время" + map.get(index));
        }
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Semaphore semaphore = new Semaphore(3);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    String name = Thread.currentThread().getName();
//                    System.out.println(name + " запустился");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    try {
//                        semaphore.acquire();
//                        workWithFileSystem();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    } finally {
//                        semaphore.release();
//                    }
//
//                    System.out.println(name + " отключился");
//                }
//            });
//        }
//        executorService.shutdown();
    }

    private static void workWithFileSystem() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " начал работу с системой");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " закончил работу с системой");
    }
}
