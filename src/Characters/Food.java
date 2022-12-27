package Characters;
import Interfaces.*;

public class Food extends Something implements Location {

    public Food(String name) {
        super(name);
    }

    public Food(String name, String benefit) {
        super(name, benefit);
    }

    @Override
    public void location(String location) {
        System.out.println(this + " лежит(ат) на " + location);
    }
}
