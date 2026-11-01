package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bis implements defpackage.biw {
    private final aonq a;
    private final nf c = new nf((char[]) null, (byte[]) null, (byte[]) null);
    private final ccp b = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);

    public bis(aonq aonqVar) {
        this.a = aonqVar;
    }

    public final defpackage.biq a() {
        return (defpackage.biq) this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.biw
    public final java.lang.Object b(defpackage.biv bivVar, aoln aolnVar) {
        defpackage.bir birVar;
        if (aolnVar instanceof defpackage.bir) {
            birVar = (defpackage.bir) aolnVar;
            int i = birVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                birVar.c = i - Integer.MIN_VALUE;
            } else {
                birVar = new defpackage.bir(this, aolnVar);
            }
        } else {
            birVar = new defpackage.bir(this, aolnVar);
        }
        java.lang.Object obj = birVar.a;
        aolu aoluVar = aolu.a;
        int i2 = birVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.biq biqVar = new defpackage.biq(bivVar);
            nf nfVar = this.c;
            defpackage.bhp bhpVar = new defpackage.bhp(this, biqVar, (aoln) null, 2);
            birVar.c = 1;
            if (nf.S(nfVar, bhpVar, birVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final void c(aomy aomyVar, cav cavVar, int i) {
        int i2;
        aomy aomyVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(723898654);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(this) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.biq biqVarA = a();
            if (biqVarA == null) {
                cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.amv(this, aomyVar, i, 13);
                    return;
                }
                return;
            }
            aomyVar2 = aomyVar;
            this.a.a(biqVarA, biqVarA.a, aomyVar2, cavVarB, java.lang.Integer.valueOf((i2 << 6) & 896));
        } else {
            aomyVar2 = aomyVar;
            cavVarB.s();
        }
        cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new defpackage.amv(this, aomyVar2, i, 14);
        }
    }

    public final void d(defpackage.biq biqVar) {
        this.b.b(biqVar);
    }
}
