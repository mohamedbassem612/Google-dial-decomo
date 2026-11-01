package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cmn {
    private final float a;

    public cmn(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return java.lang.Math.round(((i2 - i) / 2.0f) * (this.a + 1.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cmn) && java.lang.Float.compare(this.a, ((defpackage.cmn) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "Vertical(bias=" + this.a + ')';
    }
}
