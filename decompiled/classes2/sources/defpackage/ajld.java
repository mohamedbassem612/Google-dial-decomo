package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajld implements ajeo {
    public static final byte[] a = new byte[0];
    public final java.security.PublicKey b;
    public final java.lang.String c;
    public final int d;
    public final byte[] e;

    public ajld(java.security.PublicKey publicKey, java.lang.String str, int i, byte[] bArr) {
        this.b = publicKey;
        this.c = str;
        this.d = i;
        this.e = bArr;
    }

    public static ajeo a(ajju ajjuVar) throws java.security.GeneralSecurityException {
        if (!b()) {
            throw new java.security.GeneralSecurityException("Can't use X-Wing, as we might be in FIPS mode, Conscrypt is not available, or platform does not support X-Wing.");
        }
        java.security.Provider providerA = defpackage.ajll.a();
        if (providerA == null) {
            throw new java.security.GeneralSecurityException("Can't use X-Wing as Conscrypt is not available");
        }
        ajjr ajjrVar = ajjuVar.a;
        defpackage.ajst ajstVar = ajjuVar.b;
        java.lang.String strB = defpackage.ajki.b(ajjrVar);
        return new defpackage.ajld(java.security.KeyFactory.getInstance("XWING", providerA).generatePublic(new defpackage.ajlc(ajstVar.c())), strB, defpackage.ajks.a(ajjrVar.a), ajjuVar.c.c());
    }

    public static boolean b() {
        java.security.Provider providerA;
        if (ajsz.u(1) && ((android.os.Build.VERSION.SDK_INT >= 37 || (android.os.Build.VERSION.SDK_INT >= 31 && baa$.ExternalSyntheticApiModelOutline1.m(31) >= 22)) && (providerA = defpackage.ajll.a()) != null)) {
            try {
                java.security.KeyFactory.getInstance("XWING", providerA);
                return true;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        return false;
    }
}
