package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xys implements defpackage.xyq {
    private final /* synthetic */ int $cid;

    public xys(defpackage.xyt xytVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xytVar);
    }

    @Override // defpackage.xyq
    public final java.lang.Class a() {
        return this.$cid != 0 ? java.nio.ByteBuffer.class : java.io.InputStream.class;
    }

    @Override // defpackage.xyq
    public final /* synthetic */ java.lang.Object b(byte[] bArr) {
        return this.$cid != 0 ? java.nio.ByteBuffer.wrap(bArr) : new java.io.ByteArrayInputStream(bArr);
    }

    public xys(defpackage.xyt xytVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xytVar);
    }
}
