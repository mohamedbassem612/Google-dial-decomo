package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qhf implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ android.os.Bundle a;
    final /* synthetic */ defpackage.qhj b;

    public qhf(defpackage.qhj qhjVar, android.os.Bundle bundle) {
        this.a = bundle;
        j$.util.Objects.requireNonNull(qhjVar);
        this.b = qhjVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        defpackage.qhj qhjVar = this.b;
        defpackage.qgw qgwVar = qhjVar.l;
        final android.view.View view = ((aw) qgwVar).Q;
        if (view != null) {
            final boolean z2 = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
            android.os.Bundle bundle = this.a;
            if (bundle.getBoolean("overflow_showed", false)) {
                qhjVar.h.hideSoftInputFromWindow(qhjVar.c().getWindowToken(), 0);
                if (z2) {
                    qhjVar.m.showAtLocation(view, 51, 0, 0);
                } else {
                    qhjVar.m.showAtLocation(view, 53, 0, 0);
                }
                qhjVar.m.c(bundle.getBoolean("overflow_emergency_call", false));
                qhjVar.m.a(bundle.getBoolean("is_add_call_enabled", false));
            }
            if (bundle.getBoolean("audio_select_showed", false)) {
                qhjVar.h.hideSoftInputFromWindow(qhjVar.c().getWindowToken(), 0);
                qhjVar.n = new defpackage.qgs(qhjVar.i, qhjVar.j, qgwVar.z(), new qgr() { // from class: qhe
                    public final void a() {
                        defpackage.qhf qhfVar = this.a;
                        android.view.View view2 = view;
                        if (z2) {
                            qhfVar.b.m.showAtLocation(view2, 51, 0, 0);
                        } else {
                            qhfVar.b.m.showAtLocation(view2, 53, 0, 0);
                        }
                    }
                });
                defpackage.qgs qgsVar = qhjVar.n;
                j$.util.Optional optionalOfNullable = qhjVar.v;
                if (true == optionalOfNullable.isPresent()) {
                    defpackage.qgo qgoVar = ((defpackage.qfz) optionalOfNullable.get()).r;
                    if (qgoVar == null) {
                        qgoVar = defpackage.qgo.a;
                    }
                    optionalOfNullable = j$.util.Optional.ofNullable(qgoVar);
                }
                qgsVar.a((defpackage.qgo) optionalOfNullable.orElse((java.lang.Object) null));
                if (z2) {
                    qhjVar.n.showAtLocation(view, 51, 0, 0);
                } else {
                    qhjVar.n.showAtLocation(view, 53, 0, 0);
                }
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
