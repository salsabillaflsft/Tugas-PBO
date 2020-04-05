package bangunDatar;

public class PrismaSegitiga extends Segitiga{
    //v = luas x t
    private double t;
    @Override
    public double luasSegitiga(double a, double t) {
        return super.luasSegitiga(a, t)*getT();
    }
    public void setT(double t) {
        this.t = t;
    }
    public double getT() {
        return t;
    }

}
