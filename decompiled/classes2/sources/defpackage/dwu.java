package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class dwu extends android.graphics.drawable.Drawable {
    final android.graphics.Bitmap a;
    public final android.graphics.BitmapShader c;
    public float d;
    public final int f;
    private int g;
    private final int l;
    private final int h = 119;
    public final android.graphics.Paint b = new android.graphics.Paint(3);
    private final android.graphics.Matrix i = new android.graphics.Matrix();
    final android.graphics.Rect e = new android.graphics.Rect();
    private final android.graphics.RectF j = new android.graphics.RectF();
    private boolean k = true;

    public dwu(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        android.graphics.BitmapShader bitmapShader;
        this.g = 160;
        if (resources != null) {
            this.g = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            this.l = bitmap.getScaledWidth(this.g);
            this.f = bitmap.getScaledHeight(this.g);
            bitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        } else {
            this.f = -1;
            this.l = -1;
            bitmapShader = null;
        }
        this.c = bitmapShader;
    }

    public static boolean c(float f) {
        return f > 0.05f;
    }

    public void a(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
        throw null;
    }

    final void b() {
        if (this.k) {
            int i = this.h;
            int i2 = this.l;
            int i3 = this.f;
            android.graphics.Rect bounds = getBounds();
            android.graphics.Rect rect = this.e;
            a(i, i2, i3, bounds, rect);
            android.graphics.RectF rectF = this.j;
            rectF.set(rect);
            android.graphics.BitmapShader bitmapShader = this.c;
            if (bitmapShader != null) {
                android.graphics.Matrix matrix = this.i;
                matrix.setTranslate(rectF.left, rectF.top);
                android.graphics.Bitmap bitmap = this.a;
                matrix.preScale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.b.setShader(bitmapShader);
            }
            this.k = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.a;
        if (bitmap != null) {
            b();
            android.graphics.Paint paint = this.b;
            if (paint.getShader() == null) {
                canvas.drawBitmap(bitmap, (android.graphics.Rect) null, this.e, paint);
                return;
            }
            android.graphics.RectF rectF = this.j;
            float f = this.d;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        return this.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        android.graphics.Bitmap bitmap;
        return (this.h != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.b.getAlpha() < 255 || c(this.d)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        android.graphics.Paint paint = this.b;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.b.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.b.setFilterBitmap(z);
        invalidateSelf();
    }
}
