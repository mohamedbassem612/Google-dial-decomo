package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajip implements ajei {
    private static final java.security.Provider a = defpackage.ajll.b();
    private static final java.lang.ThreadLocal b = new defpackage.ajio();

    public static ajei c(ajgn ajgnVar) throws java.security.GeneralSecurityException {
        int i = defpackage.ajia.a;
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) b.get();
        if (cipher == null) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        if (!defpackage.ajia.c(cipher)) {
            throw new java.lang.IllegalStateException("Cipher does not implement AES GCM SIV.");
        }
        ajyi ajyiVar = ajgnVar.d;
        defpackage.ajst ajstVar = ajgnVar.b;
        byte[] bArrK = ajyiVar.k();
        ajstVar.c();
        return new defpackage.ajia(bArrK);
    }

    public static javax.crypto.Cipher d() {
        try {
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) defpackage.ajse.a.a("AES/GCM-SIV/NoPadding");
            if (defpackage.ajia.c(cipher)) {
                return cipher;
            }
        } catch (java.security.GeneralSecurityException unused) {
        }
        java.security.Provider provider = a;
        if (provider != null) {
            try {
                javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance("AES/GCM-SIV/NoPadding", provider);
                if (defpackage.ajia.c(cipher2)) {
                    return cipher2;
                }
            } catch (java.security.GeneralSecurityException unused2) {
            }
        }
        return null;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
