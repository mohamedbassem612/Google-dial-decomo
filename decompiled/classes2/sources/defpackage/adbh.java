package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class adbh implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ adbh(adak adakVar, java.util.concurrent.atomic.AtomicInteger atomicInteger, acwe acweVar, int i) {
        this.$cid = i;
        this.c = adakVar;
        this.a = atomicInteger;
        this.b = acweVar;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [adba, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int iJ;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((java.util.concurrent.atomic.AtomicInteger) this.a).getAndIncrement();
                    return null;
                }
                java.lang.Object obj2 = this.b;
                ((adak) this.c).j.l(1036);
                adbe.d("%s: Unsubscribe from file %s failed!", "ExpirationHandler", obj2);
                return null;
            }
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.a;
            java.lang.Object obj5 = this.b;
            synchronized (obj5) {
                if (((adnq) obj5).d.isPresent() && ((j$.util.Optional) obj4).get() == ((adnq) obj5).d.get()) {
                    adnr.a.b().l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "invalidateAndPrepareResources", 109, "CallAvatarSessionManagerImpl.java").y("invalidateAndPrepareResources(): channel '%s' has finished preparing resources.", obj3);
                    ((adnq) obj5).c = true;
                    ((adnq) obj5).d = j$.util.Optional.empty();
                }
            }
            return null;
        }
        ahyn ahynVar = (ahyn) obj;
        akzx akzxVarM = defpackage.aiwq.a.m();
        akzxVarM.u();
        defpackage.aiwq aiwqVar = (defpackage.aiwq) akzxVarM.b;
        java.lang.Object obj6 = this.a;
        j$.util.Objects.requireNonNull(obj6);
        aiwqVar.b |= 1;
        aiwqVar.c = (java.lang.String) obj6;
        ahyn ahynVar2 = (ahyn) this.b;
        if (ahynVar2.f()) {
            defpackage.aixe aixeVar = (defpackage.aixe) ahynVar2.b();
            akzxVarM.u();
            defpackage.aiwq aiwqVar2 = (defpackage.aiwq) akzxVarM.b;
            j$.util.Objects.requireNonNull(aixeVar);
            aiwqVar2.g = aixeVar;
            aiwqVar2.b |= 32;
        }
        if (ahynVar.f()) {
            long jLongValue = ((java.lang.Long) ahynVar.b()).longValue();
            akzxVarM.u();
            defpackage.aiwq aiwqVar3 = (defpackage.aiwq) akzxVarM.b;
            aiwqVar3.b |= 2;
            aiwqVar3.d = jLongValue;
        }
        ahyn ahynVar3 = (ahyn) this.c;
        if (ahynVar3.f()) {
            java.lang.String simpleName = ahynVar3.b().getClass().getSimpleName();
            akzxVarM.u();
            defpackage.aiwq aiwqVar4 = (defpackage.aiwq) akzxVarM.b;
            j$.util.Objects.requireNonNull(simpleName);
            aiwqVar4.b |= 4;
            aiwqVar4.e = simpleName;
            if (((java.lang.Throwable) ahynVar3.b()).getCause() != null) {
                java.lang.String simpleName2 = ((java.lang.Throwable) ahynVar3.b()).getCause().getClass().getSimpleName();
                akzxVarM.u();
                defpackage.aiwq aiwqVar5 = (defpackage.aiwq) akzxVarM.b;
                j$.util.Objects.requireNonNull(simpleName2);
                aiwqVar5.b |= 8;
                aiwqVar5.f = simpleName2;
            }
            if ((ahynVar3.b() instanceof acvh) && (iJ = defpackage.airh.j(((acvh) ahynVar3.b()).a.aL)) != 0) {
                akzxVarM.u();
                defpackage.aiwq aiwqVar6 = (defpackage.aiwq) akzxVarM.b;
                aiwqVar6.h = defpackage.airh.i(iJ);
                aiwqVar6.b |= 64;
            }
        }
        return (defpackage.aiwq) akzxVarM.p();
    }

    public /* synthetic */ adbh(adnq adnqVar, j$.util.Optional optional, adoa adoaVar, int i) {
        this.$cid = i;
        this.b = adnqVar;
        this.a = optional;
        this.c = adoaVar;
    }

    public /* synthetic */ adbh(java.lang.String str, ahyn ahynVar, ahyn ahynVar2, int i) {
        this.$cid = i;
        this.a = str;
        this.b = ahynVar;
        this.c = ahynVar2;
    }
}
