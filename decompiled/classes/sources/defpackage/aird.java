package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aird {
    private static final java.lang.String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final defpackage.airg b;

    static {
        defpackage.airg airiVar;
        for (int i = 0; i < 2; i++) {
            airiVar = null;
            try {
                airiVar = (defpackage.airg) java.lang.Class.forName(a[i]).asSubclass(defpackage.airg.class).getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.Throwable unused) {
            }
            if (airiVar != null) {
                b = airiVar;
            }
        }
        airiVar = new defpackage.airi();
        b = airiVar;
    }

    public static java.lang.StackTraceElement a(java.lang.Class cls, int i) {
        defpackage.aiql.l(cls, "target");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "skip count cannot be negative: "));
        }
        return b.a(cls, i + 1);
    }

    public static java.lang.StackTraceElement[] b(java.lang.Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            throw new java.lang.IllegalArgumentException("invalid maximum depth: 0");
        }
        return b.b(cls, i, i2 + 1);
    }
}
