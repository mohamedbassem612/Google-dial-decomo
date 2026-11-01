package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajia implements ajei {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = agmc.an("7a806c");
    private static final byte[] c = agmc.an("46bb91c3c5");
    private static final byte[] d = agmc.an("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] e = agmc.an("bae8e37fc83441b16034566b");
    private static final byte[] f = agmc.an("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public ajia(byte[] bArr) throws java.security.InvalidAlgorithmParameterException {
        defpackage.ajss.a(bArr.length);
        new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static boolean c(javax.crypto.Cipher cipher) {
        try {
            byte[] bArr = e;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(d, "AES"), new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(c);
            byte[] bArr2 = f;
            return java.security.MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), b);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
