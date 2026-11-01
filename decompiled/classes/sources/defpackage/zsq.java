package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zsq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/precall/impl/PrecallChain");
    public final defpackage.aify b;
    public final defpackage.ajcu c;
    public final j$.util.Optional d;
    private final defpackage.stw e;

    public zsq(defpackage.aify aifyVar, defpackage.ajcu ajcuVar, defpackage.stw stwVar, j$.util.Optional optional) {
        this.b = aifyVar;
        this.c = ajcuVar;
        this.e = stwVar;
        this.d = optional;
    }

    final defpackage.zta a(int i) {
        defpackage.aify aifyVar = this.b;
        if (i < aifyVar.size()) {
            return (defpackage.zta) aifyVar.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("attempt to access %s of %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(aifyVar.size())));
    }

    public final defpackage.ajcq b(zrx zrxVar, int i) {
        defpackage.aify aifyVar = this.b;
        if (aifyVar.size() != i) {
            defpackage.zta ztaVar = (defpackage.zta) aifyVar.get(i);
            j$.util.Optional optional = this.d;
            optional.isPresent();
            ((defpackage.gou) optional.get()).n();
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/dialershared/precall/impl/PrecallChain", "validate", 60, "PrecallChain.java")).y("running %s", ztaVar);
            return defpackage.ahvr.I(ztaVar.b(zrxVar), new vlq(this, ztaVar, zrxVar, i, 2), this.c);
        }
        defpackage.akzx akzxVarM = zsx.a.m();
        akzxVarM.u();
        zsx zsxVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(zrxVar);
        zsxVar.f = zrxVar;
        zsxVar.b |= 8;
        return defpackage.aiql.z(akzxVarM.r());
    }

    final void c(zrx zrxVar) {
        this.e.a(zrxVar);
    }
}
