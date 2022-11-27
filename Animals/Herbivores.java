package Animals;

public class Herbivores extends Mammals{

    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeOfFood) {

        super(name, age, livingEnvironment, speed);

        if(typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty()){
            this.typeOfFood = typeOfFood;
        }else {
            this.typeOfFood = "нет информации";
        }
    }

    public void pasture(){
        System.out.println(this.getName() + " идет постись.");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if(typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty()){
            this.typeOfFood = typeOfFood;
        }else {
            this.typeOfFood = "нет информации";
        }
    }

    @Override
    public void eat() {
        this.pasture();
        System.out.println(this.getName() + " кушает " + getTypeOfFood());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nТип питания: " + getTypeOfFood();
    }
}
