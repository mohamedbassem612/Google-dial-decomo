package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dlq implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        java.lang.ThreadLocal threadLocal = defpackage.dlm.a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float f = defpackage.dez.f(layout, lineForOffset, paint) + defpackage.dez.g(layout, lineForOffset, paint);
            if (f != 0.0f) {
                if (canvas == null) {
                    defpackage.aooh.g();
                }
                canvas.translate(f, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
