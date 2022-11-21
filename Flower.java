public class Flower {

    String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {

        this.name = name;

        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.flowerColor = "Россия";
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String name, String flowerColor, String country, double cost) {
        this(name, flowerColor, country, cost, 3);
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.flowerColor = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    @Override
    public String toString() {
        return "\nЦветок: " + name +
                "\nЦвет: " + flowerColor +
                "\nСтрана производитель: " + country +
                "\nСтоимость: " + String.format("%.2f", cost) +
                "\nДней хранения: " + lifeSpan + "\n";
    }
}
