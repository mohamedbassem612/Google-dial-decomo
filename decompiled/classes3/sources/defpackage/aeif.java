package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeif extends defpackage.aeio {
    private final android.graphics.Paint a;
    private final android.graphics.Matrix b;
    private final android.graphics.RectF c;
    private final int d;
    private final defpackage.aprf e;

    public aeif(android.content.res.Resources resources, defpackage.aprf aprfVar, int i) {
        aooh.f(resources, "resources");
        this.e = aprfVar;
        this.d = i;
        float f = resources.getDisplayMetrics().density;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.a = paint;
        this.b = new android.graphics.Matrix();
        this.c = new android.graphics.RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        aooh.f(canvas, "canvas");
        android.graphics.RectF rectF = this.c;
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) throws aois {
        android.graphics.Shader shader;
        aooh.f(rect, "bounds");
        super.onBoundsChange(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        float fS = this.e.s(rect.width());
        int[] iArr = defpackage.aeie.a;
        android.graphics.RectF rectF = this.c;
        rectF.set(rect);
        float f = (fS / 2.0f) + 1.0f;
        rectF.inset(f, f);
        android.graphics.Paint paint = this.a;
        paint.setStrokeWidth(fS);
        int i = this.d;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            float fWidth = rect.width();
            float fHeight = rect.height();
            float f2 = rect.left;
            float f3 = rect.top;
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(25.0f, 50.0f, 75.0f, 50.0f, defpackage.aeie.a, defpackage.aeie.b, android.graphics.Shader.TileMode.CLAMP);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            matrix.postScale(fWidth / 100.0f, fHeight / 100.0f);
            matrix.postTranslate(f2, f3);
            matrix.preTranslate(49.808f, 50.617f);
            matrix.preRotate(-54.205f);
            matrix.preScale(2.014f, 2.014f);
            matrix.preTranslate(-50.0f, -50.0f);
            linearGradient.setLocalMatrix(matrix);
            shader = linearGradient;
        } else {
            if (i2 != 1) {
                throw new aois();
            }
            android.graphics.SweepGradient sweepGradient = new android.graphics.SweepGradient(rectF.centerX(), rectF.centerY(), defpackage.aeie.c, defpackage.aeie.d);
            android.graphics.Matrix matrix2 = this.b;
            matrix2.setRotate(140.0f, rectF.centerX(), rectF.centerY());
            sweepGradient.setLocalMatrix(matrix2);
            shader = sweepGradient;
        }
        paint.setShader(shader);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
