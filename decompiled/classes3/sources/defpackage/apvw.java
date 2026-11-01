package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class apvw implements java.nio.channels.ReadableByteChannel {
    private final java.io.InputStream a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(true);

    private apvw(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    static java.nio.channels.ReadableByteChannel a(java.io.InputStream inputStream) {
        return inputStream instanceof java.io.FileInputStream ? j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((java.io.FileInputStream) inputStream).getChannel()) : new defpackage.apvw(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i;
        boolean zHasArray = byteBuffer.hasArray();
        java.io.InputStream inputStream = this.a;
        if (zHasArray) {
            i = inputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (i > 0) {
            }
        } else {
            byte[] bArr = new byte[java.lang.Math.min(16384, java.lang.Math.min(java.lang.Math.max(inputStream.available(), 4096), byteBuffer.remaining()))];
            i = inputStream.read(bArr);
            if (i > 0) {
                byteBuffer.put(bArr, 0, i);
            }
        }
        return i;
    }
}
