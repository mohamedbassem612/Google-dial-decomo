package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apuh extends org.chromium.net.UploadDataProvider {
    private volatile java.nio.channels.FileChannel a;
    private final defpackage.apug b;
    private final java.lang.Object c = new java.lang.Object();

    public apuh(defpackage.apug apugVar) {
        this.b = apugVar;
    }

    private final java.nio.channels.FileChannel a() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = this.b.a();
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.nio.channels.FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i;
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        java.nio.channels.FileChannel fileChannelA = a();
        do {
            i = fileChannelA.read(byteBuffer);
            if (i == -1) {
                break;
            }
        } while (i == 0);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) throws java.io.IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
