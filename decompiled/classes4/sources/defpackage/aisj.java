package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aisj extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private long a;
    private long b;

    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    public aisj(java.io.InputStream inputStream, long j) {
        super(inputStream);
        this.b = -1L;
        ahvr.bN((boolean) (((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31), "limit must be non-negative");
        this.a = j;
    }

    final java.io.InputStream a() {
        return (java.io.InputStream) j$.util.Objects.requireNonNull(this.in);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) java.lang.Math.min(a().available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        a().mark(i);
        this.b = this.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int i3 = a().read(bArr, i, (int) java.lang.Math.min(i2, j));
        if (i3 != -1) {
            this.a -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!a().markSupported()) {
            throw new java.io.IOException("Mark not supported");
        }
        if (this.b == -1) {
            throw new java.io.IOException("Mark not set");
        }
        a().reset();
        this.a = this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long jMin = java.lang.Math.min(j, this.a);
        if (jMin <= 0) {
            return 0L;
        }
        long jSkip = a().skip(jMin);
        this.a -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.a == 0) {
            return -1;
        }
        int i = a().read();
        if (i != -1) {
            this.a--;
        }
        return i;
    }
}
