package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yvq {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public yvq(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yvq) {
            defpackage.yvq yvqVar = (defpackage.yvq) obj;
            if (this.a == yvqVar.a && this.b == yvqVar.b && this.c == yvqVar.c && this.d == yvqVar.d && this.e == yvqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.e;
        long j2 = this.d;
        return ((((((iM + anty.M(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }

    public final java.lang.String toString() {
        return "SharpieModelParameters(aicoreMinApkVersion=" + this.a + ", aicoreModelVersion=" + this.b + ", hadesIntentPolicyId=" + this.c + ", maxWordCount=" + this.d + ", minWordCount=" + this.e + ')';
    }
}
