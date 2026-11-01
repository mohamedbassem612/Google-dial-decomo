package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afug extends jp {
    protected boolean a;
    boolean b;
    private android.graphics.drawable.Drawable c;
    private final android.graphics.Rect d;
    private final android.graphics.Rect e;
    private int i;

    public afug(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new android.graphics.Rect();
        this.e = new android.graphics.Rect();
        this.i = 119;
        this.a = true;
        this.b = false;
        android.content.res.TypedArray typedArrayA = afvl.a(context, attributeSet, afuy.b, i, 0, new int[0]);
        this.i = typedArrayA.getInt(1, this.i);
        android.graphics.drawable.Drawable drawable = typedArrayA.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.a = typedArrayA.getBoolean(2, true);
        typedArrayA.recycle();
    }

    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            if (this.b) {
                this.b = false;
                android.graphics.Rect rect = this.d;
                android.graphics.Rect rect2 = this.e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                android.view.Gravity.apply(this.i, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.c.setState(getDrawableState());
    }

    public final android.graphics.drawable.Drawable getForeground() {
        return this.c;
    }

    public final int getForegroundGravity() {
        return this.i;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b |= z;
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setForeground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.c);
            }
            this.c = drawable;
            this.b = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.i == 119) {
                    drawable.getPadding(new android.graphics.Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setForegroundGravity(int i) {
        if (this.i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.i = i;
            if (i == 119 && this.c != null) {
                this.c.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }

    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }

    public afug(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public afug(android.content.Context context) {
        this(context, null);
    }
}
