package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affl implements defpackage.affx {
    public final defpackage.affk a;
    private final defpackage.affj b;
    private final long c;
    private long d;

    public affl(defpackage.affk affkVar, defpackage.affj affjVar, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.a = affkVar;
        this.b = affjVar;
        this.c = timeUnit.toMillis(j);
        this.d = affjVar.a();
    }

    @Override // defpackage.affx
    public final void a(int i) {
        defpackage.affk affkVar = this.a;
        affkVar.a(i);
        defpackage.affj affjVar = this.b;
        if (affjVar.a() - this.d >= this.c) {
            affkVar.b();
            this.d = affjVar.a();
        }
    }

    @Override // defpackage.affx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
