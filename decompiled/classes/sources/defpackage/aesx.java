package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesx implements defpackage.aepy {
    public final defpackage.ahyn a;
    public final boolean b;
    private final int c;
    private final int d;

    public aesx(int i, int i2, defpackage.ahyn ahynVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = ahynVar;
        this.b = z;
    }

    public static defpackage.aesw d() {
        defpackage.aesw aeswVar = new defpackage.aesw();
        aeswVar.a = 3;
        aeswVar.e = defpackage.ahwt.a;
        aeswVar.b = true;
        aeswVar.d = 1;
        aeswVar.c = (byte) 63;
        return aeswVar;
    }

    @Override // defpackage.aepy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.d != 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aesx) {
            defpackage.aesx aesxVar = (defpackage.aesx) obj;
            int i = this.d;
            int i2 = aesxVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.c == aesxVar.c && this.a.equals(aesxVar.a) && this.b == aesxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        defpackage.anty.aJ(i);
        return ((((((((((((((i ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        return "MemoryConfigurations{enablement=" + defpackage.aepz.a(this.d) + ", rateLimitPerSecond=" + this.c + ", metricExtensionProvider=" + java.lang.String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public aesx() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
