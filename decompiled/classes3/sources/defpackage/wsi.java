package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsi extends defpackage.ahao {
    private final ajwr a;

    public wsi(ajwr ajwrVar) {
        this.a = ajwrVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624716, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.whf whfVar = (defpackage.whf) obj;
        com.google.android.libraries.communications.ux.views.twolinedchip.TwoLinedChip twoLinedChip = (com.google.android.libraries.communications.ux.views.twolinedchip.TwoLinedChip) view.findViewById(2131427757);
        android.content.Context context = view.getContext();
        twoLinedChip.d(context.getString(whfVar.e));
        twoLinedChip.b(whfVar.d);
        if ((whfVar.b & 8) != 0) {
            twoLinedChip.a(context.getString(whfVar.f));
        }
        if (whfVar.g) {
            twoLinedChip.c(android.content.res.ColorStateList.valueOf(urg.c(context, 2130969072)));
        } else {
            twoLinedChip.c(null);
        }
        if (whfVar.h) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            view.setAlpha(0.38f);
        }
        ajwr ajwrVar = this.a;
        defpackage.wgz wgzVar = whfVar.c;
        if (wgzVar == null) {
            wgzVar = defpackage.wgz.a;
        }
        ajwrVar.g(twoLinedChip, new defpackage.wsh(wgzVar));
    }
}
