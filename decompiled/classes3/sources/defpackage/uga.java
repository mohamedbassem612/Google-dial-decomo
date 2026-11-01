package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uga {
    public final java.lang.String a;
    public final aiye b;
    public final aiyi c;
    public final boolean d;
    public final java.lang.Boolean e;
    public final java.lang.Boolean f;

    public uga(java.lang.String str, aiye aiyeVar, aiyi aiyiVar, boolean z, java.lang.Boolean bool, java.lang.Boolean bool2) {
        aooh.f(str, "phoneNumber");
        this.a = str;
        this.b = aiyeVar;
        this.c = aiyiVar;
        this.d = z;
        this.e = bool;
        this.f = bool2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uga) {
            defpackage.uga ugaVar = (defpackage.uga) obj;
            if (aooh.n(this.a, ugaVar.a) && aooh.n(this.b, ugaVar.b) && aooh.n(this.c, ugaVar.c) && this.d == ugaVar.d && aooh.n(this.e, ugaVar.e) && aooh.n(this.f, ugaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aiye aiyeVar = this.b;
        int iHashCode2 = (iHashCode + (aiyeVar == null ? 0 : aiyeVar.hashCode())) * 31;
        aiyi aiyiVar = this.c;
        int iHashCode3 = (((iHashCode2 + (aiyiVar == null ? 0 : aiyiVar.hashCode())) * 31) + anty.L(this.d)) * 31;
        java.lang.Boolean bool = this.e;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "AutoBlockedCallInfoInternal(phoneNumber=" + this.a + ", dobbyScoobyCallMetrics=" + this.b + ", revelioSettings=" + this.c + ", phoneNumberInGlobalSpamList=" + this.d + ", isTollFreeNumber=" + this.e + ", isAlternativeSpamSolutionEligible=" + this.f + ')';
    }
}
