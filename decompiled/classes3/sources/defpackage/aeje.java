package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeje {
    private final defpackage.aeit a;
    private final defpackage.aehm b;
    private final adai c;

    public aeje(defpackage.aeit aeitVar, defpackage.aehm aehmVar) {
        aooh.f(aeitVar, "accountsModel");
        aooh.f(aehmVar, "accountConverter");
        this.a = aeitVar;
        this.b = aehmVar;
        this.c = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeje) {
            defpackage.aeje aejeVar = (defpackage.aeje) obj;
            if (aooh.n(this.a, aejeVar.a) && aooh.n(this.b, aejeVar.b)) {
                adai adaiVar = aejeVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "AddAccountContext(accountsModel=" + this.a + ", accountConverter=" + this.b + ", oneGoogleStreamz=null)";
    }
}
