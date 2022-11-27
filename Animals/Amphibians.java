package Animals;

import java.util.Objects;

public class Amphibians extends Animals{

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {

        super(name, age);

        if(livingEnvironment != null && !livingEnvironment.isEmpty() &&  livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "нет информации";
        }
    }

    @Override
    public void eat(){
        hants();
        System.out.println(getName() + " съел добычу.");
    }

    @Override
    public void go(String place) {
        System.out.println(getName() + " поплыл в " + place);
    }

    public void hants(){
        System.out.println(getName() + " пошел на охоту.");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment != null && !livingEnvironment.isEmpty() &&  livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "нет информации";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nСреда обитания: " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
