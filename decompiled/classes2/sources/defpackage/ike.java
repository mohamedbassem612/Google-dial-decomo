package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ike extends aomh implements aonn {
    int a;
    final /* synthetic */ igs b;
    final /* synthetic */ defpackage.ikj c;
    final /* synthetic */ ifv d;
    final /* synthetic */ ifz e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ defpackage.igg g;
    final /* synthetic */ defpackage.igp h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ike(igs igsVar, defpackage.ikj ikjVar, ifv ifvVar, ifz ifzVar, java.lang.String str, defpackage.igg iggVar, defpackage.igp igpVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = igsVar;
        this.c = ikjVar;
        this.d = ifvVar;
        this.e = ifzVar;
        this.f = str;
        this.g = iggVar;
        this.h = igpVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoss aossVar = (aoss) this.i;
            alat alatVar = this.b.c;
            aooh.e(alatVar, "getModelConfigList(...)");
            defpackage.ikj ikjVar = this.c;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(alatVar, 10)), 16));
            for (java.lang.Object obj2 : alatVar) {
                linkedHashMap.put(obj2, (defpackage.ijw) ikjVar.c.get(igq.a(((defpackage.igr) obj2).b)));
            }
            java.util.Set setEntrySet = linkedHashMap.entrySet();
            ifv ifvVar = this.d;
            ifz ifzVar = this.e;
            java.lang.String str = this.f;
            defpackage.igg iggVar = this.g;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(setEntrySet, 10));
            java.util.Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                arrayList.add(aoov.am(aossVar, 0, new defpackage.buj((java.util.Map.Entry) it.next(), ifvVar, ifzVar, str, iggVar, (aoln) null, 3), 3));
            }
            this.a = 1;
            obj = aooh.v(arrayList, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.igp igpVar = this.h;
        java.util.List list = (java.util.List) obj;
        defpackage.hgw hgwVarK = defpackage.hht.k(defpackage.igx.a.m());
        akzx akzxVar = (akzx) hgwVarK.a;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.igx) akzxVar.b).c);
        aooh.e(listUnmodifiableList, "getIndividualModelStartResultsList(...)");
        new alct(listUnmodifiableList);
        aooh.f(list, "values");
        akzxVar.u();
        defpackage.igx igxVar = (defpackage.igx) akzxVar.b;
        alat alatVar2 = igxVar.c;
        if (!alatVar2.c()) {
            igxVar.c = alad.J(alatVar2);
        }
        akyl.i(list, igxVar.c);
        if (igpVar != null) {
            hgwVarK.s(igpVar);
        }
        return hgwVarK.r();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ike ikeVar = new defpackage.ike(this.b, this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
        ikeVar.i = obj;
        return ikeVar;
    }
}
