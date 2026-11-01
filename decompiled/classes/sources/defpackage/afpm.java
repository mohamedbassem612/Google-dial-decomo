package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afpm extends android.widget.LinearLayout.LayoutParams {
    public int a;
    public afpl b;
    public android.view.animation.Interpolator c;

    public afpm(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afpr.b);
        this.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new afpl();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.c = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public afpm() {
        super(-1, -2);
        this.a = 1;
    }

    public afpm(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public afpm(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public afpm(android.widget.LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
