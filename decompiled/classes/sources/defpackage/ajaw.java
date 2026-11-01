package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajaw implements defpackage.ajcb {
    final /* synthetic */ defpackage.ajbg a;
    final /* synthetic */ java.util.concurrent.Executor b;

    public ajaw(defpackage.ajbg ajbgVar, java.util.concurrent.Executor executor) {
        this.a = ajbgVar;
        this.b = executor;
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        this.a.c.b.a.o((java.lang.AutoCloseable) obj, this.b);
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
    }
}
