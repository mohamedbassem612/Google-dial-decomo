package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxo implements defpackage.lxr {
    public final defpackage.kip a;
    public final defpackage.lxn b;
    public final abwd c;
    private final defpackage.lxx d;

    public lxo(defpackage.kip kipVar, defpackage.lxn lxnVar, abwd abwdVar) {
        aooh.f(kipVar, "callDetails");
        aooh.f(lxnVar, "groupPosition");
        aooh.f(abwdVar, "photoInfo");
        this.a = kipVar;
        this.d = null;
        this.b = lxnVar;
        this.c = abwdVar;
    }

    @Override // defpackage.lxr
    public final long a() {
        return this.a.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lxo) {
            defpackage.lxo lxoVar = (defpackage.lxo) obj;
            if (aooh.n(this.a, lxoVar.a)) {
                defpackage.lxx lxxVar = lxoVar.d;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.b, lxoVar.b) && aooh.n(this.c, lxoVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallDetailsRow(callDetails=" + this.a + ", callButtonUiModel=null, groupPosition=" + this.b + ", photoInfo=" + this.c + ')';
    }
}
