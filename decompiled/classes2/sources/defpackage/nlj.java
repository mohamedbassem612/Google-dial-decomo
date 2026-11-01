package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nlj implements defpackage.nmm {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/state/DobbyLifecycleStateHolder");
    private defpackage.nmo b = defpackage.nmo.NOT_SET;
    private boolean c;
    private boolean d;
    private boolean e;
    private java.lang.Long f;

    @Override // defpackage.nmm
    public final defpackage.nml a(defpackage.nmk nmkVar) {
        java.lang.Long lValueOf;
        aooh.f(nmkVar, "event");
        int i = nmkVar.b;
        if (i != 1) {
            return defpackage.nml.a;
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b((i == 1 ? (defpackage.nlr) nmkVar.c : defpackage.nlr.a).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/dobby/impl/service/state/DobbyLifecycleStateHolder", "update", 33, "DobbyLifecycleStateHolder.kt").I("lifecycle transition: %s -> %s", this.b.name(), nmoVarB.name());
        this.b = nmoVarB;
        int i2 = nmkVar.b;
        if (((i2 == 1 ? (defpackage.nlr) nmkVar.c : defpackage.nlr.a).b & 4) != 0) {
            lValueOf = java.lang.Long.valueOf((i2 == 1 ? (defpackage.nlr) nmkVar.c : defpackage.nlr.a).d);
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            this.f = lValueOf;
            aimzVar.b().l("com/android/dialer/dobby/impl/service/state/DobbyLifecycleStateHolder", "update", 42, "DobbyLifecycleStateHolder.kt").x("setting start time to %s", lValueOf.longValue());
        }
        int iOrdinal = nmoVarB.ordinal();
        if (iOrdinal == 3) {
            this.c = true;
        } else if (iOrdinal == 7) {
            this.e = true;
        } else if (iOrdinal == 10) {
            this.d = true;
        }
        return defpackage.nml.b;
    }

    @Override // defpackage.nmm
    public final defpackage.nmu b(defpackage.nmu nmuVar) {
        aooh.f(nmuVar, "model");
        defpackage.nwj nwjVarJ = mni.J(nmuVar.p());
        defpackage.nmo nmoVar = this.b;
        aooh.f(nmoVar, "value");
        akzx akzxVar = (akzx) nwjVarJ.a;
        akzxVar.u();
        ((defpackage.nmu) akzxVar.b).c = nmoVar.a();
        boolean z = this.c;
        akzxVar.u();
        defpackage.nmu nmuVar2 = (defpackage.nmu) akzxVar.b;
        nmuVar2.b |= 64;
        nmuVar2.l = z;
        boolean z2 = this.d;
        akzxVar.u();
        defpackage.nmu nmuVar3 = (defpackage.nmu) akzxVar.b;
        nmuVar3.b |= 128;
        nmuVar3.m = z2;
        boolean z3 = this.e;
        akzxVar.u();
        defpackage.nmu nmuVar4 = (defpackage.nmu) akzxVar.b;
        nmuVar4.b |= 1024;
        nmuVar4.p = z3;
        java.lang.Long l = this.f;
        if (l != null) {
            long jLongValue = l.longValue();
            akzxVar.u();
            defpackage.nmu nmuVar5 = (defpackage.nmu) akzxVar.b;
            nmuVar5.b |= 4096;
            nmuVar5.q = jLongValue;
        }
        return nwjVarJ.s();
    }
}
