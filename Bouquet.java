import java.util.Arrays;

public class Bouquet {

    private Flower[] flowers;

    public Bouquet(int amountFlowers){
        this.flowers = new Flower[amountFlowers];
    }

    public void getNewFlower(Flower flower, int amount){
        for (int i = 0; i < amount; i++) {
            for (int n = 0; n < flowers.length ; n++) {
                if (flowers[n] == null){
                    flowers[n] = flower;
                    break;
                }
            }
        }
    }

    public String toString() {
        String resoult = "Букет:\n";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null){
                resoult = resoult + Arrays.toString(flowers);
                break;
            }
        }
        return resoult;
    }

    public String calculateCost(){
        double resoult = 0;
        int percent = 10;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null){
                resoult = resoult + flowers[i].getCost();
            }
        }
        return String.format("%.2f", resoult + resoult*percent/100);
    }
}
