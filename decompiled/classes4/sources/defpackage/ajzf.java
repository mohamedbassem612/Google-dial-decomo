package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ajzf extends org.chromium.net.UploadDataProvider {
    private final java.nio.ByteBuffer a;

    public ajzf(ajzl ajzlVar) {
        this.a = ajzlVar.b.duplicate();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.remaining();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            int iLimit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(iLimit);
        } else {
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
        this.a.rewind();
        uploadDataSink.onRewindSucceeded();
    }
}
