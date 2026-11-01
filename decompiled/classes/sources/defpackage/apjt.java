package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjt extends defpackage.apjo implements defpackage.apqd {
    private final defpackage.apiy a;
    private final long b;

    public apjt(defpackage.apiy apiyVar, long j) {
        this.a = apiyVar;
        this.b = j;
    }

    @Override // defpackage.apjo
    public final long a() {
        return this.b;
    }

    @Override // defpackage.apqd
    public final long b(defpackage.apoy apoyVar, long j) {
        throw new java.lang.IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.apjo
    public final defpackage.appa c() {
        return new defpackage.appx(this);
    }

    @Override // defpackage.apjo
    public final defpackage.apiy fO() {
        return this.a;
    }

    @Override // defpackage.apqd
    public final defpackage.apqf fP() {
        return defpackage.apqf.k;
    }

    @Override // defpackage.apjo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
