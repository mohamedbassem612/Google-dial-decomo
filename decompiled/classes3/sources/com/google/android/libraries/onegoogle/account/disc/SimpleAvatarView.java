package com.google.android.libraries.onegoogle.account.disc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SimpleAvatarView extends defpackage.aehs {
    private static final float b = 0.70710677f;
    private final android.graphics.Paint c;
    private final android.graphics.Paint d;
    private final android.graphics.RectF e;
    private final int f;
    private android.graphics.drawable.Drawable g;
    private int h;
    private android.graphics.drawable.Drawable i;
    private android.graphics.drawable.Drawable j;
    private int k;
    private int l;
    private int m;
    private defpackage.akvo n;
    private boolean o;
    private dxw p;
    private int q;

    public SimpleAvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.c = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.d = paint2;
        this.e = new android.graphics.RectF();
        this.f = getResources().getDimensionPixelSize(2131167234);
        this.h = Integer.MIN_VALUE;
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.n = defpackage.akvo.a;
        this.q = 1;
        this.o = true;
        paint2.setAntiAlias(true);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(2131167260));
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.g = den.bO(context, 2131231140);
        getResources().getColor(aehj.e(true));
    }

    private final int m() {
        return (this.k - this.h) / 2;
    }

    private final void n(int i) {
        dxw dxwVar = this.p;
        if (dxwVar == null || i == Integer.MIN_VALUE) {
            return;
        }
        dxwVar.accept(java.lang.Integer.valueOf(this.a.d(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        this.h = this.a.a(this.k);
        int iIntValue = ((java.lang.Integer) aesg.g(this).d(0)).intValue();
        int i = this.h;
        if (iIntValue < i) {
            setTag(2131428603, java.lang.Integer.valueOf(i));
        }
        int iM = m();
        int i2 = this.l;
        int i3 = this.h;
        setPaddingRelative(iM, iM, (i2 - i3) - iM, (this.m - i3) - iM);
        q();
        n(this.h);
    }

    private final void q() {
        int i;
        if (this.l == Integer.MIN_VALUE || this.m == Integer.MIN_VALUE || (i = this.h) == Integer.MIN_VALUE) {
            this.e.setEmpty();
        } else {
            android.graphics.RectF rectF = this.e;
            float f = i;
            rectF.set(0.0f, 0.0f, f, f);
            int iM = m();
            rectF.offset(getLayoutDirection() == 1 ? (this.l - this.h) - iM : iM, iM);
            rectF.inset(1.0f, 1.0f);
            int iD = this.a.d(this.h);
            int iC = this.a.c(this.h);
            if (this.j != null) {
                android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
                float f2 = ((-iD) - iC) - 2;
                rectF2.inset(f2, f2);
                android.graphics.Rect rect = new android.graphics.Rect();
                rectF2.roundOut(rect);
                this.j.setBounds(rect);
            }
        }
        o();
        invalidate();
    }

    @Override // defpackage.aehs
    public final android.graphics.drawable.Drawable a() {
        return this.j;
    }

    @Override // defpackage.aehs
    public final void b() {
        if (this.k != Integer.MIN_VALUE) {
            p();
        }
    }

    @Override // defpackage.aehs
    protected final void c(dxw dxwVar) {
        this.p = dxwVar;
        n(this.h);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        getDrawableState();
    }

    @Override // defpackage.aehs
    public final void f(android.graphics.drawable.Drawable drawable) {
        this.i = null;
        o();
    }

    @Override // defpackage.aehs
    public final void h(boolean z) {
        int color = getResources().getColor(aehj.e(z));
        android.graphics.Paint paint = this.d;
        paint.setColor(color);
        paint.setAlpha(30);
        android.graphics.drawable.Drawable drawable = this.g;
        aehj.k(drawable, getResources().getColor(aehj.f(z)));
        this.g = drawable;
        this.c.setColor(getResources().getColor(aehj.d(z)));
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable.equals(null) || drawable.equals(this.j)) {
            invalidate();
        }
    }

    @Override // defpackage.aehs
    public final void j() {
        setImageDrawable(this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aehs
    public final void k(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.j;
        if (drawable2 != null) {
            if (drawable2 instanceof defpackage.aein) {
                ((defpackage.aein) drawable2).stop();
            }
            this.j.setCallback(null);
        }
        this.j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        q();
    }

    @Override // defpackage.aehs
    public final void l(defpackage.akvo akvoVar, int i) {
        this.n = akvoVar;
        this.q = 2;
        o();
        invalidate();
    }

    protected final void onDetachedFromWindow() {
        android.graphics.drawable.Drawable drawable = this.j;
        if (drawable instanceof defpackage.aein) {
            ((defpackage.aein) drawable).stop();
        }
        super.onDetachedFromWindow();
    }

    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.j;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
        if (this.o) {
            canvas.drawArc(this.e, 0.0f, 360.0f, false, this.d);
        }
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l = i;
        this.m = i2;
        this.k = java.lang.Math.min(i, i2);
        p();
    }

    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return (drawable instanceof defpackage.aein) && drawable.equals(this.j);
    }

    private final void o() {
    }

    @Override // defpackage.aehs
    public final void e(int i) {
    }

    @Override // defpackage.aehs
    public final void g(boolean z) {
    }

    public SimpleAvatarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleAvatarView(android.content.Context context) {
        this(context, null);
    }
}
