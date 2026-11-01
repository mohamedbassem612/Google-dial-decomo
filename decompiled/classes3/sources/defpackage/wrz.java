package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrz extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624711, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        defpackage.wmz wmzVar = wlfVar.c == 2 ? (defpackage.wmz) wlfVar.d : defpackage.wmz.a;
        defpackage.wne wneVarB = defpackage.wne.b((wmzVar.c == 6 ? (defpackage.wnf) wmzVar.d : defpackage.wnf.a).c);
        if (wneVarB == null) {
            wneVarB = defpackage.wne.UNKNOWN;
        }
        ahvr.bR(wneVarB == defpackage.wne.LIVE, "unexpected transcription mode %s", wneVarB);
        ((android.widget.TextView) view.findViewById(2131429526)).setText(2132021112);
    }
}
