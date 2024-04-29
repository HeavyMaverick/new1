package workers;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void work() {
    }
}
