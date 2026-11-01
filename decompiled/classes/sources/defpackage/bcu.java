package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bcu extends defpackage.dca {
    public defpackage.bct a;
    public defpackage.aosi b;

    @Override // defpackage.dca
    public final /* synthetic */ defpackage.cmv d() {
        return new defpackage.bct(this);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    public final java.lang.Object f(defpackage.aoln aolnVar) {
        defpackage.aosi aosiVar = this.b;
        if (aosiVar == null) {
            aosiVar = new defpackage.aosi(null);
            this.b = aosiVar;
            defpackage.bct bctVar = this.a;
            if (bctVar != null && bctVar.D) {
                bctVar.b();
            }
        }
        java.lang.Object objFI = aosiVar.fI(aolnVar);
        return objFI != defpackage.aolu.a ? defpackage.aojh.a : objFI;
    }

    public final int hashCode() {
        return 234;
    }
}
