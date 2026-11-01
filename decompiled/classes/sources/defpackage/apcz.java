package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcz extends defpackage.aott implements java.util.concurrent.Executor {
    public static final defpackage.apcz a = new defpackage.apcz();
    private static final defpackage.aosp b = defpackage.apdf.a.e(defpackage.aosv.y("kotlinx.coroutines.io.parallelism", defpackage.aooc.t(64, defpackage.apcn.a), Integer.MAX_VALUE));

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        b.a(aolrVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        return defpackage.apdf.a.e(1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        a(defpackage.aols.a, runnable);
    }

    @Override // defpackage.aosp
    public final void i(defpackage.aolr aolrVar, java.lang.Runnable runnable) throws defpackage.aotd {
        b.i(aolrVar, runnable);
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.aott
    public final java.util.concurrent.Executor h() {
        return this;
    }
}
