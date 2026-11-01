package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class kq extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.ld c;
    public final android.graphics.Rect d;
    public boolean e;
    boolean f;

    public kq(int i, int i2) {
        super(i, i2);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public final int eA() {
        return this.c.c();
    }

    public final boolean eB() {
        return this.c.y();
    }

    public final boolean eC() {
        return this.c.v();
    }

    public kq(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public kq(defpackage.kq kqVar) {
        super((android.view.ViewGroup.LayoutParams) kqVar);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public kq(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }

    public kq(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new android.graphics.Rect();
        this.e = true;
        this.f = false;
    }
}
