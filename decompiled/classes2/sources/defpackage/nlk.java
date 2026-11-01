package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nlk implements defpackage.nmm {
    private boolean a;
    private boolean b;

    @Override // defpackage.nmm
    public final defpackage.nml a(defpackage.nmk nmkVar) {
        boolean z;
        aooh.f(nmkVar, "event");
        int i = nmkVar.b;
        boolean z2 = true;
        if (i == 18) {
            boolean z3 = (i == 18 ? (defpackage.nlt) nmkVar.c : defpackage.nlt.a).b;
            z = this.a != z3;
            this.a = z3;
        } else {
            z = false;
        }
        int i2 = nmkVar.b;
        if (i2 == 19) {
            boolean z4 = (i2 == 19 ? (defpackage.nls) nmkVar.c : defpackage.nls.a).b;
            if (!z && this.b == z4) {
                z2 = false;
            }
            this.b = z4;
            z = z2;
        }
        return z ? defpackage.nml.b : defpackage.nml.a;
    }

    @Override // defpackage.nmm
    public final defpackage.nmu b(defpackage.nmu nmuVar) {
        aooh.f(nmuVar, "model");
        defpackage.nwj nwjVarJ = mni.J(nmuVar.p());
        java.lang.Object obj = nwjVarJ.a;
        boolean z = this.a;
        akzx akzxVar = (akzx) obj;
        akzxVar.u();
        defpackage.nmu nmuVar2 = (defpackage.nmu) akzxVar.b;
        nmuVar2.b |= 524288;
        nmuVar2.y = z;
        boolean z2 = this.b;
        akzxVar.u();
        defpackage.nmu nmuVar3 = (defpackage.nmu) akzxVar.b;
        nmuVar3.b |= 1048576;
        nmuVar3.z = z2;
        return nwjVarJ.s();
    }
}
