package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ButtonItem extends com.google.android.setupdesign.items.AbstractItem implements android.view.View.OnClickListener {
    public ButtonItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.c);
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getText(4);
        typedArrayObtainStyledAttributes.getResourceId(0, 2132083940);
        typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.aghl
    public final int a() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
    }

    public ButtonItem() {
    }
}
