package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pog {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;

    public pog(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pog) {
            defpackage.pog pogVar = (defpackage.pog) obj;
            if (aooh.n(this.a, pogVar.a) && aooh.n(this.b, pogVar.b) && this.c == pogVar.c && this.d == pogVar.d && this.e == pogVar.e && this.f == pogVar.f && this.g == pogVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.CharSequence charSequence = this.a;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        java.lang.CharSequence charSequence2 = this.b;
        return (((((((((((iHashCode * 31) + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + anty.L(this.c)) * 31) + anty.L(this.d)) * 31) + anty.L(this.e)) * 31) + anty.L(this.f)) * 31) + anty.M(this.g);
    }

    public final java.lang.String toString() {
        return "BottomRow(label=" + ((java.lang.Object) this.a) + ", emergencyDialingConnectivityStateLabel=" + ((java.lang.Object) this.b) + ", timeVisible=" + this.c + ", workIconVisible=" + this.d + ", forwardedIconVisible=" + this.e + ", spamIconVisible=" + this.f + ", callStartTime=" + this.g + ')';
    }

    public pog() {
        this(null, null, false, false, false, false, 0L);
    }
}
