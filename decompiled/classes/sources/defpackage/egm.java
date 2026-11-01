package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class egm implements java.lang.Iterable, java.io.Serializable {
    private static final defpackage.egi a;
    public static final defpackage.egm d = new defpackage.egk(defpackage.ehl.a);
    private static final long serialVersionUID = 1;
    private int b = 0;

    static {
        a = defpackage.egd.a() ? new defpackage.egl() : new egg();
    }

    public static defpackage.egm h(byte[] bArr) {
        try {
            return k(bArr, 0, bArr.length);
        } catch (defpackage.eho e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static defpackage.egm i(byte[] bArr) {
        try {
            return l(bArr);
        } catch (defpackage.eho e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static defpackage.egm k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        defpackage.anty.P(i, i + i2, bArr.length);
        return new defpackage.egk(a.a(bArr, i, i2));
    }

    static defpackage.egm l(byte[] bArr) {
        return bArr.length == 0 ? d : new defpackage.egk(bArr);
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract defpackage.egm c(int i, int i2);

    public abstract void d(defpackage.egf egfVar);

    protected abstract boolean e(defpackage.egm egmVar);

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.egm) {
            defpackage.egm egmVar = (defpackage.egm) obj;
            int iB = b();
            if (iB == egmVar.b()) {
                if (iB == 0) {
                    return true;
                }
                int i = this.b;
                int i2 = egmVar.b;
                if (i == 0 || i2 == 0 || i == i2) {
                    return e(egmVar);
                }
            }
        }
        return false;
    }

    protected abstract void f(byte[] bArr, int i);

    protected abstract int g(int i, int i2);

    public final int hashCode() {
        int iG = this.b;
        if (iG == 0) {
            int iB = b();
            iG = g(iB, iB);
            if (iG == 0) {
                iG = 1;
            }
            this.b = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return new apxk(this, 1);
    }

    public final byte[] j() {
        int iB = b();
        if (iB == 0) {
            return defpackage.ehl.a;
        }
        byte[] bArr = new byte[iB];
        f(bArr, iB);
        return bArr;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(b()), b() <= 50 ? ece.d(this) : ece.d(c(0, 47)).concat("..."));
    }
}
