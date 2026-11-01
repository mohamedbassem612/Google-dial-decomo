package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghc implements defpackage.aolp {
    public static final defpackage.cch b = new defpackage.cch();
    public final defpackage.gha a;

    public ghc(defpackage.gha ghaVar) {
        this.a = ghaVar;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final defpackage.aolq getKey() {
        return b;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        return defpackage.ajsz.as(this, aolrVar);
    }
}
