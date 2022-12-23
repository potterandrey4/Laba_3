import Characters.*;

public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish();
        People mama = new People("Мама");
        Dog bimbo = new Dog("Бимбо");
        Food golubets = new Food("Голубцы", "Полезное");
        Table table = new Table("Обеденный стол");
        Family family = new Family();

        malish.location("вернулся", "c крыши");
        malish.keptSilent("этом");
        malish.action("неуверен", "поймёт ли мама");
        malish.keptSilent("появлении Карлсона");
        malish.willBeSilent("этом", "ужина");

        mama.action("показалась невесёлой", "из-за складки на лбу");

        malish.action("думал", "о её происхждении");

        family.location("дома");

        mama.say("всем идти обедать");

        family.location(table.getName());

        golubets.location(table.getName());

        malish.likeOrDontLike(golubets);

        bimbo.location("лежал", "под столом");

        malish.action("развернул", "голубец");
        malish.action("скомкал", "капустный лист");
        malish.action("бросил", "капустный лист");






    }
}