package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aopm implements aopn {
    private final float a;
    private final float b;

    public aopm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).floatValue() <= ((java.lang.Number) comparable2).floatValue();
    }

    public final /* bridge */ /* synthetic */ java.lang.Comparable a() {
        return java.lang.Float.valueOf(this.b);
    }

    public final /* bridge */ /* synthetic */ java.lang.Comparable b() {
        return java.lang.Float.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean c(java.lang.Comparable comparable) {
        float fFloatValue = ((java.lang.Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue <= this.b;
    }

    public final boolean d() {
        return this.a > this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aopm)) {
            return false;
        }
        if (!d() || !((defpackage.aopm) obj).d()) {
            defpackage.aopm aopmVar = (defpackage.aopm) obj;
            if (this.a != aopmVar.a || this.b != aopmVar.b) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (d()) {
            return -1;
        }
        return java.lang.Float.floatToIntBits(this.b) + (java.lang.Float.floatToIntBits(this.a) * 31);
    }

    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
