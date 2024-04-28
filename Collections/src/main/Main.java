package main;

public class Main {
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

    }
}
