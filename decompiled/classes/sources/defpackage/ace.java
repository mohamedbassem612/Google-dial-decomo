package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ace {
    public final long a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ace) && this.a == ((defpackage.ace) obj).a;
    }

    public final int hashCode() {
        return defpackage.anty.M(this.a);
    }

    public final java.lang.String toString() {
        long j = this.a;
        int i = (int) (4294967295L & j);
        return "(" + java.lang.Float.intBitsToFloat((int) (j >> 32)) + ", " + java.lang.Float.intBitsToFloat(i) + ')';
    }
}
