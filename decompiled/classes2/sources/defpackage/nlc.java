package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nlc extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlc(defpackage.mua muaVar, long j, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.d = muaVar;
        this.b = j;
        this.c = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = 0;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                java.lang.Object obj2 = this.d;
                long j = this.b;
                int i3 = this.c;
                defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
                npwVarAw.w(false);
                npwVarAw.u(false);
                akzx akzxVarM = utv.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                utv utvVar = akzxVarM.b;
                utvVar.c = i3 - 1;
                utvVar.b |= 1;
                utv utvVarP = akzxVarM.p();
                aooh.e(utvVarP, "build(...)");
                utv utvVar2 = utvVarP;
                aooh.f(utvVar2, "value");
                akzx akzxVar = (akzx) npwVarAw.a;
                akzxVar.u();
                defpackage.nsm nsmVar = (defpackage.nsm) akzxVar.b;
                j$.util.Objects.requireNonNull(utvVar2);
                nsmVar.l = utvVar2;
                nsmVar.b |= 512;
                defpackage.nsm nsmVarT = npwVarAw.t();
                this.a = 1;
                if (((defpackage.mua) obj2).a.k(j, nsmVarT, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        aolu aoluVar2 = aolu.a;
        int i4 = this.a;
        aooc.af(obj);
        if (i4 == 0) {
            defpackage.nld nldVar = (defpackage.nld) this.d;
            alat alatVar = nldVar.s.c;
            aooh.e(alatVar, "getConversationItemsList(...)");
            long j2 = this.b;
            java.util.Iterator it = alatVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((defpackage.mzc) it.next()).d == j2) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                defpackage.mzc mzcVar = (defpackage.mzc) nldVar.s.c.get(i);
                int iH = mni.H((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).f);
                if (iH != 0 && iH == 3) {
                    defpackage.myz myzVar = (mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).d;
                    if (myzVar == null) {
                        myzVar = defpackage.myz.a;
                    }
                    aooh.e(myzVar, "getText(...)");
                    int i5 = this.c;
                    defpackage.vk vkVarV = mni.V(myzVar.p());
                    vkVarV.A();
                    vkVarV.z();
                    vkVarV.A();
                    defpackage.vk vkVarW = mni.W(defpackage.myy.a.m());
                    vkVarW.D();
                    vkVarW.C(i5);
                    vkVarW.E();
                    vkVarV.y(vkVarW.B());
                    defpackage.myz myzVarW = vkVarV.w();
                    defpackage.vk vkVarT = mni.T(nldVar.s.p());
                    vkVarT.q();
                    aooh.c(mzcVar);
                    defpackage.vk vkVarU = mni.U(mzcVar.p());
                    defpackage.npw npwVarP = mni.P(vkVarU.s().p());
                    npwVarP.W(myzVarW);
                    vkVarU.v(npwVarP.T());
                    vkVarT.p(i, vkVarU.r());
                    nldVar.s = vkVarT.m();
                    this.a = 1;
                    if (nldVar.p(this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.d;
        if (i != 0) {
            return new defpackage.nlc((defpackage.mua) obj2, this.b, this.c, aolnVar, 1);
        }
        return new defpackage.nlc((defpackage.nld) obj2, this.b, this.c, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlc(defpackage.nld nldVar, long j, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.d = nldVar;
        this.b = j;
        this.c = i;
    }
}
