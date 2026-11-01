package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjf extends android.text.style.ReplacementSpan {
    public static final defpackage.kjf a = new defpackage.kjf();

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        aooh.f(canvas, "canvas");
        aooh.f(charSequence, "text");
        aooh.f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        aooh.f(paint, "paint");
        aooh.f(charSequence, "text");
        return aopc.i(paint.measureText(charSequence, i, i2));
    }
}
