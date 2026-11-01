package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozx extends defpackage.aozw {
    public /* synthetic */ aozx(defpackage.aoxh aoxhVar, defpackage.aolr aolrVar, int i, int i2, int i3) {
        super(aoxhVar, (i3 & 2) != 0 ? defpackage.aols.a : aolrVar, (i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2);
    }

    @Override // defpackage.aozv
    protected final defpackage.aozv c(defpackage.aolr aolrVar, int i, int i2) {
        return new defpackage.aozx(this.d, aolrVar, i, i2);
    }

    @Override // defpackage.aozv
    public final defpackage.aoxh f() {
        return this.d;
    }

    @Override // defpackage.aozw
    public final java.lang.Object g(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) {
        java.lang.Object objFM = this.d.fM(aoxiVar, aolnVar);
        return objFM != defpackage.aolu.a ? defpackage.aojh.a : objFM;
    }
}
