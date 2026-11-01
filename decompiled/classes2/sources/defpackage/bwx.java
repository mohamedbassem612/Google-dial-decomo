package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwx {
    private final cpn a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public bwx(cpn cpnVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = cpnVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bwx) {
            defpackage.bwx bwxVar = (defpackage.bwx) obj;
            if (aooh.n(this.a, bwxVar.a) && this.b == bwxVar.b && this.c == bwxVar.c && this.d == bwxVar.d && this.e == bwxVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.e;
        boolean z2 = this.d;
        return ((((((iHashCode + anty.L(this.b)) * 31) + anty.L(this.c)) * 31) + anty.L(z2)) * 31) + anty.L(z);
    }

    public final java.lang.String toString() {
        return "HingeInfo(bounds=" + this.a + ", isFlat=" + this.b + ", isVertical=" + this.c + ", isSeparating=" + this.d + ", isOccluding=" + this.e + ')';
    }
}
