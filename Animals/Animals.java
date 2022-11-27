package Animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name) {
        this(name, 0);
    }

    public Animals(String name, int age) {
        if(name != null && !name.isBlank() && !name.isEmpty()){
            this.name = name;
        }else {
            this.name ="Animals";
        }
        if (age > 0){
            this.age = age;
        }else {
            this.age = Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else {
            this.age = Math.abs(age);
        }
    }

    public abstract void eat();

    public abstract void go(String place);

    public void sleep() {
        System.out.println(getName() + " ложится спать.");
    }

    @Override
    public String toString() {
        return "\nИмя: " + name +
                "\nВозраст: " + age + " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
