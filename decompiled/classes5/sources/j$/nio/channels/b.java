package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class b extends java.nio.channels.AsynchronousFileChannel {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.nio.channels.c a;

    public /* synthetic */ b(j$.nio.channels.c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.channels.AsynchronousChannel, java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.io.IOException {
        ((j$.nio.channels.a) this.a).close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.channels.c cVar = this.a;
        if (obj instanceof j$.nio.channels.b) {
            obj = ((j$.nio.channels.b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void force(boolean z) {
        this.a.e(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return ((j$.nio.channels.a) this.a).isOpen();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void lock(long j, long j2, boolean z, java.lang.Object obj, java.nio.channels.CompletionHandler completionHandler) {
        this.a.i(j, j2, z, obj, j$.nio.channels.d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void read(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, java.nio.channels.CompletionHandler completionHandler) {
        this.a.m(byteBuffer, j, obj, j$.nio.channels.d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ long size() {
        return this.a.size();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.nio.channels.AsynchronousFileChannel truncate(long j) {
        j$.nio.channels.c cVarN = this.a.n(j);
        if (cVarN == null) {
            return null;
        }
        return cVarN instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarN).a : new j$.nio.channels.b(cVarN);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.nio.channels.FileLock tryLock(long j, long j2, boolean z) {
        return this.a.o(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void write(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, java.nio.channels.CompletionHandler completionHandler) {
        this.a.v(byteBuffer, j, obj, j$.nio.channels.d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.util.concurrent.Future lock(long j, long j2, boolean z) {
        return this.a.f(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.util.concurrent.Future read(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.j(byteBuffer, j);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.util.concurrent.Future write(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.q(byteBuffer, j);
    }
}
