package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RadioButtonItem extends com.google.android.setupdesign.items.Item implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener {
    public boolean b;

    public RadioButtonItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new defpackage.aghm(this);
        this.b = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.u);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int e() {
        return 2131624582;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (!this.b) {
            this.b = true;
            ((com.google.android.material.radiobutton.MaterialRadioButton) view.findViewById(2131429088)).setChecked(this.b);
        }
    }

    public RadioButtonItem() {
        new defpackage.aghm(this);
        this.b = false;
    }
}
