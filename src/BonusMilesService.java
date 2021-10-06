public class BonusMilesService {
    public int calculate(int cost) {
        int price = 20;
        int miles = cost / price;

        return miles;
    }
}
