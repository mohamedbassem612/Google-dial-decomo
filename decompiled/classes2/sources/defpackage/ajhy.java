package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajhy {
    private static final java.lang.ThreadLocal a = new defpackage.ajhx();

    public static javax.crypto.Cipher a() {
        return (javax.crypto.Cipher) a.get();
    }

    public static javax.crypto.SecretKey b(byte[] bArr) throws java.security.InvalidAlgorithmParameterException {
        defpackage.ajss.a(bArr.length);
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static java.security.spec.AlgorithmParameterSpec c(byte[] bArr, int i) {
        java.nio.charset.Charset charset = defpackage.ajnf.a;
        java.lang.Integer numValueOf = !j$.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, i, 12);
    }
}
