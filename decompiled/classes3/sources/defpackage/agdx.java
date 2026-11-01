package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdx extends agaf implements afvg {
    private final android.graphics.Rect D;
    private int E;
    public final android.content.Context a;
    public final defpackage.afvh b;
    public final android.view.View.OnLayoutChangeListener c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    private java.lang.CharSequence o;
    private final android.graphics.Paint.FontMetrics p;

    public agdx(android.content.Context context, int i) {
        super(context, (android.util.AttributeSet) null, 0, i);
        this.p = new android.graphics.Paint.FontMetrics();
        defpackage.afvh afvhVar = new defpackage.afvh(this);
        this.b = afvhVar;
        this.c = new defpackage.qns(this, 6);
        this.D = new android.graphics.Rect();
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 0.5f;
        this.m = 0.5f;
        this.n = 1.0f;
        this.a = context;
        afvhVar.a.density = context.getResources().getDisplayMetrics().density;
        afvhVar.a.setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    private final float d() {
        int i;
        android.graphics.Rect rect = this.D;
        if (((rect.right - getBounds().right) - this.E) - this.g < 0) {
            i = ((rect.right - getBounds().right) - this.E) - this.g;
        } else {
            if (((rect.left - getBounds().left) - this.E) + this.g <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.E) + this.g;
        }
        return i;
    }

    public final agab a() {
        float f = -d();
        float fWidth = (float) ((((double) getBounds().width()) - (((double) this.i) * 1.4142135623730951d)) / 2.0d);
        return new defpackage.agag(new defpackage.agac(this.i), java.lang.Math.min(java.lang.Math.max(f, -fWidth), fWidth));
    }

    public final void b(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(this.o, charSequence)) {
            return;
        }
        this.o = charSequence;
        this.b.g();
        invalidateSelf();
    }

    public final void c(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        view.getWindowVisibleDisplayFrame(this.D);
    }

    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2;
        canvas.save();
        float fD = d();
        int i = this.i;
        canvas.scale(this.j, this.k, getBounds().left + (getBounds().width() * this.l), getBounds().top + (getBounds().height() * this.m));
        canvas.translate(fD, (float) (-((((double) i) * 1.4142135623730951d) - i)));
        super.draw(canvas);
        if (this.o == null) {
            canvas2 = canvas;
        } else {
            android.graphics.Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            defpackage.afvh afvhVar = this.b;
            android.graphics.Paint.FontMetrics fontMetrics = this.p;
            android.text.TextPaint textPaint = afvhVar.a;
            textPaint.getFontMetrics(fontMetrics);
            float f = fontMetrics.descent + fontMetrics.ascent;
            if (afvhVar.e != null) {
                textPaint.drawableState = getState();
                afvhVar.d(this.a);
                textPaint.setAlpha((int) (this.n * 255.0f));
            }
            java.lang.CharSequence charSequence = this.o;
            float f2 = (int) (fCenterY - (f / 2.0f));
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), f2, textPaint);
        }
        canvas2.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) java.lang.Math.max(this.b.a.getTextSize(), this.f);
    }

    public final int getIntrinsicWidth() {
        int i = this.d << 1;
        java.lang.CharSequence charSequence = this.o;
        return (int) java.lang.Math.max(i + (charSequence == null ? 0.0f : this.b.a(charSequence.toString())), this.e);
    }

    public final void h() {
        invalidateSelf();
    }

    protected final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (this.h) {
            aguv aguvVar = new aguv(es());
            aguvVar.l = a();
            q(new agal(aguvVar));
        }
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
