package com.google.android.libraries.user.profile.photopicker.common.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SquareImageView extends android.view.View {
    public android.graphics.Bitmap a;
    private final android.graphics.Paint b;
    private final android.graphics.Paint c;
    private int d;
    private android.graphics.RectF e;
    private int f;
    private int g;

    public SquareImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.c = paint;
        new defpackage.afna(this, this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968956});
        try {
            paint.setColor(typedArrayObtainStyledAttributes.getColor(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.d = context.getResources().getDimensionPixelSize(2131167287);
            if (defpackage.anhn.a.eZ().a()) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.afmz.a, 0, 0);
                try {
                    this.d = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, this.d);
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        this.a = null;
        this.b.setShader(null);
        invalidate();
    }

    public final void b() {
        if (this.f == 0 || this.g == 0) {
            return;
        }
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(this.a, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        float f = this.f;
        float f2 = this.g;
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        float f3 = width / height;
        float f4 = f / f2;
        float f5 = f3 <= f4 ? width : height * f4;
        float f6 = f3 >= f4 ? height : width / f4;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postTranslate(-((width - f5) / 2.0f), -((height - f6) / 2.0f));
        matrix.postScale(f / f5, f2 / f6);
        bitmapShader.setLocalMatrix(matrix);
        this.b.setShader(bitmapShader);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.e;
        if (rectF != null) {
            android.graphics.Bitmap bitmap = this.a;
            int i = this.d;
            if (bitmap != null) {
                float f = i;
                canvas.drawRoundRect(rectF, f, f, this.b);
            } else {
                float f2 = i;
                canvas.drawRoundRect(rectF, f2, f2, this.c);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = i - getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.f = paddingRight;
        this.g = i2 - paddingBottom;
        this.e = new android.graphics.RectF(getPaddingLeft(), getPaddingTop(), this.f, this.g);
        if (this.a != null) {
            b();
        }
    }

    public SquareImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareImageView(android.content.Context context) {
        this(context, null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167295);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
