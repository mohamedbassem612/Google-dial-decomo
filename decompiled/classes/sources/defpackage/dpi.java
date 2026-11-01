package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpi implements java.lang.Comparable {
    public final float a;

    public static int a(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return 0;
        }
        return java.lang.Float.compare(f, f2);
    }

    public static java.lang.String b(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean c(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return a(this.a, ((defpackage.dpi) obj).a);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dpi) && java.lang.Float.compare(this.a, ((defpackage.dpi) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return b(this.a);
    }
}
