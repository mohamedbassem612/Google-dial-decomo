package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class crg {
    public final long a;

    public static java.lang.String a(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.crg) && this.a == ((defpackage.crg) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
