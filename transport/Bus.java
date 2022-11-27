package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, String color, int year, String country, int maxSpeed, String fuelType) {
        super(brand, model, color, year, country, maxSpeed, fuelType);
    }

    @Override
    public void refill() {
        if (getFuelType().equalsIgnoreCase("бензин")){
            System.out.println("Заправить автобус бензином");
        }else {
            System.out.println("Заправить автобус дизелем");
        }
    }
}
