package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ExpandableItem extends com.google.android.setupdesign.items.Item implements android.view.View.OnClickListener {
    public boolean b;

    public ExpandableItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        new defpackage.aghi(this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.f);
        typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int e() {
        return 2131624577;
    }

    public final void f(boolean z) {
        if (this.b != z) {
            this.b = z;
            b(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (view.getId() == 2131429080) {
            f(!this.b);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131429080);
            if (imageView != null) {
                if (this.b) {
                    imageView.setImageResource(2131232189);
                } else {
                    imageView.setImageResource(2131232190);
                }
            }
        }
    }

    public ExpandableItem() {
        this.b = false;
        new defpackage.aghi(this);
    }
}
