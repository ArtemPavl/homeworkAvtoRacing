package Animals;

public abstract class Birds extends Animals {

    private String livingEnvironment;

    public Birds (String name, int age, String livingEnvironment) {

        super(name, age);

        if(livingEnvironment != null && !livingEnvironment.isEmpty() &&  livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "нет информации";
        }

    }

    @Override
    public abstract void eat();

    @Override

    public void go(String place) {
        System.out.println(getName() + " полетел в " + place);
    }

    public void hants(){
        System.out.println(this.getName() + " полетел на охоту.");
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
}
