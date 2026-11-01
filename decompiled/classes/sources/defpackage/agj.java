package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agj {
    public final float a;
    public final float b;
    private final defpackage.dpf c;

    public agj(float f, defpackage.dpf dpfVar) {
        this.a = f;
        this.c = dpfVar;
        float fA = dpfVar.a();
        float f2 = defpackage.agk.a;
        this.b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = ael.a;
        return java.lang.Math.log(((double) (java.lang.Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }

    public final agi b(float f) {
        double dA = a(f);
        double d = defpackage.agk.a;
        double d2 = (-1.0d) + d;
        return new agi(f, (float) (((double) (this.a * this.b)) * java.lang.Math.exp((d / d2) * dA)), (long) (java.lang.Math.exp(dA / d2) * 1000.0d));
    }
}
