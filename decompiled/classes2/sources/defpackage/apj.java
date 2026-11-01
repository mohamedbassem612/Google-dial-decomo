package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class apj extends dca {
    private final defpackage.apy a;
    private final aso b;
    private final boolean d;
    private final ars g;
    private final kaw i;
    private final java.lang.Boolean e = null;
    private final java.lang.Boolean f = null;
    private final amn h = null;

    public apj(defpackage.apy apyVar, aso asoVar, boolean z, kaw kawVar, ars arsVar) {
        this.a = apyVar;
        this.b = asoVar;
        this.d = z;
        this.i = kawVar;
        this.g = arsVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.apt(this.a, this.b, this.d, this.i, this.g);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        boolean z;
        boolean z2;
        defpackage.apt aptVar = (defpackage.apt) cmvVar;
        ars arsVar = this.g;
        aptVar.b = arsVar;
        defpackage.apy apyVar = aptVar.a;
        defpackage.apy apyVar2 = this.a;
        if (aooh.n(apyVar, apyVar2)) {
            z = false;
        } else {
            aptVar.a = apyVar2;
            aptVar.g(arsVar);
            z = true;
        }
        aso asoVar = this.b;
        if (((ark) aptVar).e != asoVar) {
            ((ark) aptVar).e = asoVar;
            z2 = true;
        } else {
            z2 = z;
        }
        kaw kawVar = this.i;
        boolean z3 = this.d;
        aptVar.d = null;
        aptVar.J(((ark) aptVar).f, z3, kawVar, asoVar, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.apj) {
            defpackage.apj apjVar = (defpackage.apj) obj;
            if (aooh.n(this.a, apjVar.a) && this.b == apjVar.b && this.d == apjVar.d) {
                java.lang.Boolean bool = apjVar.e;
                if (aooh.n(this.i, apjVar.i)) {
                    java.lang.Boolean bool2 = apjVar.f;
                    amn amnVar = apjVar.h;
                    if (aooh.n(this.g, apjVar.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        kaw kawVar = this.i;
        int iHashCode2 = (((iHashCode * 31) + (true != this.d ? 1237 : 1231)) * 961) + (kawVar != null ? kawVar.hashCode() : 0);
        ars arsVar = this.g;
        return (iHashCode2 * 29791) + (arsVar != null ? arsVar.hashCode() : 0);
    }
}
