package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxt implements ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public kxt(kva kvaVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(kvaVar);
        this.a = kvaVar;
    }

    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                a.bq(defpackage.kxx.a.c(), "failed to getCallRecordingDisclaimerAgreed", "com/android/dialer/callrecording/impl/service/CallRecordingButtonController$1", "onFailure", (char) 202, "CallRecordingButtonController.java", th, zct.b);
                defpackage.kxx kxxVar = (defpackage.kxx) this.a;
                kxxVar.h.set(true);
                kxxVar.f();
                break;
            case 1:
                a.bq(kva.a.c(), "Failed to delete call recordings", "com/android/dialer/callrecording/impl/CallRecordingImpl$1", "onFailure", (char) 149, "CallRecordingImpl.java", th, zct.b);
                java.lang.Object obj = this.a;
                ((kva) obj).d.o(rmx.dw);
                break;
            case 2:
                java.lang.Object obj2 = this.a;
                ((defpackage.kxx) obj2).g.a(mcd.au);
                break;
            case 3:
                java.lang.Object obj3 = this.a;
                defpackage.kxx kxxVar2 = (defpackage.kxx) obj3;
                kxxVar2.g.a(mcd.au);
                a.bq(defpackage.kxx.a.c(), "failed to play starting audio", "com/android/dialer/callrecording/impl/service/CallRecordingButtonController$3", "onFailure", (char) 321, "CallRecordingButtonController.java", th, zct.b);
                kxxVar2.h.set(true);
                kxxVar2.j.set(j$.util.Optional.of(defpackage.kxw.a));
                kxxVar2.n.a(ajcm.a);
                break;
            case 4:
                a.by(defpackage.lev.a.c().m(aioa.b), "Unable to determine hasLegacyCallScreenCall", "com/android/dialer/callscreen/impl/service/CallScreenController$1", "onFailure", (char) 269, "CallScreenController.java", th);
                break;
            case 5:
                ljn.a.d().i(zct.b).k(th).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl$1", "onFailure", 324, "ForkedCallAvatarSessionManagerImpl.java").y("Failed to prepare resources for channel %s", this.a);
                break;
            case 6:
                aooh.f(th, "t");
                defpackage.nej.a.c().k(th).j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController$onCallScopeAdded$<anonymous>", "onFailure", 415, "DobbyLifecycleController.kt").v("Failed to set initial lifecycle state.");
                java.lang.Object obj4 = this.a;
                ((defpackage.nej) obj4).n.a(mcd.ad);
                break;
            case 7:
                nyh nyhVar = (nyh) this.a;
                android.widget.Toast.makeText(nyhVar.b, 2132020269, 0).show();
                nyhVar.g.i((java.lang.String) null).a(mcd.as);
                nyhVar.c.o(rmx.hw);
                a.bq(nyh.a.c(), "startCall failed", "com/android/dialer/duo/impl/MeetCallControllerImpl$1", "onFailure", (char) 194, "MeetCallControllerImpl.java", th, zct.b);
                break;
            case 8:
                aooh.f(th, "t");
                ((defpackage.nza) this.a).g.set(null);
                defpackage.nza.a.c().i(zct.b).k(th).l("com/android/dialer/duo/tidepods/DuoUpgradeSupportedCache$isUpgradeSupported$<anonymous>", "onFailure", 95, "DuoUpgradeSupportedCache.kt").v("isDuoUpgradeSupported failed.");
                break;
            case 9:
                a.bq(defpackage.ood.a.c(), "Unable to read Flip To Silence user settings", "com/android/dialer/fliptosilence/impl/FlipToSilenceGrowthKitLogger$1", "onFailure", 'e', "FlipToSilenceGrowthKitLogger.java", th, zct.b);
                break;
            case 10:
                java.lang.Object obj5 = this.a;
                ((defpackage.mba) ((wjc) obj5).f).a(mcd.l);
                break;
            case 11:
                java.lang.Object obj6 = this.a;
                ((defpackage.mba) ((wjc) obj6).f).a(mcd.m);
                break;
            case 12:
                java.lang.Object obj7 = this.a;
                ((defpackage.mba) ((wjc) obj7).f).a(mcd.k);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((qdo) this.a).h = j$.util.Optional.empty();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                qgd.a.b().l("com/android/dialer/incall/rtt/service/RttInCallCachedDataLookup$1", "onFailure", 88, "RttInCallCachedDataLookup.java").v("Failed looking up the RttConfiguration");
                java.lang.Object obj8 = this.a;
                ((qgd) obj8).c.n(qgd.b, rub.c);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                a.bq(qmt.a.c(), "failed updating model and notification", "com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier$1", "onFailure", (char) 269, "StatusBarNotifier.java", th, zct.b);
                java.lang.Object obj9 = this.a;
                qmt qmtVar = (qmt) obj9;
                qmtVar.e().a(mcd.b);
                qmtVar.g.set(false);
                j$.util.Optional optional = (j$.util.Optional) qmtVar.o.get();
                qmp qmpVar = new qmp(obj9, 9);
                if (true == optional.isPresent()) {
                    java.lang.Object obj10 = optional.get();
                    j$.util.Optional optionalH = ((qmt) qmpVar.a).h((java.lang.String) obj10);
                    if (true == optionalH.isPresent()) {
                        ((qko) optionalH.get()).r.c(qbc.dP);
                    }
                }
                if ((th instanceof java.util.concurrent.TimeoutException) && ((java.lang.Long) qmtVar.m.a()).longValue() > 0) {
                    qmtVar.n.o(rmx.cB);
                    qmtVar.h.set(false);
                    qmtVar.y.a(ajcm.a);
                } else if (qmtVar.h.getAndSet(false)) {
                    qmtVar.a();
                }
                break;
            case 16:
                if (!(th instanceof java.util.concurrent.CancellationException)) {
                    a.bq(qvx.a.c(), "failed to swap sim.", "com/android/dialer/incall/voice/buttons/SwapSimButtonController$1", "onFailure", (char) 130, "SwapSimButtonController.java", th, zct.b);
                }
                ((qay) this.a).a();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                a.bq(tam.a.c(), "Unable to log audio processing started impression.", "com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer$1", "onFailure", (char) 452, "RevelioSessionInitializer.java", th, zct.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                a.by(tzr.a.c(), "Animation play has failed.", "com/android/dialer/sonic/impl/service/SonicAnimationPlayer$1", "onFailure", '[', "SonicAnimationPlayer.java", th);
                java.lang.Object obj11 = this.a;
                tzr tzrVar = (tzr) obj11;
                tzrVar.e.a(mcd.ac);
                tzrVar.d.a(th);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj12 = this.a;
                ((uhk) obj12).n.n(uhk.b, rub.c);
                break;
            default:
                java.lang.Object obj13 = this.a;
                ((uhk) obj13).n.n(uhk.c, rub.c);
                break;
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.kxx kxxVar = (defpackage.kxx) this.a;
                kxxVar.h.set(true);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    kxxVar.g();
                    return;
                } else {
                    kxxVar.f();
                    return;
                }
            case 1:
                kva.a.b().l("com/android/dialer/callrecording/impl/CallRecordingImpl$1", "onSuccess", 139, "CallRecordingImpl.java").v("Deleted call recording");
                java.lang.Object obj2 = this.a;
                ((kva) obj2).d.o(rmx.dv);
                return;
            case 2:
                java.lang.Object obj3 = this.a;
                ((defpackage.kxx) obj3).g.b(mce.ed);
                return;
            case 3:
                java.lang.Object obj4 = this.a;
                defpackage.kxx kxxVar2 = (defpackage.kxx) obj4;
                defpackage.hxe hxeVar = (defpackage.hxe) obj;
                kxxVar2.h.set(true);
                if (hxeVar == defpackage.hxe.a) {
                    defpackage.kxx.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$3", "onSuccess", 285, "CallRecordingButtonController.java").v("playing of starting audio finished.");
                    kxxVar2.g.b(mce.ej);
                    defpackage.kxr kxrVar = kxxVar2.c;
                    kxxVar2.e(kxrVar);
                    ahoq ahoqVarW = ahvr.W(236, "CallRecordingButtonController_startCallRecording_startRecording");
                    try {
                        ahvr.J(kxrVar.c(((defpackage.kxx) obj4).f), new defpackage.kxu(this, 0), ((defpackage.kxx) obj4).b);
                        ahoqVarW.close();
                        return;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return;
            case 4:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.lev) this.a).t.f();
                    return;
                }
                return;
            case 5:
                ljn.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl$1", "onSuccess", 315, "ForkedCallAvatarSessionManagerImpl.java").y("Finished preparing resources for channel %s", this.a);
                return;
            case 6:
                aooh.f((aojh) obj, "result");
                return;
            case 7:
                nyh.a.b().l("com/android/dialer/duo/impl/MeetCallControllerImpl$1", "onSuccess", 180, "MeetCallControllerImpl.java").v("startCall succeeded");
                nyh nyhVar = (nyh) this.a;
                nyhVar.g.i((java.lang.String) null).b(mce.ea);
                nyhVar.c.o(rmx.hv);
                return;
            case 8:
                ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj5 = this.a;
                ((defpackage.nza) obj5).i.a(ajcm.a);
                return;
            case 9:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.ood oodVar = (defpackage.ood) this.a;
                java.lang.Boolean bool2 = oodVar.f;
                if (bool2 != null && !bool2.booleanValue() && bool.booleanValue()) {
                    oodVar.g.bm(rmu.s);
                }
                oodVar.f = bool;
                return;
            case 10:
                return;
            case 11:
                return;
            case 12:
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((qdo) this.a).h = j$.util.Optional.empty();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                qgd.a.b().l("com/android/dialer/incall/rtt/service/RttInCallCachedDataLookup$1", "onSuccess", 82, "RttInCallCachedDataLookup.java").v("Completed looking up the RttConfiguration");
                java.lang.Object obj6 = this.a;
                ((qgd) obj6).c.n(qgd.b, rub.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                qmt qmtVar = (qmt) this.a;
                qmtVar.v.incrementAndGet();
                qmt.a.b().l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier$1", "onSuccess", 256, "StatusBarNotifier.java").v("Update finished successfully. updateInProgress set to false");
                qmtVar.g.set(false);
                if (qmtVar.h.getAndSet(false)) {
                    qmtVar.a();
                    return;
                }
                return;
            case 16:
                ((qay) this.a).a();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                zpo zpoVar = (zpo) obj;
                int iOrdinal = zpoVar.ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    java.lang.Object obj7 = this.a;
                    ((tam) obj7).p.a(qbc.gw);
                    return;
                } else if (iOrdinal != 11) {
                    a.bt(tam.a.d(), "Audio processing started with unexpected call state: %s", zpoVar.name(), "com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer$1", "onSuccess", (char) 439, "RevelioSessionInitializer.java", zct.b);
                    return;
                } else {
                    java.lang.Object obj8 = this.a;
                    ((tam) obj8).p.a(qbc.gx);
                    return;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                tzr.a.b().l("com/android/dialer/sonic/impl/service/SonicAnimationPlayer$1", "onSuccess", 82, "SonicAnimationPlayer.java").y("animation play succeeded: %s", bool3);
                if (bool3.booleanValue()) {
                    return;
                }
                java.lang.Object obj9 = this.a;
                ((tzr) obj9).e.a(mcd.ab);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj10 = this.a;
                uhk uhkVar = (uhk) obj10;
                uhkVar.l.o(rmx.dB);
                uhkVar.n.n(uhk.b, rub.b);
                return;
            default:
                java.lang.Object obj11 = this.a;
                ((uhk) obj11).n.n(uhk.c, rub.b);
                return;
        }
    }

    public kxt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public kxt(nyh nyhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(nyhVar);
        this.a = nyhVar;
    }

    public kxt(defpackage.kxx kxxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(kxxVar);
        this.a = kxxVar;
    }

    public kxt(defpackage.ood oodVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(oodVar);
        this.a = oodVar;
    }

    public kxt(defpackage.kxx kxxVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(kxxVar);
        this.a = kxxVar;
    }

    public kxt(wjc wjcVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wjcVar);
        this.a = wjcVar;
    }

    public kxt(defpackage.kxx kxxVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(kxxVar);
        this.a = kxxVar;
    }

    public kxt(wjc wjcVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wjcVar);
        this.a = wjcVar;
    }

    public kxt(defpackage.lev levVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(levVar);
        this.a = levVar;
    }

    public kxt(wjc wjcVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wjcVar);
        this.a = wjcVar;
    }

    public kxt(ljn ljnVar, adoa adoaVar, int i) {
        this.$cid = i;
        this.a = adoaVar;
        j$.util.Objects.requireNonNull(ljnVar);
    }

    public kxt(qdo qdoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qdoVar);
        this.a = qdoVar;
    }

    public kxt(qgd qgdVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qgdVar);
        this.a = qgdVar;
    }

    public kxt(qmt qmtVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qmtVar);
        this.a = qmtVar;
    }

    public kxt(qvx qvxVar, qay qayVar, int i) {
        this.$cid = i;
        this.a = qayVar;
        j$.util.Objects.requireNonNull(qvxVar);
    }

    public kxt(tam tamVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(tamVar);
        this.a = tamVar;
    }

    public kxt(tzr tzrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(tzrVar);
        this.a = tzrVar;
    }

    public kxt(uhk uhkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uhkVar);
        this.a = uhkVar;
    }

    public kxt(uhk uhkVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uhkVar);
        this.a = uhkVar;
    }
}
