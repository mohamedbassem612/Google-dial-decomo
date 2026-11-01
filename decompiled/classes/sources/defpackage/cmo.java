package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cmo implements defpackage.cmj {
    private final float a;
    private final float b;

    public cmo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cmj
    public final long a(long j, long j2, defpackage.dpq dpqVar) {
        defpackage.dpq dpqVar2 = defpackage.dpq.a;
        float f = this.a;
        if (dpqVar != dpqVar2) {
            f = -f;
        }
        return (((long) java.lang.Math.round(((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f) * (f + 1.0f))) << 32) | (((long) java.lang.Math.round(((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) * (this.b + 1.0f))) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cmo) {
            defpackage.cmo cmoVar = (defpackage.cmo) obj;
            if (java.lang.Float.compare(this.a, cmoVar.a) == 0 && java.lang.Float.compare(this.b, cmoVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}
