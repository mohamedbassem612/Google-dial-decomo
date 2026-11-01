package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jak implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jak(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((java.lang.Float) obj).floatValue();
                return java.lang.Float.valueOf(1.0f);
            case 1:
                aooh.f((diq) obj, "$this$clearAndSetSemantics");
                return aojh.a;
            case 2:
                java.lang.Long l = (java.lang.Long) obj;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                aooh.c(l);
                return java.lang.Long.valueOf(epochMilli - l.longValue());
            case 3:
                java.lang.String str = ((defpackage.kow) obj).d;
                aooh.e(str, "getTranscript(...)");
                return str;
            case 4:
                return ((defpackage.jhk) ((apqr) obj).a(defpackage.jhk.class)).p();
            case 5:
                return ((defpackage.jhk) ((apqr) obj).a(defpackage.jhk.class)).A();
            case 6:
                aooh.f((java.lang.Long) obj, "it");
                return aoyx.c(1, 0, 0, 6);
            case 7:
                return java.lang.Boolean.valueOf((((ipb) obj).b & 16) != 0);
            case 8:
                jos josVar = ((ipb) obj).g;
                return josVar == null ? jos.a : josVar;
            case 9:
                defpackage.aixo aixoVar = (defpackage.aixo) obj;
                uzx uzxVarZ = defpackage.airh.z(defpackage.aixp.a.m());
                aooh.c(aixoVar);
                uzxVarZ.ay(aixoVar);
                return uzxVarZ.ax();
            case 10:
                java.lang.Long l2 = (java.lang.Long) obj;
                java.util.Set set = defpackage.jpk.a;
                if (l2.longValue() < 30000) {
                    return defpackage.aixm.CALL_DURATION_VERY_SHORT;
                }
                if (l2.longValue() < 60000) {
                    return defpackage.aixm.CALL_DURATION_SHORT;
                }
                return l2.longValue() < 120000 ? defpackage.aixm.CALL_DURATION_MEDIUM : defpackage.aixm.CALL_DURATION_LONG;
            case 11:
                java.util.Set set2 = defpackage.jpk.a;
                long jLongValue = ((java.lang.Long) obj).longValue();
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                return java.lang.Long.valueOf(jLongValue / 60000);
            case 12:
                java.util.Set set3 = defpackage.jpk.a;
                return ((defpackage.hkd) obj).c;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.util.Set set4 = defpackage.jpk.a;
                return java.lang.Boolean.valueOf(((defpackage.hkd) obj).g);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.util.Set set5 = defpackage.jpk.a;
                return java.lang.Integer.valueOf(((android.telecom.DisconnectCause) obj).getCode());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.jyh jyhVar = (defpackage.jyh) obj;
                aooh.f(jyhVar, "it");
                return jyhVar.b;
            case 16:
                return afsq.cc((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.content.Context context = (android.content.Context) obj;
                aooh.f(context, "context");
                com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView = new com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView(context);
                dropdownMenuView.setOrientation(1);
                return dropdownMenuView;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return afsq.cc((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView2 = (com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView) obj;
                aooh.f(dropdownMenuView2, "view");
                dropdownMenuView2.y().a();
                return aojh.a;
            default:
                return afsq.cc((diq) obj);
        }
    }
}
