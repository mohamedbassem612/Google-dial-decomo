package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class mu extends defpackage.mt {
    @Override // defpackage.mt, defpackage.my
    public void a(defpackage.ni niVar, defpackage.ni niVar2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        if (window == null) {
            aooh.i("window");
        }
        if (view == null) {
            aooh.i("view");
        }
        dzn.c(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        fn$.ExternalSyntheticApiModelOutline0.m(window, false);
        fn$.ExternalSyntheticApiModelOutline0.m$1(window, true);
        defpackage.ni niVar3 = new defpackage.ni(window);
        niVar3.g(!z);
        niVar3.f(!z2);
    }
}
