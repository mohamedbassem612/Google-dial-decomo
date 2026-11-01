package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ccf implements kotlinx.coroutines.CoroutineExceptionHandler, defpackage.cdv {
    private final defpackage.aolr a;
    private final defpackage.aonn b;
    private final defpackage.aoss d;
    private defpackage.aoub e;

    public ccf(defpackage.aolr aolrVar, defpackage.aonn aonnVar) {
        this.a = aolrVar;
        this.b = aonnVar;
        this.d = defpackage.aosv.n(aolrVar.plus(this));
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
        return kotlinx.coroutines.CoroutineExceptionHandler.c;
    }

    @Override // defpackage.cdv
    public final void h() {
        defpackage.aoub aoubVar = this.e;
        if (aoubVar != null) {
            aoubVar.s(new defpackage.cbq());
        }
        this.e = null;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(defpackage.aolr aolrVar, java.lang.Throwable th) throws java.lang.Throwable {
        if (((defpackage.cmc) aolrVar.get(defpackage.cmc.a)) != null) {
            defpackage.cmc.c();
        }
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) this.a.get(kotlinx.coroutines.CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(aolrVar, th);
    }

    @Override // defpackage.cdv
    public final void i() {
        defpackage.aoub aoubVar = this.e;
        if (aoubVar != null) {
            aoubVar.s(new defpackage.cbq());
        }
        this.e = null;
    }

    @Override // defpackage.cdv
    public final void j() {
        defpackage.aoub aoubVar = this.e;
        if (aoubVar != null) {
            defpackage.aooc.X(aoubVar, "Old job was still running!", null);
        }
        this.e = defpackage.aoov.an(this.d, null, 0, this.b, 3);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return defpackage.ajsz.at(this, aolrVar);
    }
}
