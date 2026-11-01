package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahew {
    public static final defpackage.ahbq k;
    public final android.content.Context a;
    public final java.util.concurrent.ExecutorService b;
    public final defpackage.ajcu c;
    public final int d;
    public final java.util.Map e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.aimz h;
    public final boolean i;
    public final java.util.Map j;
    public final defpackage.ahda l;
    public final defpackage.adag m;
    private final java.util.Map n;
    private final defpackage.amwu o;
    private final defpackage.aoin p;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        afibVar.a("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        k = afibVar.b();
    }

    public ahew(android.content.Context context, defpackage.adag adagVar, java.util.concurrent.ExecutorService executorService, defpackage.ajcu ajcuVar, defpackage.ahda ahdaVar, int i, java.util.Map map, java.util.Map map2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.amwu amwuVar, defpackage.aoin aoinVar3) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (executorService == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (ajcuVar == null) {
            defpackage.aooh.i("backgroundExecutor");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("lazyDatabase");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("packageInfoProvider");
        }
        this.a = context;
        this.m = adagVar;
        this.b = executorService;
        this.c = ajcuVar;
        this.l = ahdaVar;
        this.d = i;
        this.n = map;
        this.e = map2;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.o = amwuVar;
        this.p = aoinVar3;
        if (!defpackage.ajsz.cd(((defpackage.aikj) map).keySet(), ((defpackage.aikj) map2).keySet()).isEmpty()) {
            java.util.Set setCd = defpackage.ajsz.cd(((defpackage.aikj) map).keySet(), ((defpackage.aikj) map2).keySet());
            java.util.Objects.toString(setCd);
            throw new java.lang.IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setCd.toString()));
        }
        this.h = defpackage.aimz.i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
        java.lang.Boolean.FALSE.booleanValue();
        this.i = false;
        this.j = adagVar.r() ? defpackage.ajsz.aQ(map, map2) : map2;
    }

    public final java.io.File a() {
        java.lang.String str;
        java.lang.Object objA = this.p.a();
        defpackage.aooh.e(objA, "get(...)");
        android.content.pm.ApplicationInfo applicationInfo = ((android.content.pm.PackageInfo) objA).applicationInfo;
        if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
            return null;
        }
        java.io.File file = new java.io.File(new java.io.File(str, "files"), "tiktok");
        if (!file.exists()) {
            file.mkdirs();
        }
        defpackage.adag adagVar = this.m;
        java.lang.String strAp = defpackage.agab.ap();
        return new java.io.File(file, (adagVar.r() || strAp == null) ? "878177909" : "878177909_".concat(java.lang.String.valueOf(new defpackage.aorg("[^A-Za-z0-9\\-_:]").b(strAp, "_"))));
    }

    public final void b() {
        try {
            android.content.Context context = this.a;
            boolean zH = defpackage.abyl.h(context);
            android.os.UserManager userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
            if (zH) {
                if (userManager == null) {
                    ((defpackage.aimw) this.h.d().l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "checkDirectBootLockStateDiscrepancy", 162, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("DirectBootUtils.isUserUnlocked() is true only because UserManager is null.");
                } else if (!aa$.ExternalSyntheticApiModelOutline1.m(userManager)) {
                    ((defpackage.aimw) this.h.c().l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "checkDirectBootLockStateDiscrepancy", 167, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("DirectBootUtils.isUserUnlocked() is true, but UserManager.isUserUnlocked() is false.");
                }
            }
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) this.h.c()).k(e).l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "checkDirectBootLockStateDiscrepancy", 174, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Failed to check DirectBootUtils.isUserUnlocked()");
        }
    }

    public final defpackage.ajcq c(int i, java.lang.String str) {
        java.lang.Object objA = this.g.a();
        defpackage.aooh.e(objA, "get(...)");
        java.lang.Iterable iterable = (java.lang.Iterable) objA;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ahel ahelVar = new ahel((ahex) it.next(), 2, str, 2);
            long j = defpackage.ahqx.a;
            defpackage.ahqt ahqtVar = new defpackage.ahqt(defpackage.ahns.c(false), ahelVar, 0);
            defpackage.ajcu ajcuVar = this.c;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), ahqtVar, 0));
            ajcuVar.execute(ajdkVar);
            arrayList.add(ajdkVar);
        }
        return new defpackage.ahda(new defpackage.anpu(false, defpackage.aify.j(arrayList)), (byte[]) null).o(new defpackage.kve(8), this.b);
    }

    public final defpackage.zzx d() {
        java.lang.Object objA = this.o.a();
        defpackage.aooh.e(objA, "get(...)");
        return (defpackage.zzx) objA;
    }
}
