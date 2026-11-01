package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dph implements defpackage.dpf {
    private final float a;
    private final float b;
    private final defpackage.dpv c;

    public dph(float f, float f2, defpackage.dpv dpvVar) {
        this.a = f;
        this.b = f2;
        this.c = dpvVar;
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.a;
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.b;
    }

    @Override // defpackage.dpl
    public final float dh(long j) {
        if (defpackage.dps.a[(int) ((1095216660480L & j) >>> 32)].a == 4294967296L) {
            return this.c.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new java.lang.IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / this.a) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i) {
        return (i / this.a) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * this.a;
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final long ds(float f) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(this.c.a(f));
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return ds((f / this.a) + 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dph) {
            defpackage.dph dphVar = (defpackage.dph) obj;
            if (java.lang.Float.compare(this.a, dphVar.a) == 0 && java.lang.Float.compare(this.b, dphVar.b) == 0 && defpackage.aooh.n(this.c, dphVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
