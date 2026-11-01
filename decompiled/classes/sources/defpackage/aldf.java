package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aldf {
    public static final defpackage.akzm a;

    static {
        defpackage.akzx akzxVarM = defpackage.akzm.a.m();
        akzxVarM.u();
        ((defpackage.akzm) akzxVarM.b).b = -315576000000L;
        akzxVarM.u();
        ((defpackage.akzm) akzxVarM.b).c = -999999999;
        defpackage.akzx akzxVarM2 = defpackage.akzm.a.m();
        akzxVarM2.u();
        ((defpackage.akzm) akzxVarM2.b).b = 315576000000L;
        akzxVarM2.u();
        ((defpackage.akzm) akzxVarM2.b).c = 999999999;
        defpackage.akzx akzxVarM3 = defpackage.akzm.a.m();
        akzxVarM3.u();
        ((defpackage.akzm) akzxVarM3.b).b = 0L;
        akzxVarM3.u();
        ((defpackage.akzm) akzxVarM3.b).c = 0;
        a = (defpackage.akzm) akzxVarM3.r();
    }

    public static long a(defpackage.akzm akzmVar) {
        g(akzmVar);
        return defpackage.a.d(defpackage.ajsz.dL(akzmVar.b, 1000L), akzmVar.c / 1000000);
    }

    public static long b(defpackage.akzm akzmVar) {
        g(akzmVar);
        return akzmVar.b;
    }

    public static defpackage.akzm c(long j) {
        return f(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static defpackage.akzm d(long j) {
        return f(defpackage.ajsz.dL(j, 60L), 0);
    }

    public static defpackage.akzm e(long j) {
        return f(j / 1000000000, (int) (j % 1000000000));
    }

    public static defpackage.akzm f(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = defpackage.a.d(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        defpackage.akzx akzxVarM = defpackage.akzm.a.m();
        akzxVarM.u();
        ((defpackage.akzm) akzxVarM.b).b = j;
        akzxVarM.u();
        ((defpackage.akzm) akzxVarM.b).c = i;
        defpackage.akzm akzmVar = (defpackage.akzm) akzxVarM.r();
        g(akzmVar);
        return akzmVar;
    }

    public static void g(defpackage.akzm akzmVar) {
        long j = akzmVar.b;
        int i = akzmVar.c;
        if (defpackage.anty.ao(j, i)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static defpackage.akzm h() {
        return f(defpackage.ajsz.dL(7L, 86400L), 0);
    }
}
