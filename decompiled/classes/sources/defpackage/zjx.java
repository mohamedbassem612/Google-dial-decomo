package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjx {
    private static final defpackage.aimz b = defpackage.aimz.i("com/google/android/dialershared/externals/tiktokapis/contrib/work/DialerTikTokWorkManager");
    public final defpackage.zjv a;
    private final defpackage.amwu c;
    private final defpackage.aoin d;
    private final defpackage.ajct e;
    private final defpackage.zzx f;

    public zjx(defpackage.amwu amwuVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.zjv zjvVar, defpackage.ajct ajctVar) {
        if (amwuVar == null) {
            defpackage.aooh.i("tikTokWorkManager");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("avoidWorkManagerInitializationInDirectBoot");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        this.c = amwuVar;
        this.f = zzxVar;
        this.d = aoinVar;
        this.a = zjvVar;
        this.e = ajctVar;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            return;
        }
        amwuVar.a();
    }

    public final defpackage.ajcq a(java.lang.String str) {
        if (((java.lang.Boolean) this.d.a()).booleanValue() && this.f.m()) {
            ((defpackage.aimw) ((defpackage.aimw) b.d()).m(defpackage.aioa.MEDIUM).l("com/google/android/dialershared/externals/tiktokapis/contrib/work/DialerTikTokWorkManager", "cancelUniqueWork", 81, "DialerTikTokWorkManager.kt")).v("WorkManager cancelUniqueWork bypassed during Direct Boot mode");
            return defpackage.ajcm.a;
        }
        defpackage.ajcq ajcqVarG = ((defpackage.ahbz) this.c.a()).g(str);
        defpackage.zjv.i(this.a, defpackage.mgv.TIKTOK_WORK_MANAGER_CANCEL_UNIQUE_WORK, defpackage.ajsz.aY(defpackage.gus.aw(str)), null, 0, 28);
        return ajcqVarG;
    }

    public final defpackage.ajcq b(defpackage.aguz aguzVar) {
        if (aguzVar == null) {
            defpackage.aooh.i("workSpec");
        }
        if (((java.lang.Boolean) this.d.a()).booleanValue() && this.f.m()) {
            ((defpackage.aimw) ((defpackage.aimw) b.d()).m(defpackage.aioa.MEDIUM).l("com/google/android/dialershared/externals/tiktokapis/contrib/work/DialerTikTokWorkManager", "enqueue", 52, "DialerTikTokWorkManager.kt")).v("WorkManager access bypassed during Direct Boot mode");
            return new defpackage.ajdd(new java.lang.IllegalStateException("WorkManager cannot be accessed during Direct Boot mode"));
        }
        defpackage.ajcq ajcqVarI = ((defpackage.ahbz) this.c.a()).i(aguzVar);
        defpackage.vut vutVar = new defpackage.vut(new defpackage.nxi(this, aguzVar, 6), 5);
        defpackage.ajct ajctVar = this.e;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), vutVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarI, ahqvVar);
        ajcqVarI.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }
}
