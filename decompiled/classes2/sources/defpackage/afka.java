package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afka extends defpackage.ecj {
    private final android.widget.TextView f;

    public afka(android.widget.TextView textView) {
        super(textView);
        this.f = textView;
    }

    private final java.lang.CharSequence y(android.text.style.ClickableSpan clickableSpan) {
        java.lang.CharSequence text = this.f.getText();
        if (!(text instanceof android.text.Spanned)) {
            return text;
        }
        android.text.Spanned spanned = (android.text.Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.ecj
    public final void c(android.view.View view, defpackage.ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.ad(defpackage.ebc.c);
        ebdVar.t(false);
    }

    @Override // defpackage.ecj
    protected final void l(java.util.List list) {
        java.lang.CharSequence text = this.f.getText();
        if (text instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) text;
            for (android.text.style.ClickableSpan clickableSpan : (android.text.style.ClickableSpan[]) spanned.getSpans(0, spanned.length(), android.text.style.ClickableSpan.class)) {
                list.add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.ecj
    protected final void m(int i, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.text.style.ClickableSpan clickableSpanW = w(i);
        if (clickableSpanW != null) {
            accessibilityEvent.setContentDescription(y(clickableSpanW));
        } else {
            android.util.Log.w("TvLinksAccessibilityHelper", a.bj(i, "LinkSpan is null for offset: "));
            accessibilityEvent.setContentDescription(this.f.getText());
        }
    }

    @Override // defpackage.ecj
    protected final void o(int i, defpackage.ebd ebdVar) {
        android.text.style.ClickableSpan clickableSpanW = w(i);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (clickableSpanW != null) {
            ebdVar.w(y(clickableSpanW));
        } else {
            android.util.Log.w("TvLinksAccessibilityHelper", a.bj(i, "LinkSpan is null for offset: "));
            ebdVar.w(this.f.getText());
        }
        ebdVar.A(true);
        ebdVar.t(true);
        x(clickableSpanW, rect);
        if (rect.isEmpty()) {
            android.util.Log.w("TvLinksAccessibilityHelper", a.bj(i, "LinkSpan bounds is empty for: "));
            rect.set(0, 0, 1, 1);
            ebdVar.o(rect);
        } else {
            x(clickableSpanW, rect);
            ebdVar.o(rect);
        }
        ebdVar.h(16);
    }

    @Override // defpackage.ecj
    public final boolean t(int i, int i2, android.os.Bundle bundle) {
        if (i2 == 16) {
            android.text.style.ClickableSpan clickableSpanW = w(i);
            if (clickableSpanW != null) {
                clickableSpanW.onClick(this.f);
                return true;
            }
            android.util.Log.e("TvLinksAccessibilityHelper", a.bj(i, "LinkSpan is null for offset: "));
        }
        return false;
    }

    final android.text.style.ClickableSpan w(int i) {
        java.lang.CharSequence text = this.f.getText();
        if (text instanceof android.text.Spanned) {
            android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(i, i, android.text.style.ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    final void x(android.text.style.ClickableSpan clickableSpan, android.graphics.Rect rect) {
        android.text.Layout layout;
        android.widget.TextView textView = this.f;
        java.lang.CharSequence text = textView.getText();
        if (!(text instanceof android.text.Spanned) || (layout = textView.getLayout()) == null) {
            return;
        }
        android.text.Spanned spanned = (android.text.Spanned) text;
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        layout.getLineBounds(lineForOffset, rect);
        rect.right = (int) primaryHorizontal2;
        if (lineForOffset == lineForOffset2) {
            rect.left = (int) primaryHorizontal;
        } else {
            rect.left = 0;
        }
        rect.top = layout.getLineTop(lineForOffset2);
        rect.bottom = layout.getLineBottom(lineForOffset2);
        rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
    }
}
