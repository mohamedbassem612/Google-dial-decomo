package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rjf {
    public final defpackage.rim a;
    public final defpackage.rio b;

    public rjf(defpackage.rim rimVar, defpackage.rio rioVar) {
        aooh.f(rimVar, "feature");
        aooh.f(rioVar, "integration");
        this.a = rimVar;
        this.b = rioVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rjf) {
            defpackage.rjf rjfVar = (defpackage.rjf) obj;
            if (this.a == rjfVar.a && aooh.n(this.b, rjfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "JoyballFeatureAndIntegration(feature=" + this.a + ", integration=" + this.b + ')';
    }
}
