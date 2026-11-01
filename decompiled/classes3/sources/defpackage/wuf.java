package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wuf implements android.text.style.LineBackgroundSpan {
    private final android.graphics.Paint a;
    private final int b;
    private final int c;

    public wuf(android.content.Context context, int i, int i2, int i3) {
        this.b = i2;
        this.c = i3;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.a = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(i);
        paint.setPathEffect(new android.graphics.DashPathEffect(new float[]{mni.cA(context, 1.0f), mni.cA(context, 1.0f)}, 0.0f));
        paint.setStrokeWidth(mni.cA(context, 1.0f));
        paint.setUnderlineText(true);
        paint.setAntiAlias(true);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, int i8) {
        int i9 = this.c;
        int iMax = java.lang.Math.max(i6, this.b);
        int iMin = java.lang.Math.min(i7, i9);
        float fMeasureText = paint.measureText(charSequence, i6, iMax);
        float fMeasureText2 = paint.measureText(charSequence, iMax, iMin);
        android.graphics.Path path = new android.graphics.Path();
        float f = i5 - ((i5 - i4) / 2.0f);
        path.moveTo(fMeasureText, f);
        path.lineTo(fMeasureText + fMeasureText2, f);
        canvas.drawPath(path, this.a);
    }
}
