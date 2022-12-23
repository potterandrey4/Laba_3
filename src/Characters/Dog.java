package Characters;
import Interfaces.*;

public class Dog extends Something implements Location, LocationWithAction, Action {

    public Dog() {
        super("Собака");
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void location(String action, String infoAboutLocation) {
        System.out.println(this + " " + action + " " + infoAboutLocation);
    }

    @Override
    public void location(String location) {
        //if (location.equals()) {
            System.out.println(this + "");
//        }
    }

    @Override
    public void action(String action, String dop_info) {
        System.out.println(this + " " + action + " "+ dop_info);
    }
}
