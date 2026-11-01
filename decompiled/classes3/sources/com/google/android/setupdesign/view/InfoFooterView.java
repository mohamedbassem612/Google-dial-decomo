package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class InfoFooterView extends android.widget.LinearLayout {
    public java.lang.CharSequence a;
    public com.google.android.setupdesign.view.RichTextView b;
    private android.graphics.drawable.Drawable c;
    private java.lang.Boolean d;
    private android.widget.ImageView e;

    public InfoFooterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = java.lang.Boolean.TRUE;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.q);
        this.c = typedArrayObtainStyledAttributes.getDrawable(0);
        this.a = typedArrayObtainStyledAttributes.getText(1);
        this.d = java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(2, true));
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence charSequence;
        android.view.View.inflate(getContext(), 2131624571, this);
        this.b = (com.google.android.setupdesign.view.RichTextView) findViewById(2131429075);
        this.e = (android.widget.ImageView) findViewById(2131429073);
        com.google.android.setupdesign.view.RichTextView richTextView = this.b;
        if (richTextView != null && (charSequence = this.a) != null) {
            richTextView.setText(charSequence);
            this.b.setVisibility(0);
        }
        android.widget.ImageView imageView = this.e;
        if (imageView != null && (drawable = this.c) != null) {
            imageView.setImageDrawable(drawable);
            this.e.setVisibility(0);
        }
        android.view.View viewFindViewById = findViewById(2131429072);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
        layoutParams.addRule(12, this.d.booleanValue() ? 1 : 0);
        viewFindViewById.setLayoutParams(layoutParams);
    }

    public InfoFooterView(android.content.Context context) {
        super(context);
        this.d = java.lang.Boolean.TRUE;
        a();
    }

    public InfoFooterView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = java.lang.Boolean.TRUE;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.q);
        this.c = typedArrayObtainStyledAttributes.getDrawable(0);
        this.a = typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
