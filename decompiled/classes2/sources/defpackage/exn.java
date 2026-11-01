package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class exn implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ exn(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return new defpackage.ezv((defpackage.etc) obj);
            case 1:
                defpackage.eqi eqiVar = (defpackage.eqi) obj;
                int i = defpackage.eqg.R;
                return eqiVar.a + ": " + eqiVar.b;
            case 2:
                defpackage.flj fljVar = (defpackage.flj) obj;
                fljVar.f();
                return fljVar.getClass().getSimpleName();
            case 3:
                return aify.n(ahvr.aO(((defpackage.ffs) obj).j().c, new defpackage.exn(4)));
            case 4:
                defpackage.fhg fhgVar = defpackage.fhg.a;
                return java.lang.Integer.valueOf(((defpackage.ern) obj).c);
            case 5:
                boolean zIsPresent = ((j$.util.Optional) obj).isPresent();
                hkz.a.b().l("com/android/dialer/accessibility/settings/impl/AccessibilitySettingsIntegration", "isRttEnabledAndSupported", 172, "AccessibilitySettingsIntegration.java").y("RTT is %s", true != zIsPresent ? "not supported" : "supported");
                return java.lang.Boolean.valueOf(zIsPresent);
            case 6:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    akzx akzxVarM = ruy.a.m();
                    ruw ruwVar = ruw.a;
                    akzxVarM.u();
                    ruy ruyVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(ruwVar);
                    ruyVar.c = ruwVar;
                    ruyVar.b = 1;
                    return akzxVarM.p();
                }
                akzx akzxVarM2 = ruy.a.m();
                rux ruxVar = rux.a;
                akzxVarM2.u();
                ruy ruyVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(ruxVar);
                ruyVar2.c = ruxVar;
                ruyVar2.b = 2;
                return akzxVarM2.p();
            case 7:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (bool.booleanValue()) {
                    return bool;
                }
                defpackage.hzd.a.c().i(zct.b).m(aioa.b).l("com/android/dialer/audio/impl/Constraints", "isFulfilledAsync", 58, "Constraints.java").v("no telephonyDevice");
                return bool;
            case 8:
                return java.lang.Boolean.valueOf(((defpackage.hzi) obj).c().d().f());
            case 9:
                a.bI(defpackage.ibd.a.d(), "Timeout waiting for active call audio", "com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "getNextActiveCallAudioInternal", (char) 133, "CallAudioManagerImpl.java", zct.b);
                return j$.util.Optional.empty();
            case 10:
                return java.lang.Boolean.valueOf(((defpackage.hzi) obj).c().c().b());
            case 11:
                ((defpackage.hxf) obj).d();
                return null;
            case 12:
                defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "playInternal", 254, "CallAudioPlayer.java").v("MediaPlayer playback timed out");
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return null;
            case 16:
                defpackage.jor jorVarB = defpackage.jor.b(((jos) obj).b);
                if (jorVarB == null) {
                    jorVarB = defpackage.jor.UNRECOGNIZED;
                }
                return java.lang.Boolean.valueOf(jorVarB != defpackage.jor.INVALID);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aimz aimzVar = jsk.a;
                return java.lang.Long.valueOf(((jsm) obj).d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (spa) ((j$.util.Optional) obj).orElse(spa.a);
            default:
                defpackage.jvd.a.c().i(zct.b).k((java.lang.IllegalStateException) obj).l("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorDataService", "submit", 140, "CallerTagSelectorDataService.java").v("Failed to submit");
                return null;
        }
    }
}
