package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fiy implements java.util.function.ToIntFunction {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                java.util.Comparator comparator = defpackage.fja.a;
                return ((defpackage.fiz) obj).a;
            case 1:
                int i = defpackage.est.b;
                return ((defpackage.ess) obj).L;
            case 2:
                int i2 = defpackage.foq.d;
                return ((defpackage.foq) obj).c;
            case 3:
                java.util.Comparator comparator2 = defpackage.ftj.a;
                return ((defpackage.ftj) obj).c.a;
            case 4:
                return ((android.content.ContentProviderResult) obj).count.intValue();
            case 5:
                return ((defpackage.kig) obj).ordinal();
            case 6:
                return ((our) obj).a.a();
            case 7:
                return ((ouk) obj).g;
            case 8:
                return ((oue) obj).n;
            case 9:
                return ((oui) obj).a.n;
            case 10:
                int iAQ = a.aQ(((plp) obj).c);
                return (iAQ != 0 ? iAQ : 1) - 1;
            case 11:
                int i3 = ((pls) obj).b;
                int i4 = 2;
                if (i3 != 0) {
                    if (i3 == 1) {
                        i4 = 3;
                    } else if (i3 == 2) {
                        i4 = 4;
                    } else if (i3 != 10001) {
                        i4 = i3 != 10002 ? 0 : 10004;
                    } else {
                        i4 = 10003;
                    }
                }
                return pez.ad(i4 != 0 ? i4 : 1);
            case 12:
                int iAc = pez.ac(((plt) obj).c);
                return pez.ab(iAc != 0 ? iAc : 1);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                int iAc2 = pez.ac(((plt) obj).c);
                return pez.ab(iAc2 != 0 ? iAc2 : 1);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                throw null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                pnf pnfVarB = pnf.b(((png) obj).e);
                if (pnfVarB == null) {
                    pnfVarB = pnf.g;
                }
                return pnfVarB.a();
            case 16:
                return ((pmr) obj).a.h;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((pmq) obj).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((pzp) obj).t;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((qmy) obj).a.n;
            default:
                return ((qum) obj).f;
        }
    }
}
