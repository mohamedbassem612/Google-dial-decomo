package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dpr implements defpackage.dpv {
    private final float a;

    public dpr(float f) {
        this.a = f;
    }

    @Override // defpackage.dpv
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.dpv
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dpr) && java.lang.Float.compare(this.a, ((defpackage.dpr) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
