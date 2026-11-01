package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abxx extends android.widget.PopupWindow {
    private final ems a;
    private final defpackage.zu b;

    public abxx(mp mpVar) {
        super((android.content.Context) mpVar);
        this.b = new defpackage.zu(this, 4);
        this.a = mpVar.P();
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.a.d(this.b);
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public final void setContentView(android.view.View view) {
        aooh.f(view, "view");
        aooh.f(view, "view");
        aooh.f(view, "<this>");
        if (!(view instanceof android.support.v7.widget.RecyclerView) && !(view instanceof android.widget.ScrollView) && !(view instanceof android.widget.ListView)) {
            android.widget.ScrollView scrollView = new android.widget.ScrollView(view.getContext());
            scrollView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            scrollView.addView(view);
            view = scrollView;
        }
        super.setContentView(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        aooh.f(view, "anchor");
        ems emsVar = this.a;
        if (emsVar.a() != emq.a) {
            boolean zIsShowing = isShowing();
            super.showAsDropDown(view, i, i2, i3);
            boolean zIsShowing2 = isShowing();
            if (zIsShowing || !zIsShowing2) {
                return;
            }
            emsVar.c(this.b);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(android.view.View view, int i, int i2, int i3) {
        aooh.f(view, "parent");
        ems emsVar = this.a;
        if (emsVar.a() != emq.a) {
            boolean zIsShowing = isShowing();
            super.showAtLocation(view, i, i2, i3);
            boolean zIsShowing2 = isShowing();
            if (zIsShowing || !zIsShowing2) {
                return;
            }
            emsVar.c(this.b);
        }
    }
}
