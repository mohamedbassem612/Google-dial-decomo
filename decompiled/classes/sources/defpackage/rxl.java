package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rxl implements defpackage.zta {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/opsrecordaudioaccess/precall/OpsRecordAudioLoaderPrecallIntegration");
    public final android.content.Context a;
    public final defpackage.rlv b;
    public final defpackage.zrw c;
    private final defpackage.aoss e;
    private final defpackage.aoss f;

    public rxl(android.content.Context context, defpackage.rlv rlvVar, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.zrw zrwVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("blockingScope");
        }
        this.a = context;
        this.b = rlvVar;
        this.e = aossVar;
        this.f = aossVar2;
        this.c = zrwVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        throw new java.lang.AssertionError();
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return ((java.lang.Boolean) j$.util.Map.-EL.getOrDefault(j$.util.DesugarCollections.unmodifiableMap((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).l), "android.telecom.extra.START_CALL_WITH_RTT", java.lang.Boolean.FALSE)).booleanValue() ? defpackage.aiql.z(zsz.b) : defpackage.aosv.F(this.f, 0, new pbw(this, (defpackage.aoln) null, 18), 3);
        }
        ((defpackage.aimw) d.b().l("com/android/dialer/opsrecordaudioaccess/precall/OpsRecordAudioLoaderPrecallIntegration", "requestDecision", 40, "OpsRecordAudioLoaderPrecallIntegration.kt")).v("Unsupported by SDK");
        return defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final defpackage.ajcq c(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return defpackage.aosv.F(this.e, 0, new rxk(zrxVar, this, (defpackage.aoln) null, 0), 3);
    }
}
