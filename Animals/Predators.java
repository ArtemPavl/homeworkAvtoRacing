package Animals;

import java.util.Objects;

public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeOfFood) {

        super(name, age, livingEnvironment, speed);

        if(typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty()){
            this.typeOfFood = typeOfFood;
        }else {
            this.typeOfFood = "нет информации";
        }
    }

    public void hunts(){
        System.out.println(this.getName() + " идет охотиться.");
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
        this.hunts();

        System.out.println(this.getName() + " кушает " + getTypeOfFood());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nТип питания: " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
