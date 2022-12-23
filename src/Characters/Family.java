package Characters;

import Interfaces.Action;
import Interfaces.Location;

import javax.naming.Name;


public class Family extends Something implements Location {
    public Family() {
        super("Семья");
    }

    enum Names {
        MOTHER("Мама"),
        FATHER("Папа"),
        BOSSE("Боссе"),
        BETAN("Бетан"),
        MALISH("Малыш");

        public final String name;

        Names(String name) {
            this.name = name;
        }

    }
    @Override
    public void location(String location) {
        if(location.equals("дома")) {
            System.out.println("Семья собралась " + location);
        }

        if (location.equals("Обеденный стол")) {
            for (Names names : Names.values()) {System.out.print(names.name + ", ");}
            System.out.println("сели за " + location);
        }
    }
}
