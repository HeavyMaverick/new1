package workers;

import interfaces.Cookable;

public class Chef extends Worker implements Cookable {
    public Chef(String name) {
        super(name);
    }

    @Override
    public void cookFood() {
        System.out.println("Шеф приготовил блюдо");
    }

    @Override
    public void work() {
        cookFood();
    }
}
