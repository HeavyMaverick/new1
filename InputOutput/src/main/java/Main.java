import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File directory = new File("folder1/folder2/folder3");
        File file1 = new File("folder1/folder2/folder3/afile1.txt");
        File file2 = new File("folder1/folder2/folder3/bfile2.txt");
        File file3 = new File("folder1/folder2/folder3/cile3.txt");
        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] files = directory.list((dir, name) -> name.startsWith("a"));
        for (String f : files){
            System.out.println(f);
        }

    }
}
