package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cn extends android.view.ViewGroup.MarginLayoutParams {
    public int a;

    public cn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ef.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public cn() {
        super(-2, -2);
        this.a = 8388627;
    }

    public cn(defpackage.cn cnVar) {
        super((android.view.ViewGroup.MarginLayoutParams) cnVar);
        this.a = 0;
        this.a = cnVar.a;
    }

    public cn(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
