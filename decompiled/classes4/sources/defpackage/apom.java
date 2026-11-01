package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apom extends java.io.OutputStream {
    final /* synthetic */ long a;
    final /* synthetic */ apoz b;
    final /* synthetic */ apon c;
    private long d;

    public apom(apon aponVar, long j, apoz apozVar) {
        this.a = j;
        this.b = apozVar;
        j$.util.Objects.requireNonNull(aponVar);
        this.c = aponVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.net.ProtocolException {
        this.c.f = true;
        long j = this.a;
        if (j == -1 || this.d >= j) {
            this.b.close();
            return;
        }
        throw new java.net.ProtocolException("expected " + j + " bytes but received " + this.d);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.c.f) {
            return;
        }
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.c.f) {
            throw new java.io.IOException("closed");
        }
        long j = i2;
        long j2 = this.a;
        if (j2 == -1 || this.d + j <= j2) {
            this.d += j;
            try {
                this.b.L(bArr, i, i2);
                return;
            } catch (java.io.InterruptedIOException e) {
                throw new java.net.SocketTimeoutException(e.getMessage());
            }
        }
        throw new java.net.ProtocolException("expected " + j2 + " bytes but received " + this.d + i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
