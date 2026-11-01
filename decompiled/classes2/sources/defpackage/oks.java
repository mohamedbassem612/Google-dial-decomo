package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oks {
    public final long a;

    public static final java.lang.String a(long j) {
        java.lang.String hexString = java.lang.Long.toHexString(j);
        aooh.e(hexString, "toHexString(...)");
        return hexString;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.oks) && this.a == ((defpackage.oks) obj).a;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "AndroidId(id=" + this.a + ')';
    }
}
