package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qce implements odm {
    final /* synthetic */ defpackage.qcg a;

    public qce(defpackage.qcg qcgVar) {
        j$.util.Objects.requireNonNull(qcgVar);
        this.a = qcgVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        defpackage.qcg qcgVar = this.a;
        qcgVar.f = (j$.util.Optional) obj;
        android.view.View view = ((aw) qcgVar.b).Q;
        if (!qcgVar.f.isPresent()) {
            com.android.dialer.incall.onhold.ui.OnHoldView onHoldView = (com.android.dialer.incall.onhold.ui.OnHoldView) view.findViewById(2131428391);
            if (onHoldView != null) {
                j$.util.Optional optional = qcgVar.e;
                hvp hvpVar = new hvp(qcgVar, onHoldView, 20, (byte[]) null);
                if (true == optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    java.lang.Object obj3 = hvpVar.b;
                    java.lang.Object obj4 = hvpVar.a;
                    defpackage.qcg qcgVar2 = (defpackage.qcg) obj3;
                    if (qcgVar2.h.b(defpackage.zpo.g).contains(obj2)) {
                        ((com.android.dialer.incall.onhold.ui.OnHoldView) obj4).setAccessibilityPaneTitle(qcgVar2.b.z().getString(2132019082));
                    }
                }
                defpackage.qci qciVarY = onHoldView.y();
                if (qciVarY.i) {
                    defpackage.qci.a.b().l("com/android/dialer/incall/onhold/ui/OnHoldViewPeer", "hide", 95, "OnHoldViewPeer.java").v("hiding OnHoldView");
                    qciVarY.i = false;
                    android.view.ViewGroup viewGroup = qciVarY.e;
                    viewGroup.animate().alpha(0.0f).translationY(-qciVarY.h).setInterpolator(defpackage.qci.b).withEndAction(new defpackage.pmx(qciVarY, 11)).setDuration(wsc.bp(viewGroup.getContext(), defpackage.urp.DURATION_MEDIUM_4)).start();
                } else {
                    defpackage.qci.a.b().l("com/android/dialer/incall/onhold/ui/OnHoldViewPeer", "hide", 92, "OnHoldViewPeer.java").v("OnHoldView already hide");
                }
            }
            qcgVar.e = j$.util.Optional.empty();
            return;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(2131428392);
        if (viewStub != null) {
            viewStub.inflate();
        }
        com.android.dialer.incall.onhold.ui.OnHoldView onHoldView2 = (com.android.dialer.incall.onhold.ui.OnHoldView) view.findViewById(2131428391);
        onHoldView2.setAccessibilityPaneTitle("");
        qcgVar.e = qcgVar.h.g();
        defpackage.qci qciVarY2 = onHoldView2.y();
        qciVarY2.f.setText(qciVarY2.d.getContext().getString(2132019085, (java.lang.CharSequence) ((defpackage.qca) qcgVar.f.orElseThrow()).a.orElse("")));
        onHoldView2.y().g.setImageResource(true != ((defpackage.qca) qcgVar.f.orElseThrow()).b ? 2131231059 : 2131231080);
        defpackage.qci qciVarY3 = onHoldView2.y();
        if (qciVarY3.i) {
            defpackage.qci.a.b().l("com/android/dialer/incall/onhold/ui/OnHoldViewPeer", "show", 70, "OnHoldViewPeer.java").v("OnHoldView already shown");
            return;
        }
        defpackage.qci.a.b().l("com/android/dialer/incall/onhold/ui/OnHoldViewPeer", "show", 73, "OnHoldViewPeer.java").v("showing OnHoldView");
        qciVarY3.i = true;
        android.view.ViewGroup viewGroup2 = qciVarY3.e;
        viewGroup2.setAlpha(0.0f);
        viewGroup2.setTranslationY(-qciVarY3.h);
        viewGroup2.setVisibility(0);
        viewGroup2.animate().alpha(1.0f).translationY(0.0f).setInterpolator(defpackage.qci.c).setDuration(wsc.bp(viewGroup2.getContext(), defpackage.urp.DURATION_MEDIUM_4)).start();
    }

    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.qcg.a.c(), "failed producing onHold model", "com/android/dialer/incall/onhold/ui/OnHoldFragmentPeer$1", "onDataLoadError", '=', "OnHoldFragmentPeer.java", th, zct.b);
    }
}
