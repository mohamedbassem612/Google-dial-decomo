package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cth extends defpackage.cts {
    public final float a;
    public final float b;

    public cth(float f, float f2) {
        super(false, true);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cth) {
            defpackage.cth cthVar = (defpackage.cth) obj;
            if (java.lang.Float.compare(this.a, cthVar.a) == 0 && java.lang.Float.compare(this.b, cthVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "ReflectiveQuadTo(x=" + this.a + ", y=" + this.b + ')';
    }
}
