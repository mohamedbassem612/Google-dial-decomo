package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ikf extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    final /* synthetic */ defpackage.ikj h;
    final /* synthetic */ igs i;
    final /* synthetic */ ifv j;
    final /* synthetic */ ifz k;
    final /* synthetic */ defpackage.igg l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikf(defpackage.ikj ikjVar, igs igsVar, ifv ifvVar, ifz ifzVar, defpackage.igg iggVar, aoln aolnVar) {
        super(2, aolnVar);
        this.h = ikjVar;
        this.i = igsVar;
        this.j = ifvVar;
        this.k = ifzVar;
        this.l = iggVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bc A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:10:0x0023, B:25:0x00a3, B:28:0x00b6, B:36:0x00f5, B:38:0x0119, B:40:0x0121, B:30:0x00bc, B:31:0x00c0, B:33:0x00c6, B:35:0x00d0), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:10:0x0023, B:25:0x00a3, B:28:0x00b6, B:36:0x00f5, B:38:0x0119, B:40:0x0121, B:30:0x00bc, B:31:0x00c0, B:33:0x00c6, B:35:0x00d0), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0119 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:10:0x0023, B:25:0x00a3, B:28:0x00b6, B:36:0x00f5, B:38:0x0119, B:40:0x0121, B:30:0x00bc, B:31:0x00c0, B:33:0x00c6, B:35:0x00d0), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[LOOP:0: B:31:0x00c0->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object objA;
        java.lang.Object obj9;
        java.lang.Object obj10;
        defpackage.igp igpVar;
        alat alatVar;
        java.util.Iterator it;
        defpackage.igx igxVarR;
        java.lang.String str;
        java.lang.Object objAj;
        java.lang.Object obj11;
        aolu aoluVar = aolu.a;
        int i = this.g;
        try {
            if (i == 0) {
                aooc.af(obj);
                defpackage.ikj ikjVar = this.h;
                igs igsVar = this.i;
                obj2 = this.j;
                ifz ifzVar = this.k;
                defpackage.igg iggVar = this.l;
                apdp apdpVar = ikjVar.e;
                this.a = apdpVar;
                this.b = igsVar;
                this.c = ikjVar;
                this.d = obj2;
                this.e = ifzVar;
                this.f = iggVar;
                this.g = 1;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj3 = ikjVar;
                obj4 = iggVar;
                obj5 = igsVar;
                obj6 = ifzVar;
                obj7 = apdpVar;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        obj8 = this.a;
                        try {
                            aooc.af(obj);
                            objAj = obj;
                            obj8 = obj8;
                            igxVarR = (defpackage.igx) objAj;
                            obj11 = obj8;
                            defpackage.igx igxVar = igxVarR;
                            ((apdp) obj11).d();
                            return igxVar;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            ((apdp) obj8).d();
                            throw th;
                        }
                    }
                    obj4 = this.f;
                    java.lang.Object obj12 = this.e;
                    java.lang.Object obj13 = this.d;
                    java.lang.Object obj14 = this.c;
                    java.lang.Object obj15 = this.b;
                    java.lang.Object obj16 = this.a;
                    try {
                        aooc.af(obj);
                        obj9 = obj15;
                        obj3 = obj14;
                        obj2 = obj13;
                        obj6 = obj12;
                        objA = obj;
                        obj10 = obj16;
                        igpVar = (defpackage.igp) objA;
                        alatVar = igpVar.b;
                        aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
                        if ((alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                            it = alatVar.iterator();
                            while (it.hasNext()) {
                                if (!((defpackage.igo) it.next()).e) {
                                    defpackage.ikj.a.b().l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl", "startWithMultiSessionSupport$<anonymous>$<anonymous>", 157, "AudioPrismCompositeModelRunnerImpl.kt").v("Not all models available, not starting runners");
                                    defpackage.hgw hgwVarK = defpackage.hht.k(defpackage.igx.a.m());
                                    hgwVarK.s(igpVar);
                                    igxVarR = hgwVarK.r();
                                    obj11 = obj10;
                                    defpackage.igx igxVar2 = igxVarR;
                                    ((apdp) obj11).d();
                                    return igxVar2;
                                }
                            }
                        }
                        defpackage.ikj.a.b().l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl", "startWithMultiSessionSupport$<anonymous>$<anonymous>", 146, "AudioPrismCompositeModelRunnerImpl.kt").v("All models available, proceeding to start runners");
                        ((defpackage.ikj) obj3).d.put(obj2, obj9);
                        if ((((igs) obj9).b & 1) != 0) {
                            str = ((igs) obj9).d;
                        } else {
                            str = null;
                        }
                        this.a = obj10;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.g = 3;
                        objAj = aoov.aj(((defpackage.ikj) obj3).b, new defpackage.ike((igs) obj9, (defpackage.ikj) obj3, (ifv) obj2, (ifz) obj6, str, (defpackage.igg) obj4, igpVar, null), this);
                        if (objAj == aoluVar) {
                            return aoluVar;
                        }
                        obj8 = obj10;
                        igxVarR = (defpackage.igx) objAj;
                        obj11 = obj8;
                        defpackage.igx igxVar3 = igxVarR;
                        ((apdp) obj11).d();
                        return igxVar3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        obj8 = obj16;
                        ((apdp) obj8).d();
                        throw th;
                    }
                }
                obj4 = this.f;
                obj6 = this.e;
                obj2 = this.d;
                obj3 = this.c;
                obj5 = this.b;
                java.lang.Object obj17 = this.a;
                aooc.af(obj);
                obj7 = obj17;
            }
            if (((igs) obj5).c.size() == 0) {
                throw new java.lang.IllegalArgumentException("no models specified in config");
            }
            if (((defpackage.ikj) obj3).d.get(obj2) != null) {
                throw new java.lang.IllegalStateException("this feature is already running");
            }
            defpackage.ikc ikcVar = ((defpackage.ikj) obj3).f;
            this.a = obj7;
            this.b = obj5;
            this.c = obj3;
            this.d = obj2;
            this.e = obj6;
            this.f = obj4;
            this.g = 2;
            objA = ikcVar.a((igs) obj5, this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            java.lang.Object obj18 = obj7;
            obj9 = obj5;
            obj10 = obj18;
            igpVar = (defpackage.igp) objA;
            alatVar = igpVar.b;
            aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
            if (alatVar instanceof java.util.Collection) {
                it = alatVar.iterator();
                while (it.hasNext()) {
                    if (!((defpackage.igo) it.next()).e) {
                        defpackage.ikj.a.b().l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl", "startWithMultiSessionSupport$<anonymous>$<anonymous>", 157, "AudioPrismCompositeModelRunnerImpl.kt").v("Not all models available, not starting runners");
                        defpackage.hgw hgwVarK2 = defpackage.hht.k(defpackage.igx.a.m());
                        hgwVarK2.s(igpVar);
                        igxVarR = hgwVarK2.r();
                        obj11 = obj10;
                    }
                }
                defpackage.ikj.a.b().l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl", "startWithMultiSessionSupport$<anonymous>$<anonymous>", 146, "AudioPrismCompositeModelRunnerImpl.kt").v("All models available, proceeding to start runners");
                ((defpackage.ikj) obj3).d.put(obj2, obj9);
                if ((((igs) obj9).b & 1) != 0) {
                    str = ((igs) obj9).d;
                } else {
                    str = null;
                }
                this.a = obj10;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = 3;
                objAj = aoov.aj(((defpackage.ikj) obj3).b, new defpackage.ike((igs) obj9, (defpackage.ikj) obj3, (ifv) obj2, (ifz) obj6, str, (defpackage.igg) obj4, igpVar, null), this);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                obj8 = obj10;
                igxVarR = (defpackage.igx) objAj;
                obj11 = obj8;
            } else {
                it = alatVar.iterator();
                while (it.hasNext()) {
                    if (!((defpackage.igo) it.next()).e) {
                        defpackage.ikj.a.b().l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl", "startWithMultiSessionSupport$<anonymous>$<anonymous>", 157, "AudioPrismCompositeModelRunnerImpl.kt").v("Not all models available, not starting runners");
                        defpackage.hgw hgwVarK3 = defpackage.hht.k(defpackage.igx.a.m());
                        hgwVarK3.s(igpVar);
                        igxVarR = hgwVarK3.r();
                        obj11 = obj10;
                    }
                }
                defpackage.ikj.a.b().l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCompositeModelRunnerImpl", "startWithMultiSessionSupport$<anonymous>$<anonymous>", 146, "AudioPrismCompositeModelRunnerImpl.kt").v("All models available, proceeding to start runners");
                ((defpackage.ikj) obj3).d.put(obj2, obj9);
                if ((((igs) obj9).b & 1) != 0) {
                    str = ((igs) obj9).d;
                } else {
                    str = null;
                }
                this.a = obj10;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = 3;
                objAj = aoov.aj(((defpackage.ikj) obj3).b, new defpackage.ike((igs) obj9, (defpackage.ikj) obj3, (ifv) obj2, (ifz) obj6, str, (defpackage.igg) obj4, igpVar, null), this);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                obj8 = obj10;
                igxVarR = (defpackage.igx) objAj;
                obj11 = obj8;
            }
            defpackage.igx igxVar4 = igxVarR;
            ((apdp) obj11).d();
            return igxVar4;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj8 = obj7;
            ((apdp) obj8).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ikf(this.h, this.i, this.j, this.k, this.l, aolnVar);
    }
}
