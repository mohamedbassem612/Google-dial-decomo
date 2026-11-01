package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dop {
    public final float a;

    public static java.lang.String a(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == 0.5f) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == -1.0f) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == 1.0f) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public static void b(float f) {
        if ((f < 0.0f || f > 1.0f) && f != -1.0f) {
            dnv.c("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dop) && java.lang.Float.compare(this.a, ((defpackage.dop) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
