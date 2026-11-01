package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambv {
    public final int a;
    public final double b;
    public final aify c;
    public final defpackage.amcb d;
    public final aify e;
    private final java.lang.String f;
    private final int g;

    public ambv(java.lang.String str, int i, double d, aify aifyVar, int i2, defpackage.amcb amcbVar, aify aifyVar2) {
        this.f = str;
        this.a = i;
        this.b = d;
        this.c = aifyVar;
        this.g = i2;
        this.d = amcbVar;
        this.e = aifyVar2;
    }

    public final int a() {
        java.lang.String str = this.f;
        if (str.isEmpty()) {
            return 0;
        }
        return ahzf.c(ahxm.b).a().f().j(str).size();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ambv) {
            defpackage.ambv ambvVar = (defpackage.ambv) obj;
            if (this.f.equals(ambvVar.f) && this.a == ambvVar.a) {
                if (java.lang.Double.doubleToLongBits(this.b) == java.lang.Double.doubleToLongBits(ambvVar.b) && ahvr.aP(this.c, ambvVar.c) && this.g == ambvVar.g && this.d.equals(ambvVar.d) && ahvr.aP(this.e, ambvVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() ^ 1000003;
        double d = this.b;
        return (((((((((((iHashCode * 1000003) ^ this.a) * 1000003) ^ ((int) ((java.lang.Double.doubleToLongBits(d) >>> 32) ^ java.lang.Double.doubleToLongBits(d)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.e;
        defpackage.amcb amcbVar = this.d;
        return "AmCacheCorrection{text=" + this.f + ", endCacheIndex=" + this.a + ", matchCost=" + this.b + ", segmentWrappers=" + java.lang.String.valueOf(this.c) + ", firstCorrectedAsrWordIndex=" + this.g + ", amCacheParameters=" + java.lang.String.valueOf(amcbVar) + ", wordCosts=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public ambv() {
        throw null;
    }
}
