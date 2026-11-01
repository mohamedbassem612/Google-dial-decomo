package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wtz extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624722, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        if ((wlfVar.c == 2 ? (defpackage.wmz) wlfVar.d : defpackage.wmz.a).c != 4) {
            throw new java.lang.IllegalStateException("no music playing tree item found");
        }
        ((android.widget.TextView) view.findViewById(2131429350)).setText(2132021088);
        view.findViewById(2131429349).setVisibility(8);
    }
}
