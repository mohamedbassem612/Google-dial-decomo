package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrs implements ajei {
    private ajrs(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new java.lang.IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        int length = bArr.length;
        defpackage.ajss.a(length);
        new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        defpackage.ajsk.b(defpackage.ajoa.ap(defpackage.ajob.c(length), ajyi.B(bArr)));
    }

    public static ajei c(ajgd ajgdVar) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        ajgh ajghVar = ajgdVar.a;
        ajyi ajyiVar = ajgdVar.d;
        defpackage.ajst ajstVar = ajgdVar.b;
        byte[] bArrK = ajyiVar.k();
        ajstVar.c();
        return new defpackage.ajrs(bArrK, ajghVar.b);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
