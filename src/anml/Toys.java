package anml;

import java.util.ArrayList;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class Toys  {

    private ArrayList listOfToys;

    public void createAList(){
        listOfToys.add(new Cat("Пушок"));
        listOfToys.add(new Dog("Дружок"));
        listOfToys.add(new RoboCat("Мегатрон-3000"));
    }

    public Toys() {
        listOfToys = new ArrayList(0);
        createAList();
    }

    public ArrayList<Pet> getListOfToys() {
        return listOfToys;
    }
}
