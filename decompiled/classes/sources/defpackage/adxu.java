package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxu implements defpackage.aolp {
    private final defpackage.adxv a;

    public adxu(defpackage.adxv adxvVar) {
        this.a = adxvVar;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final /* bridge */ defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final /* synthetic */ defpackage.aolq getKey() {
        return this.a;
    }

    @Override // defpackage.aolr
    public final /* bridge */ defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final /* bridge */ defpackage.aolr plus(defpackage.aolr aolrVar) {
        return defpackage.ajsz.as(this, aolrVar);
    }
}
