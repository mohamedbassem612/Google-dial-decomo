package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class cko {
    public defpackage.ckv h;
    public long i;
    public boolean j;
    public int k;

    public cko(long j, defpackage.ckv ckvVar) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.h = ckvVar;
        this.i = j;
        defpackage.aonj aonjVar = defpackage.ckw.a;
        if (j != 0) {
            defpackage.ckv ckvVarX = x();
            long[] jArr = ckvVarX.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = ckvVarX.c;
                if (j3 != 0) {
                    j2 = ckvVarX.d;
                    iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = ckvVarX.b;
                    if (j4 != 0) {
                        j2 = ckvVarX.d + 64;
                        iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + ((long) iNumberOfTrailingZeros);
            }
            synchronized (defpackage.ckw.b) {
                defpackage.ckt cktVar = defpackage.ckw.e;
                int i2 = cktVar.a + 1;
                long[] jArr2 = cktVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length << 1;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    defpackage.ajsz.dc(jArr2, jArr3, 0, 0, jArr2.length);
                    defpackage.ajsz.df(cktVar.c, iArr, 0, 0, 14);
                    cktVar.b = jArr3;
                    cktVar.c = iArr;
                }
                int i4 = cktVar.a;
                cktVar.a = i4 + 1;
                int length2 = cktVar.d.length;
                if (cktVar.e >= length2) {
                    int i5 = length2 << 1;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    defpackage.ajsz.df(cktVar.d, iArr2, 0, 0, 14);
                    cktVar.d = iArr2;
                }
                i = cktVar.e;
                int[] iArr3 = cktVar.d;
                cktVar.e = iArr3[i];
                cktVar.b[i4] = j;
                cktVar.c[i4] = i;
                iArr3[i] = i4;
                cktVar.c(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public void A(defpackage.ckv ckvVar) {
        this.h = ckvVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void C() {
        if (this.j) {
            defpackage.cdh.a("Cannot use a disposed snapshot");
        }
    }

    public abstract defpackage.cko b(defpackage.aonj aonjVar);

    public void d() {
        this.j = true;
        synchronized (defpackage.ckw.b) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract defpackage.aonj i();

    public abstract defpackage.aonj k();

    public void m() {
        defpackage.ckw.c = defpackage.ckw.c.b(v());
    }

    public abstract void n(defpackage.clr clrVar);

    public void p() {
        z();
    }

    public void q(int i) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean r();

    public long v() {
        return this.i;
    }

    public final defpackage.cko w() {
        defpackage.ajxw ajxwVar = defpackage.ckw.i;
        defpackage.cko ckoVar = (defpackage.cko) ajxwVar.i();
        ajxwVar.j(this);
        return ckoVar;
    }

    public defpackage.ckv x() {
        return this.h;
    }

    public final void y() {
        synchronized (defpackage.ckw.b) {
            m();
            p();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            defpackage.ckw.e.b(i);
            this.k = -1;
        }
    }
}
