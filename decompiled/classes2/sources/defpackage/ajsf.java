package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsf implements defpackage.ajsg {
    private final /* synthetic */ int $cid;

    public ajsf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ajsg
    public final /* synthetic */ java.lang.Object a(java.lang.String str, java.security.Provider provider) {
        int i = this.$cid;
        if (i == 0) {
            return provider == null ? javax.crypto.KeyAgreement.getInstance(str) : javax.crypto.KeyAgreement.getInstance(str, provider);
        }
        if (i == 1) {
            return provider == null ? javax.crypto.Cipher.getInstance(str) : javax.crypto.Cipher.getInstance(str, provider);
        }
        if (i == 2) {
            return provider == null ? java.security.KeyFactory.getInstance(str) : java.security.KeyFactory.getInstance(str, provider);
        }
        if (i != 3) {
            return provider == null ? javax.crypto.Mac.getInstance(str) : javax.crypto.Mac.getInstance(str, provider);
        }
        return provider == null ? java.security.KeyPairGenerator.getInstance(str) : java.security.KeyPairGenerator.getInstance(str, provider);
    }
}
