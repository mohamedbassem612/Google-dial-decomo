package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uqi {
    public final java.lang.String a;
    public final double b;

    public uqi(java.lang.String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uqi) {
            defpackage.uqi uqiVar = (defpackage.uqi) obj;
            if (aooh.n(this.a, uqiVar.a) && java.lang.Double.compare(this.b, uqiVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.aB(this.b);
    }

    public final java.lang.String toString() {
        return "NumberWithPopularityScore(normalizedNumber=" + this.a + ", popularityScore=" + this.b + ')';
    }
}
