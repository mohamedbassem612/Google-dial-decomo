package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afxy extends defpackage.afyj {
    public final android.animation.TimeInterpolator c;
    public final defpackage.afxn d;
    public int e;
    public float f;
    public float g;
    gls h;
    private android.animation.ObjectAnimator n;
    private android.animation.ObjectAnimator o;
    private static final android.animation.TimeInterpolator i = afpc.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final android.util.Property l = new defpackage.afxw(java.lang.Float.class);
    private static final android.util.Property m = new defpackage.afxx(java.lang.Float.class);

    public afxy(android.content.Context context, defpackage.afxz afxzVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = afxzVar;
        this.c = agab.C(context, 2130970077, i);
    }

    private final void i() {
        if (this.n == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afxy, java.lang.Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new defpackage.afxu(this));
        }
        if (this.o == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afxy, java.lang.Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new defpackage.afxv(this));
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
        defpackage.afxn afxnVar = this.d;
        android.animation.ObjectAnimator objectAnimator = this.n;
        float f = afxnVar.n;
        objectAnimator.setDuration((long) (6000.0f * f));
        this.o.setDuration((long) (f * 500.0f));
        e();
    }

    @Override // defpackage.afyj
    public final void c(gls glsVar) {
        this.h = glsVar;
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
        this.e = 0;
        ((defpackage.afyg) this.k.get(0)).c = this.d.e[0];
        this.g = 0.0f;
    }

    @Override // defpackage.afyj
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.afyj
    public final void g() {
        this.h = null;
    }
}
