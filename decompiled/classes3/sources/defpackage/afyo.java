package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afyo extends defpackage.afyj {
    public static final /* synthetic */ int f = 0;
    private static final android.util.Property g = new defpackage.afyn(java.lang.Float.class);
    public final emd a;
    public final defpackage.afxn b;
    public int c;
    public boolean d;
    public float e;
    private android.animation.ObjectAnimator h;

    public afyo(defpackage.afyt afytVar) {
        super(3);
        this.c = 1;
        this.b = afytVar;
        this.a = new emd();
    }

    private final void i() {
        if (this.h == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afyo, java.lang.Float>) g, 0.0f, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new defpackage.afym(this));
        }
    }

    @Override // defpackage.afyj
    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.afyj
    public final void b() {
        i();
        this.h.setDuration((long) (this.b.n * 333.0f));
        e();
    }

    final void e() {
        this.d = true;
        this.c = 1;
        for (defpackage.afyg afygVar : this.k) {
            defpackage.afxn afxnVar = this.b;
            afygVar.c = afxnVar.e[0];
            afygVar.d = afxnVar.i / 2;
        }
    }

    @Override // defpackage.afyj
    public final void f() {
        i();
        e();
        this.h.start();
    }

    @Override // defpackage.afyj
    public final void d() {
    }

    @Override // defpackage.afyj
    public final void g() {
    }

    @Override // defpackage.afyj
    public final void c(gls glsVar) {
    }
}
