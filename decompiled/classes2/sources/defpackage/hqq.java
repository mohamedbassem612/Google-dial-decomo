package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqq extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    int c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqq(defpackage.hqp hqpVar, defpackage.hqg hqgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hqpVar;
        this.f = hqgVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c(obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aows) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.ze) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [hqr] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        ?? r8;
        java.lang.Throwable th;
        ahpj ahpjVar;
        ahnd ahndVar;
        ahne ahneVar;
        java.lang.Object obj4;
        defpackage.ze zeVar;
        java.lang.Object obj5;
        aows aowsVar;
        oko okoVar;
        java.lang.Object obj6;
        java.lang.Object obj7;
        aomy aomyVar;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.c;
            try {
                if (i2 == 0) {
                    aooc.af(obj);
                    obj2 = this.d;
                    java.lang.Object obj8 = this.e;
                    java.lang.Object obj9 = this.f;
                    this.a = obj8;
                    this.b = obj9;
                    this.c = 1;
                    if (ahre.a((aolr) null, this) == aoluVar) {
                        return aoluVar;
                    }
                    obj3 = obj9;
                    r8 = obj8;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            aooc.af(obj);
                            return (defpackage.ze) obj;
                        }
                        ahndVar = (ahnd) this.b;
                        ahneVar = (ahne) this.a;
                        ahpjVar = (ahpj) this.d;
                        try {
                            aooc.af(obj);
                            defpackage.ze zeVar2 = (defpackage.ze) obj;
                            ahns.d(ahns.a(), ahpjVar);
                            ahneVar.b = ahndVar;
                            return zeVar2;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                ahnn.b(th);
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                ahns.d(ahns.a(), ahpjVar);
                                ahneVar.b = ahndVar;
                                throw th3;
                            }
                        }
                    }
                    obj3 = (defpackage.tt) this.b;
                    defpackage.hqr hqrVar = (defpackage.hqr) this.a;
                    obj2 = this.d;
                    aooc.af(obj);
                    r8 = hqrVar;
                }
                boolean z = ahns.a;
                ahpe ahpeVarA = ahns.a();
                ahne ahneVar2 = ahpeVarA.e;
                if (ahneVar2 == null) {
                    throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
                }
                ahnd ahndVar2 = ahneVar2.b;
                if (ahndVar2 == ahnd.b) {
                    this.d = null;
                    this.a = null;
                    this.b = null;
                    this.c = 2;
                    obj = r8.b(obj2, (defpackage.tt) obj3, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    return (defpackage.ze) obj;
                }
                if (ahndVar2 == ahnd.a) {
                    throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
                }
                ahpj ahpjVarB = ahns.b();
                if (ahpjVarB != null && ahpjVarB != ahoo.a && ahpjVarB != ahneVar2.c) {
                    throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
                }
                ahob ahobVarM = ahpeVarA.d;
                if (ahobVarM == null) {
                    ahobVarM = ahob.m(ahpeVarA);
                }
                ahnd ahndVar3 = ahnd.b;
                ahnd ahndVar4 = ahneVar2.b;
                if (ahobVarM == ahoo.a) {
                    ahndVar3 = ahnd.c;
                }
                ahneVar2.b = ahndVar3;
                ahpj ahpjVarD = ahns.d(ahpeVarA, ahobVarM);
                try {
                    this.d = ahpjVarD;
                    this.a = ahneVar2;
                    this.b = ahndVar4;
                    this.c = 3;
                    java.lang.Object objB = r8.b(obj2, (defpackage.tt) obj3, this);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    obj = objB;
                    ahpjVar = ahpjVarD;
                    ahndVar = ahndVar4;
                    ahneVar = ahneVar2;
                    defpackage.ze zeVar3 = (defpackage.ze) obj;
                    ahns.d(ahns.a(), ahpjVar);
                    ahneVar.b = ahndVar;
                    return zeVar3;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    ahpjVar = ahpjVarD;
                    ahndVar = ahndVar4;
                    ahneVar = ahneVar2;
                    ahnn.b(th);
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                ahnn.b(th5);
                throw th5;
            }
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            if (this.c != 0) {
                obj5 = this.b;
                obj4 = this.a;
                zeVar = (defpackage.ze) this.d;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.ze zeVar4 = (defpackage.ze) this.d;
                obj4 = this.e;
                java.lang.Object obj10 = this.f;
                this.d = zeVar4;
                this.a = obj4;
                this.b = obj10;
                this.c = 1;
                if (ahre.a((aolr) null, this) == aoluVar2) {
                    return aoluVar2;
                }
                zeVar = zeVar4;
                obj5 = obj10;
            }
            boolean z2 = ahns.a;
            ahpe ahpeVarA2 = ahns.a();
            ahne ahneVar3 = ahpeVarA2.e;
            if (ahneVar3 == null) {
                throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
            }
            ahnd ahndVar5 = ahneVar3.b;
            if (ahndVar5 == ahnd.b) {
                try {
                    return ((defpackage.hqp) obj4).b((defpackage.hqg) obj5, zeVar);
                } catch (java.lang.Throwable th6) {
                    ahnn.b(th6);
                    throw th6;
                }
            }
            if (ahndVar5 == ahnd.a) {
                throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
            }
            ahpj ahpjVarB2 = ahns.b();
            if (ahpjVarB2 != null && ahpjVarB2 != ahoo.a && ahpjVarB2 != ahneVar3.c) {
                throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
            }
            ahob ahobVarM2 = ahpeVarA2.d;
            if (ahobVarM2 == null) {
                ahobVarM2 = ahob.m(ahpeVarA2);
            }
            ahnd ahndVar6 = ahnd.b;
            ahnd ahndVar7 = ahneVar3.b;
            if (ahobVarM2 == ahoo.a) {
                ahndVar6 = ahnd.c;
            }
            ahneVar3.b = ahndVar6;
            ahpj ahpjVarD2 = ahns.d(ahpeVarA2, ahobVarM2);
            try {
                defpackage.ze zeVarB = ((defpackage.hqp) obj4).b((defpackage.hqg) obj5, zeVar);
                ahns.d(ahns.a(), ahpjVarD2);
                ahneVar3.b = ahndVar7;
                return zeVarB;
            } catch (java.lang.Throwable th7) {
                try {
                    ahnn.b(th7);
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    ahns.d(ahns.a(), ahpjVarD2);
                    ahneVar3.b = ahndVar7;
                    throw th8;
                }
            }
        }
        aolu aoluVar3 = aolu.a;
        int i3 = this.c;
        if (i3 != 0) {
            if (i3 == 1) {
                aows aowsVar2 = (aows) this.d;
                aooc.af(obj);
                aowsVar = aowsVar2;
            } else if (i3 != 2) {
                aooc.af(obj);
            } else {
                java.lang.Object obj11 = this.b;
                java.lang.Object obj12 = this.a;
                aowsVar = (aows) this.d;
                aooc.af(obj);
                obj7 = obj11;
                obj6 = obj12;
                obj7 = zqqVar;
                obj6 = okoVar;
                final defpackage.mki mkiVar = (defpackage.mki) this.e;
                final oko okoVar2 = (oko) obj6;
                final zqq zqqVar = (zqq) obj7;
                aomyVar = new aomy() { // from class: mjz
                    public final java.lang.Object a() {
                        aoov.an(mkiVar.h, (aolr) null, 0, new defpackage.mka(okoVar2, zqqVar, null), 3);
                        return aojh.a;
                    }
                };
                this.d = null;
                this.a = null;
                this.b = null;
                this.c = 3;
                if (aooh.D(aowsVar, aomyVar, this) == aoluVar3) {
                    return aoluVar3;
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        aows aowsVar3 = (aows) this.d;
        java.lang.Object obj13 = this.e;
        java.lang.Object obj14 = this.f;
        this.d = aowsVar3;
        this.c = 1;
        java.lang.Object objO = ((defpackage.mki) obj13).g.O((android.telecom.PhoneAccountHandle) obj14, this);
        if (objO == aoluVar3) {
            return aoluVar3;
        }
        aowsVar = aowsVar3;
        obj = objO;
        okoVar = (oko) obj;
        if (okoVar == null) {
            aowsVar.e((java.lang.Throwable) null);
            return aojh.a;
        }
        zqq zqqVar2 = new zqq(aowsVar, 1);
        this.d = aowsVar;
        this.a = okoVar;
        this.b = zqqVar2;
        this.c = 2;
        if (okoVar.M(zqqVar2, this) == aoluVar3) {
            obj7 = zqqVar2;
            obj6 = okoVar;
            return aoluVar3;
        }
        obj7 = zqqVar2;
        obj6 = okoVar;
        final defpackage.mki mkiVar2 = (defpackage.mki) this.e;
        final oko okoVar3 = (oko) obj6;
        final zqq zqqVar3 = (zqq) obj7;
        aomyVar = new aomy() { // from class: mjz
            public final java.lang.Object a() {
                aoov.an(mkiVar2.h, (aolr) null, 0, new defpackage.mka(okoVar3, zqqVar3, null), 3);
                return aojh.a;
            }
        };
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = 3;
        if (aooh.D(aowsVar, aomyVar, this) == aoluVar3) {
            return aoluVar3;
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hqr, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.hqq hqqVar = new defpackage.hqq((defpackage.hqr) this.e, (defpackage.tt) this.f, aolnVar, 0);
            hqqVar.d = obj;
            return hqqVar;
        }
        java.lang.Object obj2 = this.e;
        if (i != 1) {
            defpackage.hqq hqqVar2 = new defpackage.hqq((defpackage.mki) obj2, (android.telecom.PhoneAccountHandle) this.f, aolnVar, 2);
            hqqVar2.d = obj;
            return hqqVar2;
        }
        defpackage.hqq hqqVar3 = new defpackage.hqq((defpackage.hqp) obj2, (defpackage.hqg) this.f, aolnVar, 1);
        hqqVar3.d = obj;
        return hqqVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqq(defpackage.hqr hqrVar, defpackage.tt ttVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hqrVar;
        this.f = ttVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqq(defpackage.mki mkiVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = mkiVar;
        this.f = phoneAccountHandle;
    }
}
