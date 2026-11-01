package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class cmp implements aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cmp(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.StringBuilder sb = (java.lang.StringBuilder) obj;
                cmu cmuVar = (cmu) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(cmuVar);
                return sb;
            case 1:
                return anar.q(obj, obj2);
            case 2:
                die dieVar = ((dij) obj).b;
                aonn aonnVar = defpackage.dis.a;
                dip dipVar = din.u;
                return java.lang.Integer.valueOf(java.lang.Float.compare(((java.lang.Number) dieVar.d(dipVar, new defpackage.bmt(13))).floatValue(), ((java.lang.Number) ((dij) obj2).b.d(dipVar, new defpackage.bmt(14))).floatValue()));
            case 3:
                dkg dkgVar = (dkg) obj2;
                return ajsz.ba(new java.lang.Object[]{java.lang.Boolean.valueOf(dkgVar.a), dkp.a(new djq(dkgVar.b), defpackage.dkr.b, (cjs) obj)});
            case 4:
                return java.lang.Integer.valueOf(((djq) obj2).a);
            case 5:
                return java.lang.Integer.valueOf(((doo) obj2).a);
            case 6:
                dpc dpcVar = (dpc) obj2;
                return ajsz.ba(new java.lang.Object[]{dkp.a(new dpb(dpcVar.b), defpackage.dkr.e, (cjs) obj), java.lang.Boolean.valueOf(dpcVar.c)});
            case 7:
                return java.lang.Integer.valueOf(((dpb) obj2).a);
            case 8:
                defpackage.dqi.c((dbk) obj).o((aonj) obj2);
                return aojh.a;
            case 9:
                defpackage.dqi.c((dbk) obj).n((aonj) obj2);
                return aojh.a;
            case 10:
                defpackage.dqi.c((dbk) obj).o((aonj) obj2);
                return aojh.a;
            case 11:
                defpackage.dqi.c((dbk) obj).n((aonj) obj2);
                return aojh.a;
            case 12:
                cmw cmwVar = (cmw) obj2;
                defpackage.dqc dqcVarC = defpackage.dqi.c((dbk) obj);
                if (cmwVar != dqcVarC.i) {
                    dqcVarC.i = cmwVar;
                    aonj aonjVar = dqcVarC.j;
                    if (aonjVar != null) {
                        aonjVar.a(cmwVar);
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                dpf dpfVar = (dpf) obj2;
                defpackage.dqc dqcVarC2 = defpackage.dqi.c((dbk) obj);
                if (dpfVar != dqcVarC2.k) {
                    dqcVarC2.k = dpfVar;
                    aonj aonjVar2 = dqcVarC2.l;
                    if (aonjVar2 != null) {
                        aonjVar2.a(dpfVar);
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                emx emxVar = (emx) obj2;
                defpackage.dqc dqcVarC3 = defpackage.dqi.c((dbk) obj);
                if (emxVar != dqcVarC3.m) {
                    dqcVarC3.m = emxVar;
                    dzo.l(dqcVarC3, emxVar);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                gii giiVar = (gii) obj2;
                defpackage.dqc dqcVarC4 = defpackage.dqi.c((dbk) obj);
                if (giiVar != dqcVarC4.n) {
                    dqcVarC4.n = giiVar;
                    dzk.O(dqcVarC4, giiVar);
                }
                return aojh.a;
            case 16:
                defpackage.dqc dqcVarC5 = defpackage.dqi.c((dbk) obj);
                int iOrdinal = ((dpq) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new aois();
                    }
                    i = 1;
                }
                dqcVarC5.setLayoutDirection(i);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.dqc dqcVarC6 = defpackage.dqi.c((dbk) obj);
                dqcVarC6.A = (aonj) obj2;
                dqcVarC6.g = new defpackage.dqk(dqcVarC6, 4);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return anar.p(obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return anar.p(obj, obj2);
            default:
                return ((defpackage.yz) obj2).a;
        }
    }
}
