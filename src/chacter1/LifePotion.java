package chacter1;

public class LifePotion extends Item {
    LifePotion(String name, int price) {
        super(name, price);
    }

    @Override
    public boolean disposable() {
        return true;
    }
}
