package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abjj {
    public final float a;
    public final long b;

    public abjj(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abjj) {
            defpackage.abjj abjjVar = (defpackage.abjj) obj;
            if (java.lang.Float.compare(this.a, abjjVar.a) == 0 && anty.ah(this.b, abjjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "ImageTransformResult(scale=" + this.a + ", offset=" + cpm.c(this.b) + ')';
    }
}
