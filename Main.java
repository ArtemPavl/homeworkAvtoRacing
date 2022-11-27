import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
//        Класс Person
        System.out.println("Класс Person");

        Person maksim = new Person("Максим", 1988, "Минск", "");
        Person anya = new Person("Аня", -5, "Москва", "методист образовательных программ");
        Person katya = new Person("Катя", 1992, null, "");
        Person artem = new Person("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Person vladimir = new Person("Владимир", 21, "Казань", "");

        maksim.printHello();
        anya.printHello();
        katya.printHello();
        artem.printHello();
        vladimir.printHello();

//        Класс Car
        System.out.println("\n===========================================================");
        System.out.println("\nКласс Car");

        Car granta = new Car("Lada", "Granta", 1.7, "желтый",
                2015, "Россия", "", "", "о919от040",
                5, "Зимняя", 192, "бензин");

        Car.Key keyOn = new Car.Key("Есть", "Есть");
        granta.setKey(keyOn);

        Car.Insurance grantaInsurance = granta.new Insurance(2021, 5700, "90390323");

        grantaInsurance.checkNumberInsurance();
        grantaInsurance.checkValidationInsurance();
        System.out.println(granta);
        granta.changeTires();
        System.out.println(granta);

//      Класс Flower
        System.out.println("\n===========================================================");
        System.out.println("\nКласс Flower");


        Flower rose = new Flower("Роза обыкновенная", "", "Голландия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
        Flower peony = new Flower("Пион", "", "", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        Bouquet bouquet = new Bouquet(9);
        bouquet.getNewFlower(rose, 3);
        bouquet.getNewFlower(chrysanthemum, 5);
        bouquet.getNewFlower(gypsophila, 1);
        System.out.println("bouquet.calculateCost() = " + bouquet.calculateCost());

//        Класс Train
        System.out.println("\nКласс Train");

        Train lastochka = new Train("Ласточка", "В-901", "", 2011, "Россия",
                301, 3500, "", "Белорусский вокзал",
                "Минск-Пассажирский", 11, "дизель");

        Train lenigrad = new Train("Ленинград", "D-125", "", 2019, "Россия",
                270, 1700, "", "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8, "дизель");

        System.out.println(lastochka);
        System.out.println(lenigrad);

        lastochka.refill();
        lenigrad.refill();

        //        Класс Bus
        System.out.println("\nКласс Bus");

        Bus mersedes = new Bus("Mersedes-Benz", "eCitaro", "белый", 2020,
                "Германия", 100, "дизель");
        Bus kingLong = new Bus("KING LONG", "XMQ6129Y5", "красный", 2018,
                "Китай", 110, "бензин");
        Bus liaz = new Bus("ЛиАЗ", "4292", "синий", 2015,
                "Россия", 90, "дизель");

        System.out.println(mersedes);
        System.out.println(kingLong);
        System.out.println(liaz);

        mersedes.refill();
        kingLong.refill();
        liaz.refill();
    }
}



