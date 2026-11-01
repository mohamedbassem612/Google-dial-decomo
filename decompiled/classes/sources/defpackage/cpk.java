package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpk {
    public final long a;

    public static java.lang.String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i2) == java.lang.Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + defpackage.rz.j(java.lang.Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + defpackage.rz.j(java.lang.Float.intBitsToFloat(i2)) + ", " + defpackage.rz.j(java.lang.Float.intBitsToFloat(i)) + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cpk) && this.a == ((defpackage.cpk) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
