package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aolj implements defpackage.aolp {
    private final defpackage.aolq key;

    public aolj(defpackage.aolq aolqVar) {
        if (aolqVar == null) {
            defpackage.aooh.i("key");
        }
        this.key = aolqVar;
    }

    @Override // defpackage.aolr
    public java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        if (aonnVar == null) {
            defpackage.aooh.i("operation");
        }
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public /* bridge */ defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public defpackage.aolq getKey() {
        return this.key;
    }

    @Override // defpackage.aolr
    public /* bridge */ defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public defpackage.aolr plus(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return defpackage.ajsz.at(this, aolrVar);
    }
}
