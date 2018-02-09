package chacter1;

public class ChiOfItem extends Item {
    @Override
    public boolean disposable() {
        return false;
    }

    ChiOfItem(String name, int price) {
        super(name, price);
    }
}
