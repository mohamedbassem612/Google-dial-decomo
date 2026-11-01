package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aldi {
    public static final defpackage.alcf a;
    public static final defpackage.alcf b;
    public static final java.lang.ThreadLocal c;

    static {
        java.util.logging.Logger.getLogger(defpackage.aldi.class.getName());
        defpackage.akzx akzxVarM = defpackage.alcf.a.m();
        akzxVarM.u();
        ((defpackage.alcf) akzxVarM.b).b = -62135596800L;
        akzxVarM.u();
        ((defpackage.alcf) akzxVarM.b).c = 0;
        defpackage.akzx akzxVarM2 = defpackage.alcf.a.m();
        akzxVarM2.u();
        ((defpackage.alcf) akzxVarM2.b).b = 253402300799L;
        akzxVarM2.u();
        ((defpackage.alcf) akzxVarM2.b).c = 999999999;
        a = (defpackage.alcf) akzxVarM2.r();
        defpackage.akzx akzxVarM3 = defpackage.alcf.a.m();
        akzxVarM3.u();
        ((defpackage.alcf) akzxVarM3.b).b = 0L;
        akzxVarM3.u();
        ((defpackage.alcf) akzxVarM3.b).c = 0;
        b = (defpackage.alcf) akzxVarM3.r();
        c = new defpackage.aldg();
        i("now");
        i("getEpochSecond");
        i("getNano");
    }

    private aldi() {
    }

    public static long a(defpackage.alcf alcfVar) {
        g(alcfVar);
        return defpackage.a.d(aknx.J(alcfVar.b, 1000000L), alcfVar.c / 1000);
    }

    public static long b(defpackage.alcf alcfVar) {
        g(alcfVar);
        return defpackage.a.d(aknx.J(alcfVar.b, 1000L), alcfVar.c / 1000000);
    }

    @java.lang.Deprecated
    public static defpackage.akzm c(defpackage.alcf alcfVar, defpackage.alcf alcfVar2) {
        g(alcfVar);
        g(alcfVar2);
        long jH = akmr.h(alcfVar2.b, alcfVar.b);
        long j = ((long) alcfVar2.c) - ((long) alcfVar.c);
        int i = (int) j;
        if (j == i) {
            return defpackage.aldf.f(jH, i);
        }
        throw new java.lang.ArithmeticException();
    }

    public static defpackage.alcf d(long j) {
        return f(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    public static defpackage.alcf e(long j) {
        return f(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static defpackage.alcf f(long j, int i) {
        if (!h(j)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bC(j, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = defpackage.a.d(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = akmr.h(j, 1L);
        }
        defpackage.akzx akzxVarM = defpackage.alcf.a.m();
        akzxVarM.u();
        ((defpackage.alcf) akzxVarM.b).b = j;
        akzxVarM.u();
        ((defpackage.alcf) akzxVarM.b).c = i;
        defpackage.alcf alcfVar = (defpackage.alcf) akzxVarM.r();
        g(alcfVar);
        return alcfVar;
    }

    public static void g(defpackage.alcf alcfVar) {
        long j = alcfVar.b;
        boolean zH = h(j);
        int i = alcfVar.c;
        if (!zH || i < 0 || i >= 1000000000) {
            throw new java.lang.IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + i + ") must be in range [0, +999,999,999].");
        }
    }

    private static boolean h(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void i(java.lang.String str) {
        try {
            java.lang.Class.forName("java.time.Instant").getMethod(str, null);
        } catch (java.lang.Exception unused) {
        }
    }
}
