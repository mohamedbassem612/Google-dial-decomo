package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqb extends defpackage.emo {
    final /* synthetic */ defpackage.rqi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqb(defpackage.rqi rqiVar) {
        super(null);
        this.a = rqiVar;
    }

    @Override // defpackage.emo
    public final void e(android.view.View view) {
        this.a.e(defpackage.mce.NAVIGATION_DRAWER_MENU_RENDERED);
    }

    @Override // defpackage.emo
    public final void f(android.view.View view) {
        defpackage.aooh.f(view, "drawerView");
        defpackage.rqi rqiVar = this.a;
        if (rqiVar.p) {
            return;
        }
        ((defpackage.aimw) defpackage.rqi.a.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer$drawerListener$<anonymous>", "onDrawerSlide", 233, "MainFragmentPeer.kt")).v("initializing menu");
        rqiVar.d();
    }
}
