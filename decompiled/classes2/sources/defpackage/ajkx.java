package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajkx implements defpackage.ajkw {
    public static final byte[] a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    public static final byte[] b = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    final java.security.Provider c;

    public ajkx(java.security.Provider provider) {
        this.c = provider;
    }

    @Override // defpackage.ajkw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        int length = bArr.length;
        java.security.Provider provider = this.c;
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("XDH", provider);
        if (length != 32) {
            throw new java.security.InvalidKeyException("Invalid X25519 private key");
        }
        java.security.PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(agmc.aw(new byte[][]{a, bArr})));
        if (bArr2.length != 32) {
            throw new java.security.InvalidKeyException("Invalid X25519 public key");
        }
        java.security.PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(agmc.aw(new byte[][]{b, bArr2})));
        javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }
}
