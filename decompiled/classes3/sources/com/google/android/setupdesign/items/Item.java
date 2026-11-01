package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Item extends com.google.android.setupdesign.items.AbstractItem implements defpackage.aghp {
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public boolean f;

    public Item(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.s);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.getDrawable(0);
        this.e = typedArrayObtainStyledAttributes.getText(4);
        this.d = typedArrayObtainStyledAttributes.getText(5);
        typedArrayObtainStyledAttributes.getText(6);
        typedArrayObtainStyledAttributes.getResourceId(2, e());
        this.f = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.getColor(9, 0);
        typedArrayObtainStyledAttributes.getInt(8, 16);
        typedArrayObtainStyledAttributes.getBoolean(10, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.aghl
    public final int a() {
        return this.f ? 1 : 0;
    }

    protected int e() {
        return 2131624575;
    }

    public final void g(boolean z) {
        if (this.f != z) {
            this.f = z;
            if (z) {
                d(0);
            } else {
                c(0);
            }
        }
    }

    @Override // defpackage.aghp
    public final void h() {
    }

    public Item() {
        this.f = true;
    }
}
