package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class airf implements java.io.Closeable {
    public static final java.lang.ThreadLocal a = new defpackage.aire();
    public int b = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i <= 0) {
            throw new java.lang.AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.b = i - 1;
    }
}
