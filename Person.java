import java.time.LocalDate;

public class Person {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public  Person (String name, int yearOfBirth, String town, String jobTitle){

        if (true == yearOfBirth < 150 && yearOfBirth > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } else if (true == yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (name != null && !name.isEmpty() && !name.isBlank()){
            this.name = name;
        }else {
            this.name = "Информация не указана";
        }

        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        }else {
            this.town = "Информация не указана";
        }

        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()){
            this.jobTitle = jobTitle;
        }else {
            this.jobTitle = "Информация не указана";
        }
    }

    public void printHello(){
        System.out.println("Привет! Меня зовут " + this.name + ". Я из города "
                + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности "
                + this.jobTitle + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (true == yearOfBirth < 150 && yearOfBirth > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } else if (true == yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        }else {
            this.town = "Информация не указана";
        }
    }
}

