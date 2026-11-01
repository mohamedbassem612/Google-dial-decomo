package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajkn {
    public static final byte[] a = new byte[0];
    public final defpackage.ajkm b;
    public final byte[] c;
    private final java.math.BigInteger d;
    private final byte[] e;
    private java.math.BigInteger f = java.math.BigInteger.ZERO;

    public ajkn(byte[] bArr, byte[] bArr2, java.math.BigInteger bigInteger, defpackage.ajkm ajkmVar) {
        this.c = bArr;
        this.e = bArr2;
        this.d = bigInteger;
        this.b = ajkmVar;
    }

    public final synchronized byte[] a() {
        byte[] bArrAx;
        bArrAx = agmc.ax(this.e, aftt.I(this.f, 12));
        if (this.f.compareTo(this.d) >= 0) {
            throw new java.security.GeneralSecurityException("message limit reached");
        }
        this.f = this.f.add(java.math.BigInteger.ONE);
        return bArrAx;
    }
}
