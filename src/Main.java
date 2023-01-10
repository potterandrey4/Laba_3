import Characters.*;
import Excipition.*;
import Interfaces.Location;

public class Main {
    public static void main(String[] args) throws UnorrectBenefitException, UnorrectTableExcipition {
        Malish malish = new Malish();
        People mama = new People("Мама");
        Golubets golubets = new Golubets("Голубцы", "Полезное");
        Table table = new Table("Обеденный стол");
        Family family = new Family();
        Malish.Stamps stamps = new Malish.Stamps();
        Mum mum = new Mum();


        mum.action(malish.visitedCarlson());
        mum.action("задержалась");
        mum.action("пришла позже");
        malish.location("комната Малыша");
        stamps.considerStamps();
        malish.location("вернулся", "c крыши");
        malish.keptSilent("этом");
        malish.action("неуверен", "поймёт ли мама");
        malish.keptSilentAboutCarlson();
        malish.willBeSilent("этом", "ужина");

        mama.action("показалась невесёлой", "из-за складки на лбу");

        malish.action("думал", "о её происхждении");

        family.location("дома");

        mama.say("всем идти обедать");

        family.location(table.getName());

        golubets.location(table.getName());

        malish.likeOrDontLike(golubets);

        Location bimbo = new Location() {
          @Override
          public void location(String location) {
              if (location.equals("Обеденный стол")) {
                  System.out.println("Бимбо лежал под обеденным столом");
              }
          }
        };

        bimbo.location(table.getName());

        malish.action("развернул", "голубец");


        Golubets.CabbageLeaf cabbageList = golubets.new CabbageLeaf();
        cabbageList.whoInteracts(malish.getName());


    }
}