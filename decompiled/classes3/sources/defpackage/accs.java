package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class accs {
    public final com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext a;
    public final java.util.Map b;
    public final java.util.Map c;
    public final java.util.Map d;
    public final java.util.Map e;
    private final java.lang.String f;
    private final akhq g;

    public accs(akhq akhqVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4) {
        aooh.f(akhqVar, "promoId");
        aooh.f(promoContext, "clearcutLogContext");
        aooh.f(map, "clearcutCounts");
        aooh.f(map2, "veCounts");
        aooh.f(map3, "appStates");
        aooh.f(map4, "permissionRequestCounts");
        this.f = null;
        this.g = akhqVar;
        this.a = promoContext;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.accs) {
            defpackage.accs accsVar = (defpackage.accs) obj;
            java.lang.String str = accsVar.f;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.g, accsVar.g) && aooh.n(this.a, accsVar.a) && aooh.n(this.b, accsVar.b) && aooh.n(this.c, accsVar.c) && aooh.n(this.d, accsVar.d) && aooh.n(this.e, accsVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "TargetingRuleEvalContext(accountName=null, promoId=" + this.g + ", clearcutLogContext=" + this.a + ", clearcutCounts=" + this.b + ", veCounts=" + this.c + ", appStates=" + this.d + ", permissionRequestCounts=" + this.e + ')';
    }
}
