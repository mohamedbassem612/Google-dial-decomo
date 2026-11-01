package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BulletPointView extends android.widget.LinearLayout {
    public android.graphics.drawable.Drawable a;
    public java.lang.CharSequence b;
    public java.lang.CharSequence c;
    public com.google.android.setupdesign.view.RichTextView d;
    public com.google.android.setupdesign.view.RichTextView e;
    public android.widget.ImageView f;
    public android.view.View g;

    public BulletPointView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.b);
        this.a = typedArrayObtainStyledAttributes.getDrawable(0);
        this.b = typedArrayObtainStyledAttributes.getText(1);
        this.c = typedArrayObtainStyledAttributes.getText(2);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private final void a() {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        android.view.View.inflate(getContext(), 2131624471, this);
        this.d = (com.google.android.setupdesign.view.RichTextView) findViewById(2131429093);
        this.e = (com.google.android.setupdesign.view.RichTextView) findViewById(2131429089);
        this.f = (android.widget.ImageView) findViewById(2131429085);
        this.g = findViewById(2131429086);
        com.google.android.setupdesign.view.RichTextView richTextView = this.d;
        if (richTextView != null && (charSequence2 = this.b) != null) {
            richTextView.setText(charSequence2);
            this.d.setVisibility(0);
        }
        com.google.android.setupdesign.view.RichTextView richTextView2 = this.e;
        if (richTextView2 != null && (charSequence = this.c) != null) {
            richTextView2.setText(charSequence);
            this.e.setVisibility(0);
        }
        android.widget.ImageView imageView = this.f;
        if (imageView == null || (drawable = this.a) == null) {
            this.g.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(drawable);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
    }

    public BulletPointView(android.content.Context context) {
        super(context);
        a();
    }

    public BulletPointView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.b);
        this.a = typedArrayObtainStyledAttributes.getDrawable(0);
        this.b = typedArrayObtainStyledAttributes.getText(1);
        this.c = typedArrayObtainStyledAttributes.getText(2);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
