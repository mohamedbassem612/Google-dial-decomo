package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class awv implements aws {
    public final /* synthetic */ awt a = awt.a;
    public final dpf b;
    public final long c;

    public awv(dpf dpfVar, long j) {
        this.b = dpfVar;
        this.c = j;
    }

    public final cmw a(cmw cmwVar, cmj cmjVar) {
        throw null;
    }

    public final float b() {
        long j = this.c;
        if (dpd.h(j)) {
            return this.b.dj(dpd.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.awv) {
            defpackage.awv awvVar = (defpackage.awv) obj;
            if (aooh.n(this.b, awvVar.b) && this.c == awvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.b + ", constraints=" + dpd.e(this.c) + ')';
    }
}
