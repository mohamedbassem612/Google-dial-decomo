package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LottieIllustrationItem extends com.google.android.setupdesign.items.Item {
    public LottieIllustrationItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.o);
        typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int e() {
        return 2131624596;
    }

    LottieIllustrationItem() {
    }
}
