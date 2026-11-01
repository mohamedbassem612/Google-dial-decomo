package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aft extends defpackage.dca {
    private final defpackage.alg a;
    private final defpackage.agf b;
    private final defpackage.agg d;
    private final defpackage.ahc e;
    private final defpackage.aomy f;
    private final defpackage.afu g;
    private final ett h;
    private final ett i;
    private final ett j;

    public aft(defpackage.alg algVar, ett ettVar, ett ettVar2, ett ettVar3, defpackage.agf agfVar, defpackage.agg aggVar, defpackage.ahc ahcVar, defpackage.aomy aomyVar, defpackage.afu afuVar) {
        this.a = algVar;
        this.h = ettVar;
        this.i = ettVar2;
        this.j = ettVar3;
        this.b = agfVar;
        this.d = aggVar;
        this.e = ahcVar;
        this.f = aomyVar;
        this.g = afuVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.agd(this.a, this.h, this.i, this.j, this.b, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.agd agdVar = (defpackage.agd) cmvVar;
        agdVar.a = this.a;
        agdVar.h = this.h;
        agdVar.i = this.i;
        agdVar.j = this.j;
        agdVar.b = this.b;
        agdVar.c = this.d;
        defpackage.ahc ahcVar = agdVar.e;
        defpackage.ahc ahcVar2 = this.e;
        if (!defpackage.aooh.n(ahcVar, ahcVar2)) {
            agdVar.e = ahcVar2;
            defpackage.wl.i(agdVar, defpackage.afq.a, ahcVar2);
        }
        agdVar.d = this.f;
        agdVar.g = this.g;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aft) {
            defpackage.aft aftVar = (defpackage.aft) obj;
            if (defpackage.aooh.n(aftVar.a, this.a) && defpackage.aooh.n(aftVar.h, this.h) && defpackage.aooh.n(aftVar.i, this.i) && defpackage.aooh.n(aftVar.j, this.j) && defpackage.aooh.n(aftVar.b, this.b) && defpackage.aooh.n(aftVar.d, this.d) && defpackage.aooh.n(aftVar.e, this.e) && aftVar.f == this.f && defpackage.aooh.n(aftVar.g, this.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ett ettVar = this.h;
        int iHashCode2 = (iHashCode + (ettVar != null ? ettVar.hashCode() : 0)) * 31;
        ett ettVar2 = this.i;
        int iHashCode3 = (iHashCode2 + (ettVar2 != null ? ettVar2.hashCode() : 0)) * 31;
        ett ettVar3 = this.j;
        return ((((((((iHashCode3 + (ettVar3 != null ? ettVar3.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + (this.g.hashCode() * 31) + this.e.hashCode();
    }
}
