package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ana extends dca {
    private final boolean a;
    private final java.lang.String b;
    private final dib d;
    private final aomy e;
    private final java.lang.String f;
    private final aomy g;
    private final kaw h;

    public ana(kaw kawVar, boolean z, java.lang.String str, dib dibVar, aomy aomyVar, java.lang.String str2, aomy aomyVar2) {
        this.h = kawVar;
        this.a = z;
        this.b = str;
        this.d = dibVar;
        this.e = aomyVar;
        this.f = str2;
        this.g = aomyVar2;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.anb(this.e, this.f, this.g, this.h, this.a, this.b, this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        boolean z;
        defpackage.anb anbVar = (defpackage.anb) cmvVar;
        anbVar.l = true;
        java.lang.String str = anbVar.j;
        java.lang.String str2 = this.f;
        if (!aooh.n(str, str2)) {
            anbVar.j = str2;
            cfo.A(anbVar).I();
        }
        aomy aomyVar = this.g;
        if ((anbVar.k == null) != (aomyVar == null)) {
            anbVar.f();
            cfo.A(anbVar).I();
            z = true;
        } else {
            z = false;
        }
        dib dibVar = this.d;
        java.lang.String str3 = this.b;
        boolean z2 = this.a;
        kaw kawVar = this.h;
        aomy aomyVar2 = this.e;
        anbVar.k = aomyVar;
        boolean z3 = ((amk) anbVar).a;
        anbVar.G(kawVar, (any) null, z2, true, str3, dibVar, aomyVar2);
        if ((!z3) || z) {
            anbVar.I(false);
            anbVar.I(true);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ana anaVar = (defpackage.ana) obj;
            if (aooh.n(this.h, anaVar.h) && this.a == anaVar.a && aooh.n(this.b, anaVar.b) && aooh.n(this.d, anaVar.d) && this.e == anaVar.e && aooh.n(this.f, anaVar.f) && this.g == anaVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        kaw kawVar = this.h;
        int iHashCode = ((((kawVar != null ? kawVar.hashCode() : 0) * 961) + (true != this.a ? 1237 : 1231)) * 31) + 1231;
        java.lang.String str = this.b;
        int iHashCode2 = ((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31;
        dib dibVar = this.d;
        int iHashCode3 = (((iHashCode2 + (dibVar != null ? dibVar.a : 0)) * 31) + this.e.hashCode()) * 31;
        java.lang.String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        aomy aomyVar = this.g;
        return ((iHashCode4 + (aomyVar != null ? aomyVar.hashCode() : 0)) * 961) + 1231;
    }
}
