package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class UploadDataProvider implements java.io.Closeable {
    public abstract long getLength();

    public abstract void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer);

    public abstract void rewind(org.chromium.net.UploadDataSink uploadDataSink);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
