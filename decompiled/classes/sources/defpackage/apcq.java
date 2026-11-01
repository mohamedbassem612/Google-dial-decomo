package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcq implements defpackage.aovi {
    private final java.lang.Object a;
    private final java.lang.ThreadLocal b;
    private final defpackage.aolq c;

    public apcq(java.lang.Object obj, java.lang.ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new defpackage.apcr(threadLocal);
    }

    @Override // defpackage.aovi
    public final java.lang.Object a(defpackage.aolr aolrVar) {
        java.lang.ThreadLocal threadLocal = this.b;
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = threadLocal.get();
        threadLocal.set(obj);
        return obj2;
    }

    @Override // defpackage.aovi
    public final void c(defpackage.aolr aolrVar, java.lang.Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        if (defpackage.aooh.n(this.c, aolqVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.aolp
    public final defpackage.aolq getKey() {
        return this.c;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.aooh.n(this.c, aolqVar) ? defpackage.aols.a : this;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        return defpackage.ajsz.as(this, aolrVar);
    }

    public final java.lang.String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
