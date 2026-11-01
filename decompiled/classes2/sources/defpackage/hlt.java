package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlt {
    public final j$.time.Instant a;
    public final defpackage.hls b;
    public final int c;
    public final defpackage.hkd d;
    public final defpackage.hmh e;
    public final boolean f;
    public final boolean g;
    public final java.lang.CharSequence h;
    public final java.lang.String i;
    public final int j;
    private final long k;
    private final boolean l;
    private final java.lang.String m;

    public hlt(j$.time.Instant instant, defpackage.hls hlsVar, long j, boolean z, int i, defpackage.hkd hkdVar, defpackage.hmh hmhVar, boolean z2, boolean z3, java.lang.CharSequence charSequence, java.lang.String str, int i2) {
        aooh.f(instant, "callDate");
        this.a = instant;
        this.b = hlsVar;
        this.k = j;
        this.l = z;
        this.c = i;
        this.d = hkdVar;
        this.e = hmhVar;
        this.f = z2;
        this.g = z3;
        this.h = charSequence;
        this.i = str;
        this.m = null;
        this.j = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hlt) {
            defpackage.hlt hltVar = (defpackage.hlt) obj;
            if (aooh.n(this.a, hltVar.a) && aooh.n(this.b, hltVar.b) && this.k == hltVar.k && this.l == hltVar.l && this.c == hltVar.c && aooh.n(this.d, hltVar.d) && aooh.n(this.e, hltVar.e) && this.f == hltVar.f && this.g == hltVar.g && aooh.n(this.h, hltVar.h) && aooh.n(this.i, hltVar.i)) {
                java.lang.String str = hltVar.m;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && this.j == hltVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.hkd hkdVar = this.d;
        int iM = ((((((((((((((iHashCode * 31) + anty.M(this.k)) * 31) + anty.L(this.l)) * 31) + this.c) * 31) + (hkdVar == null ? 0 : hkdVar.hashCode())) * 31) + this.e.hashCode()) * 31) + anty.L(this.f)) * 31) + anty.L(this.g)) * 31;
        java.lang.CharSequence charSequence = this.h;
        int iHashCode2 = (iM + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.String str = this.i;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 961) + this.j;
    }

    public final java.lang.String toString() {
        return "CompactCallLog(callDate=" + this.a + ", callbackIdentifier=" + this.b + ", duration=" + this.k + ", isNew=" + this.l + ", callType=" + this.c + ", phoneNumber=" + this.d + ", contactInfo=" + this.e + ", shouldShowAsSpam=" + this.f + ", shouldShowAsScam=" + this.g + ", primaryText=" + ((java.lang.Object) this.h) + ", secondaryText=" + this.i + ", countryIso=null, numberOfCalls=" + this.j + ')';
    }
}
