package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrq implements defpackage.ajsh {
    public static final java.lang.ThreadLocal a = new defpackage.ajrp();
    public final javax.crypto.spec.SecretKeySpec b;
    public final int c;
    public final int d;

    public ajrq(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (!ajsz.u(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        defpackage.ajss.a(bArr.length);
        this.b = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        int blockSize = ((javax.crypto.Cipher) a.get()).getBlockSize();
        this.d = blockSize;
        if (i > blockSize) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        }
        this.c = i;
    }
}
