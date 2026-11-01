package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aia extends dca {
    private final alg a;
    private final agf b;
    private final agg d;
    private final ahc e;
    private final defpackage.ett f;

    public aia(alg algVar, defpackage.ett ettVar, agf agfVar, agg aggVar, ahc ahcVar) {
        this.a = algVar;
        this.f = ettVar;
        this.b = agfVar;
        this.d = aggVar;
        this.e = ahcVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.aic(this.f, this.b, this.d, this.e);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.aic aicVar = (defpackage.aic) cmvVar;
        aicVar.d = this.f;
        aicVar.a = this.b;
        aicVar.b = this.d;
        aicVar.c = this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aia) {
            defpackage.aia aiaVar = (defpackage.aia) obj;
            if (aooh.n(this.a, aiaVar.a) && aooh.n(this.f, aiaVar.f) && aooh.n(this.b, aiaVar.b) && aooh.n(this.d, aiaVar.d) && aooh.n(this.e, aiaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.f + ", enter=" + this.b + ", exit=" + this.d + ", mutableTransformState=" + this.e + ')';
    }
}
