package anml;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
abstract class Robot implements Pet{

        protected String name;

        public Robot(String name){
        this.name=name;
        }

        @Override
        public void makeASound() {

        }

        public String getName() {
                return name;
        }
}



