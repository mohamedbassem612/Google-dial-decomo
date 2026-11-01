package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fvt implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ fvt(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoit */
    public final java.lang.Object a(java.lang.Object obj) throws aoit {
        switch (this.$cid) {
            case 0:
                defpackage.agze agzeVar = (defpackage.agze) obj;
                aooh.f(agzeVar, "$this$popUpTo");
                agzeVar.a = true;
                return aojh.a;
            case 1:
                defpackage.gnu gnuVar = (defpackage.gnu) obj;
                aooh.f(gnuVar, "$this$anim");
                gnuVar.b = 0;
                gnuVar.a = 0;
                return aojh.a;
            case 2:
                android.content.Context context = (android.content.Context) obj;
                aooh.f(context, "it");
                if (context instanceof android.content.ContextWrapper) {
                    return ((android.content.ContextWrapper) context).getBaseContext();
                }
                return null;
            case 3:
                android.content.Context context2 = (android.content.Context) obj;
                aooh.f(context2, "it");
                android.content.ContextWrapper contextWrapper = context2 instanceof android.content.ContextWrapper ? (android.content.ContextWrapper) context2 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 4:
                android.content.Context context3 = (android.content.Context) obj;
                aooh.f(context3, "it");
                if (context3 instanceof android.app.Activity) {
                    return (android.app.Activity) context3;
                }
                return null;
            case 5:
                defpackage.fwc fwcVar = (defpackage.fwc) obj;
                aooh.f(fwcVar, "it");
                return fwcVar.c;
            case 6:
                defpackage.fwc fwcVar2 = (defpackage.fwc) obj;
                aooh.f(fwcVar2, "it");
                if (!(fwcVar2 instanceof defpackage.fwe)) {
                    return null;
                }
                defpackage.fwe fweVar = (defpackage.fwe) fwcVar2;
                return fweVar.k(fweVar.i());
            case 7:
                defpackage.fwk fwkVar = (defpackage.fwk) obj;
                aooh.f(fwkVar, "$this$navOptions");
                fwkVar.b = true;
                return aojh.a;
            case 8:
                return new defpackage.fws(env.a((eoq) obj));
            case 9:
                defpackage.fwc fwcVar3 = ((defpackage.fvs) ((defpackage.aes) obj).c()).a;
                aooh.d(fwcVar3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i = defpackage.fwc.e;
                java.util.Iterator itA = defpackage.hgt.Y((defpackage.fwy) fwcVar3).a();
                while (itA.hasNext()) {
                    defpackage.fwc fwcVar4 = (defpackage.fwc) itA.next();
                    if (fwcVar4 instanceof defpackage.fwy) {
                    } else if (fwcVar4 instanceof defpackage.fww) {
                    }
                }
                return null;
            case 10:
                return ((defpackage.fvs) obj).c;
            case 11:
                defpackage.fwk fwkVar2 = (defpackage.fwk) obj;
                aooh.f(fwkVar2, "$this$navOptions");
                fwkVar2.c = true;
                return aojh.a;
            case 12:
                defpackage.fwc fwcVar5 = (defpackage.fwc) obj;
                aooh.f(fwcVar5, "destination");
                defpackage.fwe fweVar2 = fwcVar5.c;
                if (fweVar2 == null || fweVar2.i() != fwcVar5.b()) {
                    return null;
                }
                return fwcVar5.c;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.fwc fwcVar6 = (defpackage.fwc) obj;
                aooh.f(fwcVar6, "it");
                return java.lang.Integer.valueOf(fwcVar6.b());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.fwc fwcVar7 = (defpackage.fwc) obj;
                aooh.f(fwcVar7, "destination");
                defpackage.fwe fweVar3 = fwcVar7.c;
                if (fweVar3 == null || fweVar3.i() != fwcVar7.b()) {
                    return null;
                }
                return fwcVar7.c;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                gfg gfgVar = (gfg) obj;
                aooh.f(gfgVar, "config");
                aooh.f(gfgVar, "config");
                throw new aoit("An operation is not implemented.");
            case 16:
                giw giwVar = (giw) obj;
                aooh.f(giwVar, "statement");
                giwVar.f();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = (androidx.window.sidecar.SidecarDisplayFeature) obj;
                int i2 = defpackage.gqu.a;
                aooh.f(sidecarDisplayFeature, "$this$require");
                return java.lang.Boolean.valueOf(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature2 = (androidx.window.sidecar.SidecarDisplayFeature) obj;
                int i3 = defpackage.gqu.a;
                aooh.f(sidecarDisplayFeature2, "$this$require");
                return java.lang.Boolean.valueOf((sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) ? false : true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature3 = (androidx.window.sidecar.SidecarDisplayFeature) obj;
                int i4 = defpackage.gqu.a;
                aooh.f(sidecarDisplayFeature3, "$this$require");
                return java.lang.Boolean.valueOf(sidecarDisplayFeature3.getType() != 1 || sidecarDisplayFeature3.getRect().width() == 0 || sidecarDisplayFeature3.getRect().height() == 0);
            default:
                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature4 = (androidx.window.sidecar.SidecarDisplayFeature) obj;
                int i5 = defpackage.gqu.a;
                aooh.f(sidecarDisplayFeature4, "$this$require");
                return java.lang.Boolean.valueOf(sidecarDisplayFeature4.getRect().left == 0 || sidecarDisplayFeature4.getRect().top == 0);
        }
    }
}
