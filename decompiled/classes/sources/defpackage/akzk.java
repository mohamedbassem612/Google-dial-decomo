package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akzk extends defpackage.akyu {
    public java.lang.Object a;

    public static int E(defpackage.akzc akzcVar) {
        int iC = akzcVar.c();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    public static int F(int i) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int G(defpackage.albh albhVar) {
        int iL = albhVar.l();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iL) * 9)) >>> 6) + iL;
    }

    public final void H() {
        if (b() > 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new java.lang.IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void I(int i, double d) {
        k(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void J(double d) {
        l(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void K(int i, float f) {
        i(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void L(float f) {
        j(java.lang.Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c();

    public abstract void d(byte b);

    public abstract void f(int i, boolean z);

    public abstract void g(int i, defpackage.akzc akzcVar);

    public abstract void h(defpackage.akzc akzcVar);

    public abstract void i(int i, int i2);

    public abstract void j(int i);

    public abstract void k(int i, long j);

    public abstract void l(long j);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(defpackage.albh albhVar);

    public abstract void p(int i, defpackage.albh albhVar);

    public abstract void q(int i, defpackage.akzc akzcVar);

    public abstract void r(int i, java.lang.String str);

    public abstract void s(java.lang.String str);

    public abstract void t(int i, int i2);

    public abstract void u(int i, int i2);

    public abstract void v(int i);

    public abstract void w(int i, long j);

    public abstract void x(long j);

    public abstract void y(byte[] bArr, int i);
}
