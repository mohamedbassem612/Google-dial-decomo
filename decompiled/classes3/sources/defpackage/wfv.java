package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class wfv {
    private final java.lang.String z;
    public static final float[] a = {-4.0f, -1.0f, 3.5f, -4.5f};
    private static final int[] y = {0, 2, 3, 1};
    public static final defpackage.wfv b = new defpackage.wfi();
    public static final defpackage.wfv c = new defpackage.wfn();
    public static final defpackage.wfv d = new defpackage.wfo();
    public static final defpackage.wfv e = new defpackage.wfp();
    public static final defpackage.wfv f = new defpackage.wfq();
    public static final defpackage.wfv g = new defpackage.wfr();
    public static final defpackage.wfv h = new defpackage.wfs();
    public static final defpackage.wfv i = new defpackage.wft();
    public static final defpackage.wfv j = new defpackage.wfu();
    public static final defpackage.wfv k = new defpackage.wey();
    public static final defpackage.wfv l = new defpackage.wez();
    public static final defpackage.wfv m = new defpackage.wfa();
    public static final defpackage.wfv n = new defpackage.wfb();
    public static final defpackage.wfv o = new defpackage.wfc();
    public static final defpackage.wfv p = new defpackage.wfd();
    public static final defpackage.wfv q = new defpackage.wfe();
    public static final defpackage.wfv r = new defpackage.wff();
    public static final defpackage.wfv s = new defpackage.wfg();
    public static final defpackage.wfv t = new defpackage.wfh();
    public static final defpackage.wfv u = new defpackage.wfj();
    public static final defpackage.wfv v = new defpackage.wfk();
    public static final defpackage.wfv w = new defpackage.wfl();
    public static final defpackage.wfv x = new defpackage.wfm();

    public wfv(java.lang.String str) {
        this.z = str;
    }

    public static float e(long j2, int i2) {
        return ((j2 - (((long) y[i2]) * 50)) % 1200) / 1200.0f;
    }

    public static float f(long j2, long j3, long j4) {
        return (j3 - j2) / j4;
    }

    public static void g(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.p(true);
            wgbVar.r(true);
            wgbVar.s(true);
            wgbVar.q(true);
        }
    }

    static void h(defpackage.wgc wgcVar, defpackage.wgb wgbVar, long j2) {
        int iB = wgcVar.b(wgbVar);
        if (wgbVar == wgcVar.e) {
            iB = 3;
        }
        wgbVar.i((float) java.lang.Math.sin((((j2 - (iB * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f));
    }

    static void i(defpackage.wgc wgcVar, long j2) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            h(wgcVar, (defpackage.wgb) it.next(), j2);
        }
    }

    public static void j(defpackage.wgb wgbVar, int i2, float f2) {
        wgbVar.i(a[i2] + ((float) java.lang.Math.sin(f2 * 6.2831855f)));
    }

    public static void k(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.n(1);
            wgbVar.i(-6.0f);
            if (wgbVar == wgcVar.c) {
                wgbVar.h(-2.0f);
            }
            if (wgbVar == wgcVar.d) {
                wgbVar.h(2.0f);
            }
        }
    }

    public static void l(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.t(true);
            wgbVar.r(false);
            wgbVar.p(false);
            wgbVar.s(false);
            wgbVar.q(false);
            wgbVar.d.h(true);
        }
    }

    public static void m(defpackage.wgc wgcVar) {
        defpackage.wgb wgbVar = wgcVar.b;
        wgbVar.j(12.0f);
        wgbVar.f(3.1415927f);
        defpackage.wgb wgbVar2 = wgcVar.c;
        wgbVar2.j(4.0f);
        wgbVar2.f(3.1415927f);
        defpackage.wgb wgbVar3 = wgcVar.d;
        wgbVar3.j(4.0f);
        wgbVar3.f(0.0f);
        defpackage.wgb wgbVar4 = wgcVar.e;
        wgbVar4.j(12.0f);
        wgbVar4.f(0.0f);
    }

    public static void n(defpackage.wgc wgcVar) {
        defpackage.wgb wgbVar = wgcVar.b;
        wgbVar.n(1);
        defpackage.wgb wgbVar2 = wgcVar.c;
        wgbVar2.h(-2.0f);
        defpackage.wgb wgbVar3 = wgcVar.d;
        wgbVar3.h(2.0f);
        wgcVar.e.n(1);
        if (wgbVar.b() > 0.66f) {
            wgbVar2.n(1);
            wgbVar3.n(1);
        }
    }

    public static void o(defpackage.wgc wgcVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            int iB = wgcVar.b(wgbVar);
            wgbVar.t(zArr[iB]);
            wgbVar.f(fArr4[iB]);
            wgbVar.j(fArr3[iB] * 1.0416666f);
            wgbVar.h(fArr2[iB] * 1.0416666f);
            wgbVar.i(a[iB] * 1.0416666f);
            wgbVar.k(fArr[iB] * 1.0416666f);
        }
    }

    public static boolean p(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            float fA = ((defpackage.wgb) it.next()).a();
            if (fA > 0.3926991f && fA < 2.7488937f) {
                return false;
            }
            if (fA > 3.5342917f && fA < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    public static void q(defpackage.wgc wgcVar) {
        wgcVar.g(3.0f);
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.j(5.656f);
            wgbVar.i(0.0f);
        }
        defpackage.wgb wgbVar2 = wgcVar.b;
        wgcVar.d(wgbVar2, 4.712389f);
        wgbVar2.f(4.712389f);
        wgcVar.c.f(0.0f);
        wgcVar.d.f(1.5707964f);
        wgcVar.e.f(3.1415927f);
    }

    public abstract void a(defpackage.wgc wgcVar);

    public abstract void b(defpackage.wgc wgcVar);

    public abstract boolean c(long j2, long j3, defpackage.wgc wgcVar);

    public final java.lang.String toString() {
        return this.z;
    }
}
