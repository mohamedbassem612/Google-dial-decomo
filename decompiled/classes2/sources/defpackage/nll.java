package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nll implements defpackage.nmm {
    private final /* synthetic */ int $cid;
    private boolean a;

    public nll(int i, byte[] bArr) {
        this.$cid = i;
        this.a = true;
    }

    @Override // defpackage.nmm
    public final defpackage.nml a(defpackage.nmk nmkVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(nmkVar, "event");
            int i2 = nmkVar.b;
            if (i2 == 7) {
                boolean z = (i2 == 7 ? (defpackage.nlv) nmkVar.c : defpackage.nlv.a).b;
                if (z != this.a) {
                    this.a = z;
                    return defpackage.nml.c;
                }
            }
            return defpackage.nml.a;
        }
        if (i == 1) {
            aooh.f(nmkVar, "event");
            int i3 = nmkVar.b;
            if (i3 == 11) {
                boolean z2 = (i3 == 11 ? (defpackage.nlu) nmkVar.c : defpackage.nlu.a).c;
                boolean z3 = this.a;
                if (z2 != z3) {
                    this.a = !z3;
                    return defpackage.nml.b;
                }
            }
            return defpackage.nml.a;
        }
        if (i != 2) {
            aooh.f(nmkVar, "event");
            int i4 = nmkVar.b;
            if (i4 == 14) {
                boolean z4 = (i4 == 14 ? (defpackage.nmj) nmkVar.c : defpackage.nmj.a).c;
                if (z4 != this.a) {
                    this.a = z4;
                    return defpackage.nml.b;
                }
            }
            return defpackage.nml.a;
        }
        aooh.f(nmkVar, "event");
        int i5 = nmkVar.b;
        if (i5 == 9) {
            boolean z5 = (i5 == 9 ? (defpackage.nmg) nmkVar.c : defpackage.nmg.a).b;
            if (z5 != this.a) {
                this.a = z5;
                return defpackage.nml.c;
            }
        }
        return defpackage.nml.a;
    }

    @Override // defpackage.nmm
    public final defpackage.nmu b(defpackage.nmu nmuVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ = mni.J(nmuVar.p());
            java.lang.Object obj = nwjVarJ.a;
            boolean z = this.a;
            akzx akzxVar = (akzx) obj;
            akzxVar.u();
            defpackage.nmu nmuVar2 = (defpackage.nmu) akzxVar.b;
            nmuVar2.b |= 16;
            nmuVar2.h = z;
            return nwjVarJ.s();
        }
        if (i == 1) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ2 = mni.J(nmuVar.p());
            java.lang.Object obj2 = nwjVarJ2.a;
            boolean z2 = this.a;
            akzx akzxVar2 = (akzx) obj2;
            akzxVar2.u();
            defpackage.nmu nmuVar3 = (defpackage.nmu) akzxVar2.b;
            nmuVar3.b |= 512;
            nmuVar3.o = z2;
            return nwjVarJ2.s();
        }
        if (i == 2) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ3 = mni.J(nmuVar.p());
            java.lang.Object obj3 = nwjVarJ3.a;
            boolean z3 = this.a;
            akzx akzxVar3 = (akzx) obj3;
            akzxVar3.u();
            ((defpackage.nmu) akzxVar3.b).j = z3;
            return nwjVarJ3.s();
        }
        aooh.f(nmuVar, "model");
        defpackage.nwj nwjVarJ4 = mni.J(nmuVar.p());
        java.lang.Object obj4 = nwjVarJ4.a;
        boolean z4 = this.a;
        akzx akzxVar4 = (akzx) obj4;
        akzxVar4.u();
        defpackage.nmu nmuVar4 = (defpackage.nmu) akzxVar4.b;
        nmuVar4.b |= 16384;
        nmuVar4.u = z4;
        return nwjVarJ4.s();
    }

    public nll(int i) {
        this.$cid = i;
    }
}
