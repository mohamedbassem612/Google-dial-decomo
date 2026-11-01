package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class opm implements defpackage.opl {
    private final char[] a;
    private final android.graphics.Paint b;

    public opm(char c) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.b = paint;
        this.a = new char[]{java.lang.Character.toUpperCase(c)};
        paint.setTypeface(android.graphics.Typeface.create("google-sans", 0));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
    }

    @Override // defpackage.opl
    public final void a(android.graphics.Canvas canvas, android.graphics.Rect rect, int i) {
        float fMin = java.lang.Math.min(rect.width(), rect.height());
        android.graphics.Paint paint = this.b;
        paint.setTextSize(fMin * 0.67f);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        char[] cArr = this.a;
        paint.getTextBounds(cArr, 0, 1, rect2);
        paint.setColor(i);
        canvas.drawText(cArr, 0, 1, rect.centerX(), rect.centerY() - rect2.exactCenterY(), paint);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.a, ((defpackage.opm) obj).a);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }
}
