package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bxb implements aonj {
    private final /* synthetic */ int $cid;

    public final java.lang.Object a(java.lang.Object obj) {
        djq djqVar = null;
        switch (this.$cid) {
            case 0:
                cmw cmwVar = defpackage.bxd.a;
                return aojh.a;
            case 1:
                cbd cbdVar = bvo.a;
                ((diq) obj).a(din.m, java.lang.Boolean.TRUE);
                return aojh.a;
            case 2:
                cmw cmwVar2 = defpackage.bxd.a;
                return aojh.a;
            case 3:
                ddh ddhVar = (ddh) obj;
                aooh.d(ddhVar, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                defpackage.byu byuVar = (defpackage.byu) ddhVar;
                byuVar.b = false;
                den.s(byuVar);
                return java.lang.Boolean.FALSE;
            case 4:
                return aojh.a;
            case 5:
                cnt cntVar = (cnt) obj;
                if (!((cmv) cntVar).t.D) {
                    return defpackage.ddg.b;
                }
                cnt cntVar2 = cntVar.d;
                cntVar.d = null;
                cntVar.b = null;
                return defpackage.ddg.a;
            case 6:
                return aojh.a;
            case 7:
                return aojh.a;
            case 8:
                boolean z = ((defpackage.cva) obj).a;
                return java.lang.Boolean.TRUE;
            case 9:
                return aojh.a;
            case 10:
                daj dajVar = (daj) obj;
                dajVar.b = true;
                cfo.w(dajVar);
                return aojh.a;
            case 11:
                ((daj) obj).A();
                return aojh.a;
            case 12:
                if (obj == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                }
                return java.lang.Boolean.valueOf(!((dcw) obj).B());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Class cls = deg.a;
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                int i = dem.z;
                return java.lang.Boolean.valueOf(((dij) obj).h().f(din.C));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((java.lang.Long) obj).longValue();
                int i2 = defpackage.dhk.d;
                return aojh.a;
            case 16:
                return java.lang.Integer.valueOf(((defpackage.dhq) obj).b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Integer.valueOf(((defpackage.dhq) obj).c.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                dka dkaVar = (dka) obj;
                return "[" + dkaVar.a + ", " + dkaVar.b + ')';
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(0);
                java.lang.Boolean bool = obj2 != null ? (java.lang.Boolean) obj2 : null;
                aooh.c(bool);
                boolean zBooleanValue = bool.booleanValue();
                java.lang.Object obj3 = list.get(1);
                ckb ckbVar = defpackage.dkr.b;
                if (!aooh.n(obj3, java.lang.Boolean.FALSE) && obj3 != null) {
                    djqVar = (djq) ckbVar.a(obj3);
                }
                aooh.c(djqVar);
                return new dkg(djqVar.a, zBooleanValue);
            default:
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new djq(((java.lang.Integer) obj).intValue());
        }
    }
}
