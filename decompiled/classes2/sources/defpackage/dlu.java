package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dlu implements android.text.style.LineHeightSpan {
    private final float a;

    public dlu(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 > 0) {
            int iCeil = (int) java.lang.Math.ceil(this.a);
            fontMetricsInt.descent = (int) java.lang.Math.ceil(((double) fontMetricsInt.descent) * ((double) (iCeil / i5)));
            fontMetricsInt.ascent = fontMetricsInt.descent - iCeil;
        }
    }
}
