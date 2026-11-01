package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofv {
    public final defpackage.ofi a;
    public final defpackage.hkd b;

    public ofv(defpackage.ofi ofiVar, defpackage.hkd hkdVar) {
        aooh.f(hkdVar, "parsedNumber");
        this.a = ofiVar;
        this.b = hkdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ofv) {
            defpackage.ofv ofvVar = (defpackage.ofv) obj;
            if (aooh.n(this.a, ofvVar.a) && aooh.n(this.b, ofvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.ofi ofiVar = this.a;
        return ((ofiVar == null ? 0 : ofiVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CachedValue(match=" + this.a + ", parsedNumber=" + this.b + ')';
    }
}
