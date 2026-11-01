package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apxo implements java.lang.Iterable, java.io.Serializable {
    public static final defpackage.apxo d = new defpackage.apxn(defpackage.apyj.a);
    private static final long serialVersionUID = 1;
    private int a = 0;

    static {
        java.lang.Class cls = defpackage.apxh.a;
    }

    static defpackage.apxo h(byte[] bArr) {
        try {
            return k(bArr);
        } catch (defpackage.apym e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static defpackage.apxo j(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        anty.P(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new defpackage.apxn(bArr2);
    }

    static defpackage.apxo k(byte[] bArr) {
        return bArr.length == 0 ? d : new defpackage.apxn(bArr);
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract defpackage.apxo c(int i, int i2);

    public abstract void d(defpackage.apxj apxjVar);

    protected abstract boolean e(defpackage.apxo apxoVar);

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.apxo) {
            defpackage.apxo apxoVar = (defpackage.apxo) obj;
            int iB = b();
            if (iB == apxoVar.b()) {
                if (iB == 0) {
                    return true;
                }
                int i = this.a;
                int i2 = apxoVar.a;
                if (i == 0 || i2 == 0 || i == i2) {
                    return e(apxoVar);
                }
            }
        }
        return false;
    }

    protected abstract void f(byte[] bArr, int i);

    protected abstract int g(int i, int i2);

    public final int hashCode() {
        int iG = this.a;
        if (iG == 0) {
            int iB = b();
            iG = g(iB, iB);
            if (iG == 0) {
                iG = 1;
            }
            this.a = iG;
        }
        return iG;
    }

    public final byte[] i() {
        int iB = b();
        if (iB == 0) {
            return defpackage.apyj.a;
        }
        byte[] bArr = new byte[iB];
        f(bArr, iB);
        return bArr;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.apxk(this, 0);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(b()), b() <= 50 ? anty.aR(this) : anty.aR(c(0, 47)).concat("..."));
    }
}
