public class Main {
    public static void withoutConcurrency() {
        long before = System.currentTimeMillis();
        float[] arr = new float[10000000];
        for (float i = 0; i < arr.length; i++) {
            arr[(int) i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
        long after = System.currentTimeMillis();
        long s = after - before;
        System.out.println(s + " Without concurrency");

    }

    public static void withConcurrency() {
        long before = System.currentTimeMillis();
        float[] arr = new float[10000000];
        float[] dst = new float[5000000];
        float[] dst2 = new float[5000000];
        for (float i = 0; i < arr.length; i++) {
            arr[(int) i] = i;
        }
        System.arraycopy(arr, 0 ,dst, 0, 5000000);
        System.arraycopy(arr, 5000000, dst2, 0, 5000000);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < dst.length; i++) {
                    dst[i] = (float) (dst[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < dst2.length; i++) {
                    dst2[i] = (float) (dst2[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
                }
            }
        });
        System.arraycopy(dst, 0, arr, 0, dst.length);
        System.arraycopy(dst2, 0, arr, 5000000, dst2.length);
        long after = System.currentTimeMillis();
        long s = after - before;
        System.out.println(s + " Concurrency");
    }

    public static void main(String[] args) {
        withoutConcurrency();
        withConcurrency();
    }
}
