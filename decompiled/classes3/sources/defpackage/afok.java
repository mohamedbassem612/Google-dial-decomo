package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afok implements defpackage.afof {
    private static final aimz d = aimz.i("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/PhotosRepository");
    public final aozh a;
    public int b;
    public boolean c;
    private final aolr e;
    private final java.util.List f;
    private final java.util.List g;
    private boolean h;
    private boolean i;
    private int j;
    private final defpackage.afoh k;
    private final aozj l;
    private final int m;
    private final int n;
    private final int o;
    private final defpackage.wyw p;
    private final defpackage.zoe q;
    private final defpackage.zoe r;

    public afok(aolr aolrVar, defpackage.zoe zoeVar, defpackage.zoe zoeVar2, defpackage.afpl afplVar, defpackage.rai raiVar, android.accounts.Account account, int i, java.lang.String str, int i2, int i3) {
        aooh.f(aolrVar, "coroutineContext");
        aooh.f(raiVar, "pageFetcherFactory");
        this.e = aolrVar;
        this.q = zoeVar;
        this.r = zoeVar2;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        aozj aozjVarA = aozk.a(afsq.k());
        this.l = aozjVarA;
        this.a = new aoys(aozjVarA, (aoub) null);
        this.i = true;
        this.p = afplVar.i(account.name);
        int i4 = i - 1;
        if (i4 == 0) {
            this.k = raiVar.i(account, null, false);
        } else {
            if (i4 == 1) {
                this.k = raiVar.i(account, null, true);
                return;
            }
            aooh.c(str);
            aooh.f(str, "clusterId");
            this.k = raiVar.i(account, str, false);
        }
    }

    private final boolean g() {
        if (this.m == 3) {
            return false;
        }
        java.util.List list = this.f;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int iAQ = a.aQ(((defpackage.akmc) it.next()).e);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                if (iAQ == 2 && (i = i + 1) < 0) {
                    ajsz.bg();
                }
            }
            if (i >= 20) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c A[Catch: all -> 0x013c, TryCatch #2 {, blocks: (B:38:0x0088, B:40:0x008c, B:41:0x008e, B:45:0x00bb, B:47:0x00c3, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee), top: B:88:0x0088, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3 A[Catch: all -> 0x013c, TryCatch #2 {, blocks: (B:38:0x0088, B:40:0x008c, B:41:0x008e, B:45:0x00bb, B:47:0x00c3, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee), top: B:88:0x0088, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113 A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:18:0x003c, B:21:0x0043, B:66:0x0131, B:36:0x0085, B:37:0x0087, B:56:0x0106, B:57:0x0107, B:59:0x0113, B:60:0x0115, B:64:0x0123, B:70:0x013d, B:71:0x013e, B:38:0x0088, B:40:0x008c, B:41:0x008e, B:45:0x00bb, B:47:0x00c3, B:51:0x00dc, B:53:0x00e8, B:55:0x00ee), top: B:90:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [amwp] */
    /* JADX WARN: Type inference failed for: r2v17 */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.afoi afoiVar;
        akov akovVar;
        aozj aozjVar;
        defpackage.afoe afoeVarM;
        int i;
        boolean z;
        defpackage.akmb akmbVar;
        defpackage.akme akmeVar;
        int i2;
        boolean z2;
        aozj aozjVar2;
        defpackage.akme akmeVar2;
        int i3;
        boolean z3;
        defpackage.afoe afoeVarL;
        int i4;
        defpackage.amwp amwpVar;
        if (aolnVar instanceof defpackage.afoi) {
            afoiVar = (defpackage.afoi) aolnVar;
            int i5 = afoiVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                afoiVar.d = i5 - Integer.MIN_VALUE;
            } else {
                afoiVar = new defpackage.afoi(this, aolnVar);
            }
        } else {
            afoiVar = new defpackage.afoi(this, aolnVar);
        }
        java.lang.Object obj = afoiVar.b;
        aolu aoluVar = aolu.a;
        defpackage.amwp amwpVar2 = afoiVar.d;
        try {
            if (amwpVar2 == 0) {
                aooc.af(obj);
                boolean zG = g();
                if (zG) {
                    this.j++;
                    i = this.o;
                } else {
                    i = this.n;
                }
                defpackage.amwp amwpVarO = this.q.O(i);
                amwpVarO.j();
                try {
                    defpackage.afoh afohVar = this.k;
                    afoiVar.e = amwpVarO;
                    afoiVar.a = zG;
                    afoiVar.d = 1;
                    java.lang.Object objA = afohVar.a(zG, afoiVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    amwpVar2 = amwpVarO;
                    obj = objA;
                    z = zG;
                    akmbVar = (defpackage.akmb) obj;
                    synchronized (this) {
                        akmeVar = akmbVar.b;
                        if (akmeVar == null) {
                            akmeVar = defpackage.akme.a;
                        }
                        aooh.e(akmeVar, "getPhotoPage(...)");
                        java.util.List list = this.f;
                        alat alatVar = akmeVar.e;
                        aooh.e(alatVar, "getPhotoList(...)");
                        list.addAll(alatVar);
                        java.util.List list2 = this.g;
                        akow akowVarH = amwpVar2.h(akmeVar.e.size());
                        aooh.e(akowVarH, "getEvent(...)");
                        list2.add(akowVarH);
                        i2 = akmeVar.b & 1;
                        if (1 != i2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.i = z2;
                        this.h = false;
                        this.c = false;
                        if (i2 != 0) {
                            defpackage.wyw wywVar = this.p;
                            ajyi ajyiVarF = aklu.f(akos.a.m());
                            if (true != akmeVar.e.isEmpty()) {
                                i4 = 109;
                            } else {
                                i4 = 108;
                            }
                            ajyiVarF.H(i4);
                            wywVar.d(ajyiVarF.G());
                        }
                        if (z) {
                            defpackage.wyw wywVar2 = this.p;
                            ajyi ajyiVarF2 = aklu.f(akos.a.m());
                            ajyiVarF2.H(107);
                            wywVar2.d(ajyiVarF2.G());
                        }
                        aozjVar2 = this.l;
                        aify aifyVarBv = ahvr.bv(this.f);
                        akmeVar2 = akmbVar.b;
                        if (akmeVar2 == null) {
                            akmeVar2 = defpackage.akme.a;
                        }
                        i3 = akmeVar2.b & 1;
                        aify aifyVarBv2 = ahvr.bv(this.g);
                        if (1 != i3) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        afoeVarL = afsq.l(aifyVarBv, z3, aifyVarBv2);
                        afoiVar.e = amwpVar2;
                        afoiVar.d = 2;
                        amwpVar = amwpVar2;
                        if (aozjVar2.a(afoeVarL, afoiVar) == aoluVar) {
                            return aoluVar;
                        }
                        afoiVar.e = amwpVar;
                        afoiVar.d = 3;
                        if (c(afoiVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    amwpVar2 = amwpVarO;
                    th = th;
                    d.c().k(th).l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/PhotosRepository", "fetchNextPage", 182, "PhotosRepository.kt").t();
                    akow akowVarI = amwpVar2.i(th);
                    aooh.c(akowVarI);
                    java.util.List list3 = this.g;
                    list3.add(akowVarI);
                    ajyi ajyiVarZ = defpackage.akmr.z(akou.a.m());
                    akovVar = akowVarI.f;
                    defpackage.wyw wywVar3 = this.p;
                    if (akovVar == null) {
                        akovVar = akov.a;
                    }
                    aooh.e(akovVar, "getErrorStatus(...)");
                    ajyiVarZ.F(akovVar);
                    wywVar3.e(ajyiVarZ.E());
                    aozjVar = this.l;
                    afoeVarM = afsq.m(ahvr.bv(this.f), this.r.D(th), ahvr.bv(list3));
                    afoiVar.e = null;
                    afoiVar.d = 4;
                    if (aozjVar.a(afoeVarM, afoiVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.h = false;
                    this.c = true;
                }
            } else if (amwpVar2 == 1) {
                boolean z4 = afoiVar.a;
                defpackage.amwp amwpVar3 = afoiVar.e;
                try {
                    aooc.af(obj);
                    z = z4;
                    amwpVar2 = amwpVar3;
                    akmbVar = (defpackage.akmb) obj;
                    synchronized (this) {
                        akmeVar = akmbVar.b;
                        if (akmeVar == null) {
                            akmeVar = defpackage.akme.a;
                        }
                        aooh.e(akmeVar, "getPhotoPage(...)");
                        java.util.List list4 = this.f;
                        alat alatVar2 = akmeVar.e;
                        aooh.e(alatVar2, "getPhotoList(...)");
                        list4.addAll(alatVar2);
                        java.util.List list5 = this.g;
                        akow akowVarH2 = amwpVar2.h(akmeVar.e.size());
                        aooh.e(akowVarH2, "getEvent(...)");
                        list5.add(akowVarH2);
                        i2 = akmeVar.b & 1;
                        if (1 != i2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.i = z2;
                        this.h = false;
                        this.c = false;
                        if (i2 != 0) {
                            defpackage.wyw wywVar4 = this.p;
                            ajyi ajyiVarF3 = aklu.f(akos.a.m());
                            if (true != akmeVar.e.isEmpty()) {
                                i4 = 109;
                            } else {
                                i4 = 108;
                            }
                            ajyiVarF3.H(i4);
                            wywVar4.d(ajyiVarF3.G());
                        }
                        if (z && !g()) {
                            defpackage.wyw wywVar5 = this.p;
                            ajyi ajyiVarF4 = aklu.f(akos.a.m());
                            ajyiVarF4.H(107);
                            wywVar5.d(ajyiVarF4.G());
                        }
                    }
                    aozjVar2 = this.l;
                    aify aifyVarBv3 = ahvr.bv(this.f);
                    akmeVar2 = akmbVar.b;
                    if (akmeVar2 == null) {
                        akmeVar2 = defpackage.akme.a;
                    }
                    i3 = akmeVar2.b & 1;
                    aify aifyVarBv4 = ahvr.bv(this.g);
                    if (1 != i3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    afoeVarL = afsq.l(aifyVarBv3, z3, aifyVarBv4);
                    afoiVar.e = amwpVar2;
                    afoiVar.d = 2;
                    amwpVar = amwpVar2;
                    if (aozjVar2.a(afoeVarL, afoiVar) == aoluVar) {
                        return aoluVar;
                    }
                    afoiVar.e = amwpVar;
                    afoiVar.d = 3;
                    if (c(afoiVar) == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    amwpVar2 = amwpVar3;
                    d.c().k(th).l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/PhotosRepository", "fetchNextPage", 182, "PhotosRepository.kt").t();
                    akow akowVarI2 = amwpVar2.i(th);
                    aooh.c(akowVarI2);
                    java.util.List list6 = this.g;
                    list6.add(akowVarI2);
                    ajyi ajyiVarZ2 = defpackage.akmr.z(akou.a.m());
                    akovVar = akowVarI2.f;
                    defpackage.wyw wywVar6 = this.p;
                    if (akovVar == null) {
                        akovVar = akov.a;
                    }
                    aooh.e(akovVar, "getErrorStatus(...)");
                    ajyiVarZ2.F(akovVar);
                    wywVar6.e(ajyiVarZ2.E());
                    aozjVar = this.l;
                    afoeVarM = afsq.m(ahvr.bv(this.f), this.r.D(th), ahvr.bv(list6));
                    afoiVar.e = null;
                    afoiVar.d = 4;
                    if (aozjVar.a(afoeVarM, afoiVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.h = false;
                    this.c = true;
                }
            } else if (amwpVar2 == 2) {
                defpackage.amwp amwpVar4 = afoiVar.e;
                aooc.af(obj);
                amwpVar = amwpVar4;
                afoiVar.e = amwpVar;
                afoiVar.d = 3;
                if (c(afoiVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (amwpVar2 == 3) {
                defpackage.amwp amwpVar5 = afoiVar.e;
                aooc.af(obj);
            } else {
                if (amwpVar2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
                this.h = false;
                this.c = true;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            d.c().k(th).l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/model/PhotosRepository", "fetchNextPage", 182, "PhotosRepository.kt").t();
            akow akowVarI3 = amwpVar2.i(th);
            aooh.c(akowVarI3);
            java.util.List list7 = this.g;
            list7.add(akowVarI3);
            ajyi ajyiVarZ3 = defpackage.akmr.z(akou.a.m());
            akovVar = akowVarI3.f;
            defpackage.wyw wywVar7 = this.p;
            if (akovVar == null) {
                akovVar = akov.a;
            }
            aooh.e(akovVar, "getErrorStatus(...)");
            ajyiVarZ3.F(akovVar);
            wywVar7.e(ajyiVarZ3.E());
            aozjVar = this.l;
            afoeVarM = afsq.m(ahvr.bv(this.f), this.r.D(th), ahvr.bv(list7));
            afoiVar.e = null;
            afoiVar.d = 4;
            if (aozjVar.a(afoeVarM, afoiVar) == aoluVar) {
                return aoluVar;
            }
            this.h = false;
            this.c = true;
        }
        return aojh.a;
    }

    @Override // defpackage.afof
    public final java.lang.Object b(int i, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.e, new defpackage.afoj(this, i, (aoln) null, 0), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object c(aoln aolnVar) {
        synchronized (this) {
            if (this.c || !this.i || this.h || this.b <= this.f.size()) {
                aojh aojhVar = aojh.a;
                return aojhVar;
            }
            this.h = true;
            java.lang.Object objA = a(aolnVar);
            return objA != aolu.a ? aojh.a : objA;
        }
    }

    @Override // defpackage.afof
    public final java.lang.Object d(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.e, new defpackage.adzb(this, (aoln) null, 4), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    @Override // defpackage.afof
    public final aozh e() {
        return this.a;
    }

    @Override // defpackage.afof
    public final java.lang.Object f() {
        this.l.e(afsq.k());
        return aojh.a;
    }
}
