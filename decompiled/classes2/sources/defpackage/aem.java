package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aem implements aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aem(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.bkn bknVar;
        defpackage.bkn bknVar2;
        defpackage.bkn bknVar3;
        defpackage.bkn bknVar4;
        defpackage.bkn bknVar5;
        defpackage.bkn bknVar6;
        switch (this.$cid) {
            case 0:
                long j = ((dpp) obj).a;
                return new dpd(dpe.l((int) (j >> 32), (int) (j & 4294967295L)));
            case 1:
                return (dpd) obj2;
            case 2:
                ajl ajlVar = aen.a;
                return aen.a;
            case 3:
                return java.lang.Integer.valueOf(((defpackage.aon) obj2).c());
            case 4:
                ((java.lang.Integer) obj2).intValue();
                return new defpackage.bbl(1L);
            case 5:
                defpackage.bcl bclVar = (defpackage.bcl) obj2;
                ckb ckbVar = defpackage.bcl.a;
                java.util.List listAsList = java.util.Arrays.asList(java.lang.Integer.valueOf(bclVar.b()), java.lang.Integer.valueOf(bclVar.c()));
                aooh.e(listAsList, "asList(...)");
                return listAsList;
            case 6:
                boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                defpackage.bko bkoVarF = ((defpackage.bke) obj).f();
                if (bkoVarF != null) {
                    return zBooleanValue ? new defpackage.bko(bkoVarF.b, bkoVarF.a, true) : bkoVarF;
                }
                return null;
            case 7:
                return java.lang.Long.valueOf(((defpackage.blz) obj2).d.get());
            case 8:
                cjs cjsVar = (cjs) obj;
                defpackage.bmb bmbVar = (defpackage.bmb) obj2;
                java.util.List list = (java.util.List) bmbVar.c.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(dji.a.b(cjsVar, (dji) list.get(i)));
                }
                defpackage.bko bkoVarA = bmbVar.a();
                java.lang.Integer numValueOf = (bkoVarA == null || (bknVar6 = bkoVarA.a) == null) ? null : java.lang.Integer.valueOf(bknVar6.a);
                defpackage.bko bkoVarA2 = bmbVar.a();
                java.lang.Long lValueOf = (bkoVarA2 == null || (bknVar5 = bkoVarA2.a) == null) ? null : java.lang.Long.valueOf(bknVar5.b);
                defpackage.bko bkoVarA3 = bmbVar.a();
                java.lang.String strC = (bkoVarA3 == null || (bknVar4 = bkoVarA3.a) == null) ? null : defpackage.dpm.c(bknVar4.c);
                defpackage.bko bkoVarA4 = bmbVar.a();
                java.lang.Integer numValueOf2 = (bkoVarA4 == null || (bknVar3 = bkoVarA4.b) == null) ? null : java.lang.Integer.valueOf(bknVar3.a);
                defpackage.bko bkoVarA5 = bmbVar.a();
                java.lang.Long lValueOf2 = (bkoVarA5 == null || (bknVar2 = bkoVarA5.b) == null) ? null : java.lang.Long.valueOf(bknVar2.b);
                defpackage.bko bkoVarA6 = bmbVar.a();
                java.lang.String strC2 = (bkoVarA6 == null || (bknVar = bkoVarA6.b) == null) ? null : defpackage.dpm.c(bknVar.c);
                defpackage.bko bkoVarA7 = bmbVar.a();
                return ajsz.bb(new java.lang.Object[]{arrayList, numValueOf, lValueOf, strC, numValueOf2, lValueOf2, strC2, bkoVarA7 != null ? java.lang.Boolean.valueOf(bkoVarA7.c) : null});
            case 9:
                return anar.p(obj, obj2);
            case 10:
                return anar.p(obj, obj2);
            case 11:
                return anar.p(obj, obj2);
            case 12:
                return anar.p(obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return anar.p(obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return anar.p(obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return anar.p(obj, obj2);
            case 16:
                return anar.p(obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return anar.p(obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.bsh bshVar = (defpackage.bsh) obj2;
                return ajsz.bb(new java.lang.Integer[]{java.lang.Integer.valueOf(bshVar.a()), java.lang.Integer.valueOf(bshVar.b())});
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((defpackage.btt) obj2).c();
            default:
                return aojh.a;
        }
    }
}
