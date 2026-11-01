package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class actx {
    public final dnb a;

    public actx(dnb dnbVar) {
        aooh.f(dnbVar, "variationSettings");
        this.a = dnbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.actx) && aooh.n(this.a, ((defpackage.actx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "GoogleSansFlexConfig(variationSettings=" + this.a + ')';
    }
}
