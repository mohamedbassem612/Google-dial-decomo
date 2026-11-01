package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SwitchItem extends com.google.android.setupdesign.items.Item implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener {
    private boolean b;

    public SwitchItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        if (defpackage.agfz.t(context)) {
            if (defpackage.agfz.C(context)) {
                b(0);
            } else {
                b(0);
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.y);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item
    protected int e() {
        return 2131624584;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        this.b = z;
    }

    public void onClick(android.view.View view) {
        this.b = !this.b;
        view.findViewById(2131429091).setChecked(this.b);
    }

    public SwitchItem() {
        this.b = false;
    }
}
