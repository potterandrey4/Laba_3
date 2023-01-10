package Characters;
import Interfaces.*;

public class Golubets extends Something implements Location {

    public Golubets(String name) {
        super(name);
    }

    public Golubets(String name, String benefit) {
        super(name, benefit);
    }

    @Override
    public void location(String location) {
        System.out.println(this + " лежит(ат) на " + location);
    }

    public class CabbageLeaf extends Something{
        public CabbageLeaf() {
            super("капустный лист");
        }

        public void whoInteracts (String name) {
            if (name.equals("Малыш")) {
                System.out.println(name + " скомкал и бросил " + this);
            }
        }
    }
}
