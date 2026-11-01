package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ejg extends android.view.ViewGroup.MarginLayoutParams {
    public int a;
    public float b;
    public boolean c;
    public int d;

    public ejg(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.widget.DrawerLayout.a);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ejg() {
        super(-1, -1);
        this.a = 0;
    }

    public ejg(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public ejg(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 0;
    }

    public ejg(defpackage.ejg ejgVar) {
        super((android.view.ViewGroup.MarginLayoutParams) ejgVar);
        this.a = 0;
        this.a = ejgVar.a;
    }
}
