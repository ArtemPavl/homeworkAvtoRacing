public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country){

        if (year > 0){
            this.year = year;
        }else {
            this.year = 2000;
        }

        if (engineVolume > 0){
            this.engineVolume = engineVolume;
        }else {
            this.engineVolume = 1.5;
        }

        if (brand == null || brand == ""){
            this.brand = "default";
        }else {
            this.brand = brand;
        }

        if (model == null || model == ""){
            this.model = "default";
        }else {
            this.model = model;
        }

        if (color == null || color == ""){
            this.color = "белый";
        }else {
            this.color = color;
        }

        if (country == null || country == ""){
            this.country = "default";
        }else {
            this.country = country;
        }
    }

    public  void printInformation(){
        System.out.println(brand + " " + model + ". Год выпуска: " + year + " год. Страна: "
                + country + ". Цвет: " + color + ". Объем двигателя: " + engineVolume + " л.");
    }

}
