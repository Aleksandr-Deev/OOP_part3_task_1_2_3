package tack3;

import tack3.Animals.Amphibian.Amphibian;
import tack3.Animals.Bird.FlyingBird;
import tack3.Animals.Bird.NotFlyingBird;
import tack3.Animals.Mammal.Herbivore;
import tack3.Animals.Mammal.Predator;

public class Main {

    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("Газель", 10, "засушливые степи",
                50, "трава");
        Herbivore giraffe = new Herbivore("Жираф", 11, "тропические степи",
                115, "листья деревьев");
        Herbivore horse = new Herbivore("Лошадь", 15, "степь", 20,
                "трава");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println();

        Predator hyena = new Predator("Гиена", 13, "саванны, полупустыные области",
                65, "мясо");
        Predator tiger = new Predator("Тигр", 15, "тропических леса, засушливые зоны",
                60, "мясо, фрукты, орехи");
        Predator bear = new Predator("Медведь", 20, "дремучие леса", 50,
                "мясо, рыба, ягоды");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        System.out.println();

        Amphibian frog = new Amphibian("Лягушка", 3, "болото");
        Amphibian grassSnake = new Amphibian("Уж", 5, "болото");

        System.out.println(frog);
        System.out.println(grassSnake);

        System.out.println();

        NotFlyingBird peacock = new NotFlyingBird("павлин", 16, "лесах и саваннах", "всеяден");
        NotFlyingBird penguin = new NotFlyingBird("пингвин", 11,
                "открытое море Южного полушария", "рыба");
        NotFlyingBird dodoBird = new NotFlyingBird("птица додо", 21, "остров Маврикий", "фруктами, орехами, семенами и кореньями");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        System.out.println();

        FlyingBird seagull = new FlyingBird("чайка", 21, "открытый выход к морю или океану", "животную пищу");
        FlyingBird albatross = new FlyingBird("альбатрос", 18, "ледяные воды Антарктиды", "летучими рыбами, мальками и моллюсками");
        FlyingBird falcon = new FlyingBird("сокол", 16, "в низинах на открытой местности", "мыши, птицы");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
