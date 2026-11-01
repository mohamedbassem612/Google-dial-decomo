package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adel implements defpackage.qr {
    private final defpackage.addd a;
    private final java.util.concurrent.Executor b;

    public adel(defpackage.addd adddVar, java.util.concurrent.Executor executor) {
        aooh.f(executor, "executor");
        this.a = adddVar;
        this.b = executor;
    }

    @Override // defpackage.qr
    public final ajcq a() {
        return ajan.f(this.a.a(), new defpackage.adek(new defpackage.acsb(8), 0), this.b);
    }

    @Override // defpackage.qr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
