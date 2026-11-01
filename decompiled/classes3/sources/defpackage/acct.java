package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acct {
    public final java.lang.String a;
    public final com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext b;
    public final boolean c;
    private final akhq d;

    public acct(akhq akhqVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, boolean z) {
        aooh.f(akhqVar, "promoId");
        aooh.f(promoContext, "clearcutLogContext");
        this.a = null;
        this.d = akhqVar;
        this.b = promoContext;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acct) {
            defpackage.acct acctVar = (defpackage.acct) obj;
            java.lang.String str = acctVar.a;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.d, acctVar.d) && aooh.n(this.b, acctVar.b) && this.c == acctVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "TriggeringConditionsEvalContext(accountName=null, promoId=" + this.d + ", clearcutLogContext=" + this.b + ", hasPresentedPromos=" + this.c + ')';
    }
}
