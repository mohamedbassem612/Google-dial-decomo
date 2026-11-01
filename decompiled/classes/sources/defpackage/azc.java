package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azc implements defpackage.ayy {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public azc(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if ((((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) ^ (-1)) & ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) ^ (-1)) & ((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) ^ (-1)) & ((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) ^ (-1))) >= 0) {
            bai.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.ayy
    public final float a() {
        return this.b;
    }

    @Override // defpackage.ayy
    public final float b(defpackage.dpq dpqVar) {
        return dpqVar == defpackage.dpq.a ? this.c : this.d;
    }

    @Override // defpackage.ayy
    public final float c(defpackage.dpq dpqVar) {
        return dpqVar == defpackage.dpq.a ? this.d : this.c;
    }

    @Override // defpackage.ayy
    public final float d() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.azc)) {
            return false;
        }
        defpackage.azc azcVar = (defpackage.azc) obj;
        return java.lang.Float.compare(this.c, azcVar.c) == 0 && java.lang.Float.compare(this.a, azcVar.a) == 0 && java.lang.Float.compare(this.d, azcVar.d) == 0 && java.lang.Float.compare(this.b, azcVar.b) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.a)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        float f = this.b;
        float f2 = this.d;
        float f3 = this.a;
        return "PaddingValues(start=" + defpackage.dpi.b(this.c) + ", top=" + defpackage.dpi.b(f3) + ", end=" + defpackage.dpi.b(f2) + ", bottom=" + defpackage.dpi.b(f) + ')';
    }

    public azc() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
