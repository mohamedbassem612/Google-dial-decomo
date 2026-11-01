package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adlw implements ajat {
    public final /* synthetic */ adlx a;
    public final /* synthetic */ ajcq b;
    public final /* synthetic */ java.util.Map c;
    public final /* synthetic */ adjz d;
    public final /* synthetic */ java.util.Collection e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ajct g;
    public final /* synthetic */ adjl h;
    public final /* synthetic */ gat i;
    public final /* synthetic */ apnt j;

    public /* synthetic */ adlw(adlx adlxVar, ajcq ajcqVar, java.util.Map map, adjz adjzVar, java.util.Collection collection, boolean z, ajct ajctVar, adjl adjlVar, apnt apntVar, gat gatVar) {
        this.a = adlxVar;
        this.b = ajcqVar;
        this.c = map;
        this.d = adjzVar;
        this.e = collection;
        this.f = z;
        this.g = ajctVar;
        this.h = adjlVar;
        this.j = apntVar;
        this.i = gatVar;
    }

    public final ajcq a(java.lang.Object obj) {
        adlx adlxVar = this.a;
        java.util.Map map = (java.util.Map) obj;
        if (adlxVar.d) {
            ajcq ajcqVar = this.b;
            aiof aiofVar = adhn.a;
            ajcqVar.cancel(false);
            return aiql.z(new java.util.HashMap());
        }
        this.c.putAll(map);
        java.util.Set setKeySet = map.keySet();
        aiof aiofVar2 = adhn.a;
        setKeySet.size();
        java.util.Iterator it = setKeySet.iterator();
        while (true) {
            adjz adjzVar = this.d;
            if (!it.hasNext()) {
                gat gatVar = this.i;
                apnt apntVar = this.j;
                adjl adjlVar = this.h;
                ajct ajctVar = this.g;
                return adlxVar.e(this.e, this.f, adjzVar, ajctVar, adjlVar, apntVar, gatVar);
            }
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) it.next();
            adhw adhwVarP = packManifest.p();
            adhw adhwVarB = adho.b(adhwVarP);
            adhw adhwVarA = adho.a(adhwVarP, packManifest.l());
            java.util.Set set = adlxVar.c;
            if (!set.contains(adhwVarB)) {
                adjzVar.p(adhwVarB);
            }
            if (!set.contains(adhwVarA)) {
                adjzVar.p(adhwVarA);
            }
        }
    }
}
