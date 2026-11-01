package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dkj implements defpackage.aonj {
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        }
        java.util.List list = (java.util.List) obj;
        java.lang.Object obj2 = list.get(0);
        defpackage.dko dkoVar = defpackage.dkp.w;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.aooh.n(obj2, bool);
        defpackage.cqg cqgVar = obj2 != null ? (defpackage.cqg) dkoVar.a(obj2) : null;
        if (cqgVar == null) {
            defpackage.aooh.g();
        }
        java.lang.Object obj3 = list.get(1);
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        defpackage.dko dkoVar2 = defpackage.dkp.A;
        defpackage.aooh.n(obj3, bool);
        defpackage.dps dpsVar = obj3 != null ? (defpackage.dps) dkoVar2.a(obj3) : null;
        if (dpsVar == null) {
            defpackage.aooh.g();
        }
        java.lang.Object obj4 = list.get(2);
        defpackage.dnd dndVar = defpackage.dnd.a;
        defpackage.dnd dndVar2 = (defpackage.aooh.n(obj4, bool) || obj4 == null) ? null : (defpackage.dnd) defpackage.dkp.o.a(obj4);
        java.lang.Object obj5 = list.get(3);
        defpackage.dmw dmwVar = (defpackage.aooh.n(obj5, bool) || obj5 == null) ? null : (defpackage.dmw) defpackage.dkp.r.a(obj5);
        java.lang.Object obj6 = list.get(4);
        defpackage.dmx dmxVar = (defpackage.aooh.n(obj6, bool) || obj6 == null) ? null : (defpackage.dmx) defpackage.dkp.s.a(obj6);
        java.lang.Object obj7 = list.get(6);
        java.lang.String str = obj7 != null ? (java.lang.String) obj7 : null;
        java.lang.Object obj8 = list.get(7);
        defpackage.aooh.n(obj8, bool);
        defpackage.dps dpsVar2 = obj8 != null ? (defpackage.dps) dkoVar2.a(obj8) : null;
        if (dpsVar2 == null) {
            defpackage.aooh.g();
        }
        java.lang.Object obj9 = list.get(8);
        defpackage.dok dokVar = (defpackage.aooh.n(obj9, bool) || obj9 == null) ? null : (defpackage.dok) defpackage.dkp.p.a(obj9);
        java.lang.Object obj10 = list.get(9);
        defpackage.doz dozVar = (defpackage.aooh.n(obj10, bool) || obj10 == null) ? null : (defpackage.doz) defpackage.dkp.m.a(obj10);
        java.lang.Object obj11 = list.get(10);
        defpackage.dnx dnxVar = defpackage.dnx.a;
        defpackage.dnx dnxVar2 = (defpackage.aooh.n(obj11, bool) || obj11 == null) ? null : (defpackage.dnx) defpackage.dkp.t.a(obj11);
        java.lang.Object obj12 = list.get(11);
        defpackage.aooh.n(obj12, bool);
        defpackage.cqg cqgVar2 = obj12 != null ? (defpackage.cqg) dkoVar.a(obj12) : null;
        if (cqgVar2 == null) {
            defpackage.aooh.g();
        }
        java.lang.Object obj13 = list.get(12);
        defpackage.dou douVar = (defpackage.aooh.n(obj13, bool) || obj13 == null) ? null : (defpackage.dou) defpackage.dkp.l.a(obj13);
        java.lang.Object obj14 = list.get(13);
        defpackage.crc crcVar = (defpackage.aooh.n(obj14, bool) || obj14 == null) ? null : (defpackage.crc) defpackage.dkp.q.a(obj14);
        long j = cqgVar2.a;
        return new defpackage.dks(cqgVar.a, dpsVar.b, dndVar2, dmwVar, dmxVar, (defpackage.dmq) null, str, dpsVar2.b, dokVar, dozVar, dnxVar2, j, douVar, crcVar, 49184);
    }
}
