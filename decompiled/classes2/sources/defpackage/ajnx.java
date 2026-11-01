package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajnx implements ajnl {
    public ajnx(ajng ajngVar, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            javax.crypto.Mac.getInstance("AESCMAC", provider);
            ajngVar.b.c();
            new javax.crypto.spec.SecretKeySpec(ajngVar.d.k(), "AES");
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.security.GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static ajnl a(ajng ajngVar) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        java.security.Provider providerA = defpackage.ajll.a();
        if (providerA != null) {
            try {
                return new defpackage.ajnx(ajngVar, providerA);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        return new defpackage.ajnx();
    }

    public ajnx(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!ajsz.u(2)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
