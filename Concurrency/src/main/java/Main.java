import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int j = 0;
                for (int i = 0; i < 1000000; i++) {
                    if (i % 2 == 0) {
                        j += i;
                    }
                }
                System.out.println(j);
                countDownLatch.countDown();
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int c = 0;
                for (int i = 0; i < 1000000; i++) {
                    if (i % 7 == 0) {
                        c++;
                    }
                }
                System.out.println(c);
                countDownLatch.countDown();
            }
        };
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                List<Integer> list = new ArrayList<Integer>(1000);
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
                int c = 0;
                for (Integer i : list) {
                    if (list.get(i) % 2 == 0) {
                        c++;
                    }
                }
                System.out.println(c);
                countDownLatch.countDown();
            }
        };
        long before = System.currentTimeMillis();
        executorService.execute(task);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

}
