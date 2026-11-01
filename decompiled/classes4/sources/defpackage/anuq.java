package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class anuq implements defpackage.aoaw {
    protected final void a(int i) {
        if (f() < i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    @Override // defpackage.aoaw
    public void c() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aoaw
    public boolean d() {
        return false;
    }

    @Override // defpackage.aoaw
    public void b() {
    }

    @Override // defpackage.aoaw, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
