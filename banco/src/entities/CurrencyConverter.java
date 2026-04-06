package entities;

public class CurrencyConverter {
    private static final double IOF_RATE = 0.06;

    public static double calculateTotalInReal(double dollarsToBuy, double dollarPrice){
        var calculattedValue = dollarsToBuy * dollarPrice * IOF_RATE;
        var finalValue = (dollarsToBuy * dollarPrice) + calculattedValue;

        return finalValue;
    }
}
