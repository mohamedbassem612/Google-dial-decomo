package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class wfz {
    private float a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    private float f;

    public wfz(float f) {
        g(f);
        this.e = true;
    }

    protected float a() {
        return this.b - this.c;
    }

    public void c(float f) {
        if (f != this.b) {
            this.b = f;
            this.e = false;
        }
    }

    protected void d(float f, float f2) {
        float f3 = this.d + (f * f2);
        this.d = f3;
        this.c += f3 * f2;
    }

    public final void e(float f) {
        this.c = f;
        this.b = f;
        this.d = 0.0f;
        this.e = true;
    }

    public final void f(long j) {
        if (this.e) {
            return;
        }
        d((this.a * a()) - (this.f * this.d), java.lang.Math.min(j, 50L) / 1000.0f);
        float fAbs = java.lang.Math.abs(a());
        float fAbs2 = java.lang.Math.abs(this.d);
        boolean z = false;
        if (fAbs < 0.001f && fAbs2 < 0.001f) {
            z = true;
        }
        this.e = z;
        if (z) {
            this.c = this.b;
            this.d = 0.0f;
        }
    }

    final void g(float f) {
        this.a = f;
        this.f = (float) (java.lang.Math.sqrt(f) * 1.7999999523162842d);
    }
}
