package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mw extends defpackage.mv {
    @Override // defpackage.mu, defpackage.mt, defpackage.my
    public void a(defpackage.ni niVar, defpackage.ni niVar2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        aooh.f(window, "window");
        aooh.f(view, "view");
        dzn.c(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            java.util.Iterator itA = dzl.b(viewGroup).a();
            while (itA.hasNext()) {
                java.lang.Object tag = ((android.view.View) itA.next()).getTag();
                if (tag instanceof java.util.List) {
                    java.util.List list = (java.util.List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof defpackage.ebr)) {
                        for (java.lang.Object obj : (java.lang.Iterable) tag) {
                            if ((obj instanceof defpackage.ebr ? (defpackage.ebr) obj : null) != null) {
                                int i = ((defpackage.ebr) obj).a;
                                throw null;
                            }
                        }
                        break;
                    }
                }
            }
        }
        fn$.ExternalSyntheticApiModelOutline0.m$1(window, true);
        defpackage.ni niVar3 = new defpackage.ni(window);
        niVar3.g(!z);
        niVar3.f(!z2);
    }
}
