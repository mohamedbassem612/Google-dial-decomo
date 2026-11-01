package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwx extends org.chromium.net.UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public apwx(org.chromium.net.UploadDataProvider uploadDataProvider) {
        this.a = uploadDataProvider;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.getLength();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
        this.a.read(uploadDataSink, byteBuffer);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
        this.a.rewind(uploadDataSink);
    }
}
