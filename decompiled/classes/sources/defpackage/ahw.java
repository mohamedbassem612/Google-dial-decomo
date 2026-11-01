package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahw implements defpackage.ajn {
    private final defpackage.agj a;

    public ahw(defpackage.dpf dpfVar) {
        this.a = new defpackage.agj(defpackage.ahx.a, dpfVar);
    }

    @Override // defpackage.ajn
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.ajn
    public final float b(float f, float f2) {
        defpackage.agj agjVar = this.a;
        double dA = agjVar.a(f2);
        double d = defpackage.agk.a;
        return f + (((float) (((double) (agjVar.a * agjVar.b)) * java.lang.Math.exp((d / ((-1.0d) + d)) * dA))) * java.lang.Math.signum(f2));
    }

    @Override // defpackage.ajn
    public final float c(long j, float f, float f2) {
        agi agiVarB = this.a.b(f2);
        long j2 = agiVarB.c;
        float f3 = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
        float fSignum = agiVarB.b * java.lang.Math.signum(agiVarB.a);
        int i = ael.a;
        return f + (fSignum * ael.a(f3).a);
    }

    @Override // defpackage.ajn
    public final long d(float f) {
        return ((long) (java.lang.Math.exp(this.a.a(f) / (((double) defpackage.agk.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.ajn
    public final float e(long j, float f) {
        agi agiVarB = this.a.b(f);
        long j2 = agiVarB.c;
        float f2 = j2;
        float f3 = j2 > 0 ? (j / 1000000) / f2 : 1.0f;
        int i = ael.a;
        return (((ael.a(f3).b * java.lang.Math.signum(agiVarB.a)) * agiVarB.b) / f2) * 1000.0f;
    }
}
