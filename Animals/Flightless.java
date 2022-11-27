package Animals;

public class Flightless extends Birds{

    private String movementType = "хождение";

    public Flightless(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void walk(){
        System.out.println(getName() + " гуляет.");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void eat() {
        this.hants();
        System.out.println(getName() + " кушает добычу");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nТип передвиения: " + movementType;
    }
}

