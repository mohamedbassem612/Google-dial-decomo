package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajkt implements ajen {
    private final ajen a;
    private final byte[] b;

    public ajkt(ajen ajenVar, byte[] bArr) {
        this.a = ajenVar;
        this.b = bArr;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return this.a.a(bArr, bArr2);
        }
        if (!defpackage.ajnf.a(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        return this.a.a(java.util.Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
