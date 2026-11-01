package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class les implements zog {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public les(otq otqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(otqVar);
        this.a = otqVar;
    }

    public final /* synthetic */ int a() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [aoss, java.lang.Object] */
    public final void b(android.telecom.Call.Details details) {
        ajcq ajcqVarI;
        switch (this.$cid) {
            case 0:
                defpackage.lev levVar = (defpackage.lev) this.a;
                if (((java.lang.Boolean) levVar.l.a()).booleanValue() && details.hasProperty(1)) {
                    ajcq ajcqVarX = levVar.A.X();
                    defpackage.lef lefVar = new defpackage.lef(4);
                    ajct ajctVar = levVar.c;
                    ahvr.J(ahvr.I(ahvr.H(ajcqVarX, lefVar, ajctVar), new defpackage.ibe(12), ajctVar), new defpackage.kxt(levVar, 4), ajctVar);
                    break;
                }
                break;
            case 1:
                aooh.c(details);
                aimz aimzVar = defpackage.jfc.a;
                aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallScopeAdded", 136, "BeeslyLifecycleControllerV2.kt").v("onCallScopedAdded");
                int iM = da$.ExternalSyntheticApiModelOutline0.m(details);
                defpackage.jfc jfcVar = (defpackage.jfc) this.a;
                jfcVar.j = iM;
                if (iM == 0) {
                    jfcVar.v.i(aoov.an(jfcVar.e, (aolr) null, 0, new defpackage.jeb(jfcVar, (aoln) null, 10, (boolean[]) null), 3));
                } else {
                    aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallScopeAdded", 140, "BeeslyLifecycleControllerV2.kt").w("Skipping handling a non-incoming call, direction:%d.", jfcVar.j);
                }
                break;
            case 2:
                aooh.f(details, "details");
                aimz aimzVar2 = defpackage.nej.a;
                aimzVar2.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded", 313, "DobbyLifecycleController.kt").v("onCallScopedAdded");
                gus.aw("CEVT_CALL_SCOPE_ADDED");
                java.lang.Object obj = this.a;
                defpackage.nej nejVar = (defpackage.nej) obj;
                nejVar.s.c();
                int iM2 = da$.ExternalSyntheticApiModelOutline0.m(details);
                nejVar.N = iM2;
                if (iM2 == 0) {
                    nejVar.n.b(mce.cN);
                    ahvr.J(aosv.C(nejVar.S(null, new defpackage.ncy(nejVar, null))), new defpackage.kxt(obj, 6), nejVar.e);
                } else {
                    aimzVar2.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded", 322, "DobbyLifecycleController.kt").w("Skipping handling a non-incoming call, direction:%d.", nejVar.N);
                }
                break;
            case 3:
                aooh.f(details, "details");
                aimz aimzVar3 = zih.a;
                aolr aolrVarPlus = zih.b.plus(aols.a);
                defpackage.nzt nztVar = (defpackage.nzt) this.a;
                aoov.al(nztVar.e, aolrVarPlus, 1, new defpackage.loe((aoln) null, nztVar, 12));
                break;
            case 4:
                aimz aimzVar4 = zih.a;
                aolr aolrVarPlus2 = zih.b.plus(aols.a);
                rdp rdpVar = (rdp) this.a;
                aoov.al((aoss) rdpVar.d, aolrVarPlus2, 1, new defpackage.loe((aoln) null, rdpVar, 14));
                break;
            case 5:
                otq otqVar = (otq) this.a;
                j$.util.Optional optional = otqVar.g.a;
                defpackage.orq orqVar = new defpackage.orq(this, 8);
                if (true == optional.isPresent()) {
                    ((otq) ((defpackage.les) orqVar.a).a).b.q((aeun) optional.get(), ruc.g, rub.d);
                }
                j$.util.Optional optionalA = otqVar.b.a();
                defpackage.orq orqVar2 = new defpackage.orq(this, 9);
                if (true == optionalA.isPresent()) {
                    java.lang.Object obj2 = optionalA.get();
                    java.lang.Object obj3 = orqVar2.a;
                    otm otmVar = new otm();
                    otmVar.a = j$.util.Optional.of(obj2);
                    ((otq) ((defpackage.les) obj3).a).g = otmVar.a();
                }
                break;
            case 6:
                if (details.hasProperty(1)) {
                    pqm pqmVar = (pqm) this.a;
                    if (j$.util.Collection.-EL.stream(pqmVar.u.a()).anyMatch(new defpackage.mif(7))) {
                        pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "onCallScopeAdded", 707, "CallControllerImpl.java").v("Disconnecting a new conference call, added while another call is in Audio Processing or Simulated Ringing state.");
                        pqmVar.b.disconnect();
                    }
                }
                break;
            case 7:
                pxg pxgVar = (pxg) this.a;
                pxgVar.f.set(java.lang.Integer.valueOf(pxgVar.d.getDetails().getVideoState()));
                break;
            case 8:
                ((pxm) this.a).a();
                break;
            case 9:
                android.os.Bundle intentExtras = details.getIntentExtras();
                if (intentExtras != null) {
                    qax qaxVar = (qax) this.a;
                    qaxVar.i = intentExtras.getLong("android.telecom.extra.CALL_CREATED_TIME_MILLIS", -1L);
                    qaxVar.j = intentExtras.getLong("android.telecom.extra.CALL_TELECOM_ROUTING_START_TIME_MILLIS", -1L);
                    qaxVar.k = intentExtras.getLong("android.telecom.extra.CALL_TELECOM_ROUTING_END_TIME_MILLIS", -1L);
                    qaxVar.h = intentExtras.getBoolean("EXTRA_ALREADY_IN_CALL", false);
                }
                java.lang.Object obj4 = this.a;
                phr phrVar = new phr(obj4, 11);
                qax qaxVar2 = (qax) obj4;
                agsm.i(569, ahvr.H(qaxVar2.x.b, phrVar, qaxVar2.f), "failed to set isIncomingCall", new java.lang.Object[0]);
                break;
            case 10:
                aimw aimwVarL = qdq.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityCallScopedController", "onCallScopeAdded", 37, "InCallProximityCallScopedController.java");
                qdq qdqVar = (qdq) this.a;
                java.lang.String str = qdqVar.f;
                aimwVarL.y("registering %s to DisplayStateTracker and AccelerometerTracker.", str);
                qdp qdpVar = qdqVar.d;
                agsm.i(587, ahvr.E(new pmw(qdpVar, str, 11, (byte[]) null), qdpVar.b), "Failed to register %s to DisplayStateTracker.", new java.lang.Object[]{str});
                qdo qdoVar = qdqVar.e;
                qfb qfbVar = new qfb(qdoVar, str, 1);
                java.util.concurrent.Executor executor = qdoVar.d;
                agsm.i(588, ahvr.I(ahvr.F(qfbVar, executor), new defpackage.ocj(qdoVar, 15), executor), "Failed to register %s to AccelerometerTracker.", new java.lang.Object[]{str});
                break;
            case 11:
                java.lang.Object obj5 = this.a;
                qpq qpqVar = (qpq) obj5;
                zpm zpmVar = qpqVar.j;
                j$.util.Optional optionalH = zpmVar.h();
                j$.util.Optional optionalI = zpmVar.i();
                j$.util.Optional optionalOfNullable = true != optionalH.isPresent() ? optionalH : j$.util.Optional.ofNullable(((apqr) optionalH.get()).b);
                java.lang.String str2 = qpqVar.f;
                if (optionalOfNullable.equals(j$.util.Optional.of(str2))) {
                    optionalH = optionalI;
                } else {
                    if (true == optionalI.isPresent()) {
                        optionalI = j$.util.Optional.ofNullable(((apqr) optionalI.get()).b);
                    }
                    if (!optionalI.equals(j$.util.Optional.of(str2))) {
                        optionalH = j$.util.Optional.empty();
                    }
                }
                if (optionalH.isPresent()) {
                    qpp qppVar = (qpp) aooc.ar(qpqVar.m.Y(), qpp.class);
                    ajcqVarI = ahvr.I(qppVar.aC(), new qpo(qpqVar, optionalH, qppVar), qpqVar.g);
                } else {
                    qpq.a.b().l("com/android/dialer/incall/video/logging/VideoCallLogger", "logSecondAddedCallType", 138, "VideoCallLogger.java").v("this call is not the secondary added call.");
                    ajcqVarI = ajcm.a;
                }
                agsm.i(639, ajcqVarI, "failed to logSecondAddedCallType", new java.lang.Object[0]);
                qpp qppVar2 = (qpp) aooc.ar(qpqVar.m.Y(), qpp.class);
                ajcq ajcqVarAS = qppVar2.aS();
                ajcq ajcqVarAC = qppVar2.aC();
                ajcq ajcqVarAB = qppVar2.aB();
                agsm.i(640, ahvr.ak(new ajcq[]{ajcqVarAS, ajcqVarAC, ajcqVarAB}).o(new joq(obj5, ajcqVarAS, ajcqVarAC, ajcqVarAB, 5), qpqVar.g), "failed to logVideoConferenceCallCreated", new java.lang.Object[0]);
                break;
            case 12:
                qrv qrvVar = (qrv) this.a;
                if (qrvVar.d.getResources().getConfiguration().getLayoutDirection() == 1) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = qrvVar.h;
                    qqo qqoVarA = qqp.a();
                    qqoVarA.a = 2;
                    qqoVarA.b = 2;
                    atomicReference.set(qqoVarA.a());
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooh.f(details, "p0");
                toj tojVar = (toj) this.a;
                tojVar.E.i(aoov.an(tojVar.c, (aolr) null, 0, new tkz(tojVar, details, (aoln) null, 6), 3));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                vzr.a.b().l("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerifierImpl", "onCallScopeAdded", 86, "WearDeviceVerifierImpl.kt").v("Call added, verifying if any bonded device is a wear device.");
                vzr vzrVar = (vzr) this.a;
                vzrVar.l.i(aoov.an(vzrVar.d, (aolr) null, 0, new ung(vzrVar, (aoln) null, 14, (byte[]) null), 3));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooh.f(details, "unused");
                wap wapVar = (wap) this.a;
                wapVar.c.i(aoov.an(wapVar.a, (aolr) null, 0, new ung(wapVar, (aoln) null, 18), 3));
                break;
            case 16:
                java.lang.Object obj6 = this.a;
                wky wkyVar = (wky) obj6;
                wpx wpxVar = wkyVar.r;
                agsm.i(1082, wkyVar.B.h(new defpackage.kff(obj6, (java.lang.Object) wkyVar.q.a(), wpxVar.d(), ahvr.H(wpxVar.a(), new wkb(10), wpxVar.b), 16), wkyVar.g), "failed to check preconditions", new java.lang.Object[0]);
                break;
            default:
                ((zqj) this.a).a();
                break;
        }
    }

    public /* synthetic */ les(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public les(qax qaxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qaxVar);
        this.a = qaxVar;
    }
}
