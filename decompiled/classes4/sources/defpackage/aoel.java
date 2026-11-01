package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoel implements aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    public aoel(aoop aoopVar, aoxi aoxiVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = aoopVar;
        this.d = aoxiVar;
        this.b = "request";
        this.c = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6 A[PHI: r9
      0x00e6: PHI (r9v6 java.lang.Object) = (r9v2 java.lang.Object), (r9v12 java.lang.Object) binds: [B:39:0x00e4, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Type inference failed for: r8v14, types: [aoxi, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, aoln aolnVar) throws anqx {
        defpackage.aoek aoekVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        apdp apdpVar;
        java.lang.Object obj8;
        java.lang.Object obj9;
        if (this.$cid != 0) {
            aoop aoopVar = (aoop) this.a;
            if (!aoopVar.a) {
                aoopVar.a = true;
                java.lang.Object objA = this.d.a(obj, aolnVar);
                return objA != aolu.a ? aojh.a : objA;
            }
            java.lang.Object obj10 = this.b;
            java.lang.Object obj11 = this.c;
            throw new anqx(anqw.k.f("Expected one " + ((java.lang.String) obj10) + " for " + obj11 + " but received two"), (anph) null);
        }
        if (aolnVar instanceof defpackage.aoek) {
            aoekVar = (defpackage.aoek) aolnVar;
            int i = aoekVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoekVar.e = i - Integer.MIN_VALUE;
            } else {
                aoekVar = new defpackage.aoek(this, aolnVar);
            }
        } else {
            aoekVar = new defpackage.aoek(this, aolnVar);
        }
        java.lang.Object obj12 = aoekVar.c;
        aolu aoluVar = aolu.a;
        int i2 = aoekVar.e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    obj3 = aoekVar.b;
                    obj4 = aoekVar.f;
                    obj2 = aoekVar.a;
                    aooc.af(obj12);
                } else {
                    if (i2 == 2) {
                        obj = aoekVar.a;
                        aooc.af(obj12);
                        obj6 = this.d;
                        obj7 = this.c;
                        aoekVar.a = obj;
                        apdpVar = (apdp) obj6;
                        aoekVar.f = apdpVar;
                        aoekVar.b = obj7;
                        aoekVar.e = 3;
                        if (apdpVar.b(aoekVar) != aoluVar) {
                            obj8 = obj;
                            obj9 = obj6;
                        }
                        return aoluVar;
                    }
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj7 = aoekVar.b;
                    obj9 = aoekVar.f;
                    obj8 = aoekVar.a;
                    aooc.af(obj12);
                }
                try {
                    ((defpackage.anql) obj7).g(obj8);
                    return aojh.a;
                } finally {
                    ((apdp) obj9).d();
                }
            }
            aooc.af(obj12);
            if (((java.util.concurrent.atomic.AtomicBoolean) this.a).compareAndSet(false, true)) {
                java.lang.Object obj13 = this.d;
                java.lang.Object obj14 = this.c;
                aoekVar.a = obj;
                apdp apdpVar2 = (apdp) obj13;
                aoekVar.f = apdpVar2;
                aoekVar.b = obj14;
                aoekVar.e = 1;
                if (apdpVar2.b(aoekVar) != aoluVar) {
                    obj2 = obj;
                    obj3 = obj14;
                    obj4 = obj13;
                }
            } else {
                obj5 = this.b;
                aoekVar.a = obj;
                aoekVar.f = null;
                aoekVar.b = null;
                aoekVar.e = 2;
                if (((defpackage.apjb) obj5).h(aoekVar) != aoluVar) {
                    obj6 = this.d;
                    obj7 = this.c;
                    aoekVar.a = obj;
                    apdpVar = (apdp) obj6;
                    aoekVar.f = apdpVar;
                    aoekVar.b = obj7;
                    aoekVar.e = 3;
                    if (apdpVar.b(aoekVar) != aoluVar) {
                        obj8 = obj;
                        obj9 = obj6;
                        ((defpackage.anql) obj7).g(obj8);
                        return aojh.a;
                    }
                }
            }
            return aoluVar;
            ((defpackage.anql) obj3).d(new anph());
            ((apdp) obj4).d();
            obj = obj2;
            obj5 = this.b;
            aoekVar.a = obj;
            aoekVar.f = null;
            aoekVar.b = null;
            aoekVar.e = 2;
            if (((defpackage.apjb) obj5).h(aoekVar) != aoluVar) {
                obj6 = this.d;
                obj7 = this.c;
                aoekVar.a = obj;
                apdpVar = (apdp) obj6;
                aoekVar.f = apdpVar;
                aoekVar.b = obj7;
                aoekVar.e = 3;
                if (apdpVar.b(aoekVar) != aoluVar) {
                    obj8 = obj;
                    obj9 = obj6;
                    ((defpackage.anql) obj7).g(obj8);
                    return aojh.a;
                }
            }
            return aoluVar;
        } catch (java.lang.Throwable th) {
            ((apdp) obj4).d();
            throw th;
        }
    }

    public aoel(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, apdp apdpVar, defpackage.apjb apjbVar, defpackage.anql anqlVar, int i) {
        this.$cid = i;
        this.a = atomicBoolean;
        this.d = apdpVar;
        this.b = apjbVar;
        this.c = anqlVar;
    }
}
