package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Illustration extends android.widget.FrameLayout {
    private float a;
    private android.graphics.drawable.Drawable b;
    private android.graphics.drawable.Drawable c;
    private final android.graphics.Rect d;
    private final android.graphics.Rect e;
    private float f;
    private float g;

    public Illustration(android.content.Context context) {
        super(context);
        this.d = new android.graphics.Rect();
        this.e = new android.graphics.Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        a(null, 0);
    }

    private final void a(android.util.AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.aggy.n, i, 0);
            this.g = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.a = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    private static final boolean b(android.graphics.drawable.Drawable drawable, int i) {
        if (i == 1) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.b != null) {
            canvas.save();
            canvas.translate(0.0f, this.e.height());
            float f = this.f;
            canvas.scale(f, f, 0.0f, 0.0f);
            if (b(this.b, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-this.b.getBounds().width(), 0.0f);
            }
            this.b.draw(canvas);
            canvas.restore();
        }
        if (this.c != null) {
            canvas.save();
            if (b(this.c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-this.e.width(), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.c.getIntrinsicHeight();
            android.graphics.Rect rect = this.d;
            rect.set(0, 0, i5, i6);
            if (this.g != 0.0f) {
                float f = i5 / intrinsicWidth;
                this.f = f;
                intrinsicHeight = (int) (intrinsicHeight * f);
                intrinsicWidth = i5;
            }
            android.graphics.Rect rect2 = this.e;
            android.view.Gravity.apply(55, intrinsicWidth, intrinsicHeight, rect, rect2);
            this.c.setBounds(rect2);
        }
        android.graphics.drawable.Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) java.lang.Math.ceil(i5 / this.f), (int) java.lang.Math.ceil((i6 - this.e.height()) / this.f));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.g != 0.0f) {
            float size = (int) (android.view.View.MeasureSpec.getSize(i) / this.g);
            setPadding(0, (int) (size - (size % this.a)), 0, 0);
        }
        setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.b) {
            this.b = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public final void setForeground(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.c) {
            this.c = drawable;
            invalidate();
            requestLayout();
        }
    }

    public Illustration(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new android.graphics.Rect();
        this.e = new android.graphics.Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        a(attributeSet, 0);
    }

    public Illustration(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new android.graphics.Rect();
        this.e = new android.graphics.Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        a(attributeSet, i);
    }
}
