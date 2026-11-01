package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsm extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624717, viewGroup, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) throws aois {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        defpackage.wmz wmzVar = wlfVar.c == 2 ? (defpackage.wmz) wlfVar.d : defpackage.wmz.a;
        ((com.android.dialer.xatu.impl.ui.XatuDtmfOptionView) view.findViewById(2131429533)).y().a(new defpackage.wsp(wmzVar.c == 3 ? (defpackage.wnb) wmzVar.d : defpackage.wnb.a, wmzVar.e));
    }
}
