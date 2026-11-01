package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajli implements ajei {
    private static final java.lang.String a = "ajli";
    private final ajei b;

    public ajli(java.lang.String str) {
        this.b = new defpackage.ajlh(str, aftt.J());
    }

    private static void c() {
        try {
            java.lang.Thread.sleep((int) (java.lang.Math.random() * 100.0d));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws javax.crypto.BadPaddingException {
        try {
            return this.b.a(bArr, bArr2);
        } catch (java.security.GeneralSecurityException e) {
            e = e;
            android.util.Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (java.security.ProviderException e2) {
            e = e2;
            android.util.Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (javax.crypto.BadPaddingException e3) {
            throw e3;
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return this.b.b(bArr, bArr2);
        } catch (java.security.GeneralSecurityException | java.security.ProviderException e) {
            android.util.Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.b(bArr, bArr2);
        }
    }
}
