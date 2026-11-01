package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class izf implements dyy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ izf(int i) {
        this.$cid = i;
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                dwn dwnVarF = eaxVar.f(647);
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = dwnVarF.b;
                marginLayoutParams.topMargin = dwnVarF.c;
                marginLayoutParams.rightMargin = dwnVarF.d;
                marginLayoutParams.bottomMargin = dwnVarF.e;
                return eax.a;
            case 1:
                int i = androidx.drawerlayout.widget.DrawerLayout.e;
                androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) view;
                int i2 = eaxVar.i().c;
                drawerLayout.c = eaxVar;
                boolean z2 = i2 > 0;
                drawerLayout.d = z2;
                if (!z2 && drawerLayout.getBackground() == null) {
                    z = true;
                }
                drawerLayout.setWillNotDraw(z);
                drawerLayout.requestLayout();
                return eaxVar.n();
            case 2:
                dwn dwnVarF2 = eaxVar.f(647);
                aooh.c(view);
                view.setPadding(dwnVarF2.b, 0, dwnVarF2.d, 0);
                return eax.a;
            case 3:
                android.view.View viewM = ft$.ExternalSyntheticApiModelOutline0.m(view, 2131427499);
                dwn dwnVarF3 = eaxVar.f(647);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i3 = dwnVarF3.b;
                int i4 = dwnVarF3.c;
                int i5 = dwnVarF3.d;
                marginLayoutParams2.setMargins(i3, i4, i5, 0);
                ((android.view.ViewGroup.MarginLayoutParams) viewM.getLayoutParams()).setMargins(i3, 0, i5, dwnVarF3.e);
                return eax.a;
            case 4:
                dwn dwnVarF4 = eaxVar.f(519);
                view.setPadding(dwnVarF4.b, 0, dwnVarF4.d, dwnVarF4.e);
                return eax.a;
            case 5:
                aimz aimzVar = defpackage.lyi.a;
                dwn dwnVarF5 = eaxVar.f(647);
                view.setPadding(dwnVarF5.b, dwnVarF5.c, dwnVarF5.d, 0);
                ft$.ExternalSyntheticApiModelOutline0.m(view, 2131427581).setPadding(view.getResources().getDimensionPixelSize(2131165303), view.getResources().getDimensionPixelSize(2131165304), view.getResources().getDimensionPixelSize(2131165302), view.getResources().getDimensionPixelSize(2131165301) + dwnVarF5.e);
                return eax.a;
            case 6:
                dwn dwnVarF6 = eaxVar.f(519);
                view.setPadding(dwnVarF6.b, dwnVarF6.c, dwnVarF6.d, dwnVarF6.e);
                return eaxVar;
            case 7:
                qnv.a.b().l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "setLayoutEdgeToEdge$<anonymous>", 395, "VideoAnswerFragmentPeer.kt").v("Applying edge to edge insets.");
                dwn dwnVarF7 = eaxVar.f(647);
                ((android.widget.FrameLayout) view.findViewById(2131428296)).setPadding(0, dwnVarF7.c, 0, dwnVarF7.e);
                return eax.a;
            case 8:
                dwn dwnVarF8 = eaxVar.f(647);
                int i6 = dzs.a;
                java.lang.Object objB = dzo.b(view, 2131428785);
                aooh.e(objB, "requireViewById(...)");
                android.view.View view2 = (android.view.View) objB;
                view2.setPadding(dwnVarF8.b, view2.getPaddingTop(), dwnVarF8.d, dwnVarF8.e);
                return eax.a;
            case 9:
                dwn dwnVarF9 = eaxVar.f(647);
                view.setPadding(dwnVarF9.b, dwnVarF9.c, dwnVarF9.d, view.getPaddingBottom());
                rvu.a.b().l("com/android/dialer/multibindingsettings/impl/DialerSettingsActivityPeer", "applySystemBarInsets", 177, "DialerSettingsActivityPeer.java").v("Insets consumed.");
                return eaxVar;
            case 10:
                return afsq.bY(view, eaxVar);
            case 11:
                view.setPadding(view.getPaddingLeft(), eaxVar.f(519).c, view.getPaddingRight(), view.getPaddingBottom());
                return eaxVar;
            case 12:
                return afsq.bY(view, eaxVar);
            default:
                dwn dwnVarF10 = eaxVar.f(647);
                view.setPadding(dwnVarF10.b, dwnVarF10.c, dwnVarF10.d, view.getPaddingBottom());
                return eaxVar;
        }
    }
}
