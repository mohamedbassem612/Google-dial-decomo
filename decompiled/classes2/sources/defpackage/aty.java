package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aty {
    public aso a;
    public long b;

    public aty(aso asoVar, long j) {
        this.a = asoVar;
        this.b = j;
    }

    public final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.a == aso.b ? j >> 32 : j & 4294967295L));
    }

    public final long b(long j, float f) {
        long jBl = mni.bl(this.b, j);
        this.b = jBl;
        float fA = this.a == null ? cpm.a(jBl) : java.lang.Math.abs(a(jBl));
        if (fA <= 0.0f || fA < f) {
            return 9205357640488583168L;
        }
        aso asoVar = this.a;
        long j2 = this.b;
        if (asoVar == null) {
            return mni.aM(this.b, mni.bm(cpm.b(j2, cpm.a(j2)), f));
        }
        float fA2 = a(j2) - (java.lang.Math.signum(a(this.b)) * f);
        long j3 = this.b;
        aso asoVar2 = this.a;
        aso asoVar3 = aso.b;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (asoVar2 == asoVar3 ? j3 & 4294967295L : j3 >> 32));
        if (this.a == asoVar3) {
            return (((long) java.lang.Float.floatToRawIntBits(fA2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) java.lang.Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public aty() {
        this(null, 0L);
    }
}
