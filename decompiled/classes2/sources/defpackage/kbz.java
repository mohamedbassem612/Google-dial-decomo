package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kbz implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kbz(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object a(java.lang.Object obj) throws aois {
        java.lang.String str;
        java.lang.String str2 = null;
        switch (this.$cid) {
            case 0:
                aooh.f((kav) obj, "it");
                return aojh.a;
            case 1:
                com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView = (com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView) obj;
                aooh.f(dropdownMenuView, "view");
                dropdownMenuView.y().a();
                return aojh.a;
            case 2:
                ((java.lang.Long) obj).longValue();
                return aojh.a;
            case 3:
                aooh.f((kav) obj, "it");
                return aojh.a;
            case 4:
                kcr kcrVar = (kct) obj;
                aooh.f(kcrVar, "it");
                int iH = defpackage.jlr.h(kcrVar);
                if (iH == 0) {
                    int i = ((defpackage.kcs) kcrVar).a;
                    kcq.e(i);
                    return "header_".concat(kcq.e(i));
                }
                if (iH != 1) {
                    throw new aois();
                }
                return "call_" + kcrVar.a.a;
            case 5:
                return afsq.cp((diq) obj);
            case 6:
                return aojh.a;
            case 7:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                if (th != null && !(th instanceof java.util.concurrent.CancellationException)) {
                    kdw.a.c().m(aioa.b).k(th).l("com/android/dialer/calllog/database/AnnotatedCallLogDataRepository$Companion", "logIfError$<anonymous>", 454, "AnnotatedCallLogDataRepository.kt").v("[AnnotatedCallLog] Failed to notify listener");
                }
                return aojh.a;
            case 8:
                kfq kfqVar = (kfq) obj;
                grn grnVar = kfu.a;
                aooh.c(kfqVar);
                akzx akzxVarP = kfqVar.p();
                aooh.f(akzxVarP, "builder");
                akzxVarP.u();
                akzxVarP.b.b = true;
                kfq kfqVarP = akzxVarP.p();
                aooh.e(kfqVarP, "build(...)");
                return kfqVarP;
            case 9:
                defpackage.kdy kdyVar = (defpackage.kdy) obj;
                aooh.f(kdyVar, "it");
                defpackage.hkd hkdVarB = kdyVar.b();
                if (hkdVarB != null && (str = hkdVarB.c) != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                java.lang.String str3 = kdyVar.e;
                if (str3 != null && str3.length() > 0) {
                    str2 = str3;
                }
                return str2 == null ? kdyVar.d : str2;
            case 10:
                aooh.f((yse) obj, "it");
                return new defpackage.kqb(null);
            case 11:
                j$.time.ZonedDateTime zonedDateTime = (j$.time.ZonedDateTime) obj;
                int i2 = defpackage.kqs.a;
                aooh.f(zonedDateTime, "it");
                return zonedDateTime.plusDays(1L);
            case 12:
                return a.I((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return a.I((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return a.I((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.view.View view = (android.view.View) obj;
                aooh.f(view, "view");
                view.setLayoutParams(new android.app.ActionBar.LayoutParams(-1, -2));
                return aojh.a;
            case 16:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.f(diqVar);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Integer.valueOf(-((int) (((java.lang.Integer) obj).intValue() * 0.05f)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.lang.Integer.valueOf((int) (((java.lang.Integer) obj).intValue() * 0.05f));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Integer.valueOf(-((int) (((java.lang.Integer) obj).intValue() * 0.05f)));
            default:
                return java.lang.Integer.valueOf((int) (((java.lang.Integer) obj).intValue() * 0.05f));
        }
    }
}
