import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("folder1/folder2/names.txt");

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            byte[] array = new byte[3000];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер страницы");
            String s = scanner.nextLine();
            while (!s.equals("exit")) {
                int pageNumber = Integer.parseInt(s);
                randomAccessFile.seek((long) (pageNumber - 1) * array.length);
                randomAccessFile.read(array);
                System.out.println(new String(array));
                System.out.println("Введите номер страницы");
                s = scanner.nextLine();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
