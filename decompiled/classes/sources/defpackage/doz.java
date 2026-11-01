package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class doz {
    public static final defpackage.doz a = new defpackage.doz(1.0f, 0.0f);
    public final float b;
    public final float c;

    public doz(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.doz) {
            defpackage.doz dozVar = (defpackage.doz) obj;
            if (this.b == dozVar.b && this.c == dozVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.b) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ')';
    }

    public doz() {
        this(1.0f, 0.0f);
    }
}
