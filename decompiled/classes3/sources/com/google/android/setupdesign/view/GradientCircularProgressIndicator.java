package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GradientCircularProgressIndicator extends android.view.View {
    public boolean a;
    public float b;
    public float c;
    public float d;
    private boolean e;
    private final android.graphics.Paint f;
    private final android.graphics.Paint g;
    private float h;
    private float i;
    private float j;
    private float k;
    private final android.graphics.RectF l;
    private final android.graphics.Matrix m;
    private android.graphics.Shader n;
    private android.animation.ValueAnimator o;
    private android.animation.ValueAnimator p;
    private float q;
    private float r;
    private boolean s;
    private int t;
    private int[] u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientCircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aooh.f(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.g = paint2;
        this.l = new android.graphics.RectF();
        this.m = new android.graphics.Matrix();
        this.q = 4.0f;
        this.s = true;
        this.u = new int[0];
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.k, i, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (dimension != -1.0f) {
            e(dimension / context.getResources().getDisplayMetrics().density);
        }
        d(typedArrayObtainStyledAttributes.getColor(1, this.t));
        a(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, new int[]{android.R.attr.colorPrimary}, 0, 0);
        b(new int[]{typedArrayObtainStyledAttributes2.getColor(0, 0)});
        typedArrayObtainStyledAttributes2.recycle();
        j();
        paint.setColor(this.t);
    }

    private final void f() {
        boolean z = false;
        if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
            z = true;
        }
        if (this.e != z) {
            this.e = z;
            k();
        }
    }

    private final void g() {
        if (this.e) {
            postInvalidate();
        }
    }

    private final void h() {
        android.animation.ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
    }

    private final void i() {
        android.animation.ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.p = null;
    }

    private final void j() {
        float f = this.q * getContext().getResources().getDisplayMetrics().density;
        this.h = f;
        this.f.setStrokeWidth(f);
        this.g.setStrokeWidth(this.h);
        g();
    }

    private final void k() {
        if (!this.e) {
            h();
        } else if (this.o == null) {
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 360.0f);
            valueAnimatorOfFloat.setDuration(2500L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new defpackage.afzo(this, 10));
            valueAnimatorOfFloat.start();
            this.o = valueAnimatorOfFloat;
        }
        if (!this.e || !this.s) {
            i();
            return;
        }
        if (this.p == null) {
            android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(2000L);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new defpackage.afzo(this, 9));
            valueAnimatorOfFloat2.start();
            this.p = valueAnimatorOfFloat2;
        }
    }

    private final void l() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, this.j, getWidth(), this.j, this.u, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        this.n = linearGradient;
        this.g.setShader(linearGradient);
    }

    public final void a(boolean z) {
        if (this.s != z) {
            this.s = z;
            k();
            g();
        }
    }

    public final void b(int[] iArr) {
        aooh.f(iArr, "value");
        boolean z = false;
        if (iArr.length == 1) {
            iArr = new int[]{iArr[0], iArr[0]};
        }
        if (java.util.Arrays.equals(this.u, iArr)) {
            return;
        }
        this.u = iArr;
        if (iArr.length > 1) {
            for (int i : iArr) {
                if (i != this.u[0]) {
                    z = true;
                    break;
                }
            }
        }
        this.a = z;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        l();
        g();
    }

    public final void c(float f) {
        float fS = aooc.s(f, 0.0f, 100.0f);
        if (this.r != fS) {
            this.r = fS;
            if (this.s) {
                return;
            }
            g();
        }
    }

    public final void d(int i) {
        if (this.t != i) {
            this.t = i;
            this.f.setColor(i);
            g();
        }
    }

    public final void e(float f) {
        if (this.q != f) {
            this.q = f;
            j();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        h();
        i();
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        aooh.f(canvas, "canvas");
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        canvas.drawCircle(this.i, this.j, this.k, this.f);
        if (this.a) {
            android.graphics.Matrix matrix = this.m;
            matrix.setRotate(this.b, this.i, this.j);
            android.graphics.Shader shader = this.n;
            if (shader != null) {
                shader.setLocalMatrix(matrix);
            }
        } else {
            android.graphics.Shader shader2 = this.n;
            if (shader2 != null) {
                shader2.setLocalMatrix(null);
            }
        }
        boolean z = this.s;
        android.graphics.RectF rectF = this.l;
        if (z) {
            canvas.drawArc(rectF, this.c - 90.0f, this.d, false, this.g);
            return;
        }
        canvas.drawArc(rectF, -90.0f, (this.r / 100.0f) * 360.0f, false, this.g);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            c(bundle.getFloat("progress"));
            a(bundle.getBoolean("isIndeterminate"));
            int[] intArray = bundle.getIntArray("indicatorColors");
            if (intArray == null) {
                intArray = this.u;
            }
            b(intArray);
            d(bundle.getInt("trackColor"));
            e(bundle.getFloat("trackThicknessDp", 4.0f));
            this.f.setColor(this.t);
            j();
            parcelable = (android.os.Parcelable) dpe.t(bundle, "superState", android.os.Parcelable.class);
        }
        super.onRestoreInstanceState(parcelable);
        l();
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putFloat("progress", this.r);
        bundle.putBoolean("isIndeterminate", this.s);
        bundle.putIntArray("indicatorColors", this.u);
        bundle.putInt("trackColor", this.t);
        bundle.putFloat("trackThicknessDp", this.q);
        return bundle;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i = i / 2.0f;
        this.j = i2 / 2.0f;
        float fMin = (java.lang.Math.min((i - getPaddingLeft()) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom()) - this.h) / 2.0f;
        this.k = fMin;
        float f = this.i;
        float f2 = this.j;
        this.l.set(f - fMin, f2 - fMin, f + fMin, f2 + fMin);
        l();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        aooh.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        f();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCircularProgressIndicator(android.content.Context context) {
        this(context, null, 0, 6, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ GradientCircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
