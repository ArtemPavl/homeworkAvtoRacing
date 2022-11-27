import Animals.*;

public class MainAnimals {
    public static void main(String[] args) {
//        Класс Animals
        System.out.println("Класс Animals");
        Herbivores gazelle = new Herbivores("Газаль", 10,
                "Африка", 97, "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 8,
                "Африка", 60, "Листья");
        Herbivores horse = new Herbivores("Лошадь", 12,
                "Лесостепи", 88, "Трава");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        gazelle.pasture();
        giraffe.eat();
        giraffe.walk();

        Predators hyena = new Predators("Гиена", 11,
                "Африка", 64, "Всеядна");
        Predators tiger = new Predators("Тигр", 7,
                "Лес", 65, "Мясо");
        Predators bear = new Predators("Медведь", 8,
                "Лес", 56, "Всеядный");

        System.out.println(tiger);
        System.out.println(hyena);
        System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 3, "Болото");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 4, "Река");

        System.out.println(frog);
        System.out.println(alreadyFreshwater);

        Flightless peacock = new Flightless("Павлин", 5, "Джунгли");
        Flightless penguin = new Flightless("Пенгвин", 10, "Арктика");
        Flightless dodoDird = new Flightless("Птица Додо", 3, "Лес");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoDird);

        Flying gull = new Flying("Чайка", 3, "Море");
        Flying albatross = new Flying("Альбатрос", 5, "Южный океан");
        Flying falcon = new Flying("Сокол", 5, "Лес");

        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
