package com.android.dialer.calllog.multibindingintegration.callscreentranscript;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class TranscriptSnippetAndLinkFrameLayout extends android.widget.FrameLayout {
    private android.widget.TextView a;
    private android.view.View b;
    private android.view.View c;
    private android.widget.TextView d;
    private android.view.View e;

    public TranscriptSnippetAndLinkFrameLayout(android.content.Context context) {
        super(context);
    }

    private final void a(boolean z) {
        ((android.view.ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).setMarginStart(z ? java.lang.Math.round(getContext().getResources().getDimension(2131167896)) : 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.TextView) findViewById(2131427880);
        this.b = findViewById(2131427883);
        this.c = findViewById(2131427884);
        this.d = (android.widget.TextView) findViewById(2131427885);
        this.e = findViewById(2131427879);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a.getLineCount() > this.a.getMaxLines()) {
            ((android.widget.FrameLayout.LayoutParams) this.b.getLayoutParams()).gravity = 8388693;
            this.c.setVisibility(0);
            a(true);
            this.b.setTranslationX(0.0f);
        } else {
            java.lang.CharSequence text = this.d.getText();
            float fMeasureText = this.a.getPaint().measureText(text, 0, text.length());
            android.view.View view = this.b;
            float x = this.a.getX() + this.a.getPaddingStart();
            android.widget.TextView textView = this.a;
            int lineCount = textView.getLineCount() - 1;
            view.setX((x + textView.getPaint().measureText(textView.getText(), textView.getLayout().getLineStart(lineCount), textView.getLayout().getLineEnd(lineCount))) - fMeasureText);
            this.c.setVisibility(8);
            a(false);
            this.d.setLeft(0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public TranscriptSnippetAndLinkFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TranscriptSnippetAndLinkFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TranscriptSnippetAndLinkFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
