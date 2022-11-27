package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private String color;
    private int year;
    private String country;
    private int maxSpeed;
    private String fuelType;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed, String fuelType) {

        if (fuelType != null && !fuelType.isEmpty() && !fuelType.isBlank()){
            this.fuelType = fuelType;
        }else {
            this.fuelType = "дизель";
        }

        if (brand != null && !brand.isEmpty() && !brand.isBlank()){
            this.brand = brand;
        }else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()){
            this.model = model;
        }else {
            this.model = "default";
        }

        if (color != null && !color.isEmpty() && !color.isBlank()){
            this.color = color;
        }else {
            this.color = "белый";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()){
            this.country = country;
        }else {
            this.country = "default";
        }

        if (year > 0){
            this.year = year;
        }else {
            this.year = 2000;
        }

        if (maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        }else {
            this.maxSpeed = 180;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()){
            this.color = color;
        }else {
            this.color = "белый";
        }
    }

    public abstract void refill();

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        }else {
            this.maxSpeed = 180;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public  String toString(){
        return "\n" + this.brand +
                "\nМодель: " + this.model +
                "\nГод выпуска: " + this.year + " год" +
                "\nСтрана: " + this.country +
                "\nЦвет: " + this.color +
                "\nМаксимальная скорость: " + this.maxSpeed +
                "\nТип топлива: " + this.fuelType;
    }
}
