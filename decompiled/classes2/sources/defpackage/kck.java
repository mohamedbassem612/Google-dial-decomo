package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kck implements aonn {
    public final /* synthetic */ cmw a;
    public final /* synthetic */ lpv b;
    public final /* synthetic */ kcy c;
    public final /* synthetic */ ayy d;
    public final /* synthetic */ kby e;
    public final /* synthetic */ java.util.List f;
    public final /* synthetic */ java.util.List g;
    public final /* synthetic */ aonj h;
    public final /* synthetic */ kca i;
    public final /* synthetic */ ayy j;
    public final /* synthetic */ gat k;
    public final /* synthetic */ nf l;

    public /* synthetic */ kck(cmw cmwVar, lpv lpvVar, kcy kcyVar, ayy ayyVar, gat gatVar, kby kbyVar, java.util.List list, java.util.List list2, aonj aonjVar, kca kcaVar, nf nfVar, ayy ayyVar2) {
        this.a = cmwVar;
        this.b = lpvVar;
        this.c = kcyVar;
        this.d = ayyVar;
        this.k = gatVar;
        this.e = kbyVar;
        this.f = list;
        this.g = list2;
        this.h = aonjVar;
        this.i = kcaVar;
        this.l = nfVar;
        this.j = ayyVar2;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
            cmw cmwVarA = azm.c(this.a, 1.0f).a(new dgg("CallLogScreen"));
            java.lang.Object objG = cavVar.g();
            if (objG == cau.a) {
                objG = new defpackage.kbz(5);
                cavVar.w(objG);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = dig.a;
            cmw cmwVarA2 = cmwVarA.a(new dhs(false, (aonj) objG));
            cye cyeVarB = awo.b(cmh.a, false);
            long jA = cavVar.a();
            long j = jA ^ (jA >>> 32);
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarA2);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            kca kcaVar = this.i;
            aonj aonjVar = this.h;
            java.util.List list = this.g;
            java.util.List list2 = this.f;
            kby kbyVar = this.e;
            gat gatVar = this.k;
            ayy ayyVar = this.d;
            kcy kcyVar = this.c;
            lpv lpvVar = this.b;
            cev.c(cavVar, cyeVarB, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.c(cavVar, java.lang.Integer.valueOf((int) j), dam.f);
            cavVar.i(aojh.a, new bae(dam.g, 7));
            cev.c(cavVar, cmwVarM, dam.c);
            awt awtVar = awt.a;
            if (lpvVar == lpv.c) {
                ayy ayyVar2 = this.j;
                cavVar.u(-192969886);
                rz.f(azm.c(cmw.c, 1.0f), (cmj) null, cfo.j(-1759495716, new kcn(kcyVar, ayyVar, gatVar, kbyVar, list2, list, aonjVar, kcaVar, ayyVar2), cavVar), cavVar, 3078);
                cavVar.o();
            } else {
                cavVar.u(-191663019);
                kcq.g(gatVar, kcyVar != null ? java.lang.Long.valueOf(kcyVar.a()) : null, kbyVar, list2, list, aonjVar, den.aX(cmw.c, ayyVar), kcaVar, cavVar, 512);
                cavVar = cavVar;
                cavVar.o();
            }
            den.aj(this.l, awtVar.a(cmw.c, cmh.h), (aono) null, cavVar, 6, 4);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
