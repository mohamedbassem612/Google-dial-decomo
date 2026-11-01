package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class coe extends defpackage.dca {
    private final defpackage.css a;
    private final boolean b;
    private final defpackage.cmj d;
    private final cwy e;
    private final float f;
    private final defpackage.cqh g;

    public coe(defpackage.css cssVar, boolean z, defpackage.cmj cmjVar, cwy cwyVar, float f, defpackage.cqh cqhVar) {
        this.a = cssVar;
        this.b = z;
        this.d = cmjVar;
        this.e = cwyVar;
        this.f = f;
        this.g = cqhVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.cof(this.a, this.b, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.cof cofVar = (defpackage.cof) cmvVar;
        boolean z = cofVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || cofVar.a.a() == this.a.a())) {
            z3 = false;
        }
        cofVar.a = this.a;
        cofVar.b = z2;
        cofVar.c = this.d;
        cofVar.d = this.e;
        cofVar.e = this.f;
        cofVar.f = this.g;
        if (z3) {
            defpackage.cfo.A(cofVar).H();
        }
        defpackage.cfo.w(cofVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.coe) {
            defpackage.coe coeVar = (defpackage.coe) obj;
            if (defpackage.aooh.n(this.a, coeVar.a) && this.b == coeVar.b && defpackage.aooh.n(this.d, coeVar.d) && defpackage.aooh.n(this.e, coeVar.e) && java.lang.Float.compare(this.f, coeVar.f) == 0 && defpackage.aooh.n(this.g, coeVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.f);
        defpackage.cqh cqhVar = this.g;
        return (iHashCode * 31) + (cqhVar == null ? 0 : cqhVar.hashCode());
    }

    public final java.lang.String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
