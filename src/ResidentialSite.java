public class ResidentialSite extends Site{

    public ResidentialSite(double _units, double _rate){
        super(_units, _rate);
    }
    public static double getTaxAmount(double base) {
        double tax = base * TAX_RATE;
        return tax;
    }

    public static double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate;
        return base;
    }
}
