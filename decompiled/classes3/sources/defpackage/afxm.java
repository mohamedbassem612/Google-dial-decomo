package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afxm extends android.widget.ProgressBar {
    public final defpackage.afxn a;
    public int b;
    public final int c;
    public boolean d;
    public final int e;
    public boolean f;
    public final java.lang.Runnable g;
    public final java.lang.Runnable h;
    private final boolean i;
    private final gls j;
    private final gls k;

    protected afxm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(agdv.a(context, attributeSet, i, 2132086145), attributeSet, i);
        this.d = false;
        this.e = 4;
        this.g = new defpackage.aflt(this, 5);
        this.h = new defpackage.aflt(this, 6, (byte[]) null);
        this.j = new defpackage.afxk(this);
        this.k = new defpackage.afxl(this);
        android.content.Context context2 = getContext();
        this.a = a(context2, attributeSet);
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afyu.a, i, i2, new int[0]);
        typedArrayA.getInt(7, -1);
        this.c = java.lang.Math.min(typedArrayA.getInt(5, -1), 1000);
        typedArrayA.recycle();
        this.i = true;
    }

    private final defpackage.afyi i() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().a;
            }
        } else if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract defpackage.afxn a(android.content.Context context, android.util.AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.afyb getProgressDrawable() {
        return (defpackage.afyb) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.afyk getIndeterminateDrawable() {
        return (defpackage.afyk) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.i) {
            ((defpackage.afyf) getCurrentDrawable()).l(g(), false, z);
        }
    }

    public final void e() {
        if (this.c > 0) {
            android.os.SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void f(int... iArr) {
        defpackage.afxn afxnVar = this.a;
        if (java.util.Arrays.equals(afxnVar.e, iArr)) {
            return;
        }
        afxnVar.e = iArr;
        getIndeterminateDrawable().b.b();
        invalidate();
    }

    final boolean g() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            android.view.View view = this;
            while (view.getVisibility() == 0) {
                java.lang.Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                    }
                } else if (parent instanceof android.view.View) {
                    view = (android.view.View) parent;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public final android.graphics.drawable.Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public void h(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.d = true;
            if (!getIndeterminateDrawable().isVisible() || defpackage.aftt.e(getContext().getContentResolver()) == 0.0f) {
                this.j.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.d();
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.c(this.j);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.k);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.k);
        }
        if (g()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.h);
        removeCallbacks(this.g);
        ((defpackage.afyf) getCurrentDrawable()).l(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().n(this.k);
            getIndeterminateDrawable().b.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().n(this.k);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        defpackage.afyi afyiVarI = i();
        if (afyiVarI == null) {
            return;
        }
        setMeasuredDimension(afyiVarI.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : afyiVarI.b() + getPaddingLeft() + getPaddingRight(), afyiVarI.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : afyiVarI.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        android.graphics.drawable.Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((defpackage.afyf) currentDrawable).l(false, false, false);
        }
        super.setIndeterminate(z);
        android.graphics.drawable.Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((defpackage.afyf) currentDrawable2).l(g(), false, false);
        }
        if ((currentDrawable2 instanceof defpackage.afyk) && g()) {
            ((defpackage.afyk) currentDrawable2).b.f();
        }
        this.d = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof defpackage.afyk) {
            ((defpackage.afyf) drawable).l(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f) {
                throw new java.lang.IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        h(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof defpackage.afyb)) {
            if (this.f) {
                throw new java.lang.IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            defpackage.afyb afybVar = (defpackage.afyb) drawable;
            afybVar.l(false, false, false);
            super.setProgressDrawable(afybVar);
            afybVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
