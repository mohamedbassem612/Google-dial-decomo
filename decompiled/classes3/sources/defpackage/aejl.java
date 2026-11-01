package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejl {
    private final boolean a;
    private final float b;

    public aejl(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aejl) {
            defpackage.aejl aejlVar = (defpackage.aejl) obj;
            if (this.a == aejlVar.a) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(aejlVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "TextWidthCalcResult{isTextFitting=" + this.a + ", actualResultTextWidth=" + this.b + '}';
    }

    public aejl() {
        throw null;
    }
}
