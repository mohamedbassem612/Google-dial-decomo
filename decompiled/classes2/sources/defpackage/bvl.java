package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bvl implements aonn {
    public final /* synthetic */ cmw a;
    public final /* synthetic */ crd b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ amu e;
    public final /* synthetic */ float f;
    public final /* synthetic */ aonn g;

    public /* synthetic */ bvl(cmw cmwVar, crd crdVar, long j, float f, amu amuVar, float f2, aonn aonnVar) {
        this.a = cmwVar;
        this.b = crdVar;
        this.c = j;
        this.d = f;
        this.e = amuVar;
        this.f = f2;
        this.g = aonnVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        int i2 = iIntValue & 1;
        cbd cbdVar = bvo.a;
        if (cavVar.H(i != 2, i2)) {
            float f = this.f;
            amu amuVar = this.e;
            float f2 = this.d;
            cmw cmwVarA = bvo.a(this.a, this.b, bos.c(((bqv) cavVar.e(bqx.a)).a, this.c, f2, cavVar), amuVar, ((dpf) cavVar.e(dfo.e)).dl(f));
            java.lang.Object objG = cavVar.g();
            java.lang.Object obj3 = cau.a;
            if (objG == obj3) {
                objG = new defpackage.bxb(1);
                cavVar.w(objG);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = dig.a;
            cmw cmwVarA2 = cmwVarA.a(new dhs(false, (aonj) objG));
            aojh aojhVar = aojh.a;
            java.lang.Object objG2 = cavVar.g();
            if (objG2 == obj3) {
                objG2 = defpackage.bmy.c;
                cavVar.w(objG2);
            }
            cvf cvfVar = cvy.a;
            cmw cmwVarA3 = cmwVarA2.a(new cvx(aojhVar, (java.lang.Object) null, (java.lang.Object[]) null, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objG2));
            cye cyeVarB = awo.b(cmh.a, true);
            long jA = cavVar.a();
            long j = jA ^ (jA >>> 32);
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarA3);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            aonn aonnVar = this.g;
            cev.c(cavVar, cyeVarB, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.c(cavVar, java.lang.Integer.valueOf((int) j), dam.f);
            cavVar.i(aojhVar, new bae(dam.g, 7));
            cev.c(cavVar, cmwVarM, dam.c);
            aonnVar.a(cavVar, 0);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
