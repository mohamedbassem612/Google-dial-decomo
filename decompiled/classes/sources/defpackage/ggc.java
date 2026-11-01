package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggc implements defpackage.giu {
    private final /* synthetic */ defpackage.ggd a;

    public ggc(defpackage.ggd ggdVar) {
        this.a = ggdVar;
    }

    @Override // defpackage.giu
    public final void a(int i, byte[] bArr) {
        defpackage.aooh.f(bArr, "value");
        this.a.a(i, bArr);
    }

    @Override // defpackage.giu
    public final void b(int i, double d) {
        this.a.b(i, d);
    }

    @Override // defpackage.giu
    public final void c(int i, long j) {
        this.a.c(i, j);
    }

    @Override // defpackage.giu
    public final void d(int i) {
        this.a.d(i);
    }

    @Override // defpackage.giu
    public final void e(int i, java.lang.String str) {
        defpackage.aooh.f(str, "value");
        this.a.e(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
