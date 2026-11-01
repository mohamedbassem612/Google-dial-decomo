package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wug extends defpackage.ahao {
    private final aoin a;
    private final defpackage.zlr b;

    public wug(defpackage.zlr zlrVar, aoin aoinVar) {
        this.b = zlrVar;
        this.a = aoinVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624724, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429350);
        android.view.View viewFindViewById = view.findViewById(2131429349);
        defpackage.wmz wmzVar = wlfVar.c == 2 ? (defpackage.wmz) wlfVar.d : defpackage.wmz.a;
        defpackage.wng wngVar = wmzVar.c == 5 ? (defpackage.wng) wmzVar.d : defpackage.wng.a;
        textView.setText(this.b.f(wngVar.c, wngVar.e, false));
        viewFindViewById.setVisibility((wngVar.d && ((java.lang.Boolean) this.a.a()).booleanValue()) ? 0 : 8);
    }
}
