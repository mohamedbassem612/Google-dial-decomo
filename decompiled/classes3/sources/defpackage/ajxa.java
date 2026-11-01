package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajxa extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private long a;
    private long b;

    public ajxa(java.io.InputStream inputStream) {
        super(inputStream);
        this.b = -1L;
        this.a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) java.lang.Math.min(this.in.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int i3 = this.in.read(bArr, i, (int) java.lang.Math.min(i2, j));
        if (i3 != -1) {
            this.a -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new java.io.IOException("Mark not supported");
        }
        if (this.b == -1) {
            throw new java.io.IOException("Mark not set");
        }
        this.in.reset();
        this.a = this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long jSkip = this.in.skip(java.lang.Math.min(j, this.a));
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
        int i = this.in.read();
        if (i != -1) {
            this.a--;
        }
        return i;
    }
}
