package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xqn implements defpackage.xqm {
    private final java.nio.channels.FileChannel a;
    private final long b;
    private final long c;

    public xqn(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.xqm
    public final long a() {
        return this.c;
    }

    @Override // defpackage.xqm
    public final void b(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.MappedByteBuffer map = this.a.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
