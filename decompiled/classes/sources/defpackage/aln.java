package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aln implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aln(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object dpnVar;
        java.lang.Object aitVar;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                defpackage.ait aitVar2 = (defpackage.ait) obj;
                dpnVar = new defpackage.dpn((((long) java.lang.Math.round(aitVar2.a)) << 32) | (((long) java.lang.Math.round(aitVar2.b)) & 4294967295L));
                return dpnVar;
            case 1:
                long j = ((defpackage.dpn) obj).a;
                aitVar = new defpackage.ait((int) (j >> 32), (int) (j & 4294967295L));
                return aitVar;
            case 2:
                long j2 = ((defpackage.dpp) obj).a;
                aitVar = new defpackage.ait((int) (j2 >> 32), (int) (j2 & 4294967295L));
                return aitVar;
            case 3:
                defpackage.ait aitVar3 = (defpackage.ait) obj;
                int iRound = java.lang.Math.round(aitVar3.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = java.lang.Math.round(aitVar3.b);
                aitVar = new defpackage.dpp((((long) iRound) << 32) | ((long) (iRound2 >= 0 ? iRound2 : 0)));
                return aitVar;
            case 4:
                defpackage.cpn cpnVar = (defpackage.cpn) obj;
                dpnVar = new defpackage.aiv(cpnVar.b, cpnVar.c, cpnVar.d, cpnVar.e);
                return dpnVar;
            case 5:
                defpackage.aiv aivVar = (defpackage.aiv) obj;
                return new defpackage.cpn(aivVar.a, aivVar.b, aivVar.c, aivVar.d);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Float.valueOf(((defpackage.ais) obj).a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cje cjeVar = (defpackage.cje) obj;
                defpackage.cbd cbdVar = defpackage.aoj.a;
                int i = defpackage.amp.a;
                android.content.Context context = (android.content.Context) defpackage.den.aa(cjeVar, defpackage.dep.b);
                defpackage.dpf dpfVar = (defpackage.dpf) defpackage.den.aa(cjeVar, defpackage.dfo.e);
                defpackage.aoh aohVar = (defpackage.aoh) defpackage.den.aa(cjeVar, defpackage.aoi.a);
                if (aohVar == null) {
                    return null;
                }
                return new defpackage.amo(context, dpfVar, aohVar.b);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                cvu cvuVar = (cvu) obj;
                if (cvuVar != null && cvuVar.a == 2) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                defpackage.aqb aqbVar = defpackage.aqd.a;
                return !((android.content.Context) defpackage.den.aa((defpackage.cje) obj, defpackage.dep.b)).getPackageManager().hasSystemFeature("android.software.leanback") ? defpackage.aqa.b : defpackage.aqd.a;
            case 10:
                return defpackage.aojh.a;
            case 11:
                return defpackage.aojh.a;
            case 12:
                java.util.List list = (java.util.List) obj;
                return new defpackage.bbh(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
            case 13:
                defpackage.dip dipVar = defpackage.din.e;
                aitVar = defpackage.aojh.a;
                ((defpackage.diq) obj).a(dipVar, aitVar);
                return aitVar;
            case 14:
                return defpackage.aojh.a;
            case 15:
                ((defpackage.diq) obj).a(defpackage.din.A, new defpackage.dib(0));
                return defpackage.aojh.a;
            case 16:
                defpackage.boc bocVar = defpackage.boq.a;
                ((defpackage.diq) obj).a(defpackage.din.A, new defpackage.dib(1));
                return defpackage.aojh.a;
            case 17:
                defpackage.cbd cbdVar2 = defpackage.bsw.a;
                return new defpackage.bsu();
            case 18:
                return defpackage.aojh.a;
            case 19:
                defpackage.aomy aomyVar = ((ccq) obj).a;
                if (aomyVar != null) {
                    aomyVar.a();
                }
                return defpackage.aojh.a;
            default:
                return java.lang.Boolean.valueOf(((java.util.Map) obj).isEmpty());
        }
    }
}
