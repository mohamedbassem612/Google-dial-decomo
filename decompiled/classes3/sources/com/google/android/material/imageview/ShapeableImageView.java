package com.google.android.material.imageview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ShapeableImageView extends android.support.v7.widget.AppCompatImageView implements agaw {
    public final android.graphics.RectF a;
    public agaf b;
    public agal c;
    private final agan d;
    private final android.graphics.RectF e;
    private final android.graphics.Paint f;
    private final android.graphics.Paint g;
    private final android.graphics.Path h;
    private android.content.res.ColorStateList i;
    private float j;
    private android.graphics.Path k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public ShapeableImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132086146), attributeSet, i);
        this.d = agam.a;
        this.h = new android.graphics.Path();
        this.r = false;
        android.content.Context context2 = getContext();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        this.a = new android.graphics.RectF();
        this.e = new android.graphics.RectF();
        this.k = new android.graphics.Path();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, defpackage.aftv.a, i, 2132086146);
        setLayerType(2, null);
        this.i = agab.o(context2, typedArrayObtainStyledAttributes, 9);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.c = new agal(agal.m(context2, attributeSet, i, 2132086146));
        setOutlineProvider(new defpackage.aftw(this));
    }

    private final void e(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        int paddingBottom = i2 - getPaddingBottom();
        android.graphics.RectF rectF = this.a;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        agan aganVar = this.d;
        agal agalVar = this.c;
        android.graphics.Path path = this.h;
        aganVar.c(agalVar, (float[]) null, 1.0f, rectF, (apnt) null, path);
        this.k.rewind();
        this.k.addPath(path);
        android.graphics.RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, i, i2);
        this.k.addRect(rectF2, android.graphics.Path.Direction.CCW);
    }

    private final boolean g() {
        return (this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) ? false : true;
    }

    private final boolean h() {
        return getLayoutDirection() == 1;
    }

    public final int a() {
        int i = this.q;
        if (i == Integer.MIN_VALUE) {
            return h() ? this.l : this.n;
        }
        return i;
    }

    public final int b() {
        int i;
        int i2;
        if (g()) {
            if (h() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!h() && (i = this.p) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.l;
    }

    public final int c() {
        int i;
        int i2;
        if (g()) {
            if (h() && (i2 = this.p) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!h() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    public final int d() {
        int i = this.p;
        if (i == Integer.MIN_VALUE) {
            return h() ? this.n : this.l;
        }
        return i;
    }

    public final agal es() {
        return this.c;
    }

    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.o;
    }

    public final int getPaddingEnd() {
        return super.getPaddingEnd() - a();
    }

    public final int getPaddingLeft() {
        return super.getPaddingLeft() - b();
    }

    public final int getPaddingRight() {
        return super.getPaddingRight() - c();
    }

    public final int getPaddingStart() {
        return super.getPaddingStart() - d();
    }

    public final int getPaddingTop() {
        return super.getPaddingTop() - this.m;
    }

    protected final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.g);
        if (this.i != null) {
            android.graphics.Paint paint = this.f;
            paint.setStrokeWidth(this.j);
            int colorForState = this.i.getColorForState(getDrawableState(), this.i.getDefaultColor());
            if (this.j <= 0.0f || colorForState == 0) {
                return;
            }
            paint.setColor(colorForState);
            canvas.drawPath(this.h, paint);
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r || !isLayoutDirectionResolved()) {
            return;
        }
        this.r = true;
        if (isPaddingRelative() || g()) {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        } else {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        }
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    public final void q(agal agalVar) {
        this.c = agalVar;
        agaf agafVar = this.b;
        if (agafVar != null) {
            agafVar.q(agalVar);
        }
        e(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + b(), i2 + this.m, i3 + c(), i4 + this.o);
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + d(), i2 + this.m, i3 + a(), i4 + this.o);
    }

    public ShapeableImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(android.content.Context context) {
        this(context, null, 0);
    }
}
