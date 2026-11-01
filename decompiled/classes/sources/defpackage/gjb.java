package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gjb extends java.lang.RuntimeException {
    public final java.lang.Throwable a;
    public final int b;

    public gjb(int i, java.lang.Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.a;
    }
}
