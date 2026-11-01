package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swh extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swh(bfe bfeVar, ajl ajlVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = bfeVar;
        this.e = ajlVar;
        this.c = j;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        rmx rmxVar;
        java.lang.Object objK;
        ailj ailjVar;
        svq svqVar;
        long j;
        java.lang.Object obj2;
        aiq aiqVar;
        java.lang.Object obj3;
        aii aiiVar;
        dpn dpnVar;
        defpackage.aev aevVar;
        defpackage.swh swhVar;
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    objK = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                }
                do {
                    ailjVar = (ailj) objK;
                    if (ailjVar.hasNext()) {
                        return aojh.a;
                    }
                    svqVar = (svq) ailjVar.next();
                    j = this.c;
                    obj2 = this.e;
                    this.a = objK;
                    this.b = 2;
                } while (svqVar.b(j, (defpackage.svr) obj2, this) != aoluVar);
                return aoluVar;
            }
            aooc.af(obj);
            java.lang.Object obj4 = this.d;
            long j2 = this.c;
            defpackage.swi swiVar = (defpackage.swi) obj4;
            if (!swiVar.e.remove(new java.lang.Long(j2))) {
                defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStopFetchingDataForCall$<anonymous>", 153, "PrefetchedCallImpl.kt").x("Skip stop fetching for call created at %d", j2);
                return aojh.a;
            }
            defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStopFetchingDataForCall$<anonymous>", 157, "PrefetchedCallImpl.kt").x("Try to remove timeout job for call created at %d", j2);
            aoub aoubVar = (aoub) swiVar.f.remove(new java.lang.Long(j2));
            if (aoubVar != null) {
                this.b = 1;
                if (aooc.T(aoubVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStopFetchingDataForCall$<anonymous>", 159, "PrefetchedCallImpl.kt").x("Stop fetching for call created at %d", this.c);
            java.lang.Object obj5 = this.d;
            int iOrdinal = ((defpackage.svr) this.e).ordinal();
            if (iOrdinal == 0) {
                rmxVar = rmx.ow;
            } else if (iOrdinal == 1) {
                rmxVar = rmx.ox;
            } else {
                if (iOrdinal != 2) {
                    throw new aois();
                }
                rmxVar = rmx.oy;
            }
            defpackage.swi swiVar2 = (defpackage.swi) obj5;
            swiVar2.b.o(rmxVar);
            objK = swiVar2.g.e().k();
            aooh.e(objK, "iterator(...)");
            do {
                ailjVar = (ailj) objK;
                if (ailjVar.hasNext()) {
                    return aojh.a;
                }
                svqVar = (svq) ailjVar.next();
                j = this.c;
                obj2 = this.e;
                this.a = objK;
                this.b = 2;
            } while (svqVar.b(j, (defpackage.svr) obj2, this) != aoluVar);
            return aoluVar;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.b;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    aooc.af(obj);
                    swhVar = this;
                } else {
                    obj3 = this.a;
                    aooc.af(obj);
                }
                java.lang.Object obj6 = swhVar.d;
                ((bfe) obj6).m(false);
                ((bfe) obj6).b = false;
                return aojh.a;
            }
            aooc.af(obj);
            aii aiiVar2 = ((bfe) this.d).d;
            boolean zK = aiiVar2.k();
            java.lang.Object obj7 = this.e;
            if (zK) {
                obj7 = obj7 instanceof aku ? (aku) obj7 : null;
                if (obj7 == null) {
                    obj7 = bdr.a;
                }
            }
            if (aiiVar2.k()) {
                aiqVar = obj7;
            } else {
                dpn dpnVar2 = new dpn(this.c);
                this.a = obj7;
                this.b = 1;
                if (aiiVar2.f(dpnVar2, this) == aoluVar2) {
                    return aoluVar2;
                }
                obj3 = obj7;
            }
            java.lang.Object obj8 = this.d;
            aiiVar = ((bfe) obj8).d;
            long jC = dpn.c(((dpn) aiiVar.d()).a, this.c);
            dpnVar = new dpn(jC);
            aevVar = new defpackage.aev(obj8, jC, 5);
            this.a = null;
            this.b = 2;
            swhVar = this;
            if (aii.l(aiiVar, dpnVar, aiqVar, (java.lang.Object) null, aevVar, swhVar, 4) == aoluVar2) {
                return aoluVar2;
            }
            java.lang.Object obj9 = swhVar.d;
            ((bfe) obj9).m(false);
            ((bfe) obj9).b = false;
            return aojh.a;
            ((bfe) this.d).a.a();
            aiqVar = obj3;
            java.lang.Object obj10 = this.d;
            aiiVar = ((bfe) obj10).d;
            long jC2 = dpn.c(((dpn) aiiVar.d()).a, this.c);
            dpnVar = new dpn(jC2);
            aevVar = new defpackage.aev(obj10, jC2, 5);
            this.a = null;
            this.b = 2;
            swhVar = this;
            if (aii.l(aiiVar, dpnVar, aiqVar, (java.lang.Object) null, aevVar, swhVar, 4) == aoluVar2) {
                return aoluVar2;
            }
            java.lang.Object obj11 = swhVar.d;
            ((bfe) obj11).m(false);
            ((bfe) obj11).b = false;
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ajl, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.d;
        if (i != 0) {
            return new defpackage.swh((bfe) obj2, (ajl) this.e, this.c, aolnVar, 1);
        }
        return new defpackage.swh((defpackage.swi) obj2, this.c, (defpackage.svr) this.e, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swh(defpackage.swi swiVar, long j, defpackage.svr svrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = swiVar;
        this.c = j;
        this.e = svrVar;
    }
}
