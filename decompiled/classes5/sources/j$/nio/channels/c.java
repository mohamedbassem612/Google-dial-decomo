package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class c implements java.nio.channels.Channel {
    public abstract void e(boolean z);

    public abstract java.util.concurrent.Future f(long j, long j2, boolean z);

    public abstract void i(long j, long j2, boolean z, java.lang.Object obj, j$.nio.channels.f fVar);

    public abstract java.util.concurrent.Future j(java.nio.ByteBuffer byteBuffer, long j);

    public abstract void m(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar);

    public abstract j$.nio.channels.c n(long j);

    public abstract java.nio.channels.FileLock o(long j, long j2, boolean z);

    public abstract java.util.concurrent.Future q(java.nio.ByteBuffer byteBuffer, long j);

    public abstract long size();

    public abstract void v(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar);
}
