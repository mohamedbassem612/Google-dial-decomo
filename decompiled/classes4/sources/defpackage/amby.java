package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amby {
    public final java.lang.String a;
    public final java.lang.Integer b;
    public final double c;
    public final int d;
    public final aify e;
    public final int f;

    public amby(java.lang.String str, java.lang.Integer num, double d, int i, int i2, aify aifyVar) {
        this.a = str;
        this.b = num;
        this.c = d;
        this.d = i;
        this.f = i2;
        this.e = aifyVar;
    }

    public static defpackage.amby a(int i) {
        defpackage.ambx ambxVar = new defpackage.ambx();
        ambxVar.a = "";
        ambxVar.b = 0;
        ambxVar.c(999.0d);
        ambxVar.b(0);
        ambxVar.c = i;
        ambxVar.d(aike.a);
        return ambxVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amby) {
            defpackage.amby ambyVar = (defpackage.amby) obj;
            if (this.a.equals(ambyVar.a) && this.b.equals(ambyVar.b)) {
                if (java.lang.Double.doubleToLongBits(this.c) == java.lang.Double.doubleToLongBits(ambyVar.c) && this.d == ambyVar.d) {
                    int i = this.f;
                    int i2 = ambyVar.f;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2 && ahvr.aP(this.e, ambyVar.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        double d = this.c;
        long jDoubleToLongBits = (java.lang.Double.doubleToLongBits(d) >>> 32) ^ java.lang.Double.doubleToLongBits(d);
        int i = this.f;
        a.aY(i);
        return (((((((iHashCode * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ this.d) * 1000003) ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        int i = this.f;
        return "ProcessorResult{text=" + this.a + ", endIndexInCacheWords=" + this.b + ", matchCost=" + this.c + ", firstCorrectedAsrWordIndex=" + this.d + ", status=" + (i != 0 ? java.lang.Integer.toString(i - 2) : "null") + ", wordCosts=" + java.lang.String.valueOf(this.e) + '}';
    }

    public amby() {
        throw null;
    }
}
