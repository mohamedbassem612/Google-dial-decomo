package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wfy extends defpackage.wga {
    public boolean a;

    public wfy(float f) {
        super(80.0f, f);
        this.a = true;
    }

    private static final float i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.wfz
    protected final float a() {
        float fA = super.a();
        if (java.lang.Math.abs(fA) < 0.3926991f) {
            return fA;
        }
        float f = 6.2831855f + fA;
        if (java.lang.Math.abs(f) >= 0.3926991f) {
            if (!this.a) {
                return fA > 0.3926991f ? fA - 6.2831855f : fA;
            }
            if (fA >= -0.3926991f) {
                return fA;
            }
        }
        return f;
    }

    public final void b(float f) {
        this.c = i(this.c + f);
        this.b = i(this.b + f);
    }

    @Override // defpackage.wfz
    public final void c(float f) {
        super.c(i(f));
    }

    @Override // defpackage.wfz
    public final void d(float f, float f2) {
        super.d(f, f2);
        this.c = i(this.c);
    }
}
