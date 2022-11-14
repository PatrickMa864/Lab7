public class Site {
    public static final double TAX_RATE = 1.13;
    public double _units;
    public double _rate;
    public Site(double _units, double _rate){
        this._units = _units;
        this._rate = _rate;
    }

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

    public static void main(String[] args) {
        Site site = new Site(1.00, 0.15);
        System.out.println(site.getBaseAmount(site._units, site._rate));
        System.out.println(site.getTaxAmount(site.getBaseAmount(site._units, site._rate)));
        ResidentialSite Rsite = new ResidentialSite(1.00, 0.15);
        System.out.println(Rsite.getBaseAmount(Rsite._units, Rsite._rate));
        System.out.println(Rsite.getTaxAmount(Rsite.getBaseAmount(Rsite._units, Rsite._rate)));
        LifelineSite Lsite = new LifelineSite(1.00, 0.15);
        System.out.println(Lsite.getBaseAmount(Lsite._units, Lsite._rate));
        System.out.println(Lsite.getTaxAmount(Lsite.getBaseAmount(Lsite._units, Lsite._rate)));
    }
}
