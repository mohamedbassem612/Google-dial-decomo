package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class omj implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ omj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        z = false;
        z = false;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((defpackage.omk) this.a).e.j(0) != 1);
            case 1:
                return java.lang.Boolean.valueOf(nyh.n((android.content.Context) this.a));
            case 2:
                otm otmVar = new otm((char[]) null);
                otmVar.a = "ringer_mode";
                otmVar.f(((defpackage.omo) this.a).d);
                return otmVar.e();
            case 3:
                return java.lang.Integer.valueOf(((oju) this.a).c());
            case 4:
                ?? r10 = this.a;
                int i = onv.c;
                return afsq.ct((java.util.List) r10);
            case 5:
                java.lang.Object obj = this.a;
                if (!((defpackage.ony) obj).d.m()) {
                    try {
                        ojo ojoVar = ((defpackage.ony) obj).c;
                        android.net.Uri uri = defpackage.onx.a;
                        android.os.Bundle bundleC = ojoVar.c(new defpackage.ojp(defpackage.onx.a, "get_auto_dnd_configuration", null));
                        if (bundleC == null) {
                            defpackage.ony.a.d().i(zct.b).l("com/android/dialer/fliptosilence/FlipToShushSettings", "isFlipToShushEnabled", 90, "FlipToShushSettings.java").v("Unable to read flip to shush state");
                        } else {
                            int i2 = bundleC.getInt("configuration");
                            defpackage.ony.a.b().l("com/android/dialer/fliptosilence/FlipToShushSettings", "isFlipToShushEnabled", 95, "FlipToShushSettings.java").w("autoDndConfiguration: %s", i2);
                            if (i2 == 2) {
                                z = true;
                            }
                        }
                    } catch (java.lang.RuntimeException e) {
                        aimw aimwVarL = defpackage.ony.a.c().i(zct.b).k(e).l("com/android/dialer/fliptosilence/FlipToShushSettings", "isFlipToShushEnabled", 103, "FlipToShushSettings.java");
                        android.net.Uri uri2 = defpackage.onx.a;
                        aimwVarL.y("can't resolve %s content provider, Digital Wellbeing (which provides Flip to Shush) isn't available on this device: only Flip to Silence is supported", new defpackage.ojp(defpackage.onx.a, "get_auto_dnd_configuration", null).a);
                    }
                    break;
                } else {
                    defpackage.ony.a.b().l("com/android/dialer/fliptosilence/FlipToShushSettings", "isFlipToShushEnabled", 81, "FlipToShushSettings.java").v("ContentObserver is unavailable in DirectBoot mode");
                }
                return java.lang.Boolean.valueOf(z);
            case 6:
                android.content.Context context = ((defpackage.oop) this.a).b;
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
                if (sensorManager == null || sensorManager.getDefaultSensor(1) == null) {
                    defpackage.oop.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsIntegration", "getPrefData", 47, "FlipToSilenceSettingsIntegration.java").v("sensor hardware not available");
                    return j$.util.Optional.empty();
                }
                if (defpackage.ony.c(context)) {
                    defpackage.oop.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsIntegration", "getPrefData", 62, "FlipToSilenceSettingsIntegration.java").v("integrate FlipToShush settings");
                    rus rusVar = new rus();
                    rusVar.d(ruz.c);
                    rusVar.c(rvc.z);
                    rusVar.e(new rva(2132018750));
                    rusVar.b(context.getDrawable(2131231426));
                    return j$.util.Optional.of(rusVar.a());
                }
                defpackage.oop.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsIntegration", "getPrefData", 52, "FlipToSilenceSettingsIntegration.java").v("integrate FlipToSilence settings");
                rus rusVar2 = new rus();
                rusVar2.d(ruz.c);
                rusVar2.c(rvc.z);
                rusVar2.e(new rva(2132018753));
                rusVar2.b(context.getDrawable(2131231426));
                return j$.util.Optional.of(rusVar2.a());
            case 7:
                if (defpackage.ony.c(((defpackage.oop) this.a).b)) {
                    defpackage.oop.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsIntegration", "getPrefActionType", 85, "FlipToSilenceSettingsIntegration.java").v("launch FlipToShush settings");
                    akzx akzxVarM = ruy.a.m();
                    rux ruxVar = rux.a;
                    akzxVarM.u();
                    ruy ruyVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(ruxVar);
                    ruyVar.c = ruxVar;
                    ruyVar.b = 2;
                    return akzxVarM.p();
                }
                defpackage.oop.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsIntegration", "getPrefActionType", 80, "FlipToSilenceSettingsIntegration.java").v("launch FlipToSilence settings");
                akzx akzxVarM2 = ruy.a.m();
                ruw ruwVar = ruw.a;
                akzxVarM2.u();
                ruy ruyVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(ruwVar);
                ruyVar2.c = ruwVar;
                ruyVar2.b = 1;
                return akzxVarM2.p();
            case 8:
                return abxl.L("STATE_GOOGLE_ASSISTANT_IS_DEFAULT", android.service.voice.VoiceInteractionService.isActiveService((android.content.Context) this.a, new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService")) ? 1 : 0);
            case 9:
                return abxl.L("DARK_MODE_ENABLED", ((urg) this.a).h() == urf.b ? 1 : 0);
            case 10:
                aimz aimzVar = oud.a;
                aimzVar.b().l("com/android/dialer/incall/activity/uiminimizer/impl/InCallActivityMinimizerImpl", "requestMinimization$<anonymous>", 63, "InCallActivityMinimizerImpl.kt").v("InCallActivity minimization requested.");
                oud oudVar = (oud) this.a;
                android.app.Activity activity = oudVar.c;
                if (activity == null) {
                    oudVar.f.i((java.lang.String) null).b(mce.ab);
                    aimzVar.b().l("com/android/dialer/incall/activity/uiminimizer/impl/InCallActivityMinimizerImpl", "requestMinimization$<anonymous>", 69, "InCallActivityMinimizerImpl.kt").v("No reference to InCallActivity, cannot minimize.");
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalE = oudVar.e.e();
                aooh.e(optionalE, "getIsInCallUiShowing(...)");
                if (!aooh.n(aooh.q(optionalE), java.lang.Boolean.TRUE)) {
                    oudVar.f.i((java.lang.String) null).b(mce.ad);
                }
                boolean zMoveTaskToBack = activity.moveTaskToBack(true);
                aimzVar.b().l("com/android/dialer/incall/activity/uiminimizer/impl/InCallActivityMinimizerImpl", "requestMinimization$<anonymous>", 86, "InCallActivityMinimizerImpl.kt").y("InCallActivity successfully minimize: %b", java.lang.Boolean.valueOf(zMoveTaskToBack));
                if (!zMoveTaskToBack) {
                    oudVar.f.i((java.lang.String) null).b(mce.ac);
                }
                return java.lang.Boolean.valueOf(zMoveTaskToBack);
            case 11:
                return ((j$.util.Optional) this.a).isPresent() ? j$.util.Optional.of(oue.f) : j$.util.Optional.empty();
            case 12:
                return ((plv) this.a).e.get() ? j$.util.Optional.of(qtu.c) : j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Boolean.valueOf(((android.content.Context) this.a).checkSelfPermission("android.permission.STATUS_BAR") == 0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Boolean.valueOf(zqz.a((android.content.Context) ((defpackage.hwv) this.a).b, "android.permission.CAMERA"));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                pvr pvrVar = (pvr) this.a;
                pvrVar.h.set(puy.a);
                pvrVar.l.a(ajcm.a);
                return null;
            case 16:
                return ((pzt) this.a).d;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                acb acbVar = new acb(((qba) this.a).d);
                while (acbVar.hasNext()) {
                    ((otz) acbVar.next()).b();
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj2 = this.a;
                return (aify) j$.util.Collection.-EL.stream(((qbe) obj2).a).map(new pei(obj2, 6)).collect(aido.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return j$.util.Optional.of(((akzx) this.a).p());
            default:
                ((qdu) this.a).b(true);
                return null;
        }
    }
}
