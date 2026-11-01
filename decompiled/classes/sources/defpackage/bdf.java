package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bdf extends defpackage.dca {
    private final defpackage.agf a = null;
    private final defpackage.agg b = null;
    private final defpackage.ajl d;

    public bdf(defpackage.ajl ajlVar) {
        this.d = ajlVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bdg(this.d);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bdg bdgVar = (defpackage.bdg) cmvVar;
        bdgVar.a = null;
        bdgVar.b = null;
        bdgVar.c = this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bdf) {
            defpackage.bdf bdfVar = (defpackage.bdf) obj;
            defpackage.agf agfVar = bdfVar.a;
            defpackage.agg aggVar = bdfVar.b;
            if (defpackage.aooh.n(this.d, bdfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "LazyLayoutAnimateItemElement(enterTransition=null, exitTransition=null, placementSpec=" + this.d + ')';
    }
}
