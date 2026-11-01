package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bnw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bnw(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bnw)) {
            defpackage.bnw bnwVar = (defpackage.bnw) obj;
            if (this.a == bnwVar.a && this.b == bnwVar.b && this.c == bnwVar.c && this.d == bnwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
