package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aof extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    final /* synthetic */ defpackage.aoc g;
    final /* synthetic */ aonn h;
    final /* synthetic */ java.lang.Object i;
    final /* synthetic */ nf j;
    private /* synthetic */ java.lang.Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aof(defpackage.aoc aocVar, nf nfVar, aonn aonnVar, java.lang.Object obj, aoln aolnVar) {
        super(2, aolnVar);
        this.g = aocVar;
        this.j = nfVar;
        this.h = aonnVar;
        this.i = obj;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aonn aonnVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Throwable th;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        aoss aossVar = (aoss) this.k;
        apdp apdpVar = aolu.a;
        int i = this.f;
        try {
            try {
                if (i == 0) {
                    aooc.af(obj);
                    defpackage.aoc aocVar = this.g;
                    aoub aoubVar = aossVar.c().get(aoub.d);
                    if (aoubVar == null) {
                        aooh.g();
                    }
                    vx vxVar = new vx(aocVar, aoubVar, (byte[]) null);
                    nf nfVar = this.j;
                    nfVar.T(vxVar);
                    aonn aonnVar2 = this.h;
                    java.lang.Object obj9 = this.i;
                    this.k = null;
                    this.a = vxVar;
                    java.lang.Object obj10 = nfVar.a;
                    this.b = obj10;
                    this.c = aonnVar2;
                    this.d = obj9;
                    this.e = nfVar;
                    this.f = 1;
                    if (((apdp) obj10).b(this) == apdpVar) {
                        return apdpVar;
                    }
                    aonnVar = aonnVar2;
                    obj2 = nfVar;
                    obj3 = obj9;
                    obj4 = obj10;
                    obj5 = vxVar;
                } else {
                    if (i != 1) {
                        obj2 = (nf) this.c;
                        obj8 = this.b;
                        obj6 = this.a;
                        try {
                            aooc.af(obj);
                            obj7 = obj6;
                            anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj2).b, obj7);
                            ((apdp) obj8).d();
                            return obj;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj2).b, obj6);
                            throw th;
                        }
                    }
                    obj2 = this.e;
                    java.lang.Object obj11 = this.d;
                    aonnVar = (aonn) this.c;
                    obj4 = this.b;
                    java.lang.Object obj12 = this.a;
                    aooc.af(obj);
                    obj3 = obj11;
                    obj5 = obj12;
                }
                this.k = null;
                this.a = obj5;
                this.b = obj4;
                this.c = obj2;
                this.d = null;
                this.e = null;
                this.f = 2;
                obj = aonnVar.a(obj3, this);
                if (obj == apdpVar) {
                    return apdpVar;
                }
                obj7 = obj5;
                obj8 = obj4;
                anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj2).b, obj7);
                ((apdp) obj8).d();
                return obj;
            } catch (java.lang.Throwable th3) {
                th = th3;
                obj6 = obj5;
                anty.ar((java.util.concurrent.atomic.AtomicReference) ((nf) obj2).b, obj6);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            apdpVar.d();
            throw th4;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aof aofVar = new defpackage.aof(this.g, this.j, this.h, this.i, aolnVar);
        aofVar.k = obj;
        return aofVar;
    }
}
