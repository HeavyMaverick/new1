import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("users.usr");
        Cat cat = new Cat("Kitten", "WhiteCat", 3);
        Cat cat1 = new Cat("Koshka", "BlackCat", 2);
        Cat cat2 = new Cat("Murka", "GrayCat", 5);
        Cat cat3 = new Cat("Puss", "OrangeCat", 6);
        List<Cat> list = new ArrayList<>();
        list.add(cat);
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        try {
            file.createNewFile();
        } catch (Exception e ){
            throw new RuntimeException();
        }
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
            for (int i = 0; i < list.size(); i++){
                objectOutputStream.writeObject(list.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){

            for (Cat c : list){
                Cat savedCat = (Cat) objectInputStream.readObject();
                System.out.println(savedCat);
            }
        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
