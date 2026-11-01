package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afxa implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ com.google.android.material.navigation.NavigationView a;

    public afxa(com.google.android.material.navigation.NavigationView navigationView) {
        j$.util.Objects.requireNonNull(navigationView);
        this.a = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.google.android.material.navigation.NavigationView navigationView = this.a;
        int[] iArr = navigationView.i;
        navigationView.getLocationOnScreen(iArr);
        boolean z = true;
        boolean z2 = iArr[1] == 0;
        defpackage.afuw afuwVar = navigationView.h;
        if (afuwVar.x != z2) {
            afuwVar.x = z2;
            afuwVar.q();
        }
        navigationView.c = z2 && navigationView.j;
        boolean z3 = navigationView.getLayoutDirection() == 1;
        int i = iArr[0];
        navigationView.e = (i == 0 || i + navigationView.getWidth() == 0) && (!z3 ? !navigationView.l : !navigationView.m);
        android.app.Activity activityO = defpackage.agab.O(navigationView.getContext());
        if (activityO != null) {
            android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) activityO.getSystemService("window")));
            navigationView.d = rectM.height() - navigationView.getHeight() == iArr[1] && android.graphics.Color.alpha(activityO.getWindow().getNavigationBarColor()) != 0 && navigationView.k;
            if ((rectM.width() != iArr[0] && rectM.width() - navigationView.getWidth() != iArr[0]) || (!z3 ? !navigationView.m : !navigationView.l)) {
                z = false;
            }
            navigationView.f = z;
        }
    }
}
