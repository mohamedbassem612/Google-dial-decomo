package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bss {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bss(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bss) {
            defpackage.bss bssVar = (defpackage.bss) obj;
            if (anty.ah(this.a, bssVar.a) && anty.ah(this.b, bssVar.b) && anty.ah(this.c, bssVar.c) && anty.ah(this.d, bssVar.d)) {
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
