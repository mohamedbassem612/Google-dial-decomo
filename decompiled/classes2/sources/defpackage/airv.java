package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class airv extends defpackage.airk {
    private final java.security.MessageDigest a;
    private final int b;
    private boolean c;

    public airv(java.security.MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void l() {
        ahvr.bZ(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.airk
    protected final void b(java.nio.ByteBuffer byteBuffer) {
        l();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.airk
    protected final void e(byte[] bArr, int i) {
        l();
        this.a.update(bArr, 0, i);
    }

    public final airq o() {
        l();
        this.c = true;
        int i = this.b;
        java.security.MessageDigest messageDigest = this.a;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = airq.b;
            return new airo(bArrDigest);
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(messageDigest.digest(), i);
        int i3 = airq.b;
        return new airo(bArrCopyOf);
    }
}
