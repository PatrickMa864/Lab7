public class LifelineSite extends Site {

    private static double getTaxAmount(double base) {
        double tax = base * TAX_RATE * 0.2;
        return tax;
    }

    private static double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate * 0.5;
        return base;
    }
}
