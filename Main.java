import transport.Car;

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
                5, "Зимняя");

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
    }
}



