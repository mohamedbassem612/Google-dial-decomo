package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dlo extends android.text.style.MetricAffectingSpan {
    private final float a;

    public dlo(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.a);
    }
}
