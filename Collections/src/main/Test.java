package main;

public class Test {
    public static void main(String[] args) {
        String[] employees = {"Nikita", "Igor", "Olga", "Vasiliy", "Maksim"};
        String[] second = new String[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            second[i] = employees[i];
        }
        second[second.length - 1] = "Ivan";
        employees = second;
        employees[1] = null;
        String[] newNames = new String[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newNames[j] = employees[i];
                j++;
            }
        }
        employees = newNames;

        MyArrayList sotrudniki = new MyArrayList();
        sotrudniki.add("Nikita");
        sotrudniki.add("Igor");
        sotrudniki.add("Olga");
        sotrudniki.add("Vasiliy");
        sotrudniki.add("Maksim");
        sotrudniki.remove("asdasdasd TestTestTest");
        for (int i = 0; i < sotrudniki.getSize(); i++){
            System.out.println(sotrudniki.get(i));
        }
        String s = "1000";
        String test = "2000";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(test);
        System.out.println(a + b);
        String s1 = "Это Игорь.";
        String name = s1.substring(4, 9);
        System.out.println(name);

//        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
//        String name = s.substring(4, 8);
//        int age = Integer.parseInt(s.substring(14, 16));
//        String heightString = s.substring(32, 37);
//        double height = Double.parseDouble(s.substring(32,37));
//        String position = s.substring(54, 65);
//        Man man = new Man(name, position, age, height);
//        man.getInfo();
        //        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i <= 1000; i++) {
//            numbers.add(i);
//        }
//        int sum = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            sum += numbers.get(i);
//        }
//        System.out.println(sum);
//        HashSet<String> names = new HashSet<>();
//        names.add("John");
//        names.add("Olga");
//        names.add("Eugene");
//        names.add("Maxim");
//        names.add("Olga");
//        for (String name : names){
//            System.out.println(name);
//        }
//        TreeSet<Integer> names = new TreeSet<>();
//        names.add(3);
//        names.add(5);
//        names.add(2);
//        names.add(1);
//        names.add(7);
//        names.add(15);
//        for(int name : names){
//            System.out.println(name);
//        }
    }
}
