package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxf implements tev {
    private final defpackage.lxa b;
    public final teo a = teo.d;
    private final aenj c = new aenj("SuggestedContactSearchSection");

    public lxf(defpackage.lxa lxaVar) {
        this.b = lxaVar;
    }

    public final aenj a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(tet tetVar, tej tejVar, aoln aolnVar) {
        defpackage.lxe lxeVar;
        long j;
        if (aolnVar instanceof defpackage.lxe) {
            lxeVar = (defpackage.lxe) aolnVar;
            int i = lxeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxeVar.d = i - Integer.MIN_VALUE;
            } else {
                lxeVar = new defpackage.lxe(this, aolnVar);
            }
        } else {
            lxeVar = new defpackage.lxe(this, aolnVar);
        }
        defpackage.lxe lxeVar2 = lxeVar;
        java.lang.Object objB = lxeVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = lxeVar2.d;
        if (i2 == 0) {
            aooc.af(objB);
            if (!(tetVar instanceof teq)) {
                return null;
            }
            tin tinVar = ((defpackage.lxc) ((teq) tetVar).a).a;
            long j2 = tinVar.a;
            lxeVar2.a = j2;
            lxeVar2.d = 1;
            objB = this.b.b(tinVar, tejVar, 1, null, lxeVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            j = j2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = lxeVar2.a;
            aooc.af(objB);
        }
        return new defpackage.lxg(j, (tfn) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.lxg lxgVar, aoln aolnVar) {
        defpackage.lxd lxdVar;
        if (aolnVar instanceof defpackage.lxd) {
            lxdVar = (defpackage.lxd) aolnVar;
            int i = lxdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxdVar.c = i - Integer.MIN_VALUE;
            } else {
                lxdVar = new defpackage.lxd(this, aolnVar);
            }
        } else {
            lxdVar = new defpackage.lxd(this, aolnVar);
        }
        java.lang.Object objA = lxdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lxdVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.lxa lxaVar = this.b;
            tfn tfnVar = lxgVar.b;
            lxdVar.d = lxgVar;
            lxdVar.c = 1;
            objA = lxaVar.a(tfnVar, lxdVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lxgVar = lxdVar.d;
            aooc.af(objA);
        }
        tfn tfnVar2 = (tfn) objA;
        long j = lxgVar.a;
        aooh.f(tfnVar2, "searchResultData");
        return new defpackage.lxg(j, tfnVar2);
    }

    public final void d(defpackage.lxg lxgVar, ten tenVar, cav cavVar, int i) {
        int i2;
        ten tenVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-2010378292);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(lxgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(tenVar) : cavVarB.D(tenVar)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            tenVar2 = tenVar;
            snl.aD((cmw) null, tenVar2, tfo.a(lxgVar.b, tenVar.c), (aonn) null, cavVarB, i2 & 112);
        } else {
            tenVar2 = tenVar;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko(this, lxgVar, tenVar2, i, 18);
        }
    }
}
