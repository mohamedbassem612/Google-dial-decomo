package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class css {
    private defpackage.cqh a;
    private float b = 1.0f;
    private defpackage.dpq c = defpackage.dpq.a;

    public abstract long a();

    protected abstract void b(defpackage.csj csjVar);

    protected void c(float f) {
        throw null;
    }

    protected void d(defpackage.cqh cqhVar) {
        throw null;
    }

    public final void e(defpackage.csj csjVar, long j, float f, defpackage.cqh cqhVar) {
        if (this.b != f) {
            c(f);
            this.b = f;
        }
        if (!defpackage.aooh.n(this.a, cqhVar)) {
            d(cqhVar);
            this.a = cqhVar;
        }
        defpackage.dpq dpqVarP = csjVar.p();
        if (this.c != dpqVarP) {
            f(dpqVarP);
            this.c = dpqVarP;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) - java.lang.Float.intBitsToFloat(i2);
        csjVar.q().c.s(fIntBitsToFloat, fIntBitsToFloat2);
        float f2 = -fIntBitsToFloat;
        float f3 = -fIntBitsToFloat2;
        if (f > 0.0f) {
            try {
                if (java.lang.Float.intBitsToFloat(i) > 0.0f && java.lang.Float.intBitsToFloat(i2) > 0.0f) {
                    b(csjVar);
                }
            } finally {
                csjVar.q().c.s(f2, f3);
            }
        }
    }

    protected void f(defpackage.dpq dpqVar) {
    }
}
