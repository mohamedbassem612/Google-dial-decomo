package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class swg extends aomh implements aonn {
    long a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.svp e;
    final /* synthetic */ defpackage.swi f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swg(defpackage.svp svpVar, defpackage.swi swiVar, boolean z, aoln aolnVar) {
        super(2, aolnVar);
        this.e = svpVar;
        this.f = swiVar;
        this.g = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:27:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f9 A[LOOP:0: B:29:0x00f3->B:31:0x00f9, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        java.lang.Object obj2;
        long j2;
        defpackage.swi swiVar;
        rmx rmxVar;
        ailj ailjVarK;
        ?? r1;
        aoub aoubVar = aolu.a;
        int i = this.d;
        if (i != 0) {
            j2 = this.a;
            if (i == 1) {
                aooc.af(obj);
                j = j2;
                defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStartFetchingDataForCall$<anonymous>", 122, "PrefetchedCallImpl.kt").x("Skip start fetching for call created at %d", j);
                return aojh.a;
            }
            obj2 = this.c;
            java.lang.Object obj3 = this.b;
            aooc.af(obj);
            r1 = obj3;
            r1.put(obj2, obj);
            j = j2;
            defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStartFetchingDataForCall$<anonymous>", 130, "PrefetchedCallImpl.kt").x("Start fetching for call created at %d", j);
            swiVar = this.f;
            if (this.g) {
                rmxVar = rmx.ou;
            } else {
                rmxVar = rmx.ov;
            }
            swiVar.b.o(rmxVar);
            ailjVarK = swiVar.g.e().k();
            aooh.e(ailjVarK, "iterator(...)");
            while (ailjVarK.hasNext()) {
                svq svqVar = (svq) ailjVarK.next();
                aimz aimzVar = zih.a;
                aoss aossVar = swiVar.c;
                defpackage.svp svpVar = this.e;
                swiVar.c(aoov.al(aossVar, zih.b.plus(aols.a), 1, new mbz((aoln) null, svqVar, j, svpVar, 2)));
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.svp svpVar2 = this.e;
        defpackage.swi swiVar2 = this.f;
        j = svpVar2.b;
        boolean zAdd = swiVar2.e.add(new java.lang.Long(j));
        boolean z = this.g;
        if (!zAdd) {
            if (!z) {
                defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStartFetchingDataForCall$<anonymous>", 119, "PrefetchedCallImpl.kt").x("Try to remove timeout job for call created at %d", j);
                aoub aoubVar2 = (aoub) swiVar2.f.remove(new java.lang.Long(j));
                if (aoubVar2 != null) {
                    this.a = j;
                    this.d = 1;
                    if (aooc.T(aoubVar2, this) == aoubVar) {
                        return aoubVar;
                    }
                    j2 = j;
                    j = j2;
                }
            }
            defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStartFetchingDataForCall$<anonymous>", 122, "PrefetchedCallImpl.kt").x("Skip start fetching for call created at %d", j);
            return aojh.a;
        }
        if (z) {
            defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStartFetchingDataForCall$<anonymous>", 127, "PrefetchedCallImpl.kt").x("Start timeout job for call created at %d", j);
            java.util.Map map = swiVar2.f;
            java.lang.Long l = new java.lang.Long(j);
            this.b = map;
            this.c = l;
            this.a = j;
            this.d = 2;
            aimz aimzVar2 = zih.a;
            aoub aoubVarAl = aoov.al(swiVar2.c, zih.b.plus(aols.a), 1, new kjb((aoln) null, swiVar2, j, 2));
            if (aoubVarAl == aoubVar) {
                return aoubVar;
            }
            obj2 = l;
            obj = aoubVarAl;
            j2 = j;
            r1 = map;
            r1.put(obj2, obj);
            j = j2;
        }
        defpackage.swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "notifyIntegrationsToStartFetchingDataForCall$<anonymous>", 130, "PrefetchedCallImpl.kt").x("Start fetching for call created at %d", j);
        swiVar = this.f;
        if (this.g) {
            rmxVar = rmx.ou;
        } else {
            rmxVar = rmx.ov;
        }
        swiVar.b.o(rmxVar);
        ailjVarK = swiVar.g.e().k();
        aooh.e(ailjVarK, "iterator(...)");
        while (ailjVarK.hasNext()) {
            svq svqVar2 = (svq) ailjVarK.next();
            aimz aimzVar3 = zih.a;
            aoss aossVar2 = swiVar.c;
            defpackage.svp svpVar3 = this.e;
            swiVar.c(aoov.al(aossVar2, zih.b.plus(aols.a), 1, new mbz((aoln) null, svqVar2, j, svpVar3, 2)));
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.swg(this.e, this.f, this.g, aolnVar);
    }
}
