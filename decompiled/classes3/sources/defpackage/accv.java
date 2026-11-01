package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class accv {
    public final acba a;
    private final java.lang.String b;
    private final akhq c;

    public accv(akhq akhqVar, acba acbaVar) {
        aooh.f(akhqVar, "promoId");
        aooh.f(acbaVar, "triggeringEvent");
        this.b = null;
        this.c = akhqVar;
        this.a = acbaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.accv) {
            defpackage.accv accvVar = (defpackage.accv) obj;
            java.lang.String str = accvVar.b;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.c, accvVar.c) && aooh.n(this.a, accvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TriggeringRuleEvalContext(accountName=null, promoId=" + this.c + ", triggeringEvent=" + this.a + ')';
    }
}
