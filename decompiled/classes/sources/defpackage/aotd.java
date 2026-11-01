package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aotd extends java.lang.Exception {
    public final java.lang.Throwable a;

    public aotd(java.lang.Throwable th, defpackage.aosp aospVar, defpackage.aolr aolrVar) {
        super(defpackage.a.bi(aolrVar, aospVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.a;
    }
}
