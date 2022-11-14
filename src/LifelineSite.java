public class LifelineSite extends Site {

    public LifelineSite(double _units, double _rate){
        super(_units, _rate);
    }
    public static double getTaxAmount(double base) {
        double tax = base * TAX_RATE * 0.2;
        return tax;
    }

    public static double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate * 0.5;
        return base;
    }
}
