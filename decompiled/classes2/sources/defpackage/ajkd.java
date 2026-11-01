package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajkd implements defpackage.ajkm {
    private final int a;

    public ajkd(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(a.bj(i, "Unsupported key length: "));
        }
        this.a = i;
    }

    @Override // defpackage.ajkm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajkm
    public final byte[] b() throws java.security.GeneralSecurityException {
        int i = this.a;
        if (i == 16) {
            return defpackage.ajks.i;
        }
        if (i == 32) {
            return defpackage.ajks.j;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // defpackage.ajkm
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length != this.a) {
            throw new java.security.InvalidAlgorithmParameterException(a.bj(length, "Unexpected key length: "));
        }
        if (!ajsz.u(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        javax.crypto.SecretKey secretKeyB = defpackage.ajhy.b(bArr);
        if (bArr2.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        }
        int length2 = bArr3.length;
        if (length2 < i + 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecC = defpackage.ajhy.c(bArr2, 0);
        javax.crypto.Cipher cipherA = defpackage.ajhy.a();
        cipherA.init(2, secretKeyB, algorithmParameterSpecC);
        return cipherA.doFinal(bArr3, i, length2 - i);
    }
}
