package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dcx implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ dcx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object douVar;
        dksVar = null;
        defpackage.dks dksVar = null;
        switch (this.$cid) {
            case 0:
                defpackage.dbk dbkVar = (defpackage.dbk) obj;
                if (dbkVar.al()) {
                    dbkVar.I();
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.dbk dbkVar2 = (defpackage.dbk) obj;
                if (dbkVar2.al()) {
                    dbkVar2.W(false, true, true);
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.dbk dbkVar3 = (defpackage.dbk) obj;
                if (dbkVar3.al()) {
                    dbkVar3.V(false);
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.dbk dbkVar4 = (defpackage.dbk) obj;
                if (dbkVar4.al()) {
                    dbkVar4.V(false);
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.dbk dbkVar5 = (defpackage.dbk) obj;
                if (dbkVar5.al()) {
                    dbkVar5.T(false);
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.dbk dbkVar6 = (defpackage.dbk) obj;
                if (dbkVar6.al()) {
                    dbkVar6.T(false);
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((android.content.Context) defpackage.den.aa((defpackage.cje) obj, defpackage.dep.b)).getResources().getConfiguration();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cje cjeVar = (defpackage.cje) obj;
                defpackage.den.aa(cjeVar, defpackage.dep.a);
                return ((android.content.Context) defpackage.den.aa(cjeVar, defpackage.dep.b)).getResources();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.dnw) defpackage.ajsz.bD((java.lang.Iterable) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.k));
            case 9:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).P();
            case 10:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).R();
            case 11:
                return java.lang.Boolean.valueOf(defpackage.dfb.b(obj));
            case 12:
                int i = defpackage.djj.a;
                return java.lang.Boolean.valueOf(!(((defpackage.djd) obj) instanceof defpackage.dkd));
            case 13:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                }
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(1);
                java.util.List list2 = (defpackage.aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (java.util.List) defpackage.dkp.b.a(obj2);
                java.lang.Object obj3 = list.get(0);
                java.lang.String str = obj3 != null ? (java.lang.String) obj3 : null;
                if (str == null) {
                    defpackage.aooh.g();
                }
                return new defpackage.dji(list2, str);
            case 14:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                }
                java.util.List list3 = (java.util.List) obj;
                java.lang.Object obj4 = list3.get(0);
                defpackage.ckb ckbVar = defpackage.dkp.j;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                defpackage.dks dksVar2 = (defpackage.aooh.n(obj4, bool) || obj4 == null) ? null : (defpackage.dks) ckbVar.a(obj4);
                java.lang.Object obj5 = list3.get(1);
                defpackage.dks dksVar3 = (defpackage.aooh.n(obj5, bool) || obj5 == null) ? null : (defpackage.dks) ckbVar.a(obj5);
                java.lang.Object obj6 = list3.get(2);
                defpackage.dks dksVar4 = (defpackage.aooh.n(obj6, bool) || obj6 == null) ? null : (defpackage.dks) ckbVar.a(obj6);
                java.lang.Object obj7 = list3.get(3);
                if (!defpackage.aooh.n(obj7, bool) && obj7 != null) {
                    dksVar = (defpackage.dks) ckbVar.a(obj7);
                }
                return new dkx(dksVar2, dksVar3, dksVar4, dksVar);
            case 15:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                }
                douVar = new defpackage.dou(((java.lang.Integer) obj).intValue());
                break;
            case 16:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                }
                java.util.List list4 = (java.util.List) obj;
                douVar = new defpackage.doz(((java.lang.Number) list4.get(0)).floatValue(), ((java.lang.Number) list4.get(1)).floatValue());
                break;
            case 17:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
                java.util.List list5 = (java.util.List) obj;
                java.lang.Object obj8 = list5.get(0);
                defpackage.dpt[] dptVarArr = defpackage.dps.a;
                defpackage.dko dkoVar = defpackage.dkp.A;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                defpackage.aooh.n(obj8, bool2);
                defpackage.dps dpsVar = obj8 != null ? (defpackage.dps) dkoVar.a(obj8) : null;
                if (dpsVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj9 = list5.get(1);
                defpackage.aooh.n(obj9, bool2);
                defpackage.dps dpsVar2 = obj9 != null ? (defpackage.dps) dkoVar.a(obj9) : null;
                if (dpsVar2 == null) {
                    defpackage.aooh.g();
                }
                douVar = new defpackage.dpa(dpsVar.b, dpsVar2.b);
                break;
            case 18:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                }
                douVar = new defpackage.dnd(((java.lang.Integer) obj).intValue());
                break;
            case 19:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.Float");
                }
                return new defpackage.dok(((java.lang.Float) obj).floatValue());
            default:
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
                java.util.List list6 = (java.util.List) obj;
                java.lang.Object obj10 = list6.get(0);
                defpackage.dko dkoVar2 = defpackage.dkp.w;
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                defpackage.aooh.n(obj10, bool3);
                defpackage.cqg cqgVar = obj10 != null ? (defpackage.cqg) dkoVar2.a(obj10) : null;
                if (cqgVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj11 = list6.get(1);
                defpackage.dko dkoVar3 = defpackage.dkp.C;
                defpackage.aooh.n(obj11, bool3);
                defpackage.cpm cpmVar = obj11 != null ? (defpackage.cpm) dkoVar3.a(obj11) : null;
                if (cpmVar == null) {
                    defpackage.aooh.g();
                }
                java.lang.Object obj12 = list6.get(2);
                java.lang.Float f = obj12 != null ? (java.lang.Float) obj12 : null;
                if (f == null) {
                    defpackage.aooh.g();
                }
                return new defpackage.crc(cqgVar.a, cpmVar.a, f.floatValue());
        }
        return douVar;
    }
}
