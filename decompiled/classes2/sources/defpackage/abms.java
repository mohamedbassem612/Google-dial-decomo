package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abms {
    public final dkz a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;

    public /* synthetic */ abms(dkz dkzVar, long j, int i, int i2) {
        long jG = dpy.g(2);
        aooh.f(dkzVar, "textStyle");
        this.a = dkzVar;
        this.b = j;
        this.c = i;
        this.e = i2;
        this.d = jG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abms) {
            defpackage.abms abmsVar = (defpackage.abms) obj;
            if (aooh.n(this.a, abmsVar.a)) {
                long j = this.b;
                long j2 = abmsVar.b;
                dpt[] dptVarArr = dps.a;
                if (anty.ah(j, j2) && this.c == abmsVar.c && this.e == abmsVar.e && anty.ah(this.d, abmsVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dpt[] dptVarArr = dps.a;
        return ((((((iHashCode + anty.M(this.b)) * 31) + this.c) * 31) + this.e) * 31) + anty.M(this.d);
    }

    public final java.lang.String toString() {
        long j = this.d;
        java.lang.String strC = dps.c(this.b);
        java.lang.String strC2 = dps.c(j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextFlowStyle(textStyle=");
        sb.append(this.a);
        sb.append(", minFontSize=");
        sb.append(strC);
        sb.append(", maxLines=");
        sb.append(this.c);
        sb.append(", measureStyle=");
        sb.append((java.lang.Object) (this.e != 1 ? "SmallestLineCount" : "LargestFont"));
        sb.append(", fontStep=");
        sb.append(strC2);
        sb.append(')');
        return sb.toString();
    }
}
