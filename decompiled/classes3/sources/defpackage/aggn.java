package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggn implements defpackage.aggl {
    public final com.google.android.setupcompat.internal.TemplateLayout a;
    public final android.view.Window b;
    public final boolean c;
    final boolean d;
    public int e = 0;

    public aggn(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.view.Window window) {
        this.a = templateLayout;
        this.b = window;
        defpackage.agfh agfhVar = (defpackage.agfh) templateLayout;
        this.c = agfhVar.e();
        this.d = agfhVar.f();
    }

    public final void a(int i) {
        android.view.Window window = this.b;
        if (window != null) {
            if (this.c && !this.d) {
                android.content.Context context = this.a.getContext();
                i = defpackage.agfz.i(context).b(context, defpackage.agfx.CONFIG_NAVIGATION_BAR_BG_COLOR);
            }
            window.setNavigationBarColor(i);
        }
    }
}
