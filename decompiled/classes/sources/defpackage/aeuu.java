package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuu implements defpackage.aepy {
    public final defpackage.aeut a;
    private final int b;
    private final int c;

    public aeuu(int i, int i2, defpackage.aeut aeutVar) {
        this.c = i;
        this.b = i2;
        this.a = aeutVar;
    }

    public static final defpackage.aeus d() {
        defpackage.aeus aeusVar = new defpackage.aeus();
        aeusVar.a = 10;
        aeusVar.b = (byte) (aeusVar.b | 3);
        aeusVar.d = new defpackage.aeut(1.0f);
        aeusVar.c = 1;
        aeusVar.b = (byte) (aeusVar.b | 4);
        return aeusVar;
    }

    @Override // defpackage.aepy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeuu) {
            defpackage.aeuu aeuuVar = (defpackage.aeuu) obj;
            int i = this.c;
            int i2 = aeuuVar.c;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.b == aeuuVar.b && this.a.equals(aeuuVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        defpackage.anty.aJ(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.a.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        return "TraceConfigurations{enablement=" + defpackage.aepz.a(this.c) + ", rateLimitPerSecond=" + this.b + ", dynamicSampler=" + java.lang.String.valueOf(this.a) + ", recordTimerDuration=false, sendEmptyTraces=false}";
    }

    public aeuu() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
