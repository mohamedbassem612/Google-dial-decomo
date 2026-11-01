package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoo extends defpackage.dca {
    private final defpackage.ati a;
    private final defpackage.aso b;
    private final boolean d;
    private final boolean e;
    private final defpackage.ars f;
    private final defpackage.aqb g;
    private final boolean h;
    private final defpackage.amn i;
    private final defpackage.kaw j;

    public aoo(defpackage.ati atiVar, defpackage.aso asoVar, boolean z, boolean z2, defpackage.ars arsVar, defpackage.kaw kawVar, defpackage.aqb aqbVar, boolean z3, defpackage.amn amnVar) {
        this.a = atiVar;
        this.b = asoVar;
        this.d = z;
        this.e = z2;
        this.f = arsVar;
        this.j = kawVar;
        this.g = aqbVar;
        this.h = z3;
        this.i = amnVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.aop(this.a, this.b, this.d, this.e, this.f, this.j, this.g, this.h, this.i);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        ((defpackage.aop) cmvVar).e(this.a, this.b, this.h, this.i, this.d, this.e, this.f, this.j, this.g);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.aoo aooVar = (defpackage.aoo) obj;
            if (defpackage.aooh.n(this.a, aooVar.a) && this.b == aooVar.b && this.d == aooVar.d && this.e == aooVar.e && defpackage.aooh.n(this.f, aooVar.f) && defpackage.aooh.n(this.j, aooVar.j) && defpackage.aooh.n(this.g, aooVar.g) && this.h == aooVar.h && defpackage.aooh.n(this.i, aooVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.ars arsVar = this.f;
        int iHashCode2 = ((((((((iHashCode * 31) + (true != this.d ? 1237 : 1231)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + (arsVar != null ? arsVar.hashCode() : 0)) * 31) + this.j.hashCode()) * 31;
        defpackage.aqb aqbVar = this.g;
        int iHashCode3 = (((iHashCode2 + (aqbVar != null ? aqbVar.hashCode() : 0)) * 31) + (true == this.h ? 1231 : 1237)) * 31;
        defpackage.amn amnVar = this.i;
        return iHashCode3 + (amnVar != null ? amnVar.hashCode() : 0);
    }
}
