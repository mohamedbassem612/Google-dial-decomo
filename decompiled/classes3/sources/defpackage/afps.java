package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afps extends dum {
    private int a;
    private apxt b;

    public afps() {
        this.a = 0;
    }

    protected void fh(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        coordinatorLayout.j(view, i);
    }

    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        fh(coordinatorLayout, view, i);
        apxt apxtVar = this.b;
        if (apxtVar == null) {
            apxtVar = new apxt(view);
            this.b = apxtVar;
        }
        android.view.View view2 = (android.view.View) apxtVar.d;
        apxtVar.c = view2.getTop();
        apxtVar.b = view2.getLeft();
        this.b.O();
        int i2 = this.a;
        if (i2 == 0) {
            return true;
        }
        this.b.P(i2);
        this.a = 0;
        return true;
    }

    public final int p() {
        apxt apxtVar = this.b;
        if (apxtVar != null) {
            return apxtVar.a;
        }
        return 0;
    }

    public final boolean q(int i) {
        apxt apxtVar = this.b;
        if (apxtVar != null) {
            return apxtVar.P(i);
        }
        this.a = i;
        return false;
    }

    public afps(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
