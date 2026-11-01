package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anzv extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private final anmx a;
    private final int b;
    private final defpackage.aodj c;
    private boolean d;
    private boolean e;

    public anzv(java.io.InputStream inputStream, int i, defpackage.aodj aodjVar, anmx anmxVar) {
        super(inputStream);
        this.a = anmxVar;
        this.b = i;
        this.c = aodjVar;
    }

    private final synchronized void a() {
        if (this.e) {
            throw new java.io.IOException("Stream closed");
        }
        if (!this.d) {
            this.in = new defpackage.anzy(this.a.a(this.in), this.b, this.c);
            this.d = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        a();
        return super.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.e) {
            this.e = true;
            super.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        a();
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new java.io.IOException("Mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        a();
        return super.skip(j);
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        a();
        return super.read(bArr, i, i2);
    }
}
