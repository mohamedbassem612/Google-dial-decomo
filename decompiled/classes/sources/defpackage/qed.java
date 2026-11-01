package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qed {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/proximitysensor/impl/incall/ProximityTracker");
    public final android.hardware.SensorManager b;
    public final defpackage.aoss c;
    public final defpackage.rlv d;
    public final defpackage.aoin e;
    public final defpackage.mgw f;
    public long g;
    public int h;
    public final qdm i;
    public final defpackage.tkl j;
    public final defpackage.gpd k;
    public final defpackage.ahda l;
    public final defpackage.apni m;

    public qed(android.hardware.SensorManager sensorManager, defpackage.aoss aossVar, defpackage.rlv rlvVar, defpackage.aazc aazcVar, defpackage.tkl tklVar, defpackage.apni apniVar, defpackage.gpd gpdVar, defpackage.aoin aoinVar, defpackage.mgw mgwVar) {
        defpackage.aooh.f(aossVar, "blockingScope");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(tklVar, "inCallUiVisibilityProvider");
        defpackage.aooh.f(apniVar, "androidJobs");
        defpackage.aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        defpackage.aooh.f(aoinVar, "enableProximitySensorCuiCancelEvent");
        defpackage.aooh.f(mgwVar, "recorder");
        this.b = sensorManager;
        this.c = aossVar;
        this.d = rlvVar;
        this.j = tklVar;
        this.m = apniVar;
        this.k = gpdVar;
        this.e = aoinVar;
        this.f = mgwVar;
        this.h = 1;
        this.g = android.os.SystemClock.elapsedRealtime();
        this.l = new defpackage.ahda((byte[]) null);
        this.i = new qdm(this, 2);
    }
}
