package transport;

import java.time.LocalDate;

public class Car {

//    В классе car создайте вложенный класс «Страховка» (**insurance**) с параметрами:
//
//    «Срок действия» страховки,
//    «Стоимость» страховки,
//    «Номер» страховки.
//
//    Данные параметры неизменяемые. Добавьте ко всем новым полям проверку данных,
//    что параметры не пустые, не равны null и содержат корректные данные.
//
//    Добавьте метод проверки срока годности страховки — не просрочена ли она.
//    Если страховка просрочена, то в консоль должно выводится предупреждающее сообщение о том,
//    что нужно срочно ехать оформлять новую страховку. Если страховка еще действует, то никаких
//    сообщений выводить не нужно.
//
//    Добавьте метод проверки, что номер страховки содержит 9 знаков.
//    Если знаков больше или меньше, то вывести сообщение "Номер страховки некорректный!".

    public class Insurance{

        private int validity;

        private int cost;

        private String number;

        public Insurance(int validity, int cost, String number) {

            if (validity > 0){
                this.validity = validity;
            }else {
                this.validity = 2022;
            }

            if (cost > 0){
                this.cost = cost;
            }else {
                this.cost = 5000;
            }

            if (number != null && !number.isEmpty() && !number.isBlank()){
                this.number = number;
            }else {
                this.number = "нет";
            }
        }

        public int getValidity() {
            return validity;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void checkValidationInsurance(){
            if(this.validity < LocalDate.now().getYear()){
                System.out.println("Нуно продлить страховку!");
            }
        }

        public void checkNumberInsurance(){
            if (this.number.length() != 9){
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    public static class Key{

        private String remoteEngineStart;

        private String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart != null && !remoteEngineStart.isEmpty() && !remoteEngineStart.isBlank()){
                this.remoteEngineStart = remoteEngineStart;
            }else {
                this.remoteEngineStart = "нет";
            }

            if (keylessEntry != null && !keylessEntry.isEmpty() && !keylessEntry.isBlank()){
                this.keylessEntry = keylessEntry;
            }else {
                this.keylessEntry = "нет";
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart != null && !remoteEngineStart.isEmpty() && !remoteEngineStart.isBlank()){
                this.remoteEngineStart = remoteEngineStart;
            }else {
                this.remoteEngineStart = "нет";
            }
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(String keylessEntry) {
            if (keylessEntry != null && !keylessEntry.isEmpty() && !keylessEntry.isBlank()){
                this.keylessEntry = keylessEntry;
            }else {
                this.keylessEntry = "нет";
            }
        }
    }


    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color,
               int year, String country, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, String tires){

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

        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()){
            this.transmission = transmission;
        }else {
            this.transmission = "механика";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()){
            if (registrationNumber.length() != 9){
                this.registrationNumber = "default";
            } else {
                for (int i = 0; i < registrationNumber.length(); i++) {
                    if (i == 0 || i == 4 || i == 5){
                        if (Character.isLetter(registrationNumber.charAt(i))){
                            this.registrationNumber = registrationNumber;
                        }else {
                            this.registrationNumber = "default";
                            break;
                        }
                    } else {
                        if (Character.isDigit(registrationNumber.charAt(i))){
                            this.registrationNumber = registrationNumber;
                        }else {
                            this.registrationNumber = "default";
                            break;
                        }
                    }
                }
            }
        }else {
            this.registrationNumber = "default";
        }

        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()){
            this.bodyType = bodyType;
        }else {
            this.bodyType = "default";
        }

        if (tires != null && !tires.isEmpty() && !tires.isBlank()){
            this.tires = tires;
        }else {
            this.tires = "default";
        }

        if (numberOfSeats > 0){
            this.numberOfSeats = numberOfSeats;
        }else {
            this.numberOfSeats = 5;
        }
    }

    public  String toString(){
        return "\n" + this.brand + " " + this.model +
                "\nГод выпуска: " + this.year + " год" +
                "\nСтрана: " + this.country +
                "\nЦвет: " + this.color +
                "\nОбъем двигателя: " + this.engineVolume + " л." +
                "\nКоробка передач: " + this.transmission +
                "\nТип кузова: " + this.bodyType +
                "\nРегистрационный номер: " + this.registrationNumber +
                "\nКоличество мест: " + this.numberOfSeats +
                "\nРезина: " + this.tires;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0){
            this.engineVolume = engineVolume;
        }else {
            this.engineVolume = 1.5;
        }
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()){
            this.transmission = transmission;
        }else {
            this.transmission = "механика";
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats > 0){
            this.numberOfSeats = numberOfSeats;
        }else {
            this.numberOfSeats = 5;
        }
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        if (tires != null && !tires.isEmpty() && !tires.isBlank()){
            this.tires = tires;
        }else {
            this.tires = "default";
        };
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public  void changeTires(){
        if(getTires().equalsIgnoreCase("Зимняя")){
            this.tires = "Летняя";
        }else{
            this.tires = "Зимняя";
        }
    }
}
