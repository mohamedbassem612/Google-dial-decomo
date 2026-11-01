package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dpu {
    public final long a;

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static java.lang.String b(long j) {
        int i = (int) (4294967295L & j);
        return "(" + java.lang.Float.intBitsToFloat((int) (j >> 32)) + ", " + java.lang.Float.intBitsToFloat(i) + ") px/sec";
    }

    public static /* synthetic */ long c(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return mni.bk(f, f2);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dpu) && this.a == ((defpackage.dpu) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return b(this.a);
    }
}
