package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dd implements defpackage.dyy {
    final /* synthetic */ defpackage.dq a;

    public dd(defpackage.dq dqVar) {
        this.a = dqVar;
    }

    @Override // defpackage.dyy
    public final defpackage.eax dC(android.view.View view, defpackage.eax eaxVar) {
        boolean z;
        defpackage.dq dqVar = this.a;
        int iD = eaxVar.d();
        int iD2 = eaxVar.d();
        android.support.v7.widget.ActionBarContextView actionBarContextView = dqVar.r;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) dqVar.r.getLayoutParams();
            boolean z2 = false;
            if (dqVar.r.isShown()) {
                if (dqVar.J == null) {
                    dqVar.J = new android.graphics.Rect();
                    dqVar.K = new android.graphics.Rect();
                }
                android.graphics.Rect rect = dqVar.J;
                android.graphics.Rect rect2 = dqVar.K;
                rect.set(eaxVar.b(), eaxVar.d(), eaxVar.c(), eaxVar.a());
                defpackage.dwn dwnVarF = eaxVar.f(2);
                android.graphics.Insets insetsM$1 = da$.ExternalSyntheticApiModelOutline0.m$1(dqVar.w.computeSystemWindowInsets(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.view.WindowInsets.Builder(), da$.ExternalSyntheticApiModelOutline0.m(rect))), rect2));
                rect.set(da$.ExternalSyntheticApiModelOutline0.m$1(insetsM$1), da$.ExternalSyntheticApiModelOutline0.m$2(insetsM$1), da$.ExternalSyntheticApiModelOutline0.m$3(insetsM$1), da$.ExternalSyntheticApiModelOutline0.m(insetsM$1));
                defpackage.dwn dwnVarD = defpackage.dwn.d(java.lang.Math.max(0, dwnVarF.b - rect2.left), java.lang.Math.max(0, dwnVarF.c - rect2.top), java.lang.Math.max(0, dwnVarF.d - rect2.right), java.lang.Math.max(0, dwnVarF.e - rect2.bottom));
                int i = marginLayoutParams.leftMargin;
                int i2 = dwnVarD.b;
                if (i == i2 && marginLayoutParams.rightMargin == dwnVarD.d) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = dwnVarD.d;
                    z = true;
                }
                android.support.v7.widget.ActionBarContextView actionBarContextView2 = dqVar.r;
                int i3 = rect.left - i2;
                int i4 = rect.top;
                int i5 = rect.right - dwnVarD.d;
                actionBarContextView2.k = i3;
                actionBarContextView2.l = i4;
                actionBarContextView2.m = i5;
                actionBarContextView2.n();
                if (!dqVar.z && rect.top > 0) {
                    iD2 = 0;
                }
                z2 = z;
            }
            if (z2) {
                dqVar.r.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            eaxVar = eaxVar.p(eaxVar.b(), iD2, eaxVar.c(), eaxVar.a());
        }
        return defpackage.dzs.e(view, eaxVar);
    }
}
