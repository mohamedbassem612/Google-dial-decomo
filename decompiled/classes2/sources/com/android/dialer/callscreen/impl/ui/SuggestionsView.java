package com.android.dialer.callscreen.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class SuggestionsView extends android.widget.HorizontalScrollView {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/ui/SuggestionsView");
    public android.widget.LinearLayout b;
    public aify c;
    public rai d;

    public SuggestionsView(android.content.Context context) {
        super(context);
        this.c = aike.a;
        a(context);
    }

    private final void a(android.content.Context context) {
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        inflate(context, 2131624070, this);
        this.b = (android.widget.LinearLayout) findViewById(2131429150);
    }

    public SuggestionsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = aike.a;
        a(context);
    }

    public SuggestionsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = aike.a;
        a(context);
    }

    public SuggestionsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = aike.a;
        a(context);
    }
}
