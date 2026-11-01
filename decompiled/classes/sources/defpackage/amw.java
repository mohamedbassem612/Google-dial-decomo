package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amw extends defpackage.dca {
    private final defpackage.any a;
    private final boolean b;
    private final boolean d;
    private final java.lang.String e;
    private final defpackage.dib f;
    private final defpackage.aomy g;
    private final defpackage.kaw h;

    public amw(defpackage.kaw kawVar, defpackage.any anyVar, boolean z, boolean z2, java.lang.String str, defpackage.dib dibVar, defpackage.aomy aomyVar) {
        this.h = kawVar;
        this.a = anyVar;
        this.b = z;
        this.d = z2;
        this.e = str;
        this.f = dibVar;
        this.g = aomyVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.amy(this.h, this.a, this.b, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        ((defpackage.amy) cmvVar).G(this.h, this.a, this.b, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.amw amwVar = (defpackage.amw) obj;
            if (defpackage.aooh.n(this.h, amwVar.h) && defpackage.aooh.n(this.a, amwVar.a) && this.b == amwVar.b && this.d == amwVar.d && defpackage.aooh.n(this.e, amwVar.e) && defpackage.aooh.n(this.f, amwVar.f) && this.g == amwVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.kaw kawVar = this.h;
        int iHashCode = kawVar != null ? kawVar.hashCode() : 0;
        defpackage.any anyVar = this.a;
        int iHashCode2 = ((((((iHashCode * 31) + (anyVar != null ? anyVar.hashCode() : 0)) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.d ? 1231 : 1237)) * 31;
        java.lang.String str = this.e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        defpackage.dib dibVar = this.f;
        return ((iHashCode3 + (dibVar != null ? dibVar.a : 0)) * 31) + this.g.hashCode();
    }
}
