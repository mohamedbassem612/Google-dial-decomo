package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovp implements defpackage.aolp, defpackage.aolq {
    private final /* synthetic */ int $cid;
    public static final defpackage.aovp b = new defpackage.aovp(1);
    public static final defpackage.aovp a = new defpackage.aovp(0);

    private aovp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return this.$cid != 0 ? aonnVar.a(obj, this) : aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        return this.$cid != 0 ? defpackage.ajsz.aq(this, aolqVar) : defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final defpackage.aolq getKey() {
        return this.$cid != 0 ? b : this;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return this.$cid != 0 ? defpackage.ajsz.ar(this, aolqVar) : defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        return this.$cid != 0 ? defpackage.ajsz.as(this, aolrVar) : defpackage.ajsz.as(this, aolrVar);
    }
}
