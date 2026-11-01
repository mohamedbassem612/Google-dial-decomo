package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esr {
    public java.lang.CharSequence a;
    public android.text.Layout.Alignment b;
    public android.text.Layout.Alignment c;
    public int d;
    public float e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    public float k;
    public int l;
    private android.graphics.Bitmap m;
    private float n;
    private int o;
    private int p;
    private float q;
    private int r;

    public esr(defpackage.ess essVar) {
        this.a = essVar.u;
        this.m = essVar.x;
        this.b = essVar.v;
        this.c = essVar.w;
        this.n = essVar.y;
        this.o = essVar.z;
        this.d = essVar.A;
        this.e = essVar.B;
        this.f = essVar.C;
        this.p = essVar.H;
        this.q = essVar.I;
        this.g = essVar.D;
        this.h = essVar.E;
        this.i = essVar.F;
        this.r = essVar.G;
        this.j = essVar.J;
        this.k = essVar.K;
        this.l = essVar.L;
    }

    public final defpackage.ess a() {
        return new defpackage.ess(this.a, this.b, this.c, this.m, this.n, this.o, this.d, this.e, this.f, this.p, this.q, this.g, this.h, this.i, this.r, this.j, this.k, this.l);
    }

    public final void b(android.graphics.Bitmap bitmap) {
        this.m = bitmap;
        this.a = null;
    }

    public final void c(float f, int i) {
        this.n = f;
        this.o = i;
    }

    public final void d(java.lang.CharSequence charSequence) {
        this.a = charSequence;
        this.m = null;
    }

    public final void e(float f, int i) {
        this.q = f;
        this.p = i;
    }

    public final void f(int i) {
        this.r = i;
        this.i = true;
    }

    public esr() {
        this.a = null;
        this.m = null;
        this.b = null;
        this.c = null;
        this.n = -3.4028235E38f;
        this.o = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.q = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = false;
        this.r = -16777216;
        this.j = Integer.MIN_VALUE;
    }
}
