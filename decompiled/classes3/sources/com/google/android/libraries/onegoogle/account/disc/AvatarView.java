package com.google.android.libraries.onegoogle.account.disc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AvatarView extends defpackage.aehs {
    private final android.graphics.Paint b;
    private final android.graphics.Paint c;
    private final android.graphics.RectF d;
    private final android.graphics.Path e;
    private final android.graphics.Path f;
    private final int g;
    private android.graphics.drawable.Drawable h;
    private int i;
    private float j;
    private android.graphics.drawable.Drawable k;
    private android.graphics.drawable.Drawable l;
    private int m;
    private final android.graphics.Path n;
    private float o;
    private boolean p;
    private boolean q;
    private dxw r;
    private int s;
    private int t;
    private boolean u;
    private java.lang.Runnable v;
    private boolean w;

    public AvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.b = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.c = paint2;
        this.d = new android.graphics.RectF();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.Path();
        this.g = getResources().getDimensionPixelSize(2131167234);
        this.i = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.n = new android.graphics.Path();
        this.o = 1.0f;
        final int i2 = 1;
        this.r = new dxw() { // from class: aeiz
            public final void accept(java.lang.Object obj) {
                if (i2 != 0) {
                }
            }
        };
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.v = new fvl(17);
        this.w = true;
        paint2.setAntiAlias(true);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(2131167260));
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.h = den.bO(context, 2131231140);
    }

    private static void o(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, boolean z) {
        boolean z2 = true;
        if (drawable != null && !z) {
            z2 = false;
        }
        ahvr.bZ(z2, "setting ring/badge is only allowed with allowDecorations");
    }

    private final void p(int i) {
        if (i != Integer.MIN_VALUE) {
            this.r.accept(java.lang.Integer.valueOf(this.a.d(i)));
        }
    }

    private final void q(int i) {
        int i2 = this.i;
        this.i = i;
        if (i2 == Integer.MIN_VALUE) {
            this.v.run();
        }
        s(this.s, this.t, i);
        u();
        p(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r() {
        android.graphics.Path path = this.f;
        path.rewind();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (java.lang.Math.min(this.s, this.t) != Integer.MIN_VALUE && this.i != Integer.MIN_VALUE) {
            android.graphics.RectF rectF = this.d;
            if (!rectF.isEmpty() && this.j != 0.0f) {
                float fM = m(this.i) * this.j;
                ahvr.bY((this.i == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
                int i = dzs.a;
                int layoutDirection = getLayoutDirection();
                float f = rectF.left;
                android.graphics.Paint paint = this.c;
                float strokeWidth = f - (paint.getStrokeWidth() / 2.0f);
                float strokeWidth2 = rectF.right + (paint.getStrokeWidth() / 2.0f);
                float fM2 = m(this.i);
                float f2 = this.g;
                float f3 = (fM2 / 2.0f) - f2;
                float f4 = layoutDirection == 1 ? strokeWidth + f3 : strokeWidth2 - f3;
                float f5 = fM / 2.0f;
                ahvr.bY((this.i == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
                float strokeWidth3 = (rectF.bottom + (paint.getStrokeWidth() / 2.0f)) - (m(this.i) / 2.0f);
                path.addCircle(f4, strokeWidth3, (f2 * this.j) + f5, android.graphics.Path.Direction.CW);
                new android.graphics.RectF(f4 - f5, strokeWidth3 - f5, f4 + f5, strokeWidth3 + f5).round(rect);
            }
        }
        android.graphics.Path path2 = this.e;
        if (!path2.isEmpty()) {
            path2.rewind();
        }
        if (!path.isEmpty()) {
            android.graphics.RectF rectF2 = this.d;
            if (!rectF2.isEmpty() && this.w) {
                path2.addOval(rectF2, android.graphics.Path.Direction.CW);
                path2.op(path2, path, android.graphics.Path.Op.DIFFERENCE);
            }
        }
        invalidate();
    }

    private final void s(int i, int i2, int i3) {
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) {
            return;
        }
        int iMin = java.lang.Math.min(i, i2);
        int i4 = (iMin - i3) / 2;
        setPadding(i4, i4, (i + i4) - iMin, (i2 + i4) - iMin);
    }

    private final void t(android.graphics.drawable.Drawable drawable, int i) {
        int iD = this.a.d(this.i);
        if (drawable == null || i == Integer.MIN_VALUE || i == iD) {
            android.graphics.Path path = this.n;
            if (path.isEmpty()) {
                return;
            }
            path.rewind();
            invalidate();
            return;
        }
        android.graphics.Path path2 = this.n;
        path2.rewind();
        android.graphics.RectF rectF = new android.graphics.RectF(drawable.getBounds());
        float f = iD - i;
        rectF.inset(f, f);
        path2.addOval(rectF, android.graphics.Path.Direction.CW);
        invalidate();
    }

    private final void u() {
        int i;
        int iMin = java.lang.Math.min(this.s, this.t);
        if (iMin == Integer.MIN_VALUE || (i = this.i) == Integer.MIN_VALUE) {
            this.d.setEmpty();
        } else {
            android.graphics.RectF rectF = this.d;
            float f = i;
            rectF.set(0.0f, 0.0f, f, f);
            float f2 = (int) ((iMin - this.i) / 2.0f);
            rectF.offset(f2, f2);
            rectF.inset(1.0f, 1.0f);
            int iD = this.a.d(this.i);
            int iC = this.a.c(this.i);
            if (this.l != null) {
                android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
                int iB = this.a.b(this.i);
                float fRound = ((iB - java.lang.Math.round(this.o * iB)) / 2) - ((iD + iC) + 2);
                rectF2.inset(fRound, fRound);
                android.graphics.Rect rect = new android.graphics.Rect();
                rectF2.roundOut(rect);
                this.l.setBounds(rect);
                t(this.l, this.m);
            }
        }
        r();
        invalidate();
    }

    @Override // defpackage.aehs
    public final android.graphics.drawable.Drawable a() {
        return this.l;
    }

    @Override // defpackage.aehs
    public final void b() {
        int i;
        int iMin = java.lang.Math.min(this.s, this.t);
        boolean z = this.u;
        if (iMin != Integer.MIN_VALUE) {
            q(z ? this.i : this.a.a(iMin));
            invalidate();
        } else {
            if (!z || (i = this.i) == Integer.MIN_VALUE) {
                return;
            }
            q(i);
        }
    }

    @Override // defpackage.aehs
    protected final void c(dxw dxwVar) {
        this.r = dxwVar;
        p(this.i);
    }

    @Override // defpackage.aehs
    public final void d() {
        if (this.p) {
            return;
        }
        this.p = true;
        invalidate();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        getDrawableState();
    }

    @Override // defpackage.aehs
    public final void e(int i) {
        this.u = true;
        n(i);
        q(i);
    }

    @Override // defpackage.aehs
    public final void f(android.graphics.drawable.Drawable drawable) {
        this.k = null;
        o(this.l, null, this.p);
        r();
    }

    @Override // defpackage.aehs
    public final void g(boolean z) {
        this.q = z;
        invalidate();
    }

    @Override // defpackage.aehs
    public final void h(boolean z) {
        int color = getResources().getColor(aehj.e(z));
        android.graphics.Paint paint = this.c;
        paint.setColor(color);
        paint.setAlpha(30);
        android.graphics.drawable.Drawable drawable = this.h;
        aehj.k(drawable, getResources().getColor(aehj.f(z)));
        this.h = drawable;
        this.b.setColor(getResources().getColor(aehj.d(z)));
    }

    @Override // defpackage.aehs
    public final void i(java.lang.Runnable runnable) {
        this.v = runnable;
        if (this.i != Integer.MIN_VALUE) {
            runnable.run();
        }
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable.equals(null) || drawable.equals(this.l)) {
            invalidate();
        }
    }

    @Override // defpackage.aehs
    public final void j() {
        setImageDrawable(this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aehs
    public final void k(android.graphics.drawable.Drawable drawable) {
        o(drawable, null, this.p);
        android.graphics.drawable.Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        u();
    }

    final int m(int i) {
        android.content.res.Resources resources = getResources();
        aooh.f(resources, "<this>");
        return aehj.c(resources, i, defpackage.akvo.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(int i) {
        setTag(2131428603, java.lang.Integer.valueOf(i));
    }

    protected final void onDraw(android.graphics.Canvas canvas) {
        int i;
        android.graphics.Path path = this.f;
        boolean z = false;
        if (!path.isEmpty() && this.w) {
            z = true;
        }
        if (z) {
            canvas.save();
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
        }
        if (this.l != null) {
            android.graphics.Path path2 = this.n;
            if (path2.isEmpty()) {
                this.l.draw(canvas);
            } else {
                canvas.save();
                canvas.clipPath(path2);
                this.l.draw(canvas);
                canvas.restore();
            }
        }
        float fA = (!this.p || (i = this.i) == Integer.MIN_VALUE) ? this.o : this.a.a(java.lang.Math.round(this.o * this.a.b(i))) / this.i;
        float fMin = java.lang.Math.min(this.s, this.t) / 2.0f;
        canvas.scale(fA, fA, fMin, fMin);
        super.onDraw(canvas);
        if (z) {
            canvas.restore();
        }
        if (this.q) {
            android.graphics.Path path3 = this.e;
            if (!path3.isEmpty()) {
                canvas.drawPath(path3, this.c);
                return;
            }
            android.graphics.RectF rectF = this.d;
            if (rectF.isEmpty()) {
                return;
            }
            canvas.drawArc(rectF, 0.0f, 360.0f, false, this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.s = i;
        this.t = i2;
        s(i, i2, this.i);
        u();
        if (this.u) {
            return;
        }
        int iMin = java.lang.Math.min(i, i2);
        if (this.p) {
            iMin = this.a.a(iMin);
        }
        if (((java.lang.Integer) aesg.g(this).d(0)).intValue() < iMin) {
            n(iMin);
        }
        q(iMin);
    }

    public void setBadgeScale(float f) {
        this.j = f;
        r();
    }

    protected void setCurrRingThickness(int i) {
        if (i != this.m) {
            this.m = i;
            t(this.l, i);
        }
    }

    public AvatarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(android.content.Context context) {
        this(context, null);
    }
}
