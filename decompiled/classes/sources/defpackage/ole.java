package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ole implements defpackage.agus {
    public final defpackage.zjv a;
    public final defpackage.rlv b;
    private final java.util.concurrent.ExecutorService c;

    public ole(defpackage.zjv zjvVar, defpackage.rlv rlvVar, defpackage.aazc aazcVar, java.util.concurrent.ExecutorService executorService) {
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (executorService == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        this.a = zjvVar;
        this.b = rlvVar;
        this.c = executorService;
    }

    public static final java.lang.String b(androidx.work.WorkerParameters workerParameters) {
        java.lang.Object next;
        java.lang.String str;
        java.util.Iterator it = workerParameters.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str = (java.lang.String) next;
            if (str == null) {
                defpackage.aooh.g();
            }
        } while (!defpackage.aoov.ad(str, "TikTokWorker#"));
        java.lang.String str2 = (java.lang.String) next;
        if (str2 != null) {
            java.lang.String strSubstring = str2.substring(13);
            defpackage.aooh.e(strSubstring, "substring(...)");
            if (strSubstring != null) {
                return strSubstring;
            }
        }
        return "null";
    }

    @Override // defpackage.agus
    public final defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        if (workerParameters == null) {
            defpackage.aooh.i("parameters");
        }
        defpackage.zjv zjvVar = this.a;
        defpackage.mgv mgvVar = defpackage.mgv.TIKTOK_WORK_EXECUTION_MONITOR_ON_WORK_STARTED;
        java.util.List listAsList = java.util.Arrays.asList(defpackage.gus.aw(workerParameters.a.toString()), defpackage.gus.aw(b(workerParameters)));
        defpackage.aooh.e(listAsList, "asList(...)");
        defpackage.zjv.i(zjvVar, mgvVar, listAsList, null, 0, 28);
        return defpackage.ajcm.a;
    }

    @Override // defpackage.agus
    public final defpackage.ajcq c(defpackage.ajcq ajcqVar, androidx.work.WorkerParameters workerParameters, j$.time.Duration duration) {
        if (workerParameters == null) {
            defpackage.aooh.i("parameters");
        }
        if (duration == null) {
            defpackage.aooh.i("duration");
        }
        defpackage.jyx jyxVar = new defpackage.jyx(new defpackage.nxi(this, workerParameters, 3, null), 6);
        java.util.concurrent.ExecutorService executorService = this.c;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(executorService, ajamVar));
        return ajamVar;
    }
}
