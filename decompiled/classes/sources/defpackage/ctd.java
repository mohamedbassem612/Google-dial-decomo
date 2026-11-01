package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctd extends defpackage.cts {
    public final float a;
    public final float b;

    public ctd(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ctd) {
            defpackage.ctd ctdVar = (defpackage.ctd) obj;
            if (java.lang.Float.compare(this.a, ctdVar.a) == 0 && java.lang.Float.compare(this.b, ctdVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "LineTo(x=" + this.a + ", y=" + this.b + ')';
    }
}
