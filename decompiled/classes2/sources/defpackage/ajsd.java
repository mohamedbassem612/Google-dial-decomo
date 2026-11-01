package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsd implements ajei {
    public final defpackage.ajsh a;
    public final ajfb b;
    public final int c;
    public final byte[] d;

    private ajsd(defpackage.ajsh ajshVar, ajfb ajfbVar, int i, byte[] bArr) {
        this.a = ajshVar;
        this.b = ajfbVar;
        this.c = i;
        this.d = bArr;
    }

    public static ajei c(ajfx ajfxVar) {
        byte[] bArrK = ajfxVar.d.k();
        ajgc ajgcVar = ajfxVar.a;
        defpackage.ajrq ajrqVar = new defpackage.ajrq(bArrK, ajgcVar.c);
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(ajgcVar.f));
        defpackage.ajsm ajsmVar = new defpackage.ajsm("HMAC".concat(strValueOf), new javax.crypto.spec.SecretKeySpec(ajfxVar.e.k(), "HMAC"));
        int i = ajgcVar.d;
        return new defpackage.ajsd(ajrqVar, new defpackage.ajsn(ajsmVar, i), i, ajfxVar.b.c());
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
