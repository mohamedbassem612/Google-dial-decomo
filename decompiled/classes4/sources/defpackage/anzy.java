package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anzy extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private final int a;
    private final defpackage.aodj b;
    private long c;
    private long d;
    private long e;

    public anzy(java.io.InputStream inputStream, int i, defpackage.aodj aodjVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = aodjVar;
    }

    private final void a() {
        if (this.d > this.c) {
            defpackage.aodj.g(this.b);
            this.c = this.d;
        }
    }

    private final void b() {
        long j = this.d;
        int i = this.a;
        if (j > i) {
            throw new defpackage.anqz(anqw.h.f(a.bj(i, "Decompressed gRPC message exceeds maximum size ")), null);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = this.in.read();
        if (i != -1) {
            this.d++;
        }
        b();
        a();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new java.io.IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new java.io.IOException("Mark not set");
        }
        this.in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long jSkip = this.in.skip(j);
        this.d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            this.d += (long) i3;
        }
        b();
        a();
        return i3;
    }
}
