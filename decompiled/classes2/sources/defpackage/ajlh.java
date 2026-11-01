package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajlh implements ajei {
    private final javax.crypto.SecretKey a;

    public ajlh(java.lang.String str, java.security.KeyStore keyStore) throws java.security.InvalidKeyException {
        javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) keyStore.getKey(str, null);
        this.a = secretKey;
        if (secretKey == null) {
            throw new java.security.InvalidKeyException("Keystore cannot load the key with ID: ".concat(java.lang.String.valueOf(str)));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length < 28) {
            throw new javax.crypto.BadPaddingException("ciphertext too short");
        }
        javax.crypto.spec.GCMParameterSpec gCMParameterSpec = new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, 12);
        javax.crypto.SecretKey secretKey = this.a;
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKey, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, length - 12);
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        javax.crypto.SecretKey secretKey = this.a;
        byte[] bArr3 = new byte[length + 28];
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey);
        cipher.updateAAD(bArr2);
        if (cipher.doFinal(bArr, 0, length, bArr3, 12) != length + 16) {
            throw new java.security.GeneralSecurityException("encryption failed: bytesWritten is wrong");
        }
        byte[] iv = cipher.getIV();
        if (iv.length != 12) {
            throw new java.security.GeneralSecurityException("IV has unexpected length");
        }
        java.lang.System.arraycopy(iv, 0, bArr3, 0, 12);
        return bArr3;
    }
}
