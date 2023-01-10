package Characters;

import Interfaces.Action;

public class Mum extends People implements Action {
    public Mum () {
        super("мама");
    }

    public void action(String action) {
        class LongSentence {
            final int len = action.length() - action.replaceAll(" ", "").length();
        }

        LongSentence lon = new LongSentence();

        if (lon.len > 2) {
            System.out.println("Пока "+ action + ", мама была у доктора");

        } else {
            System.out.println(this + " " + action);
        }
    }
}
