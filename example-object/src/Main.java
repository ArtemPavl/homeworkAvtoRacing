public class Main {
    public static void main(String[] args) {
//        Задания 1 и 2
        System.out.println("Задания 1 и 2");

        Person maksim = new Person("Максим", 1988, "Минск", "");
        Person anya = new Person("Аня", 0, "Москва", "методист образовательных программ");
        Person katya = new Person("Катя", 1992, null, "продакт-менеджер");
        Person artem = new Person("", 1995, "Москва", "директор по развитию бизнеса");

        maksim.printHello();
        anya.printHello();
        katya.printHello();
        artem.printHello();

//        Задание 3
        System.out.println("Задание 3");

        Car ladaGranta = new Car("Lada", "", 1.7, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", -1.8, "черный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "");

        ladaGranta.printInformation();
        audiA8.printInformation();
        bmwZ8.printInformation();
        kiaSportage.printInformation();
        hyundaiAvante.printInformation();

    }
}



