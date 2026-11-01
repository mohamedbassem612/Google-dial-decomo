package com.google.apps.tiktok.contrib.work;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class TikTokListenableWorker extends defpackage.gsg {
    private final defpackage.ahpz f;
    private final java.util.Map g;
    private final defpackage.aoin h;
    private final androidx.work.WorkerParameters i;
    private final defpackage.ahou j;
    private defpackage.agva k;
    private boolean l;
    private static final defpackage.aimz e = defpackage.aimz.i("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    public static final defpackage.aepd d = new defpackage.aepg("UNKNOWN");

    public TikTokListenableWorker(android.content.Context context, defpackage.ahpz ahpzVar, java.util.Map map, defpackage.aoin aoinVar, androidx.work.WorkerParameters workerParameters, defpackage.ahou ahouVar) {
        super(context, workerParameters);
        this.k = null;
        this.l = false;
        this.g = map;
        this.h = aoinVar;
        this.f = ahpzVar;
        this.i = workerParameters;
        this.j = ahouVar;
    }

    public static /* synthetic */ void c(defpackage.ajcq ajcqVar, defpackage.aepd aepdVar) {
        try {
            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
            defpackage.a.h(ajcqVar);
        } catch (java.util.concurrent.CancellationException unused) {
            ((defpackage.aimw) ((defpackage.aimw) e.d()).l("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 194, "TikTokListenableWorker.java")).y("TikTokListenableWorker was cancelled while running client worker: %s", aepdVar);
        } catch (java.util.concurrent.ExecutionException e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) e.c()).k(e2.getCause())).l("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 189, "TikTokListenableWorker.java")).y("TikTokListenableWorker encountered an exception while running client worker: %s", aepdVar);
        }
    }

    @Override // defpackage.gsg
    public final defpackage.ajcq a() {
        defpackage.ahpz ahpzVar = this.f;
        androidx.work.WorkerParameters workerParameters = this.i;
        java.lang.String strB = defpackage.agvl.b(workerParameters);
        defpackage.ahpm ahpmVarH = ahpzVar.h(1319, "WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1320, strB + " getForegroundInfoAsync()", this.j, true);
            try {
                defpackage.ahvr.bZ(this.k == null, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                defpackage.agva agvaVar = (defpackage.agva) this.h.a();
                this.k = agvaVar;
                defpackage.ajcq ajcqVarA = agvaVar.a(workerParameters);
                ahoqVarX.a(ajcqVarA);
                ahoqVarX.close();
                ahpmVarH.close();
                return ajcqVarA;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahpmVarH.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.gsg
    public final defpackage.ajcq b() {
        java.util.regex.Pattern pattern = defpackage.agvl.a;
        androidx.work.WorkerParameters workerParameters = this.i;
        java.util.Set set = workerParameters.c;
        java.lang.String str = (java.lang.String) defpackage.ahvr.aZ(defpackage.agvl.a(set).iterator());
        defpackage.ahpm ahpmVarH = this.f.h(1321, "WorkManager:TikTokListenableWorker startWork");
        try {
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1322, str + " startWork()", this.j, true);
            try {
                java.lang.String str2 = (java.lang.String) defpackage.ahvr.aZ(defpackage.agvl.a(set).iterator());
                defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1323, java.lang.String.valueOf(str2).concat(" startWork()"), defpackage.ahot.a, true);
                try {
                    defpackage.ahvr.bZ(!this.l, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.l = true;
                    defpackage.agva agvaVar = this.k;
                    if (agvaVar == null) {
                        agvaVar = (defpackage.agva) this.h.a();
                        this.k = agvaVar;
                    }
                    j$.util.Objects.requireNonNull(this);
                    agvaVar.i();
                    this.k.h(new defpackage.vmp(this, 19));
                    defpackage.ajcq ajcqVarB = this.k.b(workerParameters);
                    ajcqVarB.c(defpackage.ahqx.h(new defpackage.abqu(ajcqVarB, (defpackage.aepd) j$.util.Map.-EL.getOrDefault(this.g, str2, d), 14, null)), defpackage.ajbm.INSTANCE);
                    ahoqVarX2.a(ajcqVarB);
                    ahoqVarX2.close();
                    ahoqVarX.a(ajcqVarB);
                    ahoqVarX.close();
                    ahpmVarH.close();
                    return ajcqVarB;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarX2.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.lang.Throwable th5) {
            try {
                ahpmVarH.close();
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
