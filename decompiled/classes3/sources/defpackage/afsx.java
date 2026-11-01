package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsx implements defpackage.afth {
    final /* synthetic */ defpackage.afth a;
    final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton b;

    public afsx(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.afth afthVar) {
        this.a = afthVar;
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.afth
    public final int a() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        int i = extendedFloatingActionButton.A;
        if (i != -1) {
            return (i == 0 || i == -2) ? this.a.a() : i;
        }
        if (!(extendedFloatingActionButton.getParent() instanceof android.view.View)) {
            return this.a.a();
        }
        android.view.View view = (android.view.View) extendedFloatingActionButton.getParent();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            return this.a.a();
        }
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        int i2 = 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i2 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return (view.getHeight() - i2) - paddingTop;
    }

    @Override // defpackage.afth
    public final int b() {
        return this.b.v;
    }

    @Override // defpackage.afth
    public final int c() {
        return this.b.u;
    }

    @Override // defpackage.afth
    public final int d() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (!(extendedFloatingActionButton.getParent() instanceof android.view.View)) {
            return this.a.d();
        }
        android.view.View view = (android.view.View) extendedFloatingActionButton.getParent();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return this.a.d();
        }
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        int i = 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingLeft;
    }

    @Override // defpackage.afth
    public final android.view.ViewGroup.LayoutParams e() {
        int i = this.b.A;
        if (i == 0) {
            i = -2;
        }
        return new android.view.ViewGroup.LayoutParams(-1, i);
    }
}
