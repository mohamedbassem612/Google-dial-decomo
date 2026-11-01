package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ButtonWithMaxTextSize extends com.google.android.material.button.MaterialButton {
    public ButtonWithMaxTextSize(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        y(context, attributeSet);
    }

    private final void y(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.afjc.a);
        setTextSize(0, java.lang.Math.min(getTextSize(), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(android.content.Context context) {
        super(context);
    }

    public ButtonWithMaxTextSize(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y(context, attributeSet);
    }
}
