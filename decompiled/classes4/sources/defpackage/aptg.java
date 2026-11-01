package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptg extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final java.nio.charset.CharsetEncoder a;
    private final java.nio.CharBuffer b;
    private final java.nio.ByteBuffer c;
    private int d = -1;

    public aptg(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
        this.a = charset.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(1024);
        this.c = byteBufferAllocate;
        byteBufferAllocate.flip();
        this.b = java.nio.CharBuffer.wrap(charSequence);
    }

    private final void a() throws java.nio.charset.CharacterCodingException {
        java.nio.ByteBuffer byteBuffer = this.c;
        byteBuffer.compact();
        java.nio.charset.CoderResult coderResultEncode = this.a.encode(this.b, byteBuffer, true);
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        }
        byteBuffer.flip();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.remaining();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.d = this.b.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.nio.charset.CharacterCodingException {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        java.nio.ByteBuffer byteBuffer = this.c;
        int i3 = 0;
        if (!byteBuffer.hasRemaining() && !this.b.hasRemaining()) {
            return -1;
        }
        while (i2 > 0) {
            if (!byteBuffer.hasRemaining()) {
                a();
                if (!byteBuffer.hasRemaining() && !this.b.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = java.lang.Math.min(byteBuffer.remaining(), i2);
                byteBuffer.get(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
                i3 += iMin;
            }
        }
        if (i3 > 0 || byteBuffer.hasRemaining() || this.b.hasRemaining()) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final void reset() {
        int i = this.d;
        if (i != -1) {
            this.b.position(i);
            this.d = -1;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = 0;
        while (j > 0) {
            java.nio.CharBuffer charBuffer = this.b;
            if (!charBuffer.hasRemaining()) {
                break;
            }
            charBuffer.get();
            j--;
            i++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() throws java.nio.charset.CharacterCodingException {
        while (true) {
            java.nio.ByteBuffer byteBuffer = this.c;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            a();
            if (!byteBuffer.hasRemaining() && !this.b.hasRemaining()) {
                return -1;
            }
        }
    }
}
