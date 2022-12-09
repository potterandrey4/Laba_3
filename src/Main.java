import Characters.*;

public class Main {
    public static void main(String[] args) {
        People malish = new People("Малыш");
        People mama = new People("Мама");
        NotLivingSomething family = new NotLivingSomething("Семья");
        Dog bimbo = new Dog("Бимбо");
        NotLivingSomething golubets = new NotLivingSomething("Голубцы");

        malish.location("вернулся", "c крыши");
        malish.keptSilent("этом");
        malish.action("неуверен", "поймёт ли мама");
        malish.keptSilent("появлении Карлсона");
        malish.willBeSilent("этом", "ужина");

        mama.action("показалась невесёлой", "из-за складки на лбу");

        malish.action("думал", "о её происхждении");

        family.action("собралась", "дома");

        mama.say("всем идти обедать");

        family.action("села", "за стол");

        golubets.location("лежали", "на столе");

        malish.action("не любит", "капусту");
        malish.action("любит", "не полезную еду");

        bimbo.location("лежал", "под столом");

        malish.action("развернул", "голубец");
        malish.action("скомкал", "капустный лист");
        malish.action("бросил", "капустный лист");

    }
}