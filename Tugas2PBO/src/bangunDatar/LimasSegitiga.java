package bangunDatar;

public class LimasSegitiga extends Segitiga{
    //v = ⅓ × luas × t
    private double t;
    @Override
    public double luasSegitiga(double a, double t) {
        return super.luasSegitiga(a, t) * getT() * 1/3;
    }
    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }
}
