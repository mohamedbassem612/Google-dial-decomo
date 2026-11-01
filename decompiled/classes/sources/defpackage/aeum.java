package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeum implements defpackage.aepy {
    public final int a;
    public final float b;
    public final defpackage.ahyn c;
    private final int d;

    public aeum(int i, int i2, float f, defpackage.ahyn ahynVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = ahynVar;
    }

    public static final defpackage.aeul d() {
        defpackage.aeul aeulVar = new defpackage.aeul();
        aeulVar.b(10);
        aeulVar.a = 1.0f;
        aeulVar.c = (byte) (aeulVar.c | 2);
        aeulVar.b = defpackage.ahwt.a;
        aeulVar.d = 1;
        return aeulVar;
    }

    @Override // defpackage.aepy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeum) {
            defpackage.aeum aeumVar = (defpackage.aeum) obj;
            int i = this.d;
            int i2 = aeumVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == aeumVar.a) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(aeumVar.b) && this.c.equals(aeumVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        defpackage.anty.aJ(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        return "TimerConfigurations{enablement=" + defpackage.aepz.a(this.d) + ", rateLimitPerSecond=" + this.a + ", samplingProbability=" + this.b + ", perEventConfigurationFlags=" + java.lang.String.valueOf(this.c) + '}';
    }

    public aeum() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
