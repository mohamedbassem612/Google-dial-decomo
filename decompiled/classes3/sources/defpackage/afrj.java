package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrj extends android.widget.LinearLayout.LayoutParams {
    public android.graphics.drawable.Drawable a;
    public java.lang.CharSequence b;

    public afrj(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.b = null;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.afrn.c);
        this.a = typedArrayObtainStyledAttributes.getDrawable(0);
        this.b = typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public afrj(int i, int i2) {
        super(i, i2);
        this.a = null;
        this.b = null;
    }

    public afrj(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = null;
        this.b = null;
    }

    public afrj(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = null;
        this.b = null;
    }

    public afrj(android.widget.LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = null;
        this.b = null;
    }
}
