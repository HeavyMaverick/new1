public class HomeWork {
    public static void main(String[] args){
        String nameOfMonth = "January";
        if (nameOfMonth.equals("January")){
            System.out.println("Winter");
        }
        else if (nameOfMonth.equals("March")) {
            System.out.println("Spring");
        }
        else if (nameOfMonth.equals("July")){
            System.out.println("Summer");
        }
        else if (nameOfMonth.equals("October")){
            System.out.println("Autumn");
        }
        else {
            System.out.println("Месяц не существует");
        }
        switch (nameOfMonth){
            case "January":
                System.out.println("Winter 1");
                break;
            case "March":
                System.out.println("Spring 1");
                break;
            case "July":
                System.out.println("Summer 1");
                break;
            case "October":
                System.out.println("Autumn 1");
                break;
            default:
                System.out.println("Месяц нету 1");
                break;
        }
    }
}
