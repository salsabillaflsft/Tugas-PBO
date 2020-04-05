package bangunDatar;

public class LimasPersegiPanjang extends PersegiPanjang {
    // v limaspersegipanjang =¹/₃ x luas alas x tinggi limas
    // = 1/3 x (p.l) x t = 1/3.p.l.t
    private double t;
    @Override
    public double luas(double p, double l) {
        return super.luas(p, l) * getT() * 1/3;
    }
    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }
}
