package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zee {
    private static final aimz h = aimz.i("com/google/android/callingshared/peertopeer/capabilities/registrar/impl/RcsRegistrarImpl");
    public final aolr a;
    public final aoss b;
    public final defpackage.yqt c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final zzx e;
    public final ahda f;
    public final defpackage.abtr g;
    private final defpackage.rdp i;
    private final zzx j;

    public zee(aolr aolrVar, aoss aossVar, defpackage.yqt yqtVar, zzx zzxVar, defpackage.abtr abtrVar, defpackage.rdp rdpVar, zzx zzxVar2) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rdpVar, "flagValues");
        this.a = aolrVar;
        this.b = aossVar;
        this.c = yqtVar;
        this.e = zzxVar;
        this.g = abtrVar;
        this.i = rdpVar;
        this.j = zzxVar2;
        this.f = new ahda((byte[]) null);
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v14, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [aolr, java.lang.Object] */
    public final java.lang.Object a(defpackage.zff zffVar, aoln aolnVar) {
        defpackage.zec zecVar;
        java.util.Set set;
        defpackage.zeh zehVar;
        defpackage.zdz zdzVar;
        java.lang.Object objAj;
        if (aolnVar instanceof defpackage.zec) {
            zecVar = (defpackage.zec) aolnVar;
            int i = zecVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zecVar.d = i - Integer.MIN_VALUE;
            } else {
                zecVar = new defpackage.zec(this, aolnVar);
            }
        } else {
            zecVar = new defpackage.zec(this, aolnVar);
        }
        java.lang.Object objL = zecVar.b;
        aolu aoluVar = aolu.a;
        int i2 = zecVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                zffVar = (defpackage.zff) zecVar.a;
                aooc.af(objL);
                return new defpackage.zdy(zffVar, (java.util.Set) objL);
            }
            if (i2 == 2) {
                zffVar = (defpackage.zff) zecVar.a;
                aooc.af(objL);
                set = (java.util.Set) objL;
                if (!set.isEmpty()) {
                    return new defpackage.zdy(zffVar, set);
                }
                defpackage.abtr abtrVar = this.g;
                zecVar.a = zffVar;
                zecVar.d = 3;
                objL = aoov.aj((aolr) abtrVar.e, new ytl(abtrVar, zffVar, (aoln) null, 6), zecVar);
                if (objL == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                zffVar = (defpackage.zff) zecVar.a;
                aooc.af(objL);
            } else {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.zdz zdzVar2 = (defpackage.zdz) zecVar.a;
                    aooc.af(objL);
                    return zdzVar2;
                }
                zffVar = (defpackage.zff) zecVar.a;
                aooc.af(objL);
            }
            zdzVar = (defpackage.zdz) objL;
            if (zdzVar instanceof defpackage.zdy) {
                defpackage.abtr abtrVar2 = this.g;
                java.util.Set set2 = ((defpackage.zdy) zdzVar).a;
                zecVar.a = zdzVar;
                zecVar.d = 5;
                objAj = aoov.aj((aolr) abtrVar2.e, new defpackage.zeg(abtrVar2, zffVar, set2, null), zecVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            }
            return zdzVar;
        }
        aooc.af(objL);
        java.lang.Object objA = this.i.c.a();
        aooh.e(objA, "get(...)");
        boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        defpackage.abtr abtrVar3 = this.g;
        if (!zBooleanValue) {
            zecVar.a = zffVar;
            zecVar.d = 1;
            objL = abtrVar3.l(zffVar, zecVar);
            if (objL == aoluVar) {
                return aoluVar;
            }
            return new defpackage.zdy(zffVar, (java.util.Set) objL);
        }
        zecVar.a = zffVar;
        zecVar.d = 2;
        objL = abtrVar3.l(zffVar, zecVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        set = (java.util.Set) objL;
        if (!set.isEmpty()) {
            return new defpackage.zdy(zffVar, set);
        }
        defpackage.abtr abtrVar4 = this.g;
        zecVar.a = zffVar;
        zecVar.d = 3;
        objL = aoov.aj((aolr) abtrVar4.e, new ytl(abtrVar4, zffVar, (aoln) null, 6), zecVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        defpackage.zeu zeuVar = (defpackage.zeu) objL;
        if (zeuVar == null || (zehVar = zeuVar.b) == defpackage.zeh.a) {
            return new defpackage.zdy(zffVar, aoke.a);
        }
        if (zehVar == defpackage.zeh.c && !this.g.m(zeuVar.c)) {
            return new defpackage.zdy(zffVar, aoke.a);
        }
        zecVar.a = zffVar;
        zecVar.d = 4;
        objL = b(zffVar, zecVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        zdzVar = (defpackage.zdz) objL;
        if (zdzVar instanceof defpackage.zdy) {
            defpackage.abtr abtrVar5 = this.g;
            java.util.Set set3 = ((defpackage.zdy) zdzVar).a;
            zecVar.a = zdzVar;
            zecVar.d = 5;
            objAj = aoov.aj((aolr) abtrVar5.e, new defpackage.zeg(abtrVar5, zffVar, set3, null), zecVar);
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            if (objAj == aoluVar) {
                return aoluVar;
            }
        }
        return zdzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.zff zffVar, aoln aolnVar) {
        defpackage.zed zedVar;
        java.lang.Object objN;
        if (aolnVar instanceof defpackage.zed) {
            zedVar = (defpackage.zed) aolnVar;
            int i = zedVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zedVar.c = i - Integer.MIN_VALUE;
            } else {
                zedVar = new defpackage.zed(this, aolnVar);
            }
        } else {
            zedVar = new defpackage.zed(this, aolnVar);
        }
        java.lang.Object obj = zedVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zedVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            this.j.l(new zbq(defpackage.zbr.by));
            defpackage.yqt yqtVar = this.c;
            aolr aolrVar = this.a;
            defpackage.uke ukeVar = new defpackage.uke(zffVar, (aoln) null, 12);
            zedVar.d = zffVar;
            zedVar.c = 1;
            objN = wsc.n(yqtVar, aolrVar, ukeVar, zedVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zffVar = zedVar.d;
            aooc.af(obj);
            objN = ((aoiw) obj).a;
        }
        if ((objN instanceof aoiv) && wsc.o(objN)) {
            return new defpackage.zdx(zffVar);
        }
        aooc.af(objN);
        defpackage.yrh yrhVar = (defpackage.yrh) objN;
        defpackage.amhh amhhVar = yrhVar.b;
        if (amhhVar == null) {
            amhhVar = defpackage.amhh.a;
        }
        if (defpackage.amhf.b(amhhVar.b) != defpackage.amhf.OK) {
            aimw aimwVarL = h.d().l("com/google/android/callingshared/peertopeer/capabilities/registrar/impl/RcsRegistrarImpl", "retrieveCapabilitiesFromOnDeviceServer", 162, "RcsRegistrarImpl.kt");
            defpackage.amhh amhhVar2 = yrhVar.b;
            if (amhhVar2 == null) {
                amhhVar2 = defpackage.amhh.a;
            }
            aimwVarL.y("gRPC failed with status %s", new aepg(defpackage.amhf.b(amhhVar2.b)));
            return new defpackage.zdx(zffVar);
        }
        aojo aojoVar = defpackage.zea.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aojoVar, 10));
        aojl aojlVar = new aojl(aojoVar);
        while (aojlVar.hasNext()) {
            arrayList.add(((defpackage.zdv) aojlVar.next()).name());
        }
        java.util.Set setCf = ajsz.cf(arrayList);
        alat alatVar = yrhVar.c;
        aooh.e(alatVar, "getCapabilitiesList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : alatVar) {
            if (setCf.contains(((defpackage.yrb) obj2).c)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((defpackage.yrb) it.next()).c;
            aooh.e(str, "getName(...)");
            arrayList3.add(defpackage.zdv.c(str));
        }
        return new defpackage.zdy(zffVar, ajsz.cf(arrayList3));
    }
}
