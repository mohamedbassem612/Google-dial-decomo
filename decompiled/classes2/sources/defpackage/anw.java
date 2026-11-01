package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class anw extends dca {
    private final any a;
    private final kaw b;

    public anw(kaw kawVar, any anyVar) {
        this.b = kawVar;
        this.a = anyVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.anx(this.a.b(this.b));
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.anx anxVar = (defpackage.anx) cmvVar;
        dao daoVarB = this.a.b(this.b);
        anxVar.U(anxVar.a);
        anxVar.a = daoVarB;
        anxVar.V(daoVarB);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.anw) {
            defpackage.anw anwVar = (defpackage.anw) obj;
            if (aooh.n(this.b, anwVar.b) && aooh.n(this.a, anwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
