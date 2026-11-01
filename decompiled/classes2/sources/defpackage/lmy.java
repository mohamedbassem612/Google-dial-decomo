package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmy {
    public final defpackage.lnp a;
    public final defpackage.lnn b;

    public lmy(defpackage.lnp lnpVar, defpackage.lnn lnnVar) {
        aooh.f(lnpVar, "voter");
        aooh.f(lnnVar, "featureKey");
        this.a = lnpVar;
        this.b = lnnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lmy) {
            defpackage.lmy lmyVar = (defpackage.lmy) obj;
            if (aooh.n(this.a, lmyVar.a) && this.b == lmyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioBasedScreeningVoterWithFeatureKey(voter=" + this.a + ", featureKey=" + this.b + ')';
    }
}
