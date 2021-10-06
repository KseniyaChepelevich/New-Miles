public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int milesOverPriceMultiples = service.calculate(10_000);
        System.out.println(milesOverPriceMultiples);

        int milesOverPriceNotMultiple = service.calculate(10_010);
        System.out.println(milesOverPriceNotMultiple);

        int milesBelowPrice = service.calculate(15);
        System.out.println(milesBelowPrice);
    }
}
