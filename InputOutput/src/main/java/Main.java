import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder1/folder2");
        File file = new File("folder1/folder2/names.txt");
        directory.mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file));) {
            char[] array = new char[128];
            int count = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0){
                result.append(new String(array, 0, count));
                count = reader.read(array);
            }
            String[] names = result.toString().split(" ");
            Arrays.stream(names)
                    .filter(name -> name.contains("г"))
                    .forEach(System.out::println);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
