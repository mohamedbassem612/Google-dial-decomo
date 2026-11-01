package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apuy extends android.net.http.UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public apuy(org.chromium.net.UploadDataProvider uploadDataProvider) {
        this.a = (org.chromium.net.UploadDataProvider) j$.util.Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final long getLength() {
        return this.a.getLength();
    }

    public final void read(android.net.http.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
        this.a.read(new defpackage.apuz(uploadDataSink), byteBuffer);
    }

    public final void rewind(android.net.http.UploadDataSink uploadDataSink) {
        this.a.rewind(new defpackage.apuz(uploadDataSink));
    }
}
