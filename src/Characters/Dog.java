package Characters;
import Interfaces.*;

public class Dog extends Something implements Location, OtherActions {

    public Dog() {
        super("Собака");
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void location(String action, String info_about_location) {
        System.out.println(this + action + info_about_location);
    }

    @Override
    public void action(String action, String dop_info) {
        System.out.println(this + " " + action + " "+ dop_info);
    }
}
