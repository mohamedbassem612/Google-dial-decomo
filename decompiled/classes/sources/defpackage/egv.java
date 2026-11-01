package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class egv extends defpackage.egf {
    public java.lang.Object b;

    public static int E(int i, defpackage.egm egmVar) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + F(egmVar);
    }

    public static int F(defpackage.egm egmVar) {
        int iB = egmVar.b();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public static int G(int i, int i2) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + I(i2);
    }

    public static int H(int i, int i2) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + I(i2);
    }

    public static int I(int i) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int J(int i, java.lang.String str) {
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + K(str);
    }

    public static int K(java.lang.String str) {
        int iB = defpackage.eiz.b(str);
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public final void L(int i, double d) {
        j(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void M(double d) {
        k(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void N(int i, float f) {
        h(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void O(float f) {
        i(java.lang.Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c(byte b);

    public abstract void e(int i, boolean z);

    public abstract void f(int i, defpackage.egm egmVar);

    public abstract void g(defpackage.egm egmVar);

    public abstract void h(int i, int i2);

    public abstract void i(int i);

    public abstract void j(int i, long j);

    public abstract void k(long j);

    public abstract void l(int i, int i2);

    public abstract void m(int i);

    public abstract void n(defpackage.ehw ehwVar);

    public abstract void o(int i, defpackage.ehw ehwVar);

    public abstract void p(int i, defpackage.egm egmVar);

    public abstract void q(int i, java.lang.String str);

    public abstract void r(java.lang.String str);

    public abstract void s(int i, int i2);

    public abstract void t(int i, int i2);

    public abstract void u(int i);

    public abstract void v(int i, long j);

    public abstract void w(long j);

    public abstract void x(byte[] bArr, int i);
}
