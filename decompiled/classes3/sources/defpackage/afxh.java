package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afxh implements afvo {
    final /* synthetic */ com.google.android.material.navigationrail.NavigationRailView a;

    public afxh(com.google.android.material.navigationrail.NavigationRailView navigationRailView) {
        j$.util.Objects.requireNonNull(navigationRailView);
        this.a = navigationRailView;
    }

    public final void a(android.view.View view, eax eaxVar, afvp afvpVar) {
        dwn dwnVarF = eaxVar.f(519);
        dwn dwnVarF2 = eaxVar.f(128);
        com.google.android.material.navigationrail.NavigationRailView navigationRailView = this.a;
        if (navigationRailView.j(navigationRailView.e)) {
            afvpVar.b += dwnVarF.c;
        }
        if (navigationRailView.j(navigationRailView.f)) {
            afvpVar.d += dwnVarF.e;
        }
        if (navigationRailView.j(navigationRailView.g)) {
            if (agab.L(view)) {
                afvpVar.a += java.lang.Math.max(dwnVarF.d, dwnVarF2.d);
            } else {
                afvpVar.a += java.lang.Math.max(dwnVarF.b, dwnVarF2.b);
            }
        }
        afvpVar.a(view);
    }
}
