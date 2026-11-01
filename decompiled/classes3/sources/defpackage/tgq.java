package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgq {
    public static final aimz a = aimz.i("com/android/dialer/search/repository/SearchRepository");
    public final aolr b;
    public final ruc c;
    public final java.util.List d;
    public final java.util.Map e;
    public final java.util.Map f;
    private final aihd g;
    private final aozj h;

    public tgq(zzx zzxVar, aolr aolrVar, ruc rucVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(rucVar, "metrics");
        this.b = aolrVar;
        this.c = rucVar;
        aihd aihdVarE = zzxVar.e();
        this.g = aihdVarE;
        aooh.e(aihdVarE, "allDataSources");
        this.d = ajsz.bX(aihdVarE, new defpackage.qxq(10));
        aooh.e(aihdVarE, "allDataSources");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aihdVarE, 10)), 16));
        for (java.lang.Object obj : aihdVarE) {
            linkedHashMap.put(((defpackage.tel) obj).a(), obj);
        }
        this.e = linkedHashMap;
        aihd aihdVar = this.g;
        aooh.e(aihdVar, "allDataSources");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aihdVar, 10)), 16));
        for (java.lang.Object obj2 : aihdVar) {
            linkedHashMap2.put(((defpackage.tel) obj2).b(), obj2);
        }
        this.f = linkedHashMap2;
        aozj aozjVarA = aozk.a(new defpackage.tei("", 1, ""));
        this.h = aozjVarA;
        mkc mkcVar = new mkc((aoln) null, this, 5);
        int i = aoyc.a;
        aoov.aC(snl.aw(new apaa(mkcVar, aozjVarA)), this.b);
    }

    public final aoxh a(defpackage.tei teiVar, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.tel telVar = (defpackage.tel) it.next();
            gdc gdcVar = new gdc(telVar.c(teiVar), new mkc(telVar, (aoln) null, 4), 8);
            aoot aootVar = new aoot();
            aenj aenjVarC = aenj.c("SearchDataSource.", telVar.a());
            arrayList.add(new gdc(new defpackage.tgn(telVar, teiVar, (aoln) null, 0), new defpackage.yry((aoxh) new gdc(new gdc(new gdc(new roz(aootVar, this, (aoln) null, 12), gdcVar, 7), new defpackage.tkw(aootVar, this, aenjVarC, (aoln) null, 1), 12), new defpackage.tgp(aootVar, this, aenjVarC, null), 6), telVar, teiVar, 1), 7));
        }
        return arrayList.isEmpty() ? new edg(aokc.a, 13) : new edg((aoxh[]) ajsz.bZ(arrayList).toArray(new aoxh[0]), 6);
    }
}
