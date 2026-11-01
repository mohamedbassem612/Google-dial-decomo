package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qdu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityController");
    public final java.util.concurrent.Executor b;
    public final defpackage.qdo c;
    public final defpackage.zjv d;
    public final defpackage.qed e;
    public final java.util.function.Supplier f;
    public final defpackage.zpu g;
    public final defpackage.zof h;
    public final defpackage.ajct i;
    public final defpackage.zpy j;
    public final defpackage.ahda k;
    public final defpackage.tkl l;
    private final defpackage.zpm m;

    public qdu(defpackage.tkl tklVar, defpackage.ajct ajctVar, defpackage.zpy zpyVar, defpackage.zpm zpmVar, defpackage.qdo qdoVar, defpackage.zjv zjvVar, defpackage.qed qedVar) {
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new exm(this, 14));
        j$.util.Objects.requireNonNull(ahziVarBI);
        this.f = new pxs(ahziVarBI, 2);
        this.g = new qdr(this);
        this.h = new nzx(this, 5);
        this.k = new defpackage.ahda();
        this.l = tklVar;
        this.j = zpyVar;
        this.m = zpmVar;
        this.b = new defpackage.ajdc(ajctVar);
        this.c = qdoVar;
        this.d = zjvVar;
        this.i = ajctVar;
        this.e = qedVar;
    }

    public final void a(defpackage.qbc qbcVar) {
        j$.util.Optional optionalH = this.m.h();
        qbf qbfVar = new qbf(qbcVar, 3);
        if (true == optionalH.isPresent()) {
            ((qds) ((apqr) optionalH.get()).a(qds.class)).cp().a((defpackage.qbc) qbfVar.a);
        }
    }

    public final void b(boolean z) {
        java.util.function.Supplier supplier = this.f;
        if (((android.os.PowerManager.WakeLock) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).isHeld()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityController", "turnOffProximitySensor", 128, "InCallProximityController.java")).y("releasing wake lock, with turning on the screen immediately %b", java.lang.Boolean.valueOf(z));
            defpackage.zjv.i(this.d, defpackage.mgv.IN_CALL_PROXIMITY_CONTROLLER_TURN_OFF_PROXIMITY_SENSOR, defpackage.aify.p(defpackage.gus.ax(z)), null, 0, 28);
            try {
                ((android.os.PowerManager.WakeLock) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).release(!z ? 1 : 0);
                a(defpackage.qbc.IN_CALL_PROXIMITY_SENSOR_TURNED_OFF);
                defpackage.qed qedVar = this.e;
                qedVar.m.i(defpackage.ahvr.ag(qedVar.c, qedVar.l, new pbw(qedVar, (defpackage.aoln) null, 5)));
            } catch (java.lang.RuntimeException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityController", "turnOffProximitySensor", (char) 147, "InCallProximityController.java")).v("wake lock could not be released; it may already have been released by the system.");
            }
        }
    }
}
