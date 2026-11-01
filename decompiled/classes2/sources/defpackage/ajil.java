package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajil implements ajei {
    private final /* synthetic */ int $cid;

    private ajil(byte[] bArr, int i, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.$cid = i;
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
    }

    public static ajei c(defpackage.ajst ajstVar) {
        return new defpackage.ajil(ajstVar.c(), 1);
    }

    public static ajei d(ajhn ajhnVar) {
        return new defpackage.ajil(ajhnVar.d.k(), ajhnVar.b, 2);
    }

    public static ajei e(ajhr ajhrVar) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipherD = defpackage.ajic.d();
        byte[] bArrK = ajhrVar.d.k();
        ajhrVar.b.c();
        cipherD.getProvider();
        return new defpackage.ajil(bArrK, 3, (byte[]) null);
    }

    public static ajei f(ajgr ajgrVar) {
        byte[] bArrK = ajgrVar.d.k();
        ajgrVar.b.c();
        return new defpackage.ajil(bArrK, 4, (char[]) null);
    }

    public static ajei g(ajhr ajhrVar) {
        byte[] bArrK = ajhrVar.d.k();
        ajhrVar.b.c();
        return new defpackage.ajil(bArrK, 5, (short[]) null);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public ajil(byte[] bArr, int i) {
        this.$cid = i;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new java.lang.IllegalArgumentException("identifier has an invalid length");
        }
    }

    private ajil(byte[] bArr, defpackage.ajst ajstVar, int i) {
        this.$cid = i;
        defpackage.ajsk.b(defpackage.ajoa.ap(defpackage.ajob.c(bArr.length), ajyi.B(bArr)));
        ajstVar.c();
    }

    public ajil(int i) {
        this.$cid = i;
    }

    private ajil(byte[] bArr, int i, char[] cArr) {
        this.$cid = i;
        new defpackage.ajih(bArr);
    }

    private ajil(byte[] bArr, int i, short[] sArr) {
        this.$cid = i;
        new defpackage.ajik(bArr);
    }
}
