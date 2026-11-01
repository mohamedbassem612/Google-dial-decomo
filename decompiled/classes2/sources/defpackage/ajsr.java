package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajsr extends java.io.FilterOutputStream {
    final java.nio.ByteBuffer a;
    final java.nio.ByteBuffer b;
    boolean c;
    private final defpackage.ajsp d;
    private final int e;

    public ajsr(defpackage.ajsi ajsiVar, java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        super(outputStream);
        defpackage.ajsp ajspVarH = ajsiVar.h(bArr);
        this.d = ajspVarH;
        int iF = ajsiVar.f();
        this.e = iF;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iF);
        this.a = byteBufferAllocate;
        this.b = java.nio.ByteBuffer.allocate(ajsiVar.d());
        byteBufferAllocate.limit(iF - ajsiVar.c());
        java.nio.ByteBuffer byteBufferA = ajspVarH.a();
        byte[] bArr2 = new byte[byteBufferA.remaining()];
        byteBufferA.get(bArr2);
        this.out.write(bArr2);
        this.c = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            try {
                java.nio.ByteBuffer byteBuffer = this.a;
                byteBuffer.flip();
                java.nio.ByteBuffer byteBuffer2 = this.b;
                byteBuffer2.clear();
                this.d.c(byteBuffer, byteBuffer2);
                java.nio.ByteBuffer byteBuffer3 = this.b;
                byteBuffer3.flip();
                this.out.write(byteBuffer3.array(), byteBuffer3.position(), byteBuffer3.remaining());
                this.c = false;
                super.close();
            } catch (java.security.GeneralSecurityException e) {
                java.nio.ByteBuffer byteBuffer4 = this.a;
                java.nio.ByteBuffer byteBuffer5 = this.b;
                throw new java.io.IOException("ptBuffer.remaining():" + byteBuffer4.remaining() + " ctBuffer.remaining():" + byteBuffer5.remaining(), e);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (!this.c) {
            throw new java.io.IOException("Trying to write to closed stream");
        }
        while (true) {
            java.nio.ByteBuffer byteBuffer = this.a;
            if (i2 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr, i, iRemaining);
                i += iRemaining;
                i2 -= iRemaining;
                try {
                    byteBuffer.flip();
                    java.nio.ByteBuffer byteBuffer2 = this.b;
                    byteBuffer2.clear();
                    this.d.b(byteBuffer, byteBufferWrap, byteBuffer2);
                    byteBuffer2.flip();
                    this.out.write(byteBuffer2.array(), byteBuffer2.position(), byteBuffer2.remaining());
                    byteBuffer.clear();
                    byteBuffer.limit(this.e);
                } catch (java.security.GeneralSecurityException e) {
                    throw new java.io.IOException(e);
                }
            } else {
                this.a.put(bArr, i, i2);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }
}
