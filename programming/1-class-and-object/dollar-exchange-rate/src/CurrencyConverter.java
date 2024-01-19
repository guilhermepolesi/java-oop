public class CurrencyConverter {

    public double dollarPrice;
    public double dollarBought;
    public static double iof = 0.06;

    public double calculateValue() {
        return dollarBought * dollarPrice;
    }

}
