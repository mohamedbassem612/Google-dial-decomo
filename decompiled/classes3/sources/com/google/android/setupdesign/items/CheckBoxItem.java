package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CheckBoxItem extends com.google.android.setupdesign.items.Item implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener {
    private boolean b;

    public CheckBoxItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.d);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item
    protected int e() {
        return 2131624574;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.b = !this.b;
        ((android.widget.CheckBox) view.findViewById(2131429078)).setChecked(this.b);
    }

    public CheckBoxItem() {
        this.b = false;
    }
}
