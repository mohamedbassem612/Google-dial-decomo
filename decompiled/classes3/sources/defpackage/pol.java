package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pol {
    public final java.lang.CharSequence a;
    public final boolean b;
    public final java.lang.Integer c;
    public final boolean d;
    public final long e;

    public pol(java.lang.CharSequence charSequence, boolean z, java.lang.Integer num, boolean z2, long j) {
        this.a = charSequence;
        this.b = z;
        this.c = num;
        this.d = z2;
        this.e = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pol) {
            defpackage.pol polVar = (defpackage.pol) obj;
            if (aooh.n(this.a, polVar.a) && this.b == polVar.b && aooh.n(this.c, polVar.c) && this.d == polVar.d && this.e == polVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.CharSequence charSequence = this.a;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        boolean z = this.b;
        java.lang.Integer num = this.c;
        return (((((((iHashCode * 31) + anty.L(z)) * 31) + (num != null ? num.hashCode() : 0)) * 31) + anty.L(this.d)) * 31) + anty.M(this.e);
    }

    public final java.lang.String toString() {
        return "TopRow(label=" + ((java.lang.Object) this.a) + ", validatedIconVisible=" + this.b + ", validationIconResId=" + this.c + ", shouldShowCallTimer=" + this.d + ", callStartTime=" + this.e + ')';
    }

    public pol() {
        this(null, false, null, false, 0L);
    }
}
