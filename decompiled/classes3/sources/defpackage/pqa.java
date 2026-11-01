package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqa {
    public final defpackage.pom a;
    public final aonj b;
    public final aomy c;
    public final defpackage.qty d;
    public final aonj e;
    public final boolean f;

    public pqa(defpackage.pom pomVar, aonj aonjVar, aomy aomyVar, defpackage.qty qtyVar, aonj aonjVar2, boolean z) {
        aooh.f(aonjVar, "onLayout");
        aooh.f(aomyVar, "getElapsedTimeMillis");
        aooh.f(aonjVar2, "partnerAppAreaButtonOnClick");
        this.a = pomVar;
        this.b = aonjVar;
        this.c = aomyVar;
        this.d = qtyVar;
        this.e = aonjVar2;
        this.f = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pqa) {
            defpackage.pqa pqaVar = (defpackage.pqa) obj;
            if (aooh.n(this.a, pqaVar.a) && aooh.n(this.b, pqaVar.b) && aooh.n(this.c, pqaVar.c) && aooh.n(this.d, pqaVar.d) && aooh.n(this.e, pqaVar.e) && this.f == pqaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.pom pomVar = this.a;
        int iHashCode = ((((pomVar == null ? 0 : pomVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.qty qtyVar = this.d;
        return (((((iHashCode * 31) + (qtyVar != null ? qtyVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + anty.L(this.f);
    }

    public final java.lang.String toString() {
        return "ContactGridUiData(contactGridModel=" + this.a + ", onLayout=" + this.b + ", getElapsedTimeMillis=" + this.c + ", partnerAppAreaButton=" + this.d + ", partnerAppAreaButtonOnClick=" + this.e + ", hasCallingCard=" + this.f + ')';
    }
}
