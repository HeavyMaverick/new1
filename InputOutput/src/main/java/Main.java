import java.io.*;

public class Main {
    public static void main(String[] args){
        File directory = new File("folder1");
        File file = new File("folder1/names1.txt");
        directory.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file);) {
            int a = inputStream.read();
            while (a != -1){
                System.out.print(((char) a));
                a = inputStream.read();
            }

        }catch (Exception e){
            throw new RuntimeException(e);

        }
    }
}
