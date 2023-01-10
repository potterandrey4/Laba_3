package Characters;
import Excipition.UnorrectBenefitException;
import Interfaces.Location;

public class Malish extends People implements Location {
    public static String name = "Малыш";
    public Malish() {
        super(name);
    }


    public void likeOrDontLike(Golubets food) throws UnorrectBenefitException {
        if (food.getBenefit().equals("Полезное") | food.getBenefit().equals("Вредное")) {
            if (food.getBenefit().equals("Полезное")) {
                System.out.println("Малыш не любит "+food.getName()+"\n"+"Малыш любит вредное");

            }
            if (food.getBenefit().equals("Вредное")) {
                System.out.println("Малыш любит "+food.getBenefit()+"\n"+"Малыш не любит полезное");

            }
        } else {
            throw new UnorrectBenefitException("Еда может быть Вредной или Полезной. Проверьте корректность введённых данных");
        }
    }

    @Override
    public void location(String location) {
        if (location.equals("комната Малыша")) {
            System.out.println(this + " преспокойно сидел в своей комнате");
        }
    }

    public String visitedCarlson() {
        return (name + " гостил у Карлсона");
    }

    public void keptSilentAboutCarlson() {
        System.out.println(name + " умолчал о появлении Карлсона");
    }

    public static class Stamps {
        public void considerStamps() {
            System.out.println(name + " рассматривал марки");
        }
    }

}
