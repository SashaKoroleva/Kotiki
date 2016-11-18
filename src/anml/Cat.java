package anml;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeASound() {
        System.out.println("Мяу! Мяу! Мяу!");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
