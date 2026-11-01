package com.google.android.material.slider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Slider extends defpackage.agbj {
    public Slider(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            o(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.agbj
    protected final void m() {
        if (this.j == -1) {
            this.j = 0;
        }
    }

    public final float n() {
        return ((java.lang.Float) d().get(0)).floatValue();
    }

    public final void o(float f) {
        e(java.lang.Float.valueOf(f));
    }

    public Slider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970404);
    }

    public Slider(android.content.Context context) {
        this(context, null);
    }
}
