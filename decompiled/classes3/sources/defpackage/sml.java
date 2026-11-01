package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sml {
    public final float a;
    public final float b;
    private final float c;
    private final long d;

    public sml(float f, float f2, float f3, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sml) {
            defpackage.sml smlVar = (defpackage.sml) obj;
            if (java.lang.Float.compare(this.a, smlVar.a) == 0 && java.lang.Float.compare(this.b, smlVar.b) == 0 && java.lang.Float.compare(this.c, smlVar.c) == 0 && anty.ah(this.d, smlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + anty.M(this.d);
    }

    public final java.lang.String toString() {
        return "PreviewPosition(pivotY=" + this.a + ", scale=" + this.b + ", translationY=" + this.c + ", fullSize=" + cpp.b(this.d) + ')';
    }
}
