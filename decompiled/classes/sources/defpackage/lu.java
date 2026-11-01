package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lu extends defpackage.cn {
    public int b;

    public lu(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public lu(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public lu(defpackage.cn cnVar) {
        super(cnVar);
        this.b = 0;
    }

    public lu(defpackage.lu luVar) {
        super((defpackage.cn) luVar);
        this.b = 0;
        this.b = luVar.b;
    }

    public lu(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public lu() {
        this.b = 0;
        this.a = 8388627;
    }
}
