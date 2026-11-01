package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phg {
    public static final aimz a = aimz.i("com/android/dialer/incall/cachedphonelookup/PhoneLookupCacheUpdater");
    public final defpackage.pgs b;
    public final swa c;
    public final aoin d;
    public final ajct e;
    public final defpackage.pqo f;
    public final defpackage.afpl g;
    private final aolr h;

    public phg(defpackage.afpl afplVar, defpackage.pqo pqoVar, defpackage.pgs pgsVar, swa swaVar, aoin aoinVar, ajct ajctVar, aolr aolrVar) {
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(pqoVar, "callDirection");
        aooh.f(pgsVar, "cachedPhoneLookup");
        aooh.f(swaVar, "phoneLookupCache");
        aooh.f(aoinVar, "enablePhoneLookupPrefetching");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aolrVar, "lightweightContext");
        this.g = afplVar;
        this.f = pqoVar;
        this.b = pgsVar;
        this.c = swaVar;
        this.d = aoinVar;
        this.e = ajctVar;
        this.h = aolrVar;
    }

    public final java.lang.Object a(aonj aonjVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.h, new defpackage.ryd(this, aonjVar, (aoln) null, 1), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }
}
