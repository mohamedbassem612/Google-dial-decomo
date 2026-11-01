package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bgn {
    public static final /* synthetic */ int a = 0;
    private static java.lang.Boolean c;
    private static final defpackage.cbd d = new defpackage.cet(new defpackage.ns(6));
    private static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final void a() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        java.text.BreakIterator.getLineInstance();
    }

    public static final boolean b(int i) {
        if (i < 8 || i >= 1000) {
            return false;
        }
        java.lang.Boolean boolValueOf = c;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(java.lang.Runtime.getRuntime().availableProcessors() >= 4);
            c = boolValueOf;
        }
        if (boolValueOf == null) {
            defpackage.aooh.g();
        }
        return boolValueOf.booleanValue();
    }

    public static final void c(defpackage.dji djiVar, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, java.util.List list, boolean z, defpackage.cav cavVar) {
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) cavVar.e(d);
        if (executor == null || !b(djiVar.a())) {
            cavVar.u(842552083);
            ((defpackage.cbt) cavVar).W(false);
        } else {
            cavVar.u(841026976);
            try {
                executor.execute(new bgl(dkzVar, (defpackage.dpq) cavVar.e(defpackage.dfo.j), list, djiVar, (defpackage.dpf) cavVar.e(defpackage.dfo.e), gatVar, z, dnxVar));
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
            ((defpackage.cbt) cavVar).W(false);
        }
    }

    public static final void d(java.lang.String str, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, boolean z, defpackage.cav cavVar) {
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) cavVar.e(d);
        if (executor == null || !b(str.length())) {
            cavVar.u(-2125363537);
            ((defpackage.cbt) cavVar).W(false);
        } else {
            cavVar.u(-2126998198);
            try {
                executor.execute(new bgm(dkzVar, (defpackage.dpq) cavVar.e(defpackage.dfo.j), str, (defpackage.dpf) cavVar.e(defpackage.dfo.e), gatVar, z, dnxVar));
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
            ((defpackage.cbt) cavVar).W(false);
        }
    }
}
