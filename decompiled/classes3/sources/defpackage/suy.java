package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class suy extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ java.util.Set d;
    final /* synthetic */ amzg e;
    final /* synthetic */ amzg f;
    final /* synthetic */ amzg g;
    final /* synthetic */ aoin h;
    final /* synthetic */ boolean i;
    final /* synthetic */ rlv j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suy(java.util.Set set, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, aoin aoinVar, boolean z, rlv rlvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = set;
        this.e = amzgVar;
        this.f = amzgVar2;
        this.g = amzgVar3;
        this.h = aoinVar;
        this.i = z;
        this.j = rlvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115 A[PHI: r12
      0x0115: PHI (r12v34 java.lang.Object) = (r12v25 java.lang.Object), (r12v0 java.lang.Object) binds: [B:44:0x0113, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        rlv rlvVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        rlv rlvVar2;
        java.lang.Object objA;
        rlv rlvVar3;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        rlv rlvVar4;
        java.lang.Object objA2;
        rlv rlvVar5;
        java.lang.Object obj3 = aolu.a;
        int i = this.c;
        if (i == 0) {
            aooc.af(obj);
            if (this.d.size() < 2) {
                ajcq ajcqVarD = this.e.d();
                this.c = 1;
                obj = aosv.D(ajcqVarD, this);
                if (obj != obj3) {
                }
                return obj3;
            }
            defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>", 157, "SimSelectorProducerModule.kt").v("conflict preferred sims; no selected sim");
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                obj2 = this.b;
                java.lang.Object obj4 = this.a;
                aooc.af(obj);
                rlvVar = obj4;
                if (obj == nvr.a) {
                    rlvVar.n(rmw.gi);
                    return null;
                }
                defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 166, "SimSelectorProducerModule.kt").v("use preferred sim");
                rlvVar.n(rmw.gh);
                return obj2;
            }
            if (i != 3) {
                if (i == 4) {
                    obj3 = this.b;
                    java.lang.Object obj5 = this.a;
                    aooc.af(obj);
                    rlvVar3 = obj5;
                    if (obj != nvr.a) {
                        rlvVar3.n(rmw.gk);
                        return null;
                    }
                    defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 183, "SimSelectorProducerModule.kt").v("use default sim");
                    rlvVar3.n(rmw.gj);
                    return obj3;
                }
                if (i == 5) {
                    aooc.af(obj);
                    phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                    if (phoneAccountHandle2 != null) {
                        aoin aoinVar = this.h;
                        boolean z = this.i;
                        rlvVar4 = this.j;
                        nvw nvwVar = (nvw) aoinVar.a();
                        this.a = rlvVar4;
                        this.b = phoneAccountHandle2;
                        this.c = 6;
                        objA2 = nvwVar.a(phoneAccountHandle2, z, this);
                        if (objA2 != obj3) {
                            obj3 = phoneAccountHandle2;
                            obj = objA2;
                            rlvVar5 = rlvVar4;
                        }
                        return obj3;
                    }
                    return null;
                }
                obj3 = this.b;
                java.lang.Object obj6 = this.a;
                aooc.af(obj);
                rlvVar5 = obj6;
                if (obj != nvr.a) {
                    rlvVar5.n(rmw.gm);
                    return null;
                }
                defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 200, "SimSelectorProducerModule.kt").v("use suggested sim");
                rlvVar5.n(rmw.gl);
                return obj3;
            }
            aooc.af(obj);
            phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
            if (phoneAccountHandle != null) {
                aoin aoinVar2 = this.h;
                boolean z2 = this.i;
                rlvVar2 = this.j;
                nvw nvwVar2 = (nvw) aoinVar2.a();
                this.a = rlvVar2;
                this.b = phoneAccountHandle;
                this.c = 4;
                objA = nvwVar2.a(phoneAccountHandle, z2, this);
                if (objA != obj3) {
                    obj3 = phoneAccountHandle;
                    obj = objA;
                    rlvVar3 = rlvVar2;
                    if (obj != nvr.a) {
                        rlvVar3.n(rmw.gk);
                        return null;
                    }
                    defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 183, "SimSelectorProducerModule.kt").v("use default sim");
                    rlvVar3.n(rmw.gj);
                }
            } else {
                ajcq ajcqVarD2 = this.g.d();
                this.c = 5;
                obj = aosv.D(ajcqVarD2, this);
                if (obj != obj3) {
                    phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                    if (phoneAccountHandle2 != null) {
                        aoin aoinVar3 = this.h;
                        boolean z3 = this.i;
                        rlvVar4 = this.j;
                        nvw nvwVar3 = (nvw) aoinVar3.a();
                        this.a = rlvVar4;
                        this.b = phoneAccountHandle2;
                        this.c = 6;
                        objA2 = nvwVar3.a(phoneAccountHandle2, z3, this);
                        if (objA2 != obj3) {
                            obj3 = phoneAccountHandle2;
                            obj = objA2;
                            rlvVar5 = rlvVar4;
                            if (obj != nvr.a) {
                                defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 200, "SimSelectorProducerModule.kt").v("use suggested sim");
                                rlvVar5.n(rmw.gl);
                            } else {
                                rlvVar5.n(rmw.gm);
                            }
                        }
                    }
                    return null;
                }
            }
            return obj3;
        }
        aooc.af(obj);
        android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj;
        if (phoneAccountHandle3 != null) {
            aoin aoinVar4 = this.h;
            boolean z4 = this.i;
            rlv rlvVar6 = this.j;
            nvw nvwVar4 = (nvw) aoinVar4.a();
            this.a = rlvVar6;
            this.b = phoneAccountHandle3;
            this.c = 2;
            java.lang.Object objA3 = nvwVar4.a(phoneAccountHandle3, z4, this);
            if (objA3 != obj3) {
                obj2 = phoneAccountHandle3;
                obj = objA3;
                rlvVar = rlvVar6;
                if (obj == nvr.a) {
                    rlvVar.n(rmw.gi);
                    return null;
                }
                defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 166, "SimSelectorProducerModule.kt").v("use preferred sim");
                rlvVar.n(rmw.gh);
                return obj2;
            }
        } else {
            ajcq ajcqVarD3 = this.f.d();
            this.c = 3;
            obj = aosv.D(ajcqVarD3, this);
            if (obj != obj3) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                if (phoneAccountHandle != null) {
                    aoin aoinVar5 = this.h;
                    boolean z5 = this.i;
                    rlvVar2 = this.j;
                    nvw nvwVar5 = (nvw) aoinVar5.a();
                    this.a = rlvVar2;
                    this.b = phoneAccountHandle;
                    this.c = 4;
                    objA = nvwVar5.a(phoneAccountHandle, z5, this);
                    if (objA != obj3) {
                        obj3 = phoneAccountHandle;
                        obj = objA;
                        rlvVar3 = rlvVar2;
                        if (obj != nvr.a) {
                            rlvVar3.n(rmw.gk);
                            return null;
                        }
                        defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 183, "SimSelectorProducerModule.kt").v("use default sim");
                        rlvVar3.n(rmw.gj);
                    }
                } else {
                    ajcq ajcqVarD4 = this.g.d();
                    this.c = 5;
                    obj = aosv.D(ajcqVarD4, this);
                    if (obj != obj3) {
                        phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                        if (phoneAccountHandle2 != null) {
                            aoin aoinVar6 = this.h;
                            boolean z6 = this.i;
                            rlvVar4 = this.j;
                            nvw nvwVar6 = (nvw) aoinVar6.a();
                            this.a = rlvVar4;
                            this.b = phoneAccountHandle2;
                            this.c = 6;
                            objA2 = nvwVar6.a(phoneAccountHandle2, z6, this);
                            if (objA2 != obj3) {
                                obj3 = phoneAccountHandle2;
                                obj = objA2;
                                rlvVar5 = rlvVar4;
                                if (obj != nvr.a) {
                                    defpackage.suz.a.b().l("com/android/dialer/preferredsim/impl/simselector/SimSelectorProducerModule$Companion", "produceSelectedSim$<anonymous>$<anonymous>", 200, "SimSelectorProducerModule.kt").v("use suggested sim");
                                    rlvVar5.n(rmw.gl);
                                } else {
                                    rlvVar5.n(rmw.gm);
                                }
                            }
                        }
                        return null;
                    }
                }
            }
        }
        return obj3;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.suy(this.d, this.e, this.f, this.g, this.h, this.i, this.j, aolnVar);
    }
}
