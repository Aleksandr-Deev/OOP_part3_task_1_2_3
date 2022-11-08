package task1_2;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", 2015, "России",
                "желтого",190, 1.7, "МКПП", "Лифтбек", "А256ВС702",
                5, 4, null, null, "бензин");

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии",
                "черного",250, 3.0, "", "", "А452Ом702",
                5, 11, null, null, "бензин");

        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германии",
                "черного",240, 3.0, "", "", "А452О8702",
                2, 6, null, null, "бензин");

        Car kiaSportage = new Car("Kia", "Sportage 4 поколение", 2018, "Южнаой Кореи",
                "красного",190, 2.4, "", "", "А452ОМ70",
                5, 10, null, null, "бензин");

        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южной Кореи",
                "красного",200, 1.6, "", "", "А452ОМ702",
                5, 9, null, null, "бензин");

        System.out.println(ladaGrande);
        ladaGrande.refill();
        System.out.println(audiA8);
        audiA8.refill();
        System.out.println(bmwZ8);
        bmwZ8.refill();
        System.out.println(kiaSportage);
        kiaSportage.refill();
        System.out.println(hyundaiAvante);
        hyundaiAvante.refill();

        System.out.println();

        Bus nefaz = new Bus("Нефаз", "НефАЗ-3205", 2020, "Россия",
                "Белый", 120, "дизель");
        Bus paz = new Bus("ПАЗ", "ПАЗ-6659", 2013, "Россия",
                "желтый", 160, "дизель");
        Bus liaz = new Bus("ЛиАЗ", "ЛиАЗ-5292", 2005, "Россия",
                "голубой", 130, "дизель");

        System.out.println(nefaz);
        nefaz.refill();
        System.out.println(paz);
        paz.refill();
        System.out.println(liaz);
        liaz.refill();

        System.out.println();

        Train swallow = new Train("Ласточка", "В-901", 2011, "России"
                , null, 301, "Белорусского вокзала", "Минск-Пассажирский"
                , 3500, 11, 0, "дизель");

        Train leningrad = new Train("Ленинград", "D-125", 2019,
                "России", null, 270, "Ленинградский вокзал",
                "Ленинградский-Пассажирский", 1700, 8, 0, "дизель");

        System.out.println(swallow);
        swallow.refill();
        System.out.println(leningrad);
        leningrad.refill();
    }
}