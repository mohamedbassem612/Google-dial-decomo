package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xql implements defpackage.xqm {
    private final java.nio.ByteBuffer a;

    public xql(java.nio.ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // defpackage.xqm
    public final long a() {
        return this.a.capacity();
    }

    @Override // defpackage.xqm
    public final void b(java.security.MessageDigest[] messageDigestArr, long j, int i) {
        java.nio.ByteBuffer byteBufferSlice;
        java.nio.ByteBuffer byteBuffer = this.a;
        synchronized (byteBuffer) {
            int i2 = (int) j;
            byteBuffer.position(i2);
            byteBuffer.limit(i2 + i);
            byteBufferSlice = byteBuffer.slice();
        }
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
