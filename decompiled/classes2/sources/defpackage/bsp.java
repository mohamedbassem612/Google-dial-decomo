package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bsp {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bsp(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bsp)) {
            defpackage.bsp bspVar = (defpackage.bsp) obj;
            if (anty.ah(this.a, bspVar.a) && anty.ah(this.b, bspVar.b) && anty.ah(this.c, bspVar.c) && anty.ah(this.d, bspVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.d;
        return ((((iM + anty.M(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(j);
    }
}
