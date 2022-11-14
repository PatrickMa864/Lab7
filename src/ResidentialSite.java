public class ResidentialSite extends Site{

    private static double getTaxAmount(double base) {
        double tax = base * TAX_RATE;
        return tax;
    }

    private static double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate;
        return base;
    }
}
