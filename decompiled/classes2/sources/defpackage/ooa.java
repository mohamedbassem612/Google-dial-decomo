package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ooa implements znv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ooa(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v48, types: [aoin, java.lang.Object] */
    public final ajcq ej() {
        switch (this.$cid) {
            case 0:
                defpackage.ooc.a.b().l("com/android/dialer/fliptosilence/impl/FlipToSilenceCallEventListeners", "onCallRingingStarted", 48, "FlipToSilenceCallEventListeners.java").v("call started - registering flip to silence observer");
                java.lang.Object obj = this.a;
                return ahvr.E(new defpackage.lye(obj, 9), ((defpackage.ooc) obj).f);
            case 1:
                defpackage.nwg nwgVar = (defpackage.nwg) this.a;
                return aosv.F(nwgVar.a, 0, new defpackage.nwf(nwgVar, null, 0), 3);
            case 2:
                otq otqVar = (otq) this.a;
                otm otmVar = new otm(otqVar.g);
                otmVar.b(ruc.g);
                otqVar.g = otmVar.a();
                return otqVar.a(oto.a);
            case 3:
                pvf pvfVar = (pvf) this.a;
                if (android.telecom.VideoProfile.isTransmissionEnabled(pvfVar.k.getDetails().getVideoState())) {
                    pvf.a.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onCallRingingStarted", 413, "CameraController.java").v("ringing video call, using front camera");
                    pvfVar.f(pur.b);
                    pvfVar.g();
                }
                return ajcm.a;
            case 4:
                qbx.a.b().l("com/android/dialer/incall/motorolaincalluinotifier/MotorolaInCallUiNotifier", "onCallRingingListener$<anonymous>", 32, "MotorolaInCallUiNotifier.kt").v("New incoming call, send broadcast to hide USSD dialog");
                ((qbx) this.a).a(true);
                return ajcm.a;
            case 5:
                qdj qdjVar = (qdj) this.a;
                if (!((java.lang.Boolean) qdjVar.d.a()).booleanValue()) {
                    qdj.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/AnswerProximityController", "onCallRingingStarted", 55, "AnswerProximityController.java").v("ANSWER_PROXIMITY_SENSOR_ENABLED is not enabled.");
                    return ajcm.a;
                }
                if (!qdjVar.f.h()) {
                    qdj.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/AnswerProximityController", "onCallRingingStarted", 60, "AnswerProximityController.java").v("PROXIMITY_SCREEN_OFF_WAKE_LOCK is not supported on the device.");
                    return ajcm.a;
                }
                if (qdjVar.g.j(0) == 2) {
                    qdj.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/AnswerProximityController", "onCallRingingStarted", 65, "AnswerProximityController.java").v("display is already on.");
                    return ajcm.a;
                }
                qdl qdlVar = qdjVar.e;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = qdlVar.e;
                if (!atomicBoolean.get()) {
                    qdl.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/PseudoProximityWakeLock", "acquire", 121, "PseudoProximityWakeLock.java").v("acquiring lock");
                    zjv.i(qdlVar.d, mgv.dS, (java.util.List) null, (mhc) null, 0, 30);
                    try {
                        android.hardware.SensorManager sensorManager = qdlVar.b;
                        atomicBoolean.set(sensorManager.registerListener(qdlVar.g, sensorManager.getDefaultSensor(8), 3));
                    } catch (java.lang.IllegalStateException e) {
                        a.bq(qdl.a.d(), "could not register sensorEventListener. Values from the proximity sensor are not tracked.", "com/android/dialer/incall/proximitysensor/impl/answer/PseudoProximityWakeLock", "acquire", (char) 133, "PseudoProximityWakeLock.java", e, zct.b);
                        qdlVar.f.set(true);
                    }
                    if (qdlVar.e.get()) {
                        qdlVar.j.a(qbc.dC);
                    }
                    break;
                }
                return ajcm.a;
            case 6:
                return ((qgn) this.a).a(qbc.dU);
            case 7:
                qnd qndVar = (qnd) this.a;
                zcy zcyVarA = qndVar.n.a();
                if (zcyVarA.c()) {
                    qndVar.h.set(true);
                }
                qndVar.i.set(j$.util.Optional.of(zcyVarA));
                zpz zpzVar = qndVar.p;
                ajcq ajcqVar = ajcm.a;
                zpzVar.a(ajcqVar);
                return ajcqVar;
            case 8:
                uiw uiwVar = (uiw) this.a.a();
                return aosv.F(uiwVar.b, 0, new txf(uiwVar, (aoln) null, 16, (char[]) null), 3);
            case 9:
                ukg ukgVar = (ukg) this.a;
                return aosv.F(ukgVar.a, 0, new txf(ukgVar, (aoln) null, 17), 3);
            default:
                return ((wcz) this.a).a();
        }
    }
}
