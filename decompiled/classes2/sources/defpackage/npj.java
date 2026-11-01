package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class npj {
    public final tyw a;
    public final defpackage.npk b;

    public npj(tyw tywVar, defpackage.npk npkVar) {
        aooh.f(tywVar, "model");
        this.a = tywVar;
        this.b = npkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.npj) {
            defpackage.npj npjVar = (defpackage.npj) obj;
            if (aooh.n(this.a, npjVar.a) && this.b == npjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CandidateBanner(model=" + this.a + ", feature=" + this.b + ')';
    }
}
