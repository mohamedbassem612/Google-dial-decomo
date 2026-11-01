package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pbk implements dyy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ pbk(android.view.View view, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = view;
        this.b = obj;
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.pbp.a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setLayoutEdgeToEdge$<anonymous>", 375, "AnswerFragmentPeer.kt").v("Applying padding for edge-to-edge.");
            android.view.View view2 = this.a;
            android.view.View viewFindViewById = view2.findViewById(2131428296);
            aooh.e(viewFindViewById, "findViewById(...)");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
            dwn dwnVarF = eaxVar.f(647);
            frameLayout.setPadding(frameLayout.getPaddingLeft(), dwnVarF.c, frameLayout.getPaddingRight(), dwnVarF.e);
            defpackage.pbp pbpVar = (defpackage.pbp) this.b;
            if (((java.lang.Boolean) pbpVar.t.a()).booleanValue()) {
                int layoutDirection = pbpVar.c.dX().getConfiguration().getLayoutDirection();
                android.view.View viewFindViewById2 = view2.findViewById(2131427474);
                boolean z = layoutDirection == 1;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setPaddingRelative(z ? dwnVarF.d : dwnVarF.b, viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingEnd(), viewFindViewById2.getPaddingBottom());
                }
                android.view.View viewFindViewById3 = view2.findViewById(2131427466);
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setPaddingRelative(viewFindViewById3.getPaddingStart(), viewFindViewById3.getPaddingTop(), z ? dwnVarF.b : dwnVarF.d, viewFindViewById3.getPaddingBottom());
                }
            }
            return eax.a;
        }
        if (i == 1) {
            android.view.View view3 = this.a;
            dwn dwnVarF2 = eaxVar.f(647);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = view3.findViewById(2131427624);
            aooh.e(constraintLayoutFindViewById, "findViewById(...)");
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = constraintLayoutFindViewById;
            android.content.Context context = view3.getContext();
            aooh.e(context, "getContext(...)");
            if (defpackage.rhx.b(context)) {
                oby.a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "setLayoutEdgeToEdge$<anonymous>", 348, "EmergencyVoiceFragmentPeer.kt").v("Apply padding for edge-to-edge, large screen landscape layout.");
                view3.setPadding(view3.getPaddingLeft(), dwnVarF2.c, view3.getPaddingRight(), dwnVarF2.e);
            } else {
                java.lang.Object obj = this.b;
                aimz aimzVar = oby.a;
                aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "setLayoutEdgeToEdge$<anonymous>", 353, "EmergencyVoiceFragmentPeer.kt").v("Apply padding for edge-to-edge, not large screen landscape layout.");
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "setLayoutEdgeToEdge$<anonymous>", 354, "EmergencyVoiceFragmentPeer.kt");
                int i2 = dwnVarF2.e;
                aimwVarL.w("Bottom insets: %d", i2);
                view3.setPadding(view3.getPaddingLeft(), dwnVarF2.c, view3.getPaddingRight(), view3.getPaddingBottom());
                int dimensionPixelOffset = ((oby) obj).b.dX().getDimensionPixelOffset(2131166200);
                java.lang.Object objFindViewById = view3.findViewById(2131428385);
                aooh.e(objFindViewById, "findViewById(...)");
                android.view.ViewGroup.LayoutParams layoutParams = ((com.google.android.material.button.MaterialButton) objFindViewById).getLayoutParams();
                aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), dimensionPixelOffset + i2);
            }
            return eax.a;
        }
        defpackage.qtd qtdVar = (defpackage.qtd) this.b;
        if (eaxVar.equals(qtdVar.p.orElse((java.lang.Object) null))) {
            return eaxVar;
        }
        qtdVar.p = j$.util.Optional.of(eaxVar);
        if (view != null && view.getRootWindowInsets() != null && ft$.ExternalSyntheticApiModelOutline0.m(view.getRootWindowInsets()) != null) {
            this.a.setPadding(0, eaxVar.b.w().c, 0, 0);
        }
        j$.util.Optional optionalOfNullable = qtdVar.l;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable.get()).c));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) optionalOfNullable.orElse(bool)).booleanValue()) {
            qtdVar.m();
        } else {
            qtdVar.n();
        }
        defpackage.qso qsoVar = qtdVar.g;
        qsoVar.b.N().getWindowVisibleDisplayFrame(qsoVar.c);
        qsoVar.h();
        android.view.View viewF = qsoVar.f();
        qsoVar.i(viewF, qsoVar.b(viewF));
        if (!eaxVar.y(baa$.ExternalSyntheticApiModelOutline1.m())) {
            return eaxVar;
        }
        j$.util.Optional optionalOfNullable2 = qtdVar.l;
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable2.get()).c));
        }
        if (((java.lang.Boolean) optionalOfNullable2.orElse(bool)).booleanValue() || qtdVar.d.H().isInMultiWindowMode()) {
            return eaxVar;
        }
        j$.util.Optional optionalK = qtdVar.k();
        if (true != optionalK.isPresent()) {
            return eaxVar;
        }
        ((defpackage.qrv) optionalK.get()).j(false);
        return eaxVar;
    }

    public /* synthetic */ pbk(defpackage.qtd qtdVar, android.view.View view, int i) {
        this.$cid = i;
        this.b = qtdVar;
        this.a = view;
    }
}
