package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajkf implements defpackage.ajkh {
    private final int a;

    public ajkf(ajgm ajgmVar) throws java.security.GeneralSecurityException {
        int i = ajgmVar.b;
        int i2 = ajgmVar.c;
        if (ajgmVar.d != ajgl.c) {
            throw new java.security.GeneralSecurityException("invalid variant");
        }
        this.a = ajgmVar.a;
    }

    @Override // defpackage.ajkh
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajkh
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        int length = bArr2.length;
        if (length < i) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.a) {
            throw new java.security.GeneralSecurityException("invalid key size");
        }
        javax.crypto.SecretKey secretKeyB = defpackage.ajhy.b(bArr);
        if (length < i + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecC = defpackage.ajhy.c(bArr2, i);
        javax.crypto.Cipher cipherA = defpackage.ajhy.a();
        cipherA.init(2, secretKeyB, algorithmParameterSpecC);
        return cipherA.doFinal(bArr2, i + 12, (length - i) - 12);
    }
}
