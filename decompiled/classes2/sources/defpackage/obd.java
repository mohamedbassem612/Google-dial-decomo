package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obd {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController");
    public final j$.util.Optional b;
    public final defpackage.mba c;
    public final agsm d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public final defpackage.pya i;
    public final pqm j;
    public final zpz k;
    public final zzx l;
    private final zmq m;
    private final zms n;
    private final j$.util.Optional o;
    private final j$.util.Optional p;
    private final j$.util.Optional q;

    public obd(pqm pqmVar, zpz zpzVar, zmq zmqVar, zms zmsVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4, zzx zzxVar, defpackage.mba mbaVar, agsm agsmVar) {
        aooh.f(pqmVar, "callController");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(optional, "assistedEmergencyDialingFeature");
        aooh.f(optional2, "assistedEmergencyDialingCallScoped");
        aooh.f(optional3, "centerButtonClickedListenerOptional");
        aooh.f(optional4, "featurePromoDismissedListenerOptional");
        aooh.f(agsmVar, "androidFutures");
        this.j = pqmVar;
        this.k = zpzVar;
        this.m = zmqVar;
        this.n = zmsVar;
        this.o = optional;
        this.p = optional2;
        this.b = optional3;
        this.q = optional4;
        this.l = zzxVar;
        this.c = mbaVar;
        this.d = agsmVar;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.i = new ram(this, 1);
    }

    public final void a() {
        ahoq ahoqVarW = ahvr.W(396, "EmergencyVoiceController_hideDialpad");
        try {
            this.e.set(false);
            this.k.a(ajcm.a);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    public final void b() {
        a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "hideModal", 191, "EmergencyVoiceController.kt").v("enter");
        defpackage.ocv ocvVar = (defpackage.ocv) aooh.q(this.q);
        if (ocvVar == null) {
            throw new java.lang.IllegalStateException("Feature promo listener should not be null if it was clicked!");
        }
        defpackage.ocv.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSButtonController", "onFeaturePromoDismissed", 94, "SatelliteSOSButtonController.kt").v("enter");
        defpackage.ocu ocuVar = ocvVar.f;
        ocuVar.i.a(aosv.F(ocuVar.d, 0, new defpackage.hnj(ocuVar, (aoln) null, 20, (byte[]) null), 3));
    }

    public final void c() {
        if (this.n.c().contains(zmw.b)) {
            a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "showAudioRouteDialog", 95, "EmergencyVoiceController.kt").v("Show audio route dialog.");
            this.f.set(true);
            this.k.a(ajcm.a);
            return;
        }
        zmq zmqVar = this.m;
        j$.util.Optional optionalA = zmqVar.a();
        aooh.e(optionalA, "getCallAudioRoute(...)");
        zmw zmwVar = (zmw) aooh.q(optionalA);
        if (zmwVar == null || zmwVar != zmw.d) {
            zmqVar.e(zmw.d);
        } else {
            zmqVar.e(zmw.e);
        }
    }

    public final void d() {
        defpackage.her herVar = (defpackage.her) aooh.q(this.o);
        defpackage.her herVar2 = null;
        if (herVar != null && ((huy) herVar.a).c()) {
            herVar2 = (defpackage.her) aooh.q(this.p);
        }
        if (herVar2 != null) {
            ((defpackage.hvc) herVar2.a).b();
        } else {
            this.j.r();
        }
    }

    public final void e() {
        a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "startCountdownTimerForHidingModal", 200, "EmergencyVoiceController.kt").v("enter");
        defpackage.ocv ocvVar = (defpackage.ocv) aooh.q(this.q);
        if (ocvVar == null) {
            throw new java.lang.IllegalStateException("Feature promo listener should not be null.");
        }
        defpackage.ocv.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSButtonController", "startCountdownTimerForHidingModal", 99, "SatelliteSOSButtonController.kt").v("enter");
        defpackage.ocu ocuVar = ocvVar.f;
        aoov.an(ocuVar.d, (aolr) null, 0, new defpackage.oct(ocuVar, (aoln) null, 2, (char[]) null), 3);
    }

    public final void f() {
        ahoq ahoqVarW = ahvr.W(398, "EmergencyVoiceController_toggleDialpad");
        try {
            this.c.b(mce.bp);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.e;
            boolean z = !atomicBoolean.get();
            a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "toggleDialpad$<anonymous>", 80, "EmergencyVoiceController.kt").y("Toggle showing dialpad. Should show: %s", java.lang.Boolean.valueOf(z));
            atomicBoolean.set(z);
            this.k.a(ajcm.a);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }
}
