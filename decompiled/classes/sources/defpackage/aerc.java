package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerc implements defpackage.aepy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public aerc(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aerc) {
            defpackage.aerc aercVar = (defpackage.aerc) obj;
            int i = this.f;
            int i2 = aercVar.f;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a == aercVar.a && this.b == aercVar.b && this.c == aercVar.c && this.d == aercVar.d) {
                if (java.lang.Double.doubleToLongBits(this.e) == java.lang.Double.doubleToLongBits(aercVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.anty.aJ(this.f);
        double d = this.e;
        return ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((java.lang.Double.doubleToLongBits(d) >>> 32) ^ java.lang.Double.doubleToLongBits(d)));
    }

    public final java.lang.String toString() {
        return "CpuProfilingConfigurations{enablement=" + defpackage.aepz.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + '}';
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }

    public aerc() {
        throw null;
    }
}
