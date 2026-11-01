package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bfq extends defpackage.dca {
    private final boolean a;
    private final defpackage.any b;
    private final boolean d;
    private final defpackage.aomy e;
    private final defpackage.kaw f;

    public bfq(boolean z, defpackage.kaw kawVar, defpackage.any anyVar, boolean z2, defpackage.aomy aomyVar) {
        this.a = z;
        this.f = kawVar;
        this.b = anyVar;
        this.d = z2;
        this.e = aomyVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bfs(this.a, this.f, this.b, this.d, this.e);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bfs bfsVar = (defpackage.bfs) cmvVar;
        boolean z = bfsVar.j;
        boolean z2 = this.a;
        if (z != z2) {
            bfsVar.j = z2;
            defpackage.cfo.A(bfsVar).I();
        }
        defpackage.aomy aomyVar = this.e;
        boolean z3 = this.d;
        bfsVar.G(this.f, this.b, false, z3, null, null, aomyVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.bfq bfqVar = (defpackage.bfq) obj;
            if (this.a == bfqVar.a && defpackage.aooh.n(this.f, bfqVar.f) && defpackage.aooh.n(this.b, bfqVar.b) && this.d == bfqVar.d && this.e == bfqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.kaw kawVar = this.f;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (kawVar != null ? kawVar.hashCode() : 0);
        defpackage.any anyVar = this.b;
        return (((((((iHashCode * 31) + (anyVar != null ? anyVar.hashCode() : 0)) * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231)) * 961) + this.e.hashCode();
    }
}
