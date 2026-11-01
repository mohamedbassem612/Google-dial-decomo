package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajlj implements defpackage.ajez {
    public static final java.lang.Object a = new java.lang.Object();

    @Override // defpackage.ajez
    public final ajei a(java.lang.String str) throws java.security.GeneralSecurityException {
        defpackage.ajli ajliVar;
        try {
            synchronized (a) {
                ajliVar = new defpackage.ajli(defpackage.ajss.b(str));
                byte[] bArrB = defpackage.ajna.b(10);
                byte[] bArr = new byte[0];
                if (!java.util.Arrays.equals(bArrB, ajliVar.a(ajliVar.b(bArrB, bArr), bArr))) {
                    throw new java.security.KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return ajliVar;
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    @Override // defpackage.ajez
    public final boolean b(java.lang.String str) {
        return str.toLowerCase(java.util.Locale.US).startsWith("android-keystore://");
    }
}
