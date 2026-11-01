package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bft extends dca {
    private final boolean a;
    private final any b;
    private final boolean d;
    private final dib e;
    private final aonj f;
    private final kaw g;

    public bft(boolean z, kaw kawVar, any anyVar, boolean z2, dib dibVar, aonj aonjVar) {
        this.a = z;
        this.g = kawVar;
        this.b = anyVar;
        this.d = z2;
        this.e = dibVar;
        this.f = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bfw(this.a, this.g, this.b, this.d, this.e, this.f);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.bfw bfwVar = (defpackage.bfw) cmvVar;
        boolean z = bfwVar.j;
        boolean z2 = this.a;
        if (z != z2) {
            bfwVar.j = z2;
            cfo.A(bfwVar).I();
        }
        aonj aonjVar = this.f;
        dib dibVar = this.e;
        boolean z3 = this.d;
        any anyVar = this.b;
        kaw kawVar = this.g;
        bfwVar.k = aonjVar;
        bfwVar.G(kawVar, anyVar, false, z3, (java.lang.String) null, dibVar, bfwVar.l);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.bft bftVar = (defpackage.bft) obj;
            if (this.a == bftVar.a && aooh.n(this.g, bftVar.g) && aooh.n(this.b, bftVar.b) && this.d == bftVar.d && aooh.n(this.e, bftVar.e) && this.f == bftVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        kaw kawVar = this.g;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (kawVar != null ? kawVar.hashCode() : 0);
        any anyVar = this.b;
        int iHashCode2 = ((((((iHashCode * 31) + (anyVar != null ? anyVar.hashCode() : 0)) * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231)) * 31;
        dib dibVar = this.e;
        return ((iHashCode2 + (dibVar != null ? dibVar.a : 0)) * 31) + this.f.hashCode();
    }
}
