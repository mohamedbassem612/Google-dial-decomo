package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aggq extends android.graphics.drawable.Drawable {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final android.graphics.drawable.GradientDrawable e;
    private final android.graphics.Rect f;

    public aggq(float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        aooh.f(fArr, "cornerRadii");
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(i, i6);
        gradientDrawable.setCornerRadii(fArr);
        this.e = gradientDrawable;
        this.f = new android.graphics.Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int i;
        int i2;
        aooh.f(canvas, "canvas");
        android.graphics.Rect rect = this.f;
        if (canvas.getClipBounds(rect)) {
            int i3 = this.b;
            int i4 = rect.left + i3;
            int i5 = this.a;
            int i6 = this.d;
            int i7 = this.c;
            int i8 = rect.top + i7;
            int i9 = rect.right - i3;
            int i10 = rect.bottom - i7;
            int i11 = (i4 + i5) - i6;
            int i12 = (i9 - i5) - i6;
            if (i11 >= i12 || (i2 = i8 + i5) >= (i = i10 - i5)) {
                return;
            }
            android.graphics.drawable.GradientDrawable gradientDrawable = this.e;
            gradientDrawable.setBounds(i11, i2, i12, i);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
}
