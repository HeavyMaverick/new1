public class Worker {
    String name;
    String position;
    int salary;

    Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    String getInfo(int months){
        int monthsSalary = salary * months;
        return "Сотрудник " + name + "\nДолжность " + position +"\nПолучил зарплату "+monthsSalary + " за " +months+" месяцев.";
    }
}
