package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wyn {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl");
    public final defpackage.wxm b;
    public final defpackage.wvk c;
    public final android.content.Context d;
    public final nze e;
    public final ajcu f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    public final java.util.Map j = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentSkipListSet k = new java.util.concurrent.ConcurrentSkipListSet();
    public final java.util.concurrent.atomic.AtomicBoolean l = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final ahbv m;
    private final ajct n;
    private final aoin o;
    private final defpackage.wzx p;
    private final defpackage.rju q;

    public wyn(android.content.Context context, ajct ajctVar, ajcu ajcuVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, defpackage.wxm wxmVar, defpackage.rju rjuVar, defpackage.wvk wvkVar, ahbv ahbvVar, nze nzeVar, defpackage.wzx wzxVar) {
        this.d = context;
        this.n = ajctVar;
        this.f = ajcuVar;
        this.o = aoinVar;
        this.g = aoinVar2;
        this.b = wxmVar;
        this.q = rjuVar;
        this.c = wvkVar;
        this.m = ahbvVar;
        this.e = nzeVar;
        this.p = wzxVar;
        this.h = aoinVar3;
        this.i = aoinVar4;
    }

    public final ajcq a(defpackage.wxo wxoVar) {
        ajcq ajcqVarH;
        ajcq ajcqVarH2;
        if (wxoVar.b) {
            a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusiness", 130, "AtlasBusinessFinderImpl.java").v("atlas isn't available for incoming calls");
            return aiql.z(j$.util.Optional.empty());
        }
        if (this.l.get()) {
            a.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "isModelAvailable", 186, "AtlasBusinessFinderImpl.java").v("return cached model availability");
            ajcqVarH = aiql.z(java.lang.Boolean.TRUE);
        } else {
            ajcqVarH = ahrv.g(this.p.a()).h(new defpackage.wrn(this, 10), this.f);
        }
        ajcq ajcqVar = ajcqVarH;
        ahrv ahrvVarG = ahrv.g(this.q.j());
        defpackage.wro wroVar = new defpackage.wro(7);
        ajcu ajcuVar = this.f;
        ajcq ajcqVarH3 = ahrvVarG.h(wroVar, ajcuVar);
        java.lang.String str = wxoVar.a;
        boolean zContains = this.k.contains(str);
        aimz aimzVar = a;
        int i = 3;
        if (zContains) {
            aimzVar.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 202, "AtlasBusinessFinderImpl.java").v("found number in opted out numbers cache");
            ajcqVarH2 = aiql.z(j$.util.Optional.empty());
        } else {
            aimzVar.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 206, "AtlasBusinessFinderImpl.java").v("finding business in cache");
            java.util.Map map = this.j;
            if (map.containsKey(str)) {
                aimzVar.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 208, "AtlasBusinessFinderImpl.java").v("result found in cache");
                ajcqVarH2 = aiql.z((j$.util.Optional) map.get(str));
            } else {
                aimzVar.b().l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusinessMatchingPhoneNumber", 212, "AtlasBusinessFinderImpl.java").v("finding business from source of truth");
                ajcqVarH2 = ahvr.P(new defpackage.wwy(this, i), this.n).i(new defpackage.whr(this, str, 17), ajcuVar).i(new defpackage.whr(this, str, 18), ajcuVar).h(new wym(this, str, 2, (byte[]) null), ajcuVar);
            }
        }
        return ahrv.g(ahvr.ak(new ajcq[]{ajcqVarH3, ajcqVarH2, ajcqVar}).o(new kxy(this, ajcqVarH3, wxoVar, ajcqVar, ajcqVarH2, 9), ajcuVar)).j(((java.lang.Long) this.o.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.lang.Throwable.class, new wym(this, wxoVar, 0), ajcuVar);
    }
}
