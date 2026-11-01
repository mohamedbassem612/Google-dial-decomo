package com.android.settingslib.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LinkableTextView extends android.support.v7.widget.AppCompatTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkableTextView(android.content.Context context) {
        this(context, null, 0, 6, null);
        aooh.f(context, "context");
    }

    public final void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        aooh.f(charSequence, "text");
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof android.text.Spanned) || ((android.text.style.ClickableSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.ClickableSpan.class)).length <= 0) {
            return;
        }
        setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aooh.f(context, "context");
    }

    public /* synthetic */ LinkableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
