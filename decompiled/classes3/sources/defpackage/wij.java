package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wij extends defpackage.ahao {
    private final ops a;

    public wij(ops opsVar) {
        this.a = opsVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624293, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.uva uvaVar = (defpackage.uva) obj;
        ahvr.bM(uvaVar.c == 8);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131429527);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429545);
        android.view.View viewFindViewById = view.findViewById(2131429544);
        defpackage.uuz uuzVar = uvaVar.c == 8 ? (defpackage.uuz) uvaVar.d : defpackage.uuz.a;
        textView.setText(uuzVar.c);
        viewFindViewById.setVisibility(true == uuzVar.e ? 0 : 8);
        ops opsVar = this.a;
        defpackage.abwd abwdVar = uuzVar.d;
        if (abwdVar == null) {
            abwdVar = defpackage.abwd.a;
        }
        opsVar.f(imageView, abwdVar, false);
    }
}
