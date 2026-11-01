package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afys extends defpackage.afyj {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final android.util.Property i = new defpackage.afyr(java.lang.Float.class);
    public final android.view.animation.Interpolator[] c;
    public final defpackage.afxn d;
    public int e;
    public boolean f;
    public float g;
    gls h;
    private android.animation.ObjectAnimator l;
    private android.animation.ObjectAnimator m;

    public afys(android.content.Context context, defpackage.afyt afytVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = afytVar;
        this.c = new android.view.animation.Interpolator[]{fsu.H(context, 2130772012), fsu.H(context, 2130772013), fsu.H(context, 2130772014), fsu.H(context, 2130772015)};
    }

    private final void i() {
        if (this.l == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afys, java.lang.Float>) i, 0.0f, 1.0f);
            this.l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new defpackage.afyp(this));
        }
        if (this.m == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afys, java.lang.Float>) i, 1.0f);
            this.m = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new defpackage.afyq(this));
        }
    }

    @Override // defpackage.afyj
    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.afyj
    public final void b() {
        i();
        defpackage.afxn afxnVar = this.d;
        android.animation.ObjectAnimator objectAnimator = this.l;
        long j = (long) (afxnVar.n * 1800.0f);
        objectAnimator.setDuration(j);
        this.m.setDuration(j);
        e();
    }

    @Override // defpackage.afyj
    public final void c(gls glsVar) {
        this.h = glsVar;
    }

    @Override // defpackage.afyj
    public final void d() {
        android.animation.ObjectAnimator objectAnimator = this.m;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.m.setFloatValues(this.g, 1.0f);
            this.m.setDuration((long) ((1.0f - this.g) * 1800.0f));
            this.m.start();
        }
    }

    final void e() {
        this.e = 0;
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((defpackage.afyg) it.next()).c = this.d.e[0];
        }
    }

    @Override // defpackage.afyj
    public final void f() {
        i();
        e();
        this.l.start();
    }

    @Override // defpackage.afyj
    public final void g() {
        this.h = null;
    }
}
