package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajic implements ajei {
    private static final byte[] a = agmc.an("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] b = agmc.an("070000004041424344454647");
    private static final byte[] c = agmc.an("a0784d7a4716f3feb4f64e7f4b39bf04");

    private ajic(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20");
    }

    public static ajei c(ajgr ajgrVar) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipherD = d();
        byte[] bArrK = ajgrVar.d.k();
        ajgrVar.b.c();
        cipherD.getProvider();
        return new defpackage.ajic(bArrK);
    }

    public static javax.crypto.Cipher d() throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) defpackage.ajse.a.a("ChaCha20-Poly1305");
        if (f(cipher)) {
            return cipher;
        }
        throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    public static boolean e() {
        try {
            d();
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    private static boolean f(javax.crypto.Cipher cipher) {
        try {
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(b);
            byte[] bArr = a;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = c;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
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
