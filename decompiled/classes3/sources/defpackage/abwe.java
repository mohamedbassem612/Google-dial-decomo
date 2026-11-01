package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abwe {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public abwe(int i, int i2, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abwe) {
            defpackage.abwe abweVar = (defpackage.abwe) obj;
            if (this.a == abweVar.a && this.b == abweVar.b && java.lang.Float.compare(this.c, abweVar.c) == 0 && java.lang.Float.compare(this.d, abweVar.d) == 0 && java.lang.Float.compare(this.e, abweVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final java.lang.String toString() {
        return "CropTransform(cropWidth=" + this.a + ", cropHeight=" + this.b + ", scale=" + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ')';
    }
}
