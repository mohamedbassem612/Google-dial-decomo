package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smv implements ahth {
    public final float a;
    public final float b;
    public final float c;

    public smv(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.smv) {
            defpackage.smv smvVar = (defpackage.smv) obj;
            if (java.lang.Float.compare(this.a, smvVar.a) == 0 && java.lang.Float.compare(this.b, smvVar.b) == 0 && java.lang.Float.compare(this.c, smvVar.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "ResizableConfirmClickEvent(scale=" + this.a + ", translationX=" + this.b + ", translationY=" + this.c + ')';
    }
}
