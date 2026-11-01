package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dma extends android.text.style.MetricAffectingSpan {
    private final android.graphics.Typeface a;

    public dma(android.graphics.Typeface typeface) {
        this.a = typeface;
    }

    private final void a(android.graphics.Paint paint) {
        paint.setTypeface(this.a);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        a(textPaint);
    }
}
