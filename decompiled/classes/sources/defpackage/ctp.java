package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctp extends defpackage.cts {
    public final float a;
    public final float b;

    public ctp(float f, float f2) {
        super(false, true);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ctp) {
            defpackage.ctp ctpVar = (defpackage.ctp) obj;
            if (java.lang.Float.compare(this.a, ctpVar.a) == 0 && java.lang.Float.compare(this.b, ctpVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ')';
    }
}
