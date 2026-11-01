package com.android.dialer.chocolatechip.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CustomQuickContactBadge extends android.widget.QuickContactBadge {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomQuickContactBadge(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aooh.f(attributeSet, "attrs");
        a(attributeSet);
    }

    private final void a(android.util.AttributeSet attributeSet) {
        setClickable(attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "clickable", true));
    }

    public CustomQuickContactBadge(android.content.Context context) {
        super(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomQuickContactBadge(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aooh.f(attributeSet, "attrs");
        a(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomQuickContactBadge(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(attributeSet, "attrs");
        a(attributeSet);
    }
}
