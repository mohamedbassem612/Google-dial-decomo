package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class skq {
    public final defpackage.skp a;
    public final j$.time.Instant b;

    public skq(defpackage.skp skpVar, j$.time.Instant instant) {
        aooh.f(skpVar, "uiModel");
        aooh.f(instant, "lastCacheUpdate");
        this.a = skpVar;
        this.b = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.skq) {
            defpackage.skq skqVar = (defpackage.skq) obj;
            if (aooh.n(this.a, skqVar.a) && aooh.n(this.b, skqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CachedUiModel(uiModel=" + this.a + ", lastCacheUpdate=" + this.b + ')';
    }
}
