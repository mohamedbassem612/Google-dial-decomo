package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nmv implements defpackage.nmm {
    private final /* synthetic */ int $cid;
    private boolean a;
    private java.lang.Object b;

    public nmv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.nmm
    public final defpackage.nml a(defpackage.nmk nmkVar) {
        java.lang.Long lValueOf;
        if (this.$cid == 0) {
            aooh.f(nmkVar, "event");
            int i = nmkVar.b;
            if (i == 3) {
                alwf alwfVar = (i == 3 ? (defpackage.nme) nmkVar.c : defpackage.nme.a).c;
                if (alwfVar == null) {
                    alwfVar = alwf.a;
                }
                aooh.e(alwfVar, "getTranscriptionSummary(...)");
                boolean z = (nmkVar.b == 3 ? (defpackage.nme) nmkVar.c : defpackage.nme.a).d;
                if (!aooh.n(alwfVar, this.b) || z != this.a) {
                    this.b = alwfVar;
                    this.a = z;
                    return defpackage.nml.b;
                }
            }
            return defpackage.nml.a;
        }
        aooh.f(nmkVar, "event");
        int i2 = nmkVar.b;
        if (i2 == 16) {
            boolean z2 = (i2 == 16 ? (defpackage.nlo) nmkVar.c : defpackage.nlo.a).c;
            if (z2 != this.a) {
                this.a = z2;
                int i3 = nmkVar.b;
                if (((i3 == 16 ? (defpackage.nlo) nmkVar.c : defpackage.nlo.a).b & 1) != 0) {
                    lValueOf = java.lang.Long.valueOf((i3 == 16 ? (defpackage.nlo) nmkVar.c : defpackage.nlo.a).d);
                } else {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    this.b = lValueOf;
                }
                if (!z2) {
                    this.b = null;
                }
                return defpackage.nml.c;
            }
        }
        return defpackage.nml.a;
    }

    @Override // defpackage.nmm
    public final defpackage.nmu b(defpackage.nmu nmuVar) {
        if (this.$cid != 0) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ = mni.J(nmuVar.p());
            java.lang.Object obj = nwjVarJ.a;
            boolean z = this.a;
            akzx akzxVar = (akzx) obj;
            akzxVar.u();
            defpackage.nmu nmuVar2 = (defpackage.nmu) akzxVar.b;
            nmuVar2.b |= 65536;
            nmuVar2.v = z;
            java.lang.Object obj2 = this.b;
            if (obj2 != null) {
                long jLongValue = ((java.lang.Long) obj2).longValue();
                akzxVar.u();
                defpackage.nmu nmuVar3 = (defpackage.nmu) akzxVar.b;
                nmuVar3.b |= 131072;
                nmuVar3.w = jLongValue;
            }
            return nwjVarJ.s();
        }
        aooh.f(nmuVar, "model");
        defpackage.nwj nwjVarJ2 = mni.J(nmuVar.p());
        java.lang.Object obj3 = this.b;
        if (obj3 != null) {
            akzx akzxVarM = defpackage.nmt.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            defpackage.nmt nmtVar = (defpackage.nmt) akzxVarM.b;
            j$.util.Objects.requireNonNull(obj3);
            nmtVar.c = (alwf) obj3;
            nmtVar.b |= 1;
            boolean z2 = this.a;
            akzxVarM.u();
            defpackage.nmt nmtVar2 = (defpackage.nmt) akzxVarM.b;
            nmtVar2.b |= 2;
            nmtVar2.d = z2;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.nmt nmtVar3 = (defpackage.nmt) aladVarP;
            aooh.f(nmtVar3, "value");
            akzx akzxVar2 = (akzx) nwjVarJ2.a;
            akzxVar2.u();
            defpackage.nmu nmuVar4 = (defpackage.nmu) akzxVar2.b;
            j$.util.Objects.requireNonNull(nmtVar3);
            nmuVar4.k = nmtVar3;
            nmuVar4.b |= 32;
        }
        return nwjVarJ2.s();
    }
}
