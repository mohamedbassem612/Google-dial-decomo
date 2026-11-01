package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerg implements defpackage.aepy {
    public final float a;
    public final int b;
    public final defpackage.ahyn c;
    private final int d;

    public aerg(int i, float f, int i2, defpackage.ahyn ahynVar) {
        this.d = i;
        this.a = f;
        this.b = i2;
        this.c = ahynVar;
    }

    public static final defpackage.aerf d() {
        defpackage.aerf aerfVar = new defpackage.aerf();
        aerfVar.a = 100.0f;
        aerfVar.d = 1;
        aerfVar.b = 100;
        aerfVar.c = (byte) 3;
        return aerfVar;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        int i = this.d;
        return i == 3 || i == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aerg) {
            defpackage.aerg aergVar = (defpackage.aerg) obj;
            int i = this.d;
            int i2 = aergVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                if (java.lang.Float.floatToIntBits(this.a) == java.lang.Float.floatToIntBits(aergVar.a) && this.b == aergVar.b && this.c.equals(aergVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        defpackage.anty.aJ(i);
        return ((((((i ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.a)) * 1000003) ^ this.b) * (-721379959)) ^ 2040732332;
    }

    public final java.lang.String toString() {
        return "CrashConfigurations{enablement=" + defpackage.aepz.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=null, crashLoopListener=" + java.lang.String.valueOf(this.c) + '}';
    }

    public aerg() {
        throw null;
    }

    @Override // defpackage.aepy
    public final void c() {
    }
}
