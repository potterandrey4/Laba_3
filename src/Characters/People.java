package Characters;

import Interfaces.*;

public class People extends Something implements LocationWithAction, KeptSilent, WillBeSilent, Action, Say {
    public People() {
        super("Человек");
    }
    public People(String name) {
        super(name);
    }

    @Override
    public void location(String action, String info_about_location) {
        System.out.println(this + " " + action + " " + info_about_location);
    }


    @Override
    public void keptSilent(String reason) {
        System.out.println(this + " умолчал о " + reason);
    }

    @Override
    public void willBeSilent(String reason, String time) {
        System.out.println(this + " будет молчать о " + reason + " до " + time);
    }

    @Override
    public void action(String action, String dop_info) {
        System.out.println(this + " " + action + " "+ dop_info);
    }

    @Override
    public void say(String text) {
        System.out.println(this + " сказал(а):\"" + text + "\"");
    }

}
