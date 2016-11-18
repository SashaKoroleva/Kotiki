package anml;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class RoboCat extends Robot {

    public RoboCat(String name) {
        super(name);
    }

    @Override
    public void makeASound() {
        System.out.println("Бип-бип! Бип-бип!");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}


