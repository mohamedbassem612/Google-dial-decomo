package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajke implements defpackage.ajkm {
    @Override // defpackage.ajkm
    public final int a() {
        return 32;
    }

    @Override // defpackage.ajkm
    public final byte[] b() {
        return defpackage.ajks.k;
    }

    @Override // defpackage.ajkm
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        if (bArr.length != 32) {
            throw new java.security.InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (!defpackage.ajic.e()) {
            return new defpackage.ajih(bArr).b(java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
        java.security.Provider provider = defpackage.ajic.d().getProvider();
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20");
        if (bArr3 == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        if (bArr2.length != 12) {
            throw new java.security.GeneralSecurityException("nonce length must be 12 bytes.");
        }
        int length = bArr3.length;
        if (length < i + 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr2);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr3, i, length - i);
    }
}
