package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abri {
    public static final /* synthetic */ int e = 0;
    private static final defpackage.ahzi f = defpackage.ahvr.bI(new defpackage.tzo(5));
    public final defpackage.ahyn a;
    public final boolean b;
    public final defpackage.ajcu c;
    public final java.util.Set d;

    public abri(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ajcu ajcuVar, java.util.Set set) {
        this.a = ahynVar;
        this.b = ((java.lang.Boolean) ((defpackage.ahys) ahynVar2).a).booleanValue();
        this.c = ajcuVar;
        this.d = set;
    }

    public static void a(abrj abrjVar, java.util.ArrayList arrayList, java.lang.RuntimeException runtimeException) {
        if (android.os.Debug.isDebuggerConnected()) {
            return;
        }
        if (arrayList.size() > 20) {
            for (int i = 0; i < 20; i++) {
                java.util.Collections.swap(arrayList, i, j$.util.concurrent.ThreadLocalRandom.current().nextInt(arrayList.size() - i) + i);
            }
        }
        for (java.lang.Thread thread : arrayList.subList(0, java.lang.Math.min(arrayList.size(), 20))) {
            java.lang.RuntimeException runtimeExceptionB = defpackage.ahrc.b(thread);
            runtimeException.addSuppressed(runtimeExceptionB.getStackTrace().length > 0 ? abqt.a(thread, runtimeExceptionB) : abqt.a(thread, (java.lang.Throwable) null));
        }
        int iOrdinal = abrjVar.ordinal();
        if (iOrdinal == 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimz) f.eZ()).c()).k(runtimeException)).l("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring", "reportUnhealthyThreadPool", (char) 440, "ThreadMonitoring.java")).v("Unhealthy thread pool detected");
        } else if (iOrdinal == 1) {
            defpackage.afec.e(new yne(runtimeException, 19));
        }
    }

    public static boolean b() {
        return j$.util.concurrent.ThreadLocalRandom.current().nextInt(1000) <= 0;
    }
}
