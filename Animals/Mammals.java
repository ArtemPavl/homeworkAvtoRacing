package Animals;

public abstract class Mammals extends Animals{

    private String livingEnvironment;
    private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {

        super(name, age);

        if(livingEnvironment != null && !livingEnvironment.isEmpty() &&  !livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "нет информации";
        }

        if (speed > 0){
            this.speed = speed;
        }else {
            this.speed = Math.abs(speed);
        }
    }

    @Override
    public abstract void eat();

    @Override
    public void go(String place) {
        System.out.println(getName() + " пошел в " + place);
    }

    public void walk(){
        System.out.println(this.getName() + " пошел гулять.");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment != null && !livingEnvironment.isEmpty() &&  !livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "нет информации";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0){
            this.speed = speed;
        }else {
            this.speed = Math.abs(speed);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nСреда обитания: " + getLivingEnvironment() +
                "\nСкорость: " + getSpeed();
    }
}
