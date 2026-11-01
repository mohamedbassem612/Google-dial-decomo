package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrw implements ajei {
    public final javax.crypto.SecretKey a;
    public final byte[] b;

    public ajrw(byte[] bArr, defpackage.ajst ajstVar) throws java.security.GeneralSecurityException {
        if (!ajsz.u(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = defpackage.ajhy.b(bArr);
        this.b = ajstVar.c();
    }

    public static ajei c(ajgi ajgiVar) {
        return new defpackage.ajrw(ajgiVar.d.k(), ajgiVar.b);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
