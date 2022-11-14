public class Site {
    public static final double TAX_RATE = 1.13;

    private double getBillableAmount(double _units, double _rate){
        return getBaseAmount(_units,_rate) + getTaxAmount(getBaseAmount(_units,_rate));
    }

    private static double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private static double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate;
        return base;
    }
}
