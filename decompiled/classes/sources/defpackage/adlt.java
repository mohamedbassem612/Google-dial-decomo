package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adlt {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    public final java.lang.Object l;

    public adlt(defpackage.adjz adjzVar, defpackage.adhu adhuVar, defpackage.adhu adhuVar2, defpackage.adhu adhuVar3, defpackage.ajct ajctVar, defpackage.adjl adjlVar, defpackage.adgy adgyVar, defpackage.aify aifyVar) {
        this.h = new java.util.HashMap();
        this.i = new java.util.HashMap();
        this.b = adjzVar;
        this.c = adhuVar;
        this.d = adhuVar2;
        this.e = adhuVar3;
        this.a = ajctVar;
        this.f = adjlVar;
        this.l = adgyVar;
        defpackage.apnt apntVar = new defpackage.apnt(this);
        this.j = apntVar;
        this.g = new defpackage.gat(adjzVar, ajctVar, apntVar);
        this.k = aifyVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    private final synchronized defpackage.adlx o(java.lang.String str, defpackage.adlx adlxVar) {
        defpackage.adlx adlxVar2;
        ?? r0 = this.h;
        adlxVar2 = (defpackage.adlx) r0.get(str);
        r0.put(str, adlxVar);
        return adlxVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [adjl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v5, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq a(java.lang.String str, java.util.Set set, java.util.Set set2) {
        try {
            java.lang.String str2 = str;
            java.util.List<defpackage.adjk> listA = this.f.a(str2);
            if (listA.isEmpty()) {
                return new defpackage.ajcm(java.lang.Boolean.FALSE);
            }
            defpackage.aiof aiofVar = defpackage.adhn.a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (defpackage.adjk adjkVar : listA) {
                defpackage.adhw adhwVar = adjkVar.a;
                if (!set.contains(adhwVar)) {
                    int i = ((defpackage.adjz) this.b).n(((defpackage.adhb) adhwVar).a) ? 1 : true != set2.contains(adhwVar) ? 2 : 3;
                    defpackage.aiof aiofVar2 = defpackage.adhn.a;
                    java.lang.Object obj = this.g;
                    defpackage.aiof aiofVar3 = defpackage.adhn.c;
                    defpackage.gat gatVar = (defpackage.gat) obj;
                    defpackage.ajxw ajxwVar = (defpackage.ajxw) gatVar.a.get(adhwVar);
                    if (ajxwVar != null) {
                        ajxwVar.c.cancel(true);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    defpackage.apnt apntVar = (defpackage.apnt) gatVar.c;
                    java.util.Iterator it = defpackage.aieu.b(apntVar.i(), apntVar.j(), apntVar.k()).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(defpackage.aiql.A(((defpackage.adhi) it.next()).b(adhwVar)));
                    }
                    defpackage.ajcq ajcqVarB = new defpackage.anpu(false, defpackage.aify.j(arrayList2)).b(new defpackage.nyf(arrayList2, adhwVar, 12, null), gatVar.d);
                    defpackage.adpy adpyVar = new defpackage.adpy(this, str2, adjkVar, i, 1);
                    ?? r2 = this.a;
                    int i2 = defpackage.ajan.c;
                    defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarB, adpyVar);
                    ajcqVarB.c(ajalVar, defpackage.aiql.t(r2, ajalVar));
                    arrayList.add(ajalVar);
                    defpackage.aiof aiofVar4 = defpackage.adhn.a;
                }
                str2 = str;
            }
            if (arrayList.size() <= 0) {
                defpackage.aiof aiofVar5 = defpackage.adhn.a;
                return new defpackage.ajcm(java.lang.Boolean.FALSE);
            }
            defpackage.aiof aiofVar6 = defpackage.adhn.a;
            defpackage.ajbh ajbhVar = new defpackage.ajbh(defpackage.aify.j(arrayList), true);
            defpackage.uqd uqdVar = new defpackage.uqd(5);
            ?? r1 = this.a;
            int i3 = defpackage.ajan.c;
            defpackage.ajal ajalVar2 = new defpackage.ajal(ajbhVar, uqdVar);
            ajbhVar.c(ajalVar2, defpackage.aiql.t(r1, ajalVar2));
            return ajalVar2;
        } catch (java.io.IOException e) {
            return new defpackage.ajdd(e);
        }
    }

    public final defpackage.ajcq b(java.lang.String str, java.util.Collection collection, java.util.Set set) {
        java.lang.Object[] objArr = {collection};
        defpackage.ahvr.ay(objArr, 1);
        return c(str, new defpackage.aike(objArr, 1), set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ajct, java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [adjl, java.lang.Object] */
    public final synchronized defpackage.ajcq c(java.lang.String str, java.util.List list, java.util.Set set) throws java.lang.Throwable {
        java.lang.Throwable th;
        try {
            try {
                final defpackage.adlx adlxVar = new defpackage.adlx(str, list, set, this);
                defpackage.adlx adlxVarO = o(str, adlxVar);
                if (adlxVarO != null) {
                    try {
                        adlxVarO.a();
                        adlxVar.b(adlxVarO);
                        defpackage.aiof aiofVar = defpackage.adhn.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                java.lang.Object obj = this.b;
                final ?? r3 = this.a;
                final ?? r4 = this.f;
                java.lang.Object obj2 = this.j;
                java.lang.Object obj3 = this.g;
                final defpackage.gat gatVar = (defpackage.gat) obj3;
                final defpackage.apnt apntVar = (defpackage.apnt) obj2;
                final defpackage.adjz adjzVar = (defpackage.adjz) obj;
                defpackage.ajcq ajcqVarC = new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{adlxVar.e})).c(new defpackage.ajas() { // from class: adlv
                    @Override // defpackage.ajas
                    public final defpackage.ajcq a() {
                        defpackage.adjz adjzVar2;
                        defpackage.adlx adlxVar2 = adlxVar;
                        if (adlxVar2.d) {
                            return defpackage.ajcm.a;
                        }
                        java.util.HashSet hashSet = new java.util.HashSet();
                        boolean zN = false;
                        defpackage.ailk ailkVarListIterator = ((defpackage.aify) adlxVar2.b).listIterator(0);
                        while (true) {
                            adjzVar2 = adjzVar;
                            if (!ailkVarListIterator.hasNext()) {
                                break;
                            }
                            java.util.Iterator it = ((java.util.Collection) ailkVarListIterator.next()).iterator();
                            while (it.hasNext()) {
                                defpackage.adhw adhwVarP = ((com.google.android.libraries.micore.superpacks.common.Slice) it.next()).f().p();
                                hashSet.add(adhwVarP);
                                zN |= adjzVar2.n(((defpackage.adhb) adhwVarP).a);
                            }
                        }
                        if (zN && hashSet.size() > 1) {
                            throw new java.lang.IllegalArgumentException("Only one file can be requested for a detached namespace.");
                        }
                        defpackage.gat gatVar2 = gatVar;
                        defpackage.apnt apntVar2 = apntVar;
                        defpackage.adjl adjlVar = r4;
                        defpackage.ajct ajctVar = r3;
                        defpackage.ajcq ajcqVarA = adlxVar2.f.a(adlxVar2.a, hashSet, adlxVar2.c);
                        defpackage.adlu adluVar = new defpackage.adlu(adlxVar2, hashSet, !zN, adjzVar2, ajctVar, adjlVar, apntVar2, gatVar2, 0);
                        int i = defpackage.ajan.c;
                        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarA, adluVar);
                        ajcqVarA.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
                        return ajalVar;
                    }
                }, r3);
                adlxVar.d(ajcqVarC);
                return defpackage.aiql.A(new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarC})).c(new defpackage.adlp(this, str, adlxVar, ajcqVarC, 0), r3));
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void d(java.lang.String str, defpackage.adlx adlxVar) {
        ?? r0 = this.h;
        if (r0.get(str) == adlxVar) {
            r0.remove(str);
        }
    }

    public final synchronized void e(defpackage.adkm adkmVar) {
        ((defpackage.adhu) this.e).a(adkmVar);
    }

    public final void f(java.lang.String str, defpackage.adjk adjkVar, int i) throws java.io.IOException {
        defpackage.adhw adhwVar = adjkVar.a;
        defpackage.adhw adhwVarA = defpackage.adho.a(adhwVar, adjkVar.b);
        defpackage.adhw adhwVarB = defpackage.adho.b(adhwVar);
        java.lang.Object obj = this.b;
        defpackage.adjz adjzVar = (defpackage.adjz) obj;
        adjzVar.p(adhwVarA);
        adjzVar.p(adhwVarB);
        if (i != 1) {
            if (i != 2) {
                java.lang.String str2 = ((defpackage.adhb) adhwVar).a;
                synchronized (adjzVar.b) {
                    ((defpackage.adjz) obj).d(str2).a();
                    defpackage.adjd adjdVar = ((defpackage.adjz) obj).d;
                    if (((defpackage.adiw) adjdVar.a(adhwVar)).d >= 2) {
                        adjdVar.c(adhwVar, 1);
                    }
                }
            } else {
                ((defpackage.adjz) this.b).p(adhwVar);
            }
        }
        java.lang.Object obj2 = this.f;
        try {
            ((defpackage.adjq) obj2).b.getWritableDatabase().delete("pending_packs", "parent_id=? AND pack_name=?", new java.lang.String[]{str, adhwVar.toString()});
        } catch (android.database.sqlite.SQLiteException e) {
            defpackage.adiz adizVar = ((defpackage.adjq) obj2).b;
            java.io.IOException iOException = new java.io.IOException(defpackage.hgb.l(adhwVar, str, "SqlitePendingPacks#remove, SQL delete failed, parentId: ", ", packName: "), e);
            adizVar.a(iOException);
            throw iOException;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [acxa, java.lang.Object] */
    public final defpackage.ajcq g() {
        try {
            java.lang.Object obj = this.l;
            defpackage.ahzf ahzfVar = afek.a;
            ((defpackage.aogc) this.g).P(defpackage.aehj.N("*.lease", ((android.content.Context) obj).getPackageName(), 0L));
            this.b.l(1077);
        } catch (defpackage.affa unused) {
            int i = defpackage.adbe.a;
        } catch (java.io.IOException e) {
            defpackage.adbe.g(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
            this.b.l(1078);
        }
        try {
            ((defpackage.aogc) this.g).T(defpackage.abrz.L((android.content.Context) this.l, (defpackage.ahyn) this.i));
        } catch (java.io.IOException unused2) {
            this.d.a();
        }
        return defpackage.ajcm.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq h(acwe acweVar, java.lang.String str, int i, long j, java.lang.String str2, acwb acwbVar, acvr acvrVar, acvv acvvVar, acvw acvwVar, int i2, java.util.List list, defpackage.akyp akypVar) {
        return defpackage.ahvr.I(k(acweVar), new aczr(this, acweVar, str, acvrVar, acvvVar, acwbVar, i, j, str2, acvwVar, i2, list, akypVar, 1), this.h);
    }

    public final defpackage.ajcq i(acwe acweVar) {
        return defpackage.ahvr.H(j(new defpackage.aile(acweVar)), new aczo(acweVar, 2), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq j(defpackage.aihd aihdVar) {
        return adcs.e(this.e.f(aihdVar)).g(new acze(this, aihdVar, 9), (java.util.concurrent.Executor) this.h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq k(acwe acweVar) {
        return defpackage.ahvr.I(this.e.e(acweVar), new aczi(acweVar, 4), this.h);
    }

    public final void l(acwb acwbVar, android.net.Uri uri) {
        java.lang.Object obj = this.a;
        if (((defpackage.ahyn) obj).f()) {
            try {
                long jK = ((defpackage.aogc) this.g).K(uri);
                if (jK > 0) {
                    ((defpackage.adce) ((defpackage.ahyn) obj).b()).g(acwbVar.c, jK);
                }
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq m(java.util.List list, int i, int i2) {
        if (i == list.size()) {
            return defpackage.aiql.z(null);
        }
        acvv acvvVar = (acvv) list.get(i);
        int iAe = defpackage.a.ae(acvvVar.f);
        if (iAe == 0) {
            iAe = 1;
        }
        if (iAe != 2) {
            return m(list, i + 1, i2);
        }
        defpackage.akzx akzxVarM = acwe.a.m();
        acvq acvqVar = acvvVar.g;
        if (acvqVar == null) {
            acvqVar = acvq.a;
        }
        java.lang.String str = acvqVar.b;
        akzxVarM.u();
        acwe acweVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        acweVar.b |= 4;
        acweVar.e = str;
        akzxVarM.u();
        acwe acweVar2 = akzxVarM.b;
        acweVar2.f = i2 - 1;
        acweVar2.b |= 8;
        acwe acweVarR = akzxVarM.r();
        return defpackage.ahvr.I(this.e.e(acweVarR), new aczt(this, acweVarR, acvvVar, list, i, i2, 0), this.h);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [acxa, java.lang.Object] */
    public final defpackage.ajcq n(int i, java.lang.String str, java.lang.String str2) {
        android.net.Uri uriP = defpackage.abrz.P((android.content.Context) this.l, i, str, str2, this.d, (defpackage.ahyn) this.i, false);
        if (uriP != null) {
            return defpackage.aiql.z(uriP);
        }
        defpackage.adbe.c("%s: Failed to get file uri!", "SharedFileManager");
        yg ygVarB = defpackage.acvh.b();
        ygVarB.b = acvg.v;
        return defpackage.aiql.y(ygVarB.d());
    }

    public adlt(android.content.Context context, defpackage.acxa acxaVar, defpackage.aczw aczwVar, defpackage.aogc aogcVar, defpackage.adax adaxVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.adba adbaVar, defpackage.acvl acvlVar, defpackage.ahyn ahynVar3, java.util.concurrent.Executor executor, defpackage.agab agabVar) {
        this.l = context;
        this.d = acxaVar;
        this.e = aczwVar;
        this.g = aogcVar;
        this.f = adaxVar;
        this.k = ahynVar;
        this.a = ahynVar2;
        this.b = adbaVar;
        this.c = acvlVar;
        this.i = ahynVar3;
        this.h = executor;
        this.j = agabVar;
    }
}
