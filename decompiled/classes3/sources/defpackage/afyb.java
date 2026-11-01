package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afyb extends defpackage.afyf {
    public static final /* synthetic */ int h = 0;
    private static final ejy q = new defpackage.afya();
    public final defpackage.afyi a;
    public final defpackage.afyg b;
    public float c;
    public android.animation.ValueAnimator d;
    public android.animation.TimeInterpolator e;
    public android.animation.TimeInterpolator f;
    public android.animation.TimeInterpolator g;
    private final ejz r;
    private boolean s;
    private final android.animation.ValueAnimator t;

    public afyb(android.content.Context context, defpackage.afxn afxnVar, defpackage.afyi afyiVar) {
        super(context, afxnVar);
        this.s = false;
        this.a = afyiVar;
        defpackage.afyg afygVar = new defpackage.afyg();
        this.b = afygVar;
        afygVar.h = true;
        ejz ejzVar = new ejz(this, q);
        this.r = ejzVar;
        eka ekaVar = new eka();
        ekaVar.c(1.0f);
        ekaVar.e(50.0f);
        ejzVar.t = ekaVar;
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new defpackage.wer(this, afxnVar, 5));
        if (afxnVar.c(true) && afxnVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        defpackage.afxn afxnVar = this.j;
        float f = i;
        return (f < afxnVar.o * 10000.0f || f > afxnVar.p * 10000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.o)) {
            canvas.save();
            defpackage.afyi afyiVar = this.a;
            afyiVar.h(canvas, getBounds(), f(), k(), j());
            defpackage.afyg afygVar = this.b;
            afygVar.f = g();
            android.graphics.Paint paint = this.m;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setAntiAlias(true);
            defpackage.afxn afxnVar = this.j;
            afygVar.c = afxnVar.e[0];
            int iA = afxnVar.i;
            if (iA > 0) {
                if (!(afyiVar instanceof defpackage.afyl)) {
                    iA = (int) ((iA * dzk.A(b(), 0.0f, 0.01f)) / 0.01f);
                }
                afyiVar.f(canvas, paint, b(), 1.0f, afxnVar.f, this.n, iA);
            } else {
                afyiVar.f(canvas, paint, 0.0f, 1.0f, afxnVar.f, this.n, 0);
            }
            afyiVar.e(canvas, paint, afygVar, this.n);
            afyiVar.d(canvas, paint, afxnVar.e[0], this.n);
            canvas.restore();
        }
    }

    @Override // defpackage.afyf
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        float fE = defpackage.aftt.e(this.i.getContentResolver());
        if (fE == 0.0f) {
            this.s = true;
        } else {
            this.s = false;
            this.r.t.e(50.0f / fE);
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.afyf, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.r.k();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        float fA = a(i);
        if (this.s) {
            this.r.k();
            d(f / 10000.0f);
            c(fA);
            return true;
        }
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            boolean z = this.a instanceof defpackage.afyl;
            ejz ejzVar = this.r;
            if (z) {
                ejzVar.h(10000.0f / iWidth);
            } else {
                ejzVar.h((float) (10000.0d / (((double) java.lang.Math.min(iHeight, iWidth)) * 3.141592653589793d)));
            }
        }
        ejz ejzVar2 = this.r;
        ejzVar2.i(b() * 10000.0f);
        ejzVar2.j(f);
        return true;
    }
}
