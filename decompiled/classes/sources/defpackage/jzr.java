package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/compose/data/CallLogPagingData");
    public final defpackage.jzy b;
    public final defpackage.kal c;
    public final defpackage.kab d;
    public final defpackage.kad e;
    public defpackage.jzt f;
    public final defpackage.aoxh g;
    public final defpackage.aozj h;
    public final defpackage.apnt i;
    private final defpackage.ojo j;
    private final defpackage.jzx k;
    private final defpackage.aoin l;
    private final defpackage.aoin m;
    private final defpackage.aoss n;
    private final defpackage.aolr o;
    private final int p;
    private final int q;
    private final defpackage.aoss r;
    private final defpackage.zjm s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [aoxh] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public jzr(defpackage.kgl kglVar, defpackage.kgl kglVar2, defpackage.jzy jzyVar, defpackage.kal kalVar, defpackage.apnt apntVar, defpackage.ojo ojoVar, defpackage.kab kabVar, defpackage.kad kadVar, defpackage.jzx jzxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zjm zjmVar, defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        int i;
        ?? r12;
        defpackage.aoxh aoxhVarAC;
        if (kglVar2 == null) {
            defpackage.aooh.i("callLogFilterStateHolder");
        }
        if (kalVar == null) {
            defpackage.aooh.i("realtimeDataRepository");
        }
        if (apntVar == null) {
            defpackage.aooh.i("callLogPagingSourceFactory");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = jzyVar;
        this.c = kalVar;
        this.i = apntVar;
        this.j = ojoVar;
        this.d = kabVar;
        this.e = kadVar;
        this.k = jzxVar;
        this.l = aoinVar;
        this.m = aoinVar2;
        this.s = zjmVar;
        this.n = aossVar;
        this.o = aolrVar;
        int iLongValue = (int) ((java.lang.Number) aoinVar.a()).longValue();
        this.p = iLongValue;
        int iLongValue2 = (int) ((java.lang.Number) aoinVar2.a()).longValue();
        this.q = iLongValue2;
        defpackage.aozj aozjVar = new defpackage.aozj(defpackage.aokc.a);
        this.h = aozjVar;
        defpackage.aoss aossVarP = defpackage.aosv.p(aossVar, aolrVar);
        this.r = aossVarP;
        defpackage.aoov.an(aossVarP, null, 0, new defpackage.edj(kglVar2, kglVar, this, (defpackage.aoln) null, 4), 3);
        defpackage.aokv aokvVar = new defpackage.aokv(10);
        android.net.Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
        defpackage.aooh.e(uri, "CONTENT_URI");
        aokvVar.add(new defpackage.fzh(new defpackage.gdc(new defpackage.aoxw(ojoVar.k(uri), 1), new defpackage.vvs(null, 1, null), 8), 2));
        j$.util.Optional optionalG = zjmVar.g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        if (optionalG == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.kgz kgzVar = (defpackage.kgz) optionalG.orElse((java.lang.Object) null);
        if (kgzVar != null) {
            i = 1;
            if (kgzVar.d) {
                android.net.Uri uri2 = abvv.a;
                aokvVar.add(new defpackage.edg(new defpackage.gdc(new defpackage.fzh(new defpackage.aoxn(new defpackage.aoxl(300L), new defpackage.aoxw(ojoVar.k(abvv.a), 1), null), 16), new defpackage.vvs(null, 1, null), 8), 4));
            }
        } else {
            i = 1;
        }
        defpackage.aoov.an(aossVar, null, 0, new defpackage.bur(aokvVar.f(), this, (defpackage.aoln) null, 14), 3);
        int i2 = i;
        java.lang.Object obj = new defpackage.rsr(new defpackage.gbr(iLongValue, 0, false, iLongValue2, 0, 54), (defpackage.aomy) new defpackage.jza(this, 2)).b;
        if (obj == null) {
            defpackage.aooh.i("<this>");
            defpackage.aooh.i("<this>");
        }
        defpackage.gdd gddVar = new defpackage.gdd((defpackage.aoln) null, aossVarP, i2);
        if (obj == null) {
            defpackage.aooh.i("<this>");
            r12 = 0;
        } else {
            r12 = obj;
        }
        defpackage.aoyt aoytVarAt = defpackage.aoov.at(new defpackage.gdc(new defpackage.gdc((defpackage.aonn) new defpackage.efl((defpackage.aoln) null, 2, (char[]) null), (defpackage.aoxh) new defpackage.fzh(new defpackage.aowy(new defpackage.fzn(defpackage.gfz.f(new defpackage.fzn(r12, gddVar, null, 2, null)), new defpackage.kkg(null, i2, null), (defpackage.aoln) null, 0)), i2), 7), new defpackage.fzb(null), 6), aossVarP, defpackage.aozb.b);
        defpackage.aozh aozhVar = kalVar.c;
        defpackage.aozh aozhVar2 = kadVar.b;
        defpackage.aozh aozhVar3 = kabVar.b;
        if (((java.lang.Boolean) jzxVar.b.a()).booleanValue()) {
            defpackage.aoxh aoxhVarA = defpackage.aoxo.a(new defpackage.fzh(aozjVar, 5));
            defpackage.jzv jzvVar = new defpackage.jzv((defpackage.aoln) null, jzxVar, 0);
            int i3 = defpackage.aoyc.a;
            aoxhVarAC = defpackage.aoov.aC(new defpackage.gdc((defpackage.aonn) new defpackage.jzm((defpackage.aoln) null, 2, (char[]) null), (defpackage.aoxh) new defpackage.apaa(jzvVar, aoxhVarA), 7), jzxVar.c);
        } else {
            aoxhVarAC = new defpackage.edg(defpackage.aojh.a, 13);
        }
        this.g = new defpackage.fzh(defpackage.aoov.aq(aoytVarAt, aozhVar, aozhVar2, aozhVar3, aoxhVarAC, new defpackage.jzq(this, null)), 3);
    }
}
