package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ihd implements alal {
    private final /* synthetic */ int $cid;

    public ihd(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(int i) {
        ypp yppVar = null;
        switch (this.$cid) {
            case 0:
                switch (i) {
                    case 0:
                        yppVar = ihe.a;
                        break;
                    case 1:
                        yppVar = ihe.b;
                        break;
                    case 2:
                        yppVar = ihe.c;
                        break;
                    case 3:
                        yppVar = ihe.d;
                        break;
                    case 4:
                        yppVar = ihe.e;
                        break;
                    case 5:
                        yppVar = ihe.f;
                        break;
                    case 6:
                        yppVar = ihe.g;
                        break;
                    case 7:
                        yppVar = ihe.h;
                        break;
                    case 8:
                        yppVar = ihe.i;
                        break;
                }
                if (yppVar == null) {
                    return ihe.j;
                }
                return yppVar;
            case 1:
                ifv ifvVarB = ifv.b(i);
                return ifvVarB == null ? ifv.j : ifvVarB;
            case 2:
                defpackage.jvw jvwVarB = defpackage.jvw.b(i);
                return jvwVarB == null ? defpackage.jvw.UNKNOWN : jvwVarB;
            case 3:
                defpackage.jxd jxdVarB = defpackage.jxd.b(i);
                return jxdVarB == null ? defpackage.jxd.UNDEFINED : jxdVarB;
            case 4:
                defpackage.lln llnVarB = defpackage.lln.b(i);
                if (llnVarB != null) {
                    return llnVarB;
                }
                return defpackage.lln.UNKNOWN_ACTION;
            case 5:
                ampc ampcVarB = ampc.b(i);
                return ampcVarB == null ? ampc.a : ampcVarB;
            case 6:
                defpackage.lln llnVarB2 = defpackage.lln.b(i);
                if (llnVarB2 != null) {
                    return llnVarB2;
                }
                return defpackage.lln.UNKNOWN_ACTION;
            case 7:
                defpackage.lll lllVarB = defpackage.lll.b(i);
                if (lllVarB != null) {
                    return lllVarB;
                }
                return defpackage.lll.UNSET;
            case 8:
                defpackage.lll lllVarB2 = defpackage.lll.b(i);
                if (lllVarB2 != null) {
                    return lllVarB2;
                }
                return defpackage.lll.UNSET;
            case 9:
                defpackage.lll lllVarB3 = defpackage.lll.b(i);
                if (lllVarB3 != null) {
                    return lllVarB3;
                }
                return defpackage.lll.UNSET;
            case 10:
                if (i == 0) {
                    yppVar = defpackage.njf.UNKNOWN_ACTION;
                } else if (i == 1) {
                    yppVar = defpackage.njf.END_CALL;
                } else if (i == 2) {
                    yppVar = defpackage.njf.REPORT_SPAM;
                } else if (i == 3) {
                    yppVar = defpackage.njf.PLAY_DTMF_TONE;
                } else if (i == 4) {
                    yppVar = defpackage.njf.ASK_FOR_CONSENT_FOR_AI_REPLIES;
                }
                if (yppVar == null) {
                    return defpackage.njf.UNRECOGNIZED;
                }
                return yppVar;
            case 11:
                if (i == 0) {
                    yppVar = ypp.a;
                } else if (i == 1) {
                    yppVar = ypp.b;
                } else if (i == 2) {
                    yppVar = ypp.c;
                }
                if (yppVar == null) {
                    return ypp.d;
                }
                return yppVar;
            case 12:
                zty ztyVarB = zty.b(i);
                return ztyVarB == null ? zty.a : ztyVarB;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ztx ztxVarB = ztx.b(i);
                return ztxVarB == null ? ztx.a : ztxVarB;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.nvp nvpVarB = defpackage.nvp.b(i);
                if (nvpVarB != null) {
                    return nvpVarB;
                }
                return defpackage.nvp.EVENT_UNKNOWN;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.nvp nvpVarB2 = defpackage.nvp.b(i);
                if (nvpVarB2 != null) {
                    return nvpVarB2;
                }
                return defpackage.nvp.EVENT_UNKNOWN;
            case 16:
                akie akieVarB = akie.b(i);
                return akieVarB == null ? akie.a : akieVarB;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                akhx akhxVarB = akhx.b(i);
                return akhxVarB == null ? akhx.a : akhxVarB;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                akgw akgwVarB = akgw.b(i);
                return akgwVarB == null ? akgw.a : akgwVarB;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ammm ammmVarB = ammm.b(i);
                return ammmVarB == null ? ammm.a : ammmVarB;
            default:
                akte akteVarB = akte.b(i);
                return akteVarB == null ? akte.a : akteVarB;
        }
    }
}
