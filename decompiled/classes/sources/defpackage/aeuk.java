package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuk extends defpackage.agab implements defpackage.aepj, defpackage.aeqv {
    public static final long a;
    public final defpackage.aequ b;
    public final android.content.Context c;
    public final defpackage.amwu d;
    public final defpackage.aevd e;
    private final defpackage.aepm f;
    private final java.util.concurrent.Executor g;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        a = 43200000L;
    }

    public aeuk(defpackage.gou gouVar, android.content.Context context, defpackage.aepm aepmVar, java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.aevd aevdVar, defpackage.aoin aoinVar) {
        this.b = gouVar.D(executor, amwuVar, aoinVar);
        this.g = executor;
        this.c = context;
        this.d = amwuVar;
        this.e = aevdVar;
        this.f = aepmVar;
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        this.f.b(this);
        defpackage.aiql.E(new defpackage.ajas() { // from class: aeuj
            /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
            /* JADX WARN: Type inference failed for: r2v21, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v30, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v11, types: [aoin, java.lang.Object] */
            @Override // defpackage.ajas
            public final defpackage.ajcq a() throws afeb {
                java.util.UUID uuidM;
                defpackage.aeuk aeukVar = this.a;
                android.content.Context context = aeukVar.c;
                if (!defpackage.abyl.i(context)) {
                    return defpackage.ajcm.a;
                }
                defpackage.afec.b();
                defpackage.aevd aevdVar = aeukVar.e;
                long j = defpackage.aeuk.a;
                defpackage.afec.b();
                android.content.Context context2 = (android.content.Context) aevdVar.a;
                if (defpackage.abyl.i(context2)) {
                    long j2 = defpackage.abyl.i(context2) ? ((android.content.SharedPreferences) aevdVar.b.a()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    if (jElapsedRealtime < j2) {
                        ((android.content.SharedPreferences) aevdVar.b.a()).edit().remove("primes.packageMetric.lastSendTime").commit();
                        j2 = -1;
                    }
                    if (j2 != -1 && jElapsedRealtime <= j2 + j) {
                        return defpackage.ajcm.a;
                    }
                }
                android.content.pm.PackageStats packageStats = null;
                if (!aeukVar.b.b(null)) {
                    return defpackage.ajcm.a;
                }
                defpackage.afec.b();
                defpackage.afec.b();
                android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) context.getSystemService(android.os.storage.StorageManager.class);
                if (storageManager == null) {
                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 30, "PackageStatsCaptureO.java")).v("StorageManager is not available");
                } else {
                    android.app.usage.StorageStatsManager storageStatsManagerM = aa$.ExternalSyntheticApiModelOutline0.m(context.getSystemService(aa$.ExternalSyntheticApiModelOutline0.m()));
                    if (storageStatsManagerM == null) {
                        ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 35, "PackageStatsCaptureO.java")).v("StorageStatsManager is not available");
                    } else {
                        java.lang.String packageName = context.getPackageName();
                        android.content.pm.PackageStats packageStats2 = new android.content.pm.PackageStats(packageName);
                        java.util.Iterator it = aa$.ExternalSyntheticApiModelOutline1.m(storageManager).iterator();
                        while (it.hasNext()) {
                            android.os.storage.StorageVolume storageVolumeM = aa$.ExternalSyntheticApiModelOutline1.m(it.next());
                            if (aa$.ExternalSyntheticApiModelOutline1.m$1(storageVolumeM).equals("mounted")) {
                                java.lang.String strM = aa$.ExternalSyntheticApiModelOutline1.m(storageVolumeM);
                                if ("1AEF-1A1E".equals(strM)) {
                                    uuidM = null;
                                } else if (strM == null) {
                                    try {
                                        uuidM = aa$.ExternalSyntheticApiModelOutline0.m();
                                    } catch (java.lang.IllegalArgumentException e) {
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 76, "PackageStatsCaptureO.java")).y("Invalid UUID format: '%s'", strM);
                                        uuidM = null;
                                    }
                                } else {
                                    uuidM = java.util.UUID.fromString(strM);
                                }
                                if (uuidM != null) {
                                    try {
                                        android.app.usage.StorageStats storageStatsM = aa$.ExternalSyntheticApiModelOutline0.m(storageStatsManagerM, uuidM, packageName, android.os.Process.myUserHandle());
                                        if (aa$.ExternalSyntheticApiModelOutline0.m().equals(uuidM)) {
                                            packageStats2.codeSize += aa$.ExternalSyntheticApiModelOutline0.m$1(storageStatsM);
                                            packageStats2.dataSize += aa$.ExternalSyntheticApiModelOutline0.m$2(storageStatsM) - aa$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                            packageStats2.cacheSize += aa$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                        } else {
                                            packageStats2.externalCodeSize += aa$.ExternalSyntheticApiModelOutline0.m$1(storageStatsM);
                                            packageStats2.externalDataSize += aa$.ExternalSyntheticApiModelOutline0.m$2(storageStatsM) - aa$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                            packageStats2.externalCacheSize += aa$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                        }
                                    } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException | java.lang.RuntimeException e2) {
                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e2)).l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '3', "PackageStatsCaptureO.java")).v("queryStatsForPackage() call failed");
                                    }
                                }
                            }
                        }
                        packageStats = packageStats2;
                    }
                }
                if (packageStats == null) {
                    return defpackage.aiql.y(new java.lang.IllegalStateException("PackageStats capture failed."));
                }
                defpackage.akzx akzxVarM = defpackage.apgu.a.m();
                defpackage.akzx akzxVarM2 = defpackage.apgp.a.m();
                long j3 = packageStats.cacheSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar = (defpackage.apgp) akzxVarM2.b;
                apgpVar.b |= 1;
                apgpVar.c = j3;
                long j4 = packageStats.codeSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar2 = (defpackage.apgp) akzxVarM2.b;
                apgpVar2.b |= 2;
                apgpVar2.d = j4;
                long j5 = packageStats.dataSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar3 = (defpackage.apgp) akzxVarM2.b;
                apgpVar3.b |= 4;
                apgpVar3.e = j5;
                long j6 = packageStats.externalCacheSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar4 = (defpackage.apgp) akzxVarM2.b;
                apgpVar4.b |= 8;
                apgpVar4.f = j6;
                long j7 = packageStats.externalCodeSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar5 = (defpackage.apgp) akzxVarM2.b;
                apgpVar5.b |= 16;
                apgpVar5.g = j7;
                long j8 = packageStats.externalDataSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar6 = (defpackage.apgp) akzxVarM2.b;
                apgpVar6.b |= 32;
                apgpVar6.h = j8;
                long j9 = packageStats.externalMediaSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar7 = (defpackage.apgp) akzxVarM2.b;
                apgpVar7.b |= 64;
                apgpVar7.i = j9;
                long j10 = packageStats.externalObbSize;
                akzxVarM2.u();
                defpackage.apgp apgpVar8 = (defpackage.apgp) akzxVarM2.b;
                apgpVar8.b |= 128;
                apgpVar8.j = j10;
                defpackage.akzx akzxVarL = ((defpackage.apgp) akzxVarM2.r()).L();
                defpackage.ahyn ahynVar = ((defpackage.aeui) aeukVar.d.a()).a;
                akzxVarM.u();
                defpackage.apgu apguVar = (defpackage.apgu) akzxVarM.b;
                defpackage.apgp apgpVar9 = (defpackage.apgp) akzxVarL.r();
                j$.util.Objects.requireNonNull(apgpVar9);
                apguVar.j = apgpVar9;
                apguVar.b |= 128;
                defpackage.aevd aevdVar2 = aeukVar.e;
                if (defpackage.abyl.i((android.content.Context) aevdVar2.a)) {
                    ((android.content.SharedPreferences) aevdVar2.b.a()).edit().putLong("primes.packageMetric.lastSendTime", android.os.SystemClock.elapsedRealtime()).commit();
                }
                defpackage.aequ aequVar = aeukVar.b;
                defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                aeqqVarA.f((defpackage.apgu) akzxVarM.r());
                return aequVar.a(aeqqVarA.a());
            }
        }, this.g);
    }

    @Override // defpackage.aeqv
    public final void n() {
        this.f.a(this);
    }

    @Override // defpackage.aepj
    public final /* synthetic */ void j(defpackage.aenj aenjVar) {
    }
}
