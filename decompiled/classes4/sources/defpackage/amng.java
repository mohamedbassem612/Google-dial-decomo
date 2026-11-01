package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class amng {
    public final double a;
    public final double b;
    public final double c;

    public amng(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.amng) {
            defpackage.amng amngVar = (defpackage.amng) obj;
            if (java.lang.Double.compare(this.a, amngVar.a) == 0 && java.lang.Double.compare(this.b, amngVar.b) == 0 && java.lang.Double.compare(this.c, amngVar.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.aB(this.a) * 31) + anty.aB(this.b)) * 31) + anty.aB(this.c);
    }

    public final java.lang.String toString() {
        return "HueShifts(midHueShift=" + this.a + ", endHueShift=" + this.b + ", surfaceHueShift=" + this.c + ')';
    }
}
