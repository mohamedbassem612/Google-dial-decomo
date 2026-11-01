package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ycd implements defpackage.xuq {
    private final /* synthetic */ int $cid;
    private final java.nio.ByteBuffer a = java.nio.ByteBuffer.allocate(4);

    public ycd(int i, byte[] bArr) {
        this.$cid = i;
    }

    @Override // defpackage.xuq
    public final /* synthetic */ void a(byte[] bArr, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        if (this.$cid != 0) {
            java.lang.Long l = (java.lang.Long) obj;
            messageDigest.update(bArr);
            java.nio.ByteBuffer byteBuffer = this.a;
            synchronized (byteBuffer) {
                byteBuffer.position(0);
                messageDigest.update(byteBuffer.putLong(l.longValue()).array());
            }
            return;
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            java.nio.ByteBuffer byteBuffer2 = this.a;
            synchronized (byteBuffer2) {
                byteBuffer2.position(0);
                messageDigest.update(byteBuffer2.putInt(num.intValue()).array());
            }
        }
    }

    public ycd(int i) {
        this.$cid = i;
    }
}
