package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adlu implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;

    public /* synthetic */ adlu(defpackage.adlx adlxVar, java.util.Set set, boolean z, defpackage.adjz adjzVar, defpackage.ajct ajctVar, defpackage.adjl adjlVar, defpackage.apnt apntVar, defpackage.gat gatVar, int i) {
        this.$cid = i;
        this.b = adlxVar;
        this.c = set;
        this.a = z;
        this.d = adjzVar;
        this.e = ajctVar;
        this.f = adjlVar;
        this.h = apntVar;
        this.g = gatVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adli */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [ajct, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v2, types: [adjl] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [adlx] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [adlx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [adjl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws adli {
        defpackage.ajcq ajcqVarE;
        ?? r6;
        ?? r5;
        if (this.$cid != 0) {
            defpackage.adio adioVar = (defpackage.adio) obj;
            defpackage.ajxw ajxwVar = (defpackage.ajxw) this.b;
            ((defpackage.adhh) ajxwVar.a).a();
            defpackage.ahvr.ci(adioVar);
            java.lang.Object obj2 = this.f;
            defpackage.gat gatVar = (defpackage.gat) this.e;
            defpackage.adjz adjzVar = (defpackage.adjz) gatVar.e;
            defpackage.adhw adhwVar = (defpackage.adhw) obj2;
            adjzVar.l(adhwVar, adioVar.a);
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) this.h;
            com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest.e();
            if (versionedNameE != null) {
                adjzVar.m(adhwVar, versionedNameE);
            }
            if (this.a) {
                gatVar.t((java.io.File) this.c, defpackage.agab.ch(packManifest));
            }
            return gatVar.C(adhwVar, (defpackage.adhw) this.d, (defpackage.adhw) this.g, ajxwVar);
        }
        if (this.c.isEmpty()) {
            return defpackage.ajcm.a;
        }
        java.lang.Object obj3 = this.g;
        java.lang.Object obj4 = this.h;
        ?? r7 = this.f;
        ?? r8 = this.e;
        java.lang.Object obj5 = this.d;
        boolean z = this.a;
        java.lang.Object obj6 = this.b;
        ?? r3 = (defpackage.adlx) obj6;
        java.util.List list = r3.b;
        if (((defpackage.aike) list).d == 1) {
            ajcqVarE = r3.e((java.util.Collection) list.get(0), z, (defpackage.adjz) obj5, r8, r7, (defpackage.apnt) obj4, (defpackage.gat) obj3);
            r6 = r8;
            r5 = r7;
        } else {
            ?? r9 = r8;
            java.util.HashMap map = new java.util.HashMap();
            defpackage.ajcq ajcmVar = new defpackage.ajcm(new java.util.HashMap());
            defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
            ?? r4 = r3;
            ?? r10 = r7;
            while (ailkVarListIterator.hasNext()) {
                ?? r11 = r4;
                ?? r12 = r9;
                defpackage.ajcq ajcqVar = ajcmVar;
                ?? r13 = r10;
                adlw adlwVar = new adlw((defpackage.adlx) r11, ajcqVar, map, (defpackage.adjz) obj5, (java.util.Collection) ailkVarListIterator.next(), z, (defpackage.ajct) r12, (defpackage.adjl) r13, (defpackage.apnt) obj4, (defpackage.gat) obj3);
                r10 = r13;
                r4 = r11;
                int i = defpackage.ajan.c;
                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, adlwVar);
                ajcqVar.c(ajalVar, defpackage.aiql.t(r12, ajalVar));
                r9 = r12;
                ajcmVar = ajalVar;
                map = map;
            }
            java.util.HashMap map2 = map;
            ?? r14 = r9;
            defpackage.adfd adfdVar = new defpackage.adfd(map2, 2);
            int i2 = defpackage.ajan.c;
            defpackage.ajal ajalVar2 = new defpackage.ajal(ajcmVar, adfdVar);
            ajcmVar.c(ajalVar2, defpackage.aiql.t(r14, ajalVar2));
            ajcqVarE = ajalVar2;
            r5 = r10;
            r6 = r14;
        }
        defpackage.accg accgVar = new defpackage.accg(obj6, r5, r6, 2, null);
        int i3 = defpackage.ajan.c;
        defpackage.ajal ajalVar3 = new defpackage.ajal(ajcqVarE, accgVar);
        ajcqVarE.c(ajalVar3, defpackage.aiql.t(r6, ajalVar3));
        return ajalVar3;
    }

    public /* synthetic */ adlu(defpackage.gat gatVar, defpackage.ajxw ajxwVar, defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, boolean z, java.io.File file, defpackage.adhw adhwVar2, defpackage.adhw adhwVar3, int i) {
        this.$cid = i;
        this.e = gatVar;
        this.b = ajxwVar;
        this.f = adhwVar;
        this.h = packManifest;
        this.a = z;
        this.c = file;
        this.d = adhwVar2;
        this.g = adhwVar3;
    }
}
