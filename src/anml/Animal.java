package anml;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
abstract class Animal implements Pet{

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void makeASound() {

    }

    public String getName() {
        return name;
    }
}
