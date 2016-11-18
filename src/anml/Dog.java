package anml;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeASound() {
        System.out.println("Гав! Гав! Гав!");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
