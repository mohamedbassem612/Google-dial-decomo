package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aliv extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final java.io.InputStream d;
    private final defpackage.aliu e;
    private final int f;
    private volatile boolean b = false;
    public volatile boolean a = false;
    private volatile int c = 0;

    public aliv(java.io.InputStream inputStream, defpackage.alqg alqgVar, defpackage.aliu aliuVar) {
        this.d = inputStream;
        this.e = aliuVar;
        int iAf = a.af(alqgVar.b);
        int i = 1;
        int i2 = (iAf == 0 ? 1 : iAf) - 2;
        if (i2 == 0) {
            i = 2;
        } else if (i2 != 1) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding value.");
        }
        this.f = ((i * alqgVar.d) * alqgVar.c) / 1000;
    }

    public final int a() {
        return this.c / this.f;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = true;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (this.b || this.a) {
            return -1;
        }
        int iA = a() / 100;
        int i3 = this.d.read(bArr, i, i2);
        this.c += i3;
        int iA2 = a();
        if (iA2 / 100 > iA) {
            defpackage.aliu aliuVar = this.e;
            akzx akzxVarM = defpackage.aljk.a.m();
            akzxVarM.u();
            ((defpackage.aljk) akzxVarM.b).b = iA2;
            aliuVar.a((defpackage.aljk) akzxVarM.p());
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }
}
