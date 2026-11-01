package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afod implements defpackage.afof {
    private static final aimz f = aimz.i("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/ClustersRepository");
    public final aolr a;
    public final aozh b;
    public int c;
    public boolean d;
    public final aozj e;
    private final android.accounts.Account g;
    private final java.util.List h;
    private final java.util.List i;
    private boolean j;
    private boolean k;
    private final defpackage.afob l;
    private final defpackage.wyw m;
    private final defpackage.zoe n;
    private final defpackage.zoe o;

    public afod(defpackage.rai raiVar, aolr aolrVar, defpackage.zoe zoeVar, defpackage.zoe zoeVar2, defpackage.afpl afplVar, android.accounts.Account account) {
        aooh.f(raiVar, "pageFetcherFactory");
        aooh.f(aolrVar, "coroutineContext");
        this.a = aolrVar;
        this.n = zoeVar;
        this.o = zoeVar2;
        this.g = account;
        him himVar = ((hjq) raiVar.a).a;
        this.l = new defpackage.afob(himVar.a.bd(), himVar.a.au(), account);
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        aozj aozjVarA = aozk.a(afsq.k());
        this.e = aozjVarA;
        this.b = new aoys(aozjVarA, (aoub) null);
        this.k = true;
        this.m = afplVar.i(account.name);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069 A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:30:0x0063, B:32:0x0069, B:33:0x006b, B:35:0x007b, B:36:0x007d, B:38:0x0093, B:39:0x0095, B:43:0x009d), top: B:59:0x0063, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:30:0x0063, B:32:0x0069, B:33:0x006b, B:35:0x007b, B:36:0x007d, B:38:0x0093, B:39:0x0095, B:43:0x009d), top: B:59:0x0063, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:30:0x0063, B:32:0x0069, B:33:0x006b, B:35:0x007b, B:36:0x007d, B:38:0x0093, B:39:0x0095, B:43:0x009d), top: B:59:0x0063, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.afoc afocVar;
        defpackage.amwp amwpVar;
        java.lang.Throwable th;
        defpackage.amwp amwpVar2;
        defpackage.aklz aklzVar;
        defpackage.aklq aklqVar;
        defpackage.aklq aklqVar2;
        defpackage.aklq aklqVar3;
        boolean z;
        akov akovVar;
        if (aolnVar instanceof defpackage.afoc) {
            afocVar = (defpackage.afoc) aolnVar;
            int i = afocVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afocVar.c = i - Integer.MIN_VALUE;
            } else {
                afocVar = new defpackage.afoc(this, aolnVar);
            }
        } else {
            afocVar = new defpackage.afoc(this, aolnVar);
        }
        java.lang.Object obj = afocVar.a;
        aolu aoluVar = aolu.a;
        int i2 = afocVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.amwp amwpVarO = this.n.O(14);
            amwpVarO.j();
            try {
                defpackage.afob afobVar = this.l;
                afocVar.d = amwpVarO;
                afocVar.c = 1;
                java.lang.Object objA = afobVar.a(afocVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                amwpVar2 = amwpVarO;
                obj = objA;
                aklzVar = (defpackage.aklz) obj;
                synchronized (this) {
                    java.util.List list = this.h;
                    aklqVar = aklzVar.b;
                    if (aklqVar == null) {
                        aklqVar = defpackage.aklq.a;
                    }
                    alat alatVar = aklqVar.d;
                    aooh.e(alatVar, "getClusterList(...)");
                    list.addAll(alatVar);
                    java.util.List list2 = this.i;
                    aklqVar2 = aklzVar.b;
                    if (aklqVar2 == null) {
                        aklqVar2 = defpackage.aklq.a;
                    }
                    akow akowVarH = amwpVar2.h(aklqVar2.d.size());
                    aooh.e(akowVarH, "getEvent(...)");
                    list2.add(akowVarH);
                    aklqVar3 = aklzVar.b;
                    if (aklqVar3 == null) {
                        aklqVar3 = defpackage.aklq.a;
                    }
                    if (1 != (aklqVar3.b & 1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.k = z;
                    this.j = false;
                    this.d = false;
                    this.e.e(afsq.l(ahvr.bv(this.h), this.k, ahvr.bv(this.i)));
                    afocVar.d = amwpVar2;
                    afocVar.c = 2;
                    if (c(afocVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } catch (java.lang.Throwable th2) {
                amwpVar = amwpVarO;
                th = th2;
                f.c().k(th).l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/ClustersRepository", "fetchNextPage", 111, "ClustersRepository.kt").t();
                akow akowVarI = amwpVar.i(th);
                aooh.c(akowVarI);
                java.util.List list3 = this.i;
                list3.add(akowVarI);
                ajyi ajyiVarZ = defpackage.akmr.z(akou.a.m());
                akovVar = akowVarI.f;
                defpackage.wyw wywVar = this.m;
                if (akovVar == null) {
                    akovVar = akov.a;
                }
                aooh.e(akovVar, "getErrorStatus(...)");
                ajyiVarZ.F(akovVar);
                wywVar.e(ajyiVarZ.E());
                this.e.e(afsq.m(ahvr.bv(this.h), this.o.D(th), ahvr.bv(list3)));
                this.j = false;
                this.d = true;
            }
        } else if (i2 == 1) {
            amwpVar2 = afocVar.d;
            try {
                aooc.af(obj);
                aklzVar = (defpackage.aklz) obj;
                synchronized (this) {
                    java.util.List list4 = this.h;
                    aklqVar = aklzVar.b;
                    if (aklqVar == null) {
                        aklqVar = defpackage.aklq.a;
                    }
                    alat alatVar2 = aklqVar.d;
                    aooh.e(alatVar2, "getClusterList(...)");
                    list4.addAll(alatVar2);
                    java.util.List list5 = this.i;
                    aklqVar2 = aklzVar.b;
                    if (aklqVar2 == null) {
                        aklqVar2 = defpackage.aklq.a;
                    }
                    akow akowVarH2 = amwpVar2.h(aklqVar2.d.size());
                    aooh.e(akowVarH2, "getEvent(...)");
                    list5.add(akowVarH2);
                    aklqVar3 = aklzVar.b;
                    if (aklqVar3 == null) {
                        aklqVar3 = defpackage.aklq.a;
                    }
                    if (1 != (aklqVar3.b & 1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.k = z;
                    this.j = false;
                    this.d = false;
                }
                this.e.e(afsq.l(ahvr.bv(this.h), this.k, ahvr.bv(this.i)));
                afocVar.d = amwpVar2;
                afocVar.c = 2;
                if (c(afocVar) == aoluVar) {
                    return aoluVar;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                amwpVar = amwpVar2;
                f.c().k(th).l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/ClustersRepository", "fetchNextPage", 111, "ClustersRepository.kt").t();
                akow akowVarI2 = amwpVar.i(th);
                aooh.c(akowVarI2);
                java.util.List list6 = this.i;
                list6.add(akowVarI2);
                ajyi ajyiVarZ2 = defpackage.akmr.z(akou.a.m());
                akovVar = akowVarI2.f;
                defpackage.wyw wywVar2 = this.m;
                if (akovVar == null) {
                    akovVar = akov.a;
                }
                aooh.e(akovVar, "getErrorStatus(...)");
                ajyiVarZ2.F(akovVar);
                wywVar2.e(ajyiVarZ2.E());
                this.e.e(afsq.m(ahvr.bv(this.h), this.o.D(th), ahvr.bv(list6)));
                this.j = false;
                this.d = true;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            amwpVar = afocVar.d;
            try {
                aooc.af(obj);
            } catch (java.lang.Throwable th4) {
                th = th4;
                f.c().k(th).l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/ClustersRepository", "fetchNextPage", 111, "ClustersRepository.kt").t();
                akow akowVarI3 = amwpVar.i(th);
                aooh.c(akowVarI3);
                java.util.List list7 = this.i;
                list7.add(akowVarI3);
                ajyi ajyiVarZ3 = defpackage.akmr.z(akou.a.m());
                akovVar = akowVarI3.f;
                defpackage.wyw wywVar3 = this.m;
                if (akovVar == null) {
                    akovVar = akov.a;
                }
                aooh.e(akovVar, "getErrorStatus(...)");
                ajyiVarZ3.F(akovVar);
                wywVar3.e(ajyiVarZ3.E());
                this.e.e(afsq.m(ahvr.bv(this.h), this.o.D(th), ahvr.bv(list7)));
                this.j = false;
                this.d = true;
            }
        }
        return aojh.a;
    }

    @Override // defpackage.afof
    public final java.lang.Object b(int i, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.a, new defpackage.afoj(this, i, (aoln) null, 1), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object c(aoln aolnVar) {
        synchronized (this) {
            if (this.d || !this.k || this.j || this.c <= this.h.size()) {
                aojh aojhVar = aojh.a;
                return aojhVar;
            }
            this.j = true;
            java.lang.Object objA = a(aolnVar);
            return objA != aolu.a ? aojh.a : objA;
        }
    }

    @Override // defpackage.afof
    public final java.lang.Object d(aoln aolnVar) {
        throw null;
    }

    @Override // defpackage.afof
    public final aozh e() {
        return this.b;
    }

    @Override // defpackage.afof
    public final java.lang.Object f() {
        throw null;
    }
}
