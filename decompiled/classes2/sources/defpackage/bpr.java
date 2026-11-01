package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bpr implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bpr(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        acm acmVar;
        int i = this.$cid;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(1.0f);
        int i2 = 0;
        switch (i) {
            case 0:
                return pf.k((diq) obj);
            case 1:
                boc bocVar = boq.a;
                return pf.k((diq) obj);
            case 2:
                return pf.k((diq) obj);
            case 3:
                int i3 = defpackage.bqg.a;
                return aojh.a;
            case 4:
                defpackage.brk brkVar = (defpackage.brk) obj;
                defpackage.byq[] byqVarArr = new defpackage.byq[3];
                byqVarArr[0] = defpackage.bys.a;
                byqVarArr[1] = defpackage.bys.b;
                dpo dpoVar = brkVar.a;
                int iA = dpn.a(dpoVar.c());
                long j = brkVar.b;
                byqVarArr[2] = iA < ((int) (j >> 32)) / 2 ? defpackage.bys.c : defpackage.bys.d;
                java.util.List listBb = ajsz.bb(byqVarArr);
                long j2 = brkVar.c >> 32;
                dpq dpqVar = brkVar.d;
                acmVar = new acm(listBb.size());
                int size = listBb.size();
                while (i2 < size) {
                    acmVar.f(((defpackage.byq) listBb.get(i2)).a(dpoVar, j, (int) j2, dpqVar));
                    i2++;
                }
                break;
            case 5:
                defpackage.brk brkVar2 = (defpackage.brk) obj;
                defpackage.byr[] byrVarArr = new defpackage.byr[4];
                byrVarArr[0] = defpackage.bys.e;
                byrVarArr[1] = defpackage.bys.f;
                byrVarArr[2] = defpackage.bys.g;
                dpo dpoVar2 = brkVar2.a;
                int iB = dpn.b(dpoVar2.c());
                long j3 = brkVar2.b;
                byrVarArr[3] = iB < ((int) (j3 & 4294967295L)) / 2 ? defpackage.bys.h : defpackage.bys.i;
                java.util.List listBb2 = ajsz.bb(byrVarArr);
                long j4 = brkVar2.c & 4294967295L;
                acmVar = new acm(listBb2.size());
                int size2 = listBb2.size();
                while (i2 < size2) {
                    acmVar.f(((defpackage.byr) listBb2.get(i2)).a(dpoVar2, j3, (int) j4));
                    i2++;
                }
                break;
            case 6:
                int i4 = defpackage.brj.a;
                return pf.k((diq) obj);
            case 7:
                return java.lang.Boolean.TRUE;
            case 8:
                return pf.j((diq) obj);
            case 9:
                dfb.c((diq) obj);
                return aojh.a;
            case 10:
                java.util.List list = (java.util.List) obj;
                defpackage.bsh bshVar = new defpackage.bsh();
                bshVar.c(((java.lang.Number) list.get(0)).intValue());
                bshVar.d(((java.lang.Number) list.get(1)).intValue());
                return bshVar;
            case 11:
                aogy aogyVar = (aogy) obj;
                ajb ajbVar = defpackage.bsn.a;
                aogyVar.a = 1750;
                aogyVar.n(fValueOf, 0).b = defpackage.bsn.a;
                aogyVar.n(fValueOf2, 1000);
                return aojh.a;
            case 12:
                aogy aogyVar2 = (aogy) obj;
                ajb ajbVar2 = defpackage.bsn.a;
                aogyVar2.a = 1750;
                aogyVar2.n(fValueOf, 250).b = defpackage.bsn.a;
                aogyVar2.n(fValueOf2, 1250);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aogy aogyVar3 = (aogy) obj;
                ajb ajbVar3 = defpackage.bsn.a;
                aogyVar3.a = 6000;
                aogyVar3.n(java.lang.Float.valueOf(0.87f), 3000).b = defpackage.bsn.b;
                aogyVar3.n(java.lang.Float.valueOf(0.1f), 6000);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aogy aogyVar4 = (aogy) obj;
                ajb ajbVar4 = defpackage.bsn.a;
                aogyVar4.a = 6000;
                java.lang.Float fValueOf3 = java.lang.Float.valueOf(90.0f);
                aogyVar4.n(fValueOf3, 300).b = new ajb(0.05f, 0.7f, 0.1f, 1.0f);
                aogyVar4.n(fValueOf3, 1500);
                java.lang.Float fValueOf4 = java.lang.Float.valueOf(180.0f);
                aogyVar4.n(fValueOf4, 1800);
                aogyVar4.n(fValueOf4, 3000);
                java.lang.Float fValueOf5 = java.lang.Float.valueOf(270.0f);
                aogyVar4.n(fValueOf5, 3300);
                aogyVar4.n(fValueOf5, 4500);
                java.lang.Float fValueOf6 = java.lang.Float.valueOf(360.0f);
                aogyVar4.n(fValueOf6, 4800);
                aogyVar4.n(fValueOf6, 6000);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aogy aogyVar5 = (aogy) obj;
                ajb ajbVar5 = defpackage.bsn.a;
                aogyVar5.a = 1750;
                aogyVar5.n(fValueOf, 650).b = defpackage.bsn.a;
                aogyVar5.n(fValueOf2, 1500);
                return aojh.a;
            case 16:
                aogy aogyVar6 = (aogy) obj;
                ajb ajbVar6 = defpackage.bsn.a;
                aogyVar6.a = 1750;
                aogyVar6.n(fValueOf, 900).b = defpackage.bsn.a;
                aogyVar6.n(fValueOf2, 1750);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int i5 = defpackage.bto.a;
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i6 = defpackage.bto.a;
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.bvf bvfVar = defpackage.bvf.a;
                return pf.k((diq) obj);
            default:
                defpackage.bvf bvfVar2 = defpackage.bvf.a;
                return pf.k((diq) obj);
        }
        return acmVar;
    }
}
