public class A {
//    try(
//    OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
//        Scanner scanner = new Scanner(System.in);
//        String result = scanner.nextLine();
//        System.out.println("Enter name, or type\"exit\":");
//        String name = scanner.nextLine();
//        while(!name.equals("exit")){
//            outputStream.write(name.getBytes());
//            outputStream.write("\n".getBytes());
//            name = scanner.nextLine();
//        }
//    } catch (Exception e){
//        throw new RuntimeException();
//    }
//        try (
//    InputStream inputStream = new BufferedInputStream(new FileInputStream(file))){
//        byte[] array = new byte[128];
//        int count = inputStream.read(array);
//        StringBuilder result = new StringBuilder();
//        while (count > 0){
//            result.append(new String(array, 0 , count));
//            count = inputStream.read(array);
//        }
//        System.out.println(result.toString());
//    } catch (Exception e){
//        throw new RuntimeException();
//    }

//        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
//            long before = System.currentTimeMillis();
//            int a = inputStream.read();
//            StringBuilder result = new StringBuilder();
//            while (a != -1){
//                result.append(((char) a));
//                a = inputStream.read();
//            }
//            long after = System.currentTimeMillis();
//            System.out.println(after - before);
//        } catch (Exception e){
//            throw new RuntimeException();
//        }
//File file = new File("folder1/folder2/names.txt");
//        try (
//    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
//        byte[] array = new byte[3000];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите номер страницы");
//        String s = scanner.nextLine();
//        while (!s.equals("exit")) {
//            int pageNumber = Integer.parseInt(s);
//            randomAccessFile.seek((long) (pageNumber - 1) * array.length);
//            randomAccessFile.read(array);
//            System.out.println(new String(array));
//            System.out.println("Введите номер страницы");
//            s = scanner.nextLine();
//        }
//    } catch (Exception e) {
//        throw new RuntimeException();
//    }
}
