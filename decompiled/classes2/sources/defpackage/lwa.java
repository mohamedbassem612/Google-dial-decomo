package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwa implements tev {
    private final defpackage.lxa b;
    public final teo a = teo.b;
    private final aenj c = new aenj("ContactSearchSection");

    public lwa(defpackage.lxa lxaVar) {
        this.b = lxaVar;
    }

    public final aenj a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(tet tetVar, tej tejVar, aoln aolnVar) {
        defpackage.lvz lvzVar;
        long j;
        if (aolnVar instanceof defpackage.lvz) {
            lvzVar = (defpackage.lvz) aolnVar;
            int i = lvzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvzVar.d = i - Integer.MIN_VALUE;
            } else {
                lvzVar = new defpackage.lvz(this, aolnVar);
            }
        } else {
            lvzVar = new defpackage.lvz(this, aolnVar);
        }
        defpackage.lvz lvzVar2 = lvzVar;
        java.lang.Object objB = lvzVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = lvzVar2.d;
        if (i2 == 0) {
            aooc.af(objB);
            if (!(tetVar instanceof teq)) {
                return null;
            }
            tin tinVar = ((defpackage.lxb) ((teq) tetVar).a).a;
            long j2 = tinVar.a;
            lvzVar2.a = j2;
            lvzVar2.d = 1;
            objB = this.b.b(tinVar, tejVar, 3, null, lvzVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            j = j2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = lvzVar2.a;
            aooc.af(objB);
        }
        return new defpackage.lwb(j, (tfn) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.lwb lwbVar, aoln aolnVar) {
        defpackage.lvy lvyVar;
        if (aolnVar instanceof defpackage.lvy) {
            lvyVar = (defpackage.lvy) aolnVar;
            int i = lvyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvyVar.c = i - Integer.MIN_VALUE;
            } else {
                lvyVar = new defpackage.lvy(this, aolnVar);
            }
        } else {
            lvyVar = new defpackage.lvy(this, aolnVar);
        }
        java.lang.Object objA = lvyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lvyVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.lxa lxaVar = this.b;
            tfn tfnVar = lwbVar.b;
            lvyVar.d = lwbVar;
            lvyVar.c = 1;
            objA = lxaVar.a(tfnVar, lvyVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lwbVar = lvyVar.d;
            aooc.af(objA);
        }
        tfn tfnVar2 = (tfn) objA;
        long j = lwbVar.a;
        aooh.f(tfnVar2, "searchResultData");
        return new defpackage.lwb(j, tfnVar2);
    }

    public final void d(defpackage.lwb lwbVar, ten tenVar, cav cavVar, int i) {
        int i2;
        ten tenVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1644917723);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(lwbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(tenVar) : cavVarB.D(tenVar)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            tenVar2 = tenVar;
            snl.aD((cmw) null, tenVar2, tfo.a(lwbVar.b, tenVar.c), (aonn) null, cavVarB, i2 & 112);
        } else {
            tenVar2 = tenVar;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko(this, lwbVar, tenVar2, i, 16);
        }
    }
}
