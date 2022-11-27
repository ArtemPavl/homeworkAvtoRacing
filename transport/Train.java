package transport;

public class Train extends Transport{

    private int tripPrice;
    private String travelTime;
    private String startingStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, String color, int year,
                 String country, int maxSpeed, int tripPrice, String travelTime,
                 String startingStation, String endingStation, int numberOfWagons, String fuelType) {

        super(brand, model, color, year, country, maxSpeed, fuelType);

        if (travelTime != null && !travelTime.isEmpty() && !travelTime.isBlank()){
            this.travelTime = travelTime;
        }else {
            this.travelTime = "нет информации";
        }

        if (startingStation != null && !startingStation.isEmpty() && !startingStation.isBlank()){
            this.startingStation = startingStation;
        }else {
            this.startingStation = "нет информации";
        }

        if (endingStation != null && !endingStation.isEmpty() && !endingStation.isBlank()){
            this.endingStation = endingStation;
        }else {
            this.endingStation = "нет информации";
        }

        if (tripPrice  > 0){
            this.tripPrice  = tripPrice ;
        }else {
            this.tripPrice = 0;
        }

        if (numberOfWagons > 0){
            this.numberOfWagons = numberOfWagons;
        }else {
            this.numberOfWagons = 1;
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправить поезд дизелем");
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice  > 0){
            this.tripPrice  = tripPrice ;
        }else {
            this.tripPrice = 0;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime != null && !travelTime.isEmpty() && !travelTime.isBlank()){
            this.travelTime = travelTime;
        }else {
            this.travelTime = "нет информации";
        }
    }

    public String getStartingStation() {
        return startingStation;
    }

    public void setStartingStation(String startingStation) {
        if (startingStation != null && !startingStation.isEmpty() && !startingStation.isBlank()){
            this.startingStation = startingStation;
        }else {
            this.startingStation = "нет информации";
        }
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if (endingStation != null && !endingStation.isEmpty() && !endingStation.isBlank()){
            this.endingStation = endingStation;
        }else {
            this.endingStation = "нет информации";
        }

    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0){
            this.numberOfWagons = numberOfWagons;
        }else {
            this.numberOfWagons = 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nСтоимость поездки: " + this.tripPrice +
                "\nВремя поездки: " + this.travelTime +
                "\nСтанция отбытия: " + this.startingStation +
                "\nСтанция прибытия: " + this.endingStation +
                "\nКоличество вагонов: " + this.numberOfWagons;
    }
}
