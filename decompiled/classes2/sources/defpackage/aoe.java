package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aoe extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ aonj f;
    final /* synthetic */ java.lang.Enum g;
    final /* synthetic */ java.lang.Object h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoe(defpackage.akd akdVar, nf nfVar, aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.g = akdVar;
        this.h = nfVar;
        this.f = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [aoub, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        aonj aonjVar;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Throwable th;
        java.lang.Object obj6;
        java.lang.Object obj7;
        nf nfVar;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        vx vxVar;
        java.lang.Object obj8;
        aonj aonjVar2;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Throwable th2;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        int i = this.$cid;
        java.lang.Object obj15 = this.i;
        if (i != 0) {
            apdp apdpVar = (aoss) obj15;
            aolu aoluVar = aolu.a;
            int i2 = this.e;
            try {
                try {
                    if (i2 == 0) {
                        aooc.af(obj);
                        java.lang.Enum r11 = this.g;
                        aoub aoubVar = apdpVar.c().get(aoub.d);
                        if (aoubVar == null) {
                            aooh.g();
                        }
                        vx vxVar2 = new vx(r11, aoubVar, (char[]) null);
                        java.lang.Object obj16 = this.h;
                        do {
                            nfVar = (nf) obj16;
                            atomicReference = (java.util.concurrent.atomic.AtomicReference) nfVar.b;
                            vxVar = (vx) atomicReference.get();
                            if (vxVar != null) {
                                if (((defpackage.akd) vxVar2.b).compareTo((java.lang.Enum) vxVar.b) < 0) {
                                    throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                                }
                            }
                        } while (!anty.Q(atomicReference, vxVar, vxVar2));
                        if (vxVar != null) {
                            vxVar.a.s(new defpackage.ake());
                        }
                        obj8 = nfVar.a;
                        aonj aonjVar3 = this.f;
                        this.i = null;
                        this.a = vxVar2;
                        this.b = obj8;
                        this.c = aonjVar3;
                        this.d = obj16;
                        this.e = 1;
                        if (((apdp) obj8).b(this) == aoluVar) {
                            return aoluVar;
                        }
                        aonjVar2 = aonjVar3;
                        obj9 = obj16;
                        obj10 = vxVar2;
                    } else if (i2 != 1) {
                        obj11 = (nf) this.c;
                        obj13 = this.b;
                        obj12 = this.a;
                        try {
                            aooc.af(obj);
                            obj14 = obj12;
                            anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj11).b, obj14);
                            ((apdp) obj13).d();
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                            anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj11).b, obj12);
                            throw th2;
                        }
                    } else {
                        obj9 = this.d;
                        aonjVar2 = (aonj) this.c;
                        java.lang.Object obj17 = this.b;
                        java.lang.Object obj18 = this.a;
                        aooc.af(obj);
                        obj8 = obj17;
                        obj10 = obj18;
                    }
                    this.i = null;
                    this.a = obj10;
                    this.b = obj8;
                    this.c = obj9;
                    this.d = null;
                    this.e = 2;
                    java.lang.Object objA = aonjVar2.a(this);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    obj11 = obj9;
                    obj13 = obj8;
                    obj = objA;
                    obj14 = obj10;
                    anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj11).b, obj14);
                    ((apdp) obj13).d();
                } catch (java.lang.Throwable th4) {
                    obj11 = obj9;
                    th2 = th4;
                    obj12 = obj10;
                    anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj11).b, obj12);
                    throw th2;
                }
            } catch (java.lang.Throwable th5) {
                apdpVar.d();
                throw th5;
            }
        } else {
            apdp apdpVar2 = (aoss) obj15;
            aolu aoluVar2 = aolu.a;
            int i3 = this.e;
            try {
                try {
                    if (i3 == 0) {
                        aooc.af(obj);
                        java.lang.Enum r12 = this.g;
                        aoub aoubVar2 = apdpVar2.c().get(aoub.d);
                        if (aoubVar2 == null) {
                            aooh.g();
                        }
                        vx vxVar3 = new vx(r12, aoubVar2, (byte[]) null);
                        obj2 = this.h;
                        nf nfVar2 = (nf) obj2;
                        nfVar2.T(vxVar3);
                        aonj aonjVar4 = this.f;
                        this.i = null;
                        this.a = vxVar3;
                        obj3 = nfVar2.a;
                        this.b = obj3;
                        this.c = aonjVar4;
                        this.d = obj2;
                        this.e = 1;
                        if (((apdp) obj3).b(this) == aoluVar2) {
                            return aoluVar2;
                        }
                        aonjVar = aonjVar4;
                        obj4 = vxVar3;
                    } else if (i3 != 1) {
                        obj5 = (nf) this.c;
                        obj3 = this.b;
                        obj6 = this.a;
                        try {
                            aooc.af(obj);
                            obj7 = obj6;
                            anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj5).b, obj7);
                            ((apdp) obj3).d();
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj5).b, obj6);
                            throw th;
                        }
                    } else {
                        java.lang.Object obj19 = this.d;
                        aonjVar = (aonj) this.c;
                        java.lang.Object obj20 = this.b;
                        java.lang.Object obj21 = this.a;
                        aooc.af(obj);
                        obj2 = obj19;
                        obj3 = obj20;
                        obj4 = obj21;
                    }
                    this.i = null;
                    this.a = obj4;
                    this.b = obj3;
                    this.c = obj2;
                    this.d = null;
                    this.e = 2;
                    java.lang.Object objA2 = aonjVar.a(this);
                    if (objA2 == aoluVar2) {
                        return aoluVar2;
                    }
                    obj5 = obj2;
                    obj = objA2;
                    obj7 = obj4;
                    anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj5).b, obj7);
                    ((apdp) obj3).d();
                } catch (java.lang.Throwable th7) {
                    obj5 = obj2;
                    th = th7;
                    obj6 = obj4;
                    anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj5).b, obj6);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                apdpVar2.d();
                throw th8;
            }
        }
        return obj;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Enum r1 = this.g;
        if (i != 0) {
            defpackage.akd akdVar = (defpackage.akd) r1;
            defpackage.aoe aoeVar = new defpackage.aoe(akdVar, (nf) this.h, this.f, aolnVar, 1);
            aoeVar.i = obj;
            return aoeVar;
        }
        defpackage.aoc aocVar = (defpackage.aoc) r1;
        defpackage.aoe aoeVar2 = new defpackage.aoe(aocVar, (nf) this.h, this.f, aolnVar, 0);
        aoeVar2.i = obj;
        return aoeVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoe(defpackage.aoc aocVar, nf nfVar, aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.g = aocVar;
        this.h = nfVar;
        this.f = aonjVar;
    }
}
