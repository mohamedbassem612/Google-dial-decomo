package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afxt extends defpackage.afyj {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final android.util.Property l = new defpackage.afxr(java.lang.Float.class);
    private static final android.util.Property m = new defpackage.afxs(java.lang.Float.class);
    public final emd d;
    public final defpackage.afxn e;
    public int f;
    public float g;
    public float h;
    gls i;
    private android.animation.ObjectAnimator n;
    private android.animation.ObjectAnimator o;

    public afxt(defpackage.afxz afxzVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = afxzVar;
        this.d = new emd();
    }

    private final void i() {
        if (this.n == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afxt, java.lang.Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new defpackage.afxp(this));
        }
        if (this.o == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afxt, java.lang.Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new defpackage.afxq(this));
        }
    }

    @Override // defpackage.afyj
    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.afyj
    public final void b() {
        i();
        defpackage.afxn afxnVar = this.e;
        android.animation.ObjectAnimator objectAnimator = this.n;
        float f = afxnVar.n;
        objectAnimator.setDuration((long) (5400.0f * f));
        this.o.setDuration((long) (f * 333.0f));
        e();
    }

    @Override // defpackage.afyj
    public final void c(gls glsVar) {
        this.i = glsVar;
    }

    @Override // defpackage.afyj
    public final void d() {
        android.animation.ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    final void e() {
        this.f = 0;
        ((defpackage.afyg) this.k.get(0)).c = this.e.e[0];
        this.h = 0.0f;
    }

    @Override // defpackage.afyj
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.afyj
    public final void g() {
        this.i = null;
    }
}
