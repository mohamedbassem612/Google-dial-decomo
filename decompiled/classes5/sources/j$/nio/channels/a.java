package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class a extends j$.nio.channels.c {
    public final /* synthetic */ java.nio.channels.AsynchronousFileChannel a;

    public a(java.nio.channels.AsynchronousFileChannel asynchronousFileChannel) {
        this.a = asynchronousFileChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void e(boolean z) throws java.io.IOException {
        this.a.force(z);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.channels.AsynchronousFileChannel asynchronousFileChannel = this.a;
        if (obj instanceof j$.nio.channels.a) {
            obj = ((j$.nio.channels.a) obj).a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.util.concurrent.Future f(long j, long j2, boolean z) {
        return this.a.lock(j, j2, z);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void i(long j, long j2, boolean z, java.lang.Object obj, j$.nio.channels.f fVar) {
        this.a.lock(j, j2, z, obj, j$.nio.channels.e.a(fVar));
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.util.concurrent.Future j(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.read(byteBuffer, j);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void m(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar) {
        this.a.read(byteBuffer, j, obj, j$.nio.channels.e.a(fVar));
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ j$.nio.channels.c n(long j) throws java.io.IOException {
        java.nio.channels.AsynchronousFileChannel asynchronousFileChannelTruncate = this.a.truncate(j);
        if (asynchronousFileChannelTruncate == null) {
            return null;
        }
        return asynchronousFileChannelTruncate instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelTruncate).a : new j$.nio.channels.a(asynchronousFileChannelTruncate);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.nio.channels.FileLock o(long j, long j2, boolean z) {
        return this.a.tryLock(j, j2, z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.util.concurrent.Future q(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.write(byteBuffer, j);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ long size() {
        return this.a.size();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void v(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar) {
        this.a.write(byteBuffer, j, obj, j$.nio.channels.e.a(fVar));
    }
}
