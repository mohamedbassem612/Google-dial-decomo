package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvh extends defpackage.gta {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final java.util.Map b;
    private final defpackage.ahpz c;
    private final java.util.Map d;

    public agvh(java.util.Map map, defpackage.ahpz ahpzVar, java.util.Map map2) {
        this.b = map;
        this.c = ahpzVar;
        this.d = map2;
    }

    @Override // defpackage.gta
    public final defpackage.gsg a(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        defpackage.aoin aoinVar;
        java.lang.String str2;
        try {
            defpackage.ahpz ahpzVar = this.c;
            defpackage.ahpm ahpmVarH = ahpzVar.h(1325, "WorkerFactory.createWorker()");
            try {
                if (str.equals(com.google.apps.tiktok.contrib.work.TikTokListenableWorker.class.getName())) {
                    defpackage.aihd aihdVarA = defpackage.agvl.a(workerParameters.c);
                    if (aihdVarA.size() != 1) {
                        ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 88, "TikTokWorkerFactory.java")).y("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new aepb(aihdVarA.size()));
                    } else {
                        str2 = (java.lang.String) defpackage.ahvr.aZ(aihdVarA.iterator());
                        aoinVar = (defpackage.aoin) this.b.get(str2);
                    }
                    ahpmVarH.close();
                    return null;
                }
                aoinVar = (defpackage.aoin) this.b.get(str);
                if (aoinVar != null) {
                    java.util.Set set = workerParameters.c;
                    java.util.regex.Pattern pattern = defpackage.agvl.a;
                    set.add("TikTokWorker#".concat(java.lang.String.valueOf(str)));
                }
                str2 = str;
                if (aoinVar != null) {
                    if (str2 != null) {
                        com.google.apps.tiktok.contrib.work.TikTokListenableWorker tikTokListenableWorker = new com.google.apps.tiktok.contrib.work.TikTokListenableWorker(context, ahpzVar, this.d, aoinVar, workerParameters, defpackage.ahot.a);
                        ahpmVarH.close();
                        return tikTokListenableWorker;
                    }
                    str2 = null;
                }
                if (str.equals(com.google.apps.tiktok.contrib.work.TikTokListenableWorker.class.getName())) {
                    ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "maybeLogMissingWorkerMessage", 160, "TikTokWorkerFactory.java")).y("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                }
                ahpmVarH.close();
                return null;
            } catch (java.lang.Throwable th) {
                try {
                    ahpmVarH.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (java.lang.RuntimeException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).v("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
    }
}
