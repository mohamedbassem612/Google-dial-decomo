package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nn {
    private static final android.view.ViewGroup.LayoutParams a = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static final void a(mp mpVar, aonn aonnVar) {
        androidx.compose.ui.platform.ComposeView childAt = ((android.view.ViewGroup) mpVar.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        androidx.compose.ui.platform.ComposeView composeView = childAt instanceof androidx.compose.ui.platform.ComposeView ? childAt : null;
        if (composeView != null) {
            composeView.j((caz) null);
            composeView.a(aonnVar);
            return;
        }
        androidx.compose.ui.platform.ComposeView composeView2 = new androidx.compose.ui.platform.ComposeView(mpVar, (android.util.AttributeSet) null, 0, 6, (aooc) null);
        composeView2.j((caz) null);
        composeView2.a(aonnVar);
        android.view.View decorView = mpVar.getWindow().getDecorView();
        if (dzo.k(decorView) == null) {
            dzo.l(decorView, mpVar);
        }
        if (dzo.i(decorView) == null) {
            dzo.j(decorView, mpVar);
        }
        if (dzk.N(decorView) == null) {
            dzk.O(decorView, mpVar);
        }
        mpVar.setContentView(composeView2, a);
    }
}
