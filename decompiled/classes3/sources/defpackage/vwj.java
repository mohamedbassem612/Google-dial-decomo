package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vwj extends defpackage.ahao {
    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ android.view.View a(android.view.ViewGroup viewGroup) {
        return (com.android.dialer.voicemail.tab.impl.ui.ErrorBannerView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624194, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.vwk vwkVarY = ((com.android.dialer.voicemail.tab.impl.ui.ErrorBannerView) view).y();
        defpackage.vtx vtxVar = (defpackage.vtx) ((defpackage.vyj) obj).b.orElseThrow();
        vwkVarY.f = j$.util.Optional.of(vtxVar);
        vwkVarY.b.setText(vtxVar.d);
        vwkVarY.c.setText(vtxVar.e);
        if ((vtxVar.b & 8) != 0) {
            android.widget.TextView textView = vwkVarY.d;
            textView.setVisibility(0);
            defpackage.vtw vtwVar = vtxVar.f;
            if (vtwVar == null) {
                vtwVar = defpackage.vtw.a;
            }
            textView.setText(vtwVar.d);
        } else {
            vwkVarY.d.setVisibility(8);
        }
        if ((vtxVar.b & 16) == 0) {
            vwkVarY.e.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = vwkVarY.e;
        textView2.setVisibility(0);
        defpackage.vtw vtwVar2 = vtxVar.g;
        if (vtwVar2 == null) {
            vtwVar2 = defpackage.vtw.a;
        }
        textView2.setText(vtwVar2.d);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void f(android.view.View view) {
    }
}
