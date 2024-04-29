package workers;

import interfaces.Codable;

public class Coder extends Worker implements Codable {
    public Coder(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Кодер накодил");
    }

    @Override
    public void work() {
        writeCode();
    }
}
