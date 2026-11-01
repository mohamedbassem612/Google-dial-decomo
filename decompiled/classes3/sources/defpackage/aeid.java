package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeid extends defpackage.aeio {
    private static final int[][] a = {new int[]{-279548, 155, 50}, new int[]{-1490379, 205, 105}, new int[]{-12417548, 310, 100}, new int[]{-13326253, 50, 105}};
    private final android.graphics.Paint b;
    private final android.graphics.RectF c = new android.graphics.RectF();
    private final defpackage.aprf d;

    public aeid(defpackage.aprf aprfVar) {
        this.d = aprfVar;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int[][] iArr = a;
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = iArr[i];
            android.graphics.Paint paint = this.b;
            paint.setColor(iArr2[0]);
            canvas.drawArc(this.c, iArr2[1], iArr2[2], false, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        ahvr.bN(rect.width() == rect.height(), "Width and height for G1RingDrawable bounds must be equal.");
        int iS = this.d.s(rect.width());
        ahvr.bN(rect.width() == rect.height(), "Width and height for ring bounds must be equal.");
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        float f = (iS + 1) / 2.0f;
        rectF.inset(f, f);
        this.c.set(rectF);
        this.b.setStrokeWidth(iS);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
