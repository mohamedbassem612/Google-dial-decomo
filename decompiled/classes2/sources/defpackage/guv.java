package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class guv implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ guv(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                gxl gxlVar = (gxl) obj;
                aooh.f(gxlVar, "spec");
                return true != gxlVar.d() ? "OneTime" : "Periodic";
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                grp grpVar = grp.a;
                aooh.f(entry, "<destruct>");
                java.lang.String str6 = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.lang.Object[]) {
                    value = java.util.Arrays.toString((java.lang.Object[]) value);
                    aooh.e(value, "toString(...)");
                }
                return str6 + " : " + value;
            case 2:
                gvw gvwVar = (gvw) obj;
                aooh.f(gvwVar, "it");
                java.lang.String simpleName = gvwVar.getClass().getSimpleName();
                aooh.e(simpleName, "getSimpleName(...)");
                return simpleName;
            case 3:
                defpackage.hmz hmzVar = (defpackage.hmz) obj;
                aooh.f(hmzVar, "it");
                return hmzVar.h;
            case 4:
                defpackage.hmz hmzVar2 = (defpackage.hmz) obj;
                aooh.f(hmzVar2, "it");
                return hmzVar2.a;
            case 5:
                defpackage.ub ubVar = (defpackage.ub) obj;
                return java.lang.Boolean.valueOf((ubVar == null || (str = ubVar.c) == null || !str.equals("googleDialerCallerror")) ? false : true);
            case 6:
                defpackage.ub ubVar2 = (defpackage.ub) obj;
                if ((ubVar2 == null || (str3 = ubVar2.c) == null || !aoov.G(str3, "inCall_", false)) && (ubVar2 == null || (str2 = ubVar2.c) == null || !aoov.G(str2, "inCall", false))) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 7:
                defpackage.ub ubVar3 = (defpackage.ub) obj;
                if ((ubVar3 == null || (str5 = ubVar3.c) == null || !aoov.G(str5, "preCall_", false)) && (ubVar3 == null || (str4 = ubVar3.c) == null || !aoov.G(str4, "preCall", false))) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 8:
                android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) obj;
                aooh.c(disconnectCause);
                if (disconnectCause.getCode() != 1 && disconnectCause.getCode() != 0) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                ((java.lang.Character) obj).charValue();
                return aojh.a;
            case 10:
                return ((defpackage.hve) ((apqr) obj).a(defpackage.hve.class)).e();
            case 11:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                if (th != null && !(th instanceof java.util.concurrent.CancellationException)) {
                    defpackage.hxv.a.d().k(th).l("com/android/dialer/audio/audioinjector/AudioInjector", "stopRequestReceiverJob$<anonymous>", 390, "AudioInjector.kt").v("stopRequestReceiverJob completion failed");
                }
                return aojh.a;
            case 12:
                java.lang.Throwable th2 = (java.lang.Throwable) obj;
                if (th2 != null && !(th2 instanceof java.util.concurrent.CancellationException)) {
                    defpackage.hxv.a.d().k(th2).l("com/android/dialer/audio/audioinjector/AudioInjector", "startRequestReceiverJobIfNotStarted$<anonymous>$<anonymous>$<anonymous>", 347, "AudioInjector.kt").v("requestReceiverJob completion failed");
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.String str7 = (java.lang.String) obj;
                vaa vaaVarR = alpv.r(alqh.a.m());
                aooh.c(str7);
                vaaVarR.aD(str7);
                return vaaVarR.aC();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.String str8 = (java.lang.String) obj;
                vaa vaaVarR2 = alpv.r(alqh.a.m());
                aooh.c(str8);
                vaaVarR2.aD(str8);
                return vaaVarR2.aC();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Throwable th3 = (java.lang.Throwable) obj;
                if (th3 != null && !(th3 instanceof java.util.concurrent.CancellationException)) {
                    itf.a.c().m(aioa.b).k(th3).l("com/android/dialer/beesly/impl/data/BeeslyDataRepository$Companion", "logIfError$<anonymous>", 111, "BeeslyDataRepository.kt").v("[Beesly] Failed to notify listener");
                }
                return aojh.a;
            case 16:
                return ((defpackage.hhe) obj).r();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) obj;
                aooh.f(frameLayout, "frameLayout");
                android.view.View childAt = frameLayout.getChildAt(0);
                aooh.e(childAt, "getChildAt(...)");
                defpackage.hgz.f(childAt);
                frameLayout.removeAllViews();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.hhe hheVar = (defpackage.hhe) obj;
                aooh.f(hheVar, "it");
                return hheVar.r();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f((defpackage.aes) obj, "$this$AnimatedContent");
                ajb ajbVar = defpackage.jaa.a;
                ajb ajbVar2 = defpackage.jaa.b;
                return new afo(aga.n(new alm(200, 200, ajbVar2), 2), aga.o(den.bv(200, 0, ajbVar2, 2), 2), (ahu) null, 12);
            default:
                aooh.f((diq) obj, "$this$clearAndSetSemantics");
                return aojh.a;
        }
    }
}
