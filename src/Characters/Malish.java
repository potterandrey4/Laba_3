package Characters;

public class Malish extends People{
    public Malish() {
        super("Малыш");
    }

    public void likeOrDontLike(Food food) {
        if (food.getBenefit().equals("Полезное")) {
            System.out.println("Малыш не любит "+food.getName()+"\n"+"Малыш любит вредное");
        }

        if (food.getBenefit().equals("Вредное")) {
            System.out.println("Малыш любит "+food.getBenefit()+"\n"+"Малыш не любит полезное");
        }
    }
}
