package Animals;

public class Flying extends Birds{

    private String movementType = "полет";

    public Flying(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void fly(){
        System.out.println(getName() + " летает.");
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