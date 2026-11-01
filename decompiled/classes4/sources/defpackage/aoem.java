package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoem extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ aonj e;
    final /* synthetic */ aoxh f;
    final /* synthetic */ defpackage.anql g;
    final /* synthetic */ defpackage.apjb h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoem(aonj aonjVar, aoxh aoxhVar, defpackage.apjb apjbVar, defpackage.anql anqlVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = aonjVar;
        this.f = aoxhVar;
        this.h = apjbVar;
        this.g = anqlVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5, types: [aoxh, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Throwable th;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        apdp apdpVar;
        java.lang.Object objAe;
        java.lang.Throwable thC;
        java.lang.Object obj2;
        java.lang.Throwable th2;
        apdp apdpVar2;
        apdp apdpVar3;
        anqw anqwVarD;
        anph anphVar;
        anph anphVar2;
        anqw anqwVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aolu aoluVar = aolu.a;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.c;
                if (i != 2) {
                    java.lang.Object obj6 = this.b;
                    anphVar2 = (anph) this.a;
                    anqwVar = (anqw) this.i;
                    aooc.af(obj);
                    obj4 = obj6;
                } else {
                    java.lang.Object obj7 = this.b;
                    th2 = (java.lang.Throwable) this.a;
                    apdp apdpVar4 = (apdp) this.i;
                    aooc.af(obj);
                    obj3 = obj7;
                    apdpVar2 = apdpVar4;
                    try {
                        ((defpackage.anql) obj2).d(new anph());
                        ((apdp) obj3).d();
                        thC = th2;
                        apdpVar3 = apdpVar2;
                        apdpVar3 = apdpVar;
                        j$.util.Objects.checkIndex(0, 2);
                        if (thC == null) {
                            anqwVarD = anqw.b;
                        } else if (thC instanceof java.util.concurrent.CancellationException) {
                            anqwVarD = anqw.c.e(thC);
                        } else {
                            anqwVarD = anqw.d(thC);
                        }
                        if (thC != null || (anphVar = anqw.a(thC)) == null) {
                            anphVar = new anph();
                        }
                        obj2 = this.g;
                        this.i = anqwVarD;
                        this.a = anphVar;
                        this.b = apdpVar3;
                        this.c = obj2;
                        this.d = 3;
                        if (apdpVar3.b(this) != aoluVar) {
                            return aoluVar;
                        }
                        anphVar2 = anphVar;
                        anqwVar = anqwVarD;
                        obj4 = apdpVar3;
                    } catch (java.lang.Throwable th3) {
                        ((apdp) obj3).d();
                        throw th3;
                    }
                }
            } else {
                atomicBoolean = (java.util.concurrent.atomic.AtomicBoolean) this.a;
                apdpVar = (apdp) this.i;
                try {
                    aooc.af(obj);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    objAe = aooc.ae(th);
                }
            }
            obj5 = obj4;
            try {
                ((defpackage.anql) obj2).a(anqwVar, anphVar2);
                return aojh.a;
            } finally {
                ((apdp) obj5).d();
            }
        }
        aooc.af(obj);
        apdp apdpVar5 = new apdp();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
        aonj aonjVar = this.e;
        aoxh aoxhVar = this.f;
        defpackage.apjb apjbVar = this.h;
        defpackage.anql anqlVar = this.g;
        try {
            ?? A = aonjVar.a(aoxhVar);
            defpackage.aoel aoelVar = new defpackage.aoel(atomicBoolean2, apdpVar5, apjbVar, anqlVar, 0);
            this.i = apdpVar5;
            this.a = atomicBoolean2;
            this.d = 1;
            if (A.fM(aoelVar, this) == aoluVar) {
                return aoluVar;
            }
            atomicBoolean = atomicBoolean2;
            apdpVar = apdpVar5;
        } catch (java.lang.Throwable th5) {
            th = th5;
            atomicBoolean = atomicBoolean2;
            apdpVar = apdpVar5;
            objAe = aooc.ae(th);
        }
        objAe = aojh.a;
        apdp apdpVar6 = apdpVar;
        thC = aoiw.c(objAe);
        apdpVar3 = apdpVar6;
        if (thC == null && atomicBoolean.compareAndSet(false, true)) {
            obj2 = this.g;
            this.i = apdpVar6;
            this.a = null;
            this.b = apdpVar6;
            this.c = obj2;
            this.d = 2;
            if (apdpVar6.b(this) == aoluVar) {
                apdpVar3 = apdpVar6;
                return aoluVar;
            }
            apdpVar3 = apdpVar6;
            th2 = thC;
            apdp apdpVar7 = apdpVar6;
            apdpVar2 = apdpVar7;
            obj3 = apdpVar7;
            ((defpackage.anql) obj2).d(new anph());
            ((apdp) obj3).d();
            thC = th2;
            apdpVar3 = apdpVar2;
        }
        apdpVar3 = apdpVar6;
        j$.util.Objects.checkIndex(0, 2);
        if (thC == null) {
            anqwVarD = anqw.b;
        } else if (thC instanceof java.util.concurrent.CancellationException) {
            anqwVarD = anqw.c.e(thC);
        } else {
            anqwVarD = anqw.d(thC);
        }
        if (thC != null) {
            anphVar = new anph();
        } else {
            anphVar = new anph();
        }
        obj2 = this.g;
        this.i = anqwVarD;
        this.a = anphVar;
        this.b = apdpVar3;
        this.c = obj2;
        this.d = 3;
        if (apdpVar3.b(this) != aoluVar) {
            return aoluVar;
        }
        anphVar2 = anphVar;
        anqwVar = anqwVarD;
        obj4 = apdpVar3;
        obj5 = obj4;
        ((defpackage.anql) obj2).a(anqwVar, anphVar2);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aoem aoemVar = new defpackage.aoem(this.e, this.f, this.h, this.g, aolnVar);
        aoemVar.i = obj;
        return aoemVar;
    }
}
