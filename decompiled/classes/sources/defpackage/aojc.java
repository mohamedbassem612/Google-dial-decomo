package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aojc implements java.lang.Comparable {
    public final long a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return defpackage.aooh.b(this.a ^ Long.MIN_VALUE, ((defpackage.aojc) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aojc) && this.a == ((defpackage.aojc) obj).a;
    }

    public final int hashCode() {
        return defpackage.anty.M(this.a);
    }

    public final java.lang.String toString() {
        long j = this.a;
        if (j >= 0) {
            java.lang.String string = java.lang.Long.toString(j, 10);
            defpackage.aooh.e(string, "toString(...)");
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        java.lang.String string2 = java.lang.Long.toString(j2, 10);
        defpackage.aooh.e(string2, "toString(...)");
        java.lang.String string3 = java.lang.Long.toString(j3, 10);
        defpackage.aooh.e(string3, "toString(...)");
        return java.lang.String.valueOf(string2).concat(java.lang.String.valueOf(string3));
    }
}
