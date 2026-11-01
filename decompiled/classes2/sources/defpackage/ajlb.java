package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajlb implements ajen {
    public static final byte[] a = new byte[0];
    public static final byte[] b = "Workload".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    public static final byte[] c = "ContextInfo".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    private final java.security.PrivateKey d;
    private final java.lang.String e;
    private final int f;
    private final byte[] g;

    public ajlb(java.security.PrivateKey privateKey, java.lang.String str, int i, byte[] bArr) {
        this.d = privateKey;
        this.e = str;
        this.f = i;
        this.g = bArr;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.g;
        int length = bArr3.length;
        int i = this.f + length;
        int length2 = bArr.length;
        if (length2 < i) {
            throw new java.security.GeneralSecurityException("Ciphertext is too short");
        }
        if (!defpackage.ajnf.a(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length, i);
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, i, length2);
        return deh$.ExternalSyntheticApiModelOutline0.m(deh$.ExternalSyntheticApiModelOutline0.m(this.e), this.d, bArr2, new android.crypto.hpke.Message(bArrCopyOfRange, bArrCopyOfRange2), a);
    }
}
