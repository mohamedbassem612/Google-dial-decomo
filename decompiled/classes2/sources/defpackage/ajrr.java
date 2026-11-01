package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajrr extends java.lang.ThreadLocal {
    protected static final javax.crypto.Cipher a() {
        try {
            return (javax.crypto.Cipher) defpackage.ajse.a.a("AES/CTR/NOPADDING");
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return a();
    }
}
