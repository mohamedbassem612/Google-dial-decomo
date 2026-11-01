package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abjl {
    public static final defpackage.abjl a = new defpackage.abjl(1.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;

    public abjl(float f, float f2, float f3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abjl) {
            defpackage.abjl abjlVar = (defpackage.abjl) obj;
            if (java.lang.Float.compare(this.b, abjlVar.b) == 0 && java.lang.Float.compare(this.c, abjlVar.c) == 0 && java.lang.Float.compare(this.d, abjlVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "TransformationUiData(scale=" + this.b + ", translationX=" + this.c + ", translationY=" + this.d + ')';
    }
}
