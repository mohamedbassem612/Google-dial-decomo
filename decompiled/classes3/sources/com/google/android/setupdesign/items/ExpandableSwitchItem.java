package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ExpandableSwitchItem extends com.google.android.setupdesign.items.SwitchItem implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener {
    public boolean b;
    public final int c;
    private java.lang.CharSequence g;
    private java.lang.CharSequence h;

    public ExpandableSwitchItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = android.view.View.generateViewId();
        new defpackage.aghj(this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.g);
        this.g = typedArrayObtainStyledAttributes.getText(0);
        this.h = typedArrayObtainStyledAttributes.getText(1);
        if (defpackage.agfz.t(context)) {
            b(0);
            typedArrayObtainStyledAttributes.getInt(8, 16);
        } else {
            typedArrayObtainStyledAttributes.getInt(8, 48);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item
    protected final int e() {
        return 2131624578;
    }

    public final void f(boolean z) {
        if (this.b != z) {
            this.b = z;
            b(0);
        }
    }

    @Override // com.google.android.setupdesign.items.SwitchItem, android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (!defpackage.agfz.t(view.getContext())) {
            f(!this.b);
            return;
        }
        if (view.getId() == 2131429090) {
            f(!this.b);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429089);
            if (textView != null) {
                textView.setText(this.b ? this.h : this.g);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131429087);
            if (textView2 != null) {
                if (this.b) {
                    textView2.setText(2132020292);
                } else {
                    textView2.setText(2132020300);
                }
            }
        }
    }

    public ExpandableSwitchItem() {
        this.b = false;
        this.c = android.view.View.generateViewId();
        new defpackage.aghj(this);
    }
}
