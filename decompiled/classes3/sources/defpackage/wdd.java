package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdd implements defpackage.qbb {
    public boolean a = false;
    private j$.util.Optional d = j$.util.Optional.empty();
    public boolean b = false;
    public boolean c = false;

    /* JADX WARN: Code duplicated, block: B:14:0x0083  */
    @Override // defpackage.qbb
    public final ajcq a() {
        akzx akzxVarM = defpackage.amrn.a.m();
        boolean z = this.a;
        akzxVarM.u();
        defpackage.amrn amrnVar = (defpackage.amrn) akzxVarM.b;
        amrnVar.b |= 1;
        amrnVar.c = z;
        boolean z2 = this.b;
        akzxVarM.u();
        defpackage.amrn amrnVar2 = (defpackage.amrn) akzxVarM.b;
        amrnVar2.b |= 4;
        amrnVar2.e = z2;
        boolean z3 = this.c;
        akzxVarM.u();
        defpackage.amrn amrnVar3 = (defpackage.amrn) akzxVarM.b;
        amrnVar3.b |= 8;
        amrnVar3.f = z3;
        j$.util.Optional optional = this.d;
        defpackage.vxc vxcVar = new defpackage.vxc(akzxVarM, 13);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = vxcVar.a;
            int iOrdinal = ((defpackage.zul) obj).ordinal();
            if (iOrdinal == 0) {
                akzx akzxVar = (akzx) obj2;
                akzxVar.u();
                defpackage.amrn amrnVar4 = (defpackage.amrn) akzxVar.b;
                amrnVar4.d = 1;
                amrnVar4.b |= 2;
            } else if (iOrdinal == 1) {
                akzx akzxVar2 = (akzx) obj2;
                akzxVar2.u();
                defpackage.amrn amrnVar5 = (defpackage.amrn) akzxVar2.b;
                amrnVar5.d = 2;
                amrnVar5.b |= 2;
            } else if (iOrdinal == 2) {
                akzx akzxVar3 = (akzx) obj2;
                akzxVar3.u();
                defpackage.amrn amrnVar6 = (defpackage.amrn) akzxVar3.b;
                amrnVar6.d = 3;
                amrnVar6.b |= 2;
            } else if (iOrdinal == 3) {
                akzx akzxVar4 = (akzx) obj2;
                akzxVar4.u();
                defpackage.amrn amrnVar7 = (defpackage.amrn) akzxVar4.b;
                amrnVar7.d = 4;
                amrnVar7.b |= 2;
            } else if (iOrdinal == 4) {
                akzx akzxVar5 = (akzx) obj2;
                akzxVar5.u();
                defpackage.amrn amrnVar8 = (defpackage.amrn) akzxVar5.b;
                amrnVar8.d = 2;
                amrnVar8.b |= 2;
            }
        }
        return aiql.z(j$.util.Optional.of((defpackage.amrn) akzxVarM.p()));
    }

    @Override // defpackage.qbb
    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        j$.util.Objects.requireNonNull(akzxVar);
        defpackage.vxc vxcVar = new defpackage.vxc(akzxVar, 12);
        if (true == optional.isPresent()) {
            defpackage.amrn amrnVar = (defpackage.amrn) optional.get();
            akzx akzxVar2 = (akzx) vxcVar.a;
            akzxVar2.u();
            amow amowVar = akzxVar2.b;
            amow amowVar2 = amow.a;
            j$.util.Objects.requireNonNull(amrnVar);
            amowVar.ah = amrnVar;
            amowVar.c |= Integer.MIN_VALUE;
        }
    }

    public final void c(defpackage.zul zulVar) {
        this.d = j$.util.Optional.of(zulVar);
    }
}
