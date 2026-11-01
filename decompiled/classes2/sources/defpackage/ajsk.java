package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsk implements defpackage.ajoc {
    public static defpackage.ajoc b(defpackage.ajoa ajoaVar) {
        ajyi ajyiVar = ajoaVar.a;
        defpackage.ajoe ajoeVar = new defpackage.ajoe(ajyiVar.k());
        try {
            java.security.Provider providerA = defpackage.ajll.a();
            if (providerA == null) {
                throw new java.security.GeneralSecurityException("Conscrypt not available");
            }
            javax.crypto.Mac.getInstance("AESCMAC", providerA);
            return new defpackage.ajsj(ajoeVar, new defpackage.ajsj(ajyiVar.k(), providerA, 1), 0);
        } catch (java.security.GeneralSecurityException unused) {
            return ajoeVar;
        }
    }

    @Override // defpackage.ajoc
    public final byte[] a(byte[] bArr, int i) {
        throw null;
    }
}
