package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajoe implements defpackage.ajoc {
    private static final java.lang.ThreadLocal a = new defpackage.ajod();
    private final javax.crypto.SecretKey b;
    private final byte[] c;
    private final byte[] d;

    public ajoe(byte[] bArr) throws java.security.GeneralSecurityException {
        defpackage.ajss.a(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        javax.crypto.Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrAA = agmc.aA(cipherB.doFinal(new byte[16]));
        this.c = bArrAA;
        this.d = agmc.aA(bArrAA);
    }

    private static javax.crypto.Cipher b() throws java.security.GeneralSecurityException {
        if (ajsz.u(1)) {
            return (javax.crypto.Cipher) a.get();
        }
        throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // defpackage.ajoc
    public final byte[] a(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        javax.crypto.SecretKey secretKey = this.b;
        javax.crypto.Cipher cipherB = b();
        cipherB.init(1, secretKey);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 << 4;
        byte[] bArrAy = (i2 << 4) == length ? agmc.ay(bArr, i4, this.c, 16) : agmc.ax(agmc.az(java.util.Arrays.copyOfRange(bArr, i4, length)), this.d);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            c(bArr2, bArr, i5 << 4, bArr3);
            if (cipherB.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new java.lang.IllegalStateException("Cipher didn't write full block");
            }
        }
        c(bArr2, bArrAy, 0, bArr3);
        if (cipherB.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : java.util.Arrays.copyOf(bArr2, i);
        }
        throw new java.lang.IllegalStateException("Cipher didn't write full block");
    }
}
