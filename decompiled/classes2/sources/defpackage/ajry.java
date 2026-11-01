package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajry implements ajem, defpackage.ajjc {
    public static final byte[] a = new byte[16];
    public static final byte[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final java.lang.ThreadLocal c = new defpackage.ajrx();
    public final defpackage.ajoc d;
    public final byte[] e;
    public final byte[] f;

    private ajry(byte[] bArr, defpackage.ajst ajstVar) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        int length = bArr.length;
        if (length != 32 && length != 64) {
            throw new java.security.InvalidKeyException(a.bs(length, "invalid key size: ", " bytes; key must have 32 or 64 bytes"));
        }
        int i = length >> 1;
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, 0, i);
        this.e = java.util.Arrays.copyOfRange(bArr, i, length);
        this.d = defpackage.ajsk.b(defpackage.ajoa.ap(defpackage.ajob.c(bArrCopyOfRange.length), ajyi.B(bArrCopyOfRange)));
        this.f = ajstVar.c();
    }

    public static defpackage.ajjc a(ajis ajisVar) {
        return new defpackage.ajry(ajisVar.d.k(), ajisVar.b);
    }
}
