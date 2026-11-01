package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amnl {
    public static final double[][] a = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public final double b;
    public final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double j;

    public amnl(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
        this.g = d6;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.amnl) {
            defpackage.amnl amnlVar = (defpackage.amnl) obj;
            if (java.lang.Double.compare(this.b, amnlVar.b) == 0 && java.lang.Double.compare(this.c, amnlVar.c) == 0 && java.lang.Double.compare(this.d, amnlVar.d) == 0 && java.lang.Double.compare(this.e, amnlVar.e) == 0 && java.lang.Double.compare(this.f, amnlVar.f) == 0 && java.lang.Double.compare(this.g, amnlVar.g) == 0 && java.lang.Double.compare(this.h, amnlVar.h) == 0 && java.lang.Double.compare(this.i, amnlVar.i) == 0 && java.lang.Double.compare(this.j, amnlVar.j) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((anty.aB(this.b) * 31) + anty.aB(this.c)) * 31) + anty.aB(this.d)) * 31) + anty.aB(this.e)) * 31) + anty.aB(this.f)) * 31) + anty.aB(this.g)) * 31) + anty.aB(this.h)) * 31) + anty.aB(this.i)) * 31) + anty.aB(this.j);
    }

    public final java.lang.String toString() {
        return "Cam16(hue=" + this.b + ", chroma=" + this.c + ", j=" + this.d + ", q=" + this.e + ", m=" + this.f + ", s=" + this.g + ", jstar=" + this.h + ", astar=" + this.i + ", bstar=" + this.j + ')';
    }
}
