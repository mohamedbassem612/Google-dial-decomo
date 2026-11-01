package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsw extends defpackage.ahao {
    private final ajwr a;

    public wsw(ajwr ajwrVar) {
        this.a = ajwrVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624719, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) throws aois {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        aooh.f(view, "view");
        aooh.f(wlfVar, "data");
        int i = dzs.a;
        ((android.widget.TextView) dzo.b(view, 2131427858)).setText((wlfVar.c == 5 ? (defpackage.wlb) wlfVar.d : defpackage.wlb.a).c);
        ((android.widget.ImageView) dzo.b(view, 2131428082)).setImageResource((wlfVar.c == 5 ? (defpackage.wlb) wlfVar.d : defpackage.wlb.a).d);
        this.a.g((android.widget.ImageButton) dzo.b(view, 2131428023), defpackage.wsv.a);
        com.android.dialer.xatu.impl.ui.XatuDtmfOptionView xatuDtmfOptionView = (com.android.dialer.xatu.impl.ui.XatuDtmfOptionView) dzo.b(view, 2131427939);
        aooh.c(xatuDtmfOptionView);
        xatuDtmfOptionView.setVisibility(((wlfVar.c == 5 ? (defpackage.wlb) wlfVar.d : defpackage.wlb.a).b & 4) == 0 ? 8 : 0);
        if (((wlfVar.c == 5 ? (defpackage.wlb) wlfVar.d : defpackage.wlb.a).b & 4) != 0) {
            defpackage.wss wssVarY = xatuDtmfOptionView.y();
            defpackage.wnb wnbVar = (wlfVar.c == 5 ? (defpackage.wlb) wlfVar.d : defpackage.wlb.a).e;
            if (wnbVar == null) {
                wnbVar = defpackage.wnb.a;
            }
            aooh.e(wnbVar, "getDemoDtmfOption(...)");
            wssVarY.a(new defpackage.wso(wnbVar));
        }
    }
}
